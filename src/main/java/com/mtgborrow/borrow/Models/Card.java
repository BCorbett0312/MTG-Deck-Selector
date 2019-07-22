package com.mtgborrow.borrow.Models;


import java.util.Map;


public class Card {


    private String artist;
    private String borderColor;
    private String[] colorIdentity;
    private String[] colorIndicator;
    private String[] colors;
    private Float convertedManaCost;
    private Integer count;
    private String duelDeck;
    private Float faceConvertedManaCost;
    private String flavorText;
    private Object[] foreignData;
    private String frameEffect;
    private String frameVersion;
    private String hand;
    private Boolean hasFoil;
    private Boolean hasNonFoil;
    private Boolean isAlternative;
    private Boolean isArena;
    private Boolean isFullArt;
    private Boolean isMtgo;
    private Boolean isOnlineOnly;
    private Boolean isOversized;
    private Boolean isPaper;
    private Boolean isPromo;
    private Boolean isReprint;
    private Boolean isReserved;
    private Boolean isStarter;
    private Boolean isStorySpotlight;
    private Boolean isTextless;
    private Boolean isTimeshifted;
    private String layout;
    private Object legalities;
    private String life;
    private String loyalty;
    private String manaCost;
    private Integer mcmId;
    private Integer mcmMetaId;
    private String mcmName;
    private Integer mtgArenaId;
    private Integer mtgoFoilId;
    private Integer mtgoId;
    private Integer mtgstocksId;
    private Integer multiverseId;
    private String name;
    private String[] names;
    private String number; //The collector number of the card in the set.
    private String originalText;
    private String originalType;
    private String power;
//    private Map<String, Float> prices;
    private String[] printings;
//    private String[] purchaseUrls;
    private Object[] rulings;
    private String scryfallId;
    private String scryfallOracleId;
    private String scryfallIllustrationId;
    private String side;
    private String[] subtypes;
    private String[] supertypes;
    private Integer tcgplayerProductId;
    private String  tcgplayerPurchaseUrl;
    private String text;
    private String toughness;
    private String type;
    private String[] types;
    private String uuid;
    private String[] variations;
    private String watermark;

