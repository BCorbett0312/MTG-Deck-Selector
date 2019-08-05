package com.mtgborrow.borrow.services;


import com.mtgborrow.borrow.models.User;
import com.mtgborrow.borrow.models.RequestUser;
import com.mtgborrow.borrow.repositories.UserRepository;
import com.mtgborrow.borrow.security.CustomException;
import com.mtgborrow.borrow.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Service
public class UserService {


    UserRepository userRepository;
    AuthenticationManager authenticationManager;
    JwtTokenProvider jwtTokenProvider;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.passwordEncoder = passwordEncoder;
    }




    public User createNewUser(RequestUser requestUser){
        User creatingCollection = parseFromRequest(requestUser);

        return creatingCollection;
    }

    public User persistInitialUser(User user){
        return this.userRepository.save(user);
    }

    public User getUserById(Long id){
        return this.userRepository.getById(id);
    }

    public User parseFromRequest(RequestUser requestUser){
        User newUser = new User();
        newUser.setPassword(requestUser.getPassword());
        newUser.setUsername(requestUser.getUsername());

        return newUser;
    }

    public User save(User user){
        return userRepository.save(user);
    }


    public String signin(String username, String password) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            return jwtTokenProvider.createToken(username);
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
            throw new CustomException("Invalid username/password supplied", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    public String signup(User user) {
        if (!userRepository.existsByUsername(user.getUsername())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return jwtTokenProvider.createToken(user.getUsername());
        } else {
            throw new CustomException("Username is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    public User whoami(HttpServletRequest req) {
        return userRepository.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(req)));
    }
}