    public Card() {

    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String[] getColorIdentity() {
        return colorIdentity;
    }

    public void setColorIdentity(String[] colorIdentity) {
        this.colorIdentity = colorIdentity;
    }

    public String[] getColorIndicator() {
        return colorIndicator;
    }

    public void setColorIndicator(String[] colorIndicator) {
        this.colorIndicator = colorIndicator;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public Float getConvertedManaCost() {
        return convertedManaCost;
    }

    public void setConvertedManaCost(Float convertedManaCost) {
        this.convertedManaCost = convertedManaCost;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getDuelDeck() {
        return duelDeck;
    }

    public void setDuelDeck(String duelDeck) {
        this.duelDeck = duelDeck;
    }

    public Float getFaceConvertedManaCost() {
        return faceConvertedManaCost;
    }

    public void setFaceConvertedManaCost(Float faceConvertedManaCost) {
        this.faceConvertedManaCost = faceConvertedManaCost;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public Object[] getForeignData() {
        return foreignData;
    }

    public void setForeignData(Object[] foreignData) {
        this.foreignData = foreignData;
    }

    public String getFrameEffect() {
        return frameEffect;
    }

    public void setFrameEffect(String frameEffect) {
        this.frameEffect = frameEffect;
    }

    public String getFrameVersion() {
        return frameVersion;
    }

    public void setFrameVersion(String frameVersion) {
        this.frameVersion = frameVersion;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public Boolean getHasFoil() {
        return hasFoil;
    }

    public void setHasFoil(Boolean hasFoil) {
        this.hasFoil = hasFoil;
    }

    public Boolean getHasNonFoil() {
        return hasNonFoil;
    }

    public void setHasNonFoil(Boolean hasNonFoil) {
        this.hasNonFoil = hasNonFoil;
    }

    public Boolean getAlternative() {
        return isAlternative;
    }

    public void setAlternative(Boolean alternative) {
        isAlternative = alternative;
    }

    public Boolean getArena() {
        return isArena;
    }

    public void setArena(Boolean arena) {
        isArena = arena;
    }

    public Boolean getFullArt() {
        return isFullArt;
    }

    public void setFullArt(Boolean fullArt) {
        isFullArt = fullArt;
    }

    public Boolean getMtgo() {
        return isMtgo;
    }

    public void setMtgo(Boolean mtgo) {
        isMtgo = mtgo;
    }

    public Boolean getOnlineOnly() {
        return isOnlineOnly;
    }

    public void setOnlineOnly(Boolean onlineOnly) {
        isOnlineOnly = onlineOnly;
    }

    public Boolean getOversized() {
        return isOversized;
    }

    public void setOversized(Boolean oversized) {
        isOversized = oversized;
    }

    public Boolean getPaper() {
        return isPaper;
    }

    public void setPaper(Boolean paper) {
        isPaper = paper;
    }

    public Boolean getPromo() {
        return isPromo;
    }

    public void setPromo(Boolean promo) {
        isPromo = promo;
    }

    public Boolean getReprint() {
        return isReprint;
    }

    public void setReprint(Boolean reprint) {
        isReprint = reprint;
    }

    public Boolean getReserved() {
        return isReserved;
    }

    public void setReserved(Boolean reserved) {
        isReserved = reserved;
    }

    public Boolean getStarter() {
        return isStarter;
    }

    public void setStarter(Boolean starter) {
        isStarter = starter;
    }

    public Boolean getStorySpotlight() {
        return isStorySpotlight;
    }

    public void setStorySpotlight(Boolean storySpotlight) {
        isStorySpotlight = storySpotlight;
    }

    public Boolean getTextless() {
        return isTextless;
    }

    public void setTextless(Boolean textless) {
        isTextless = textless;
    }

    public Boolean getTimeshifted() {
        return isTimeshifted;
    }

    public void setTimeshifted(Boolean timeshifted) {
        isTimeshifted = timeshifted;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Object getLegalities() {
        return legalities;
    }

    public void setLegalities(Object legalities) {
        this.legalities = legalities;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public Integer getMcmId() {
        return mcmId;
    }

    public void setMcmId(Integer mcmId) {
        this.mcmId = mcmId;
    }

    public Integer getMcmMetaId() {
        return mcmMetaId;
    }

    public void setMcmMetaId(Integer mcmMetaId) {
        this.mcmMetaId = mcmMetaId;
    }

    public String getMcmName() {
        return mcmName;
    }

    public void setMcmName(String mcmName) {
        this.mcmName = mcmName;
    }

    public Integer getMtgArenaId() {
        return mtgArenaId;
    }

    public void setMtgArenaId(Integer mtgArenaId) {
        this.mtgArenaId = mtgArenaId;
    }

    public Integer getMtgoFoilId() {
        return mtgoFoilId;
    }

    public void setMtgoFoilId(Integer mtgoFoilId) {
        this.mtgoFoilId = mtgoFoilId;
    }

    public Integer getMtgoId() {
        return mtgoId;
    }

    public void setMtgoId(Integer mtgoId) {
        this.mtgoId = mtgoId;
    }

    public Integer getMtgstocksId() {
        return mtgstocksId;
    }

    public void setMtgstocksId(Integer mtgstocksId) {
        this.mtgstocksId = mtgstocksId;
    }

    public Integer getMultiverseId() {
        return multiverseId;
    }

    public void setMultiverseId(Integer multiverseId) {
        this.multiverseId = multiverseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getOriginalType() {
        return originalType;
    }

    public void setOriginalType(String originalType) {
        this.originalType = originalType;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

//    public Map<String, Float> getPrices() {
//        return prices;
//    }

//    public void setPrices(Map prices) {
//        this.prices = null;
//    }

    public String[] getPrintings() {
        return printings;
    }

    public void setPrintings(String[] printings) {
        this.printings = printings;
    }

//    public String[] getPurchaseUrls() {
//        return purchaseUrls;
//    }

//    public void setPurchaseUrls(String[] purchaseUrls) {
//        this.purchaseUrls = purchaseUrls;
//    }

    public Object[] getRulings() {
        return rulings;
    }

    public void setRulings(Object[] rulings) {
        this.rulings = rulings;
    }

    public String getScryfallId() {
        return scryfallId;
    }

    public void setScryfallId(String scryfallId) {
        this.scryfallId = scryfallId;
    }

    public String getScryfallOracleId() {
        return scryfallOracleId;
    }

    public void setScryfallOracleId(String scryfallOracleId) {
        this.scryfallOracleId = scryfallOracleId;
    }

    public String getScryfallIllustrationId() {
        return scryfallIllustrationId;
    }

    public void setScryfallIllustrationId(String scryfallIllustrationId) {
        this.scryfallIllustrationId = scryfallIllustrationId;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String[] getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(String[] subtypes) {
        this.subtypes = subtypes;
    }

    public String[] getSupertypes() {
        return supertypes;
    }

    public void setSupertypes(String[] supertypes) {
        this.supertypes = supertypes;
    }

    public Integer getTcgplayerProductId() {
        return tcgplayerProductId;
    }

    public void setTcgplayerProductId(Integer tcgplayerProductId) {
        this.tcgplayerProductId = tcgplayerProductId;
    }

    public String getTcgplayerPurchaseUrl() {
        return tcgplayerPurchaseUrl;
    }

    public void setTcgplayerPurchaseUrl(String tcgplayerPurchaseUrl) {
        this.tcgplayerPurchaseUrl = tcgplayerPurchaseUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String[] getVariations() {
        return variations;
    }

    public void setVariations(String[] variations) {
        this.variations = variations;
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
