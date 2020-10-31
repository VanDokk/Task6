package sample;

import java.util.*;

public class Card {

    private String name;
    private int manaCost;
    private Double cmc;
    private List<String> colors = null;
    private List<String> colorIdentity = null;
    private String type;
    private List<Object> supertypes = null;
    private List<String> types = null;
    private List<Object> subtypes = null;
    private String rarity;
    private String set;
    private String setName;
    private String text;
    private String artist;
    private String number;
    private String layout;
    private Integer multiverseid;
    private String imageUrl;
    private List<Ruling> rulings = null;
    private List<ForeignName> foreignNames = null;
    private List<String> printings = null;
    private String originalText;
    private String originalType;
    private List<Legality> legalities = null;
    private String id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = Character.getNumericValue(manaCost.toCharArray()[1]);
    }

    public Double getCmc() {
        return cmc;
    }

    public void setCmc(Double cmc) {
        this.cmc = cmc;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public List<String> getColorIdentity() {
        return colorIdentity;
    }

    public void setColorIdentity(List<String> colorIdentity) {
        this.colorIdentity = colorIdentity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Object> getSupertypes() {
        return supertypes;
    }

    public void setSupertypes(List<Object> supertypes) {
        this.supertypes = supertypes;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<Object> getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(List<Object> subtypes) {
        this.subtypes = subtypes;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Integer getMultiverseid() {
        return multiverseid;
    }

    public void setMultiverseid(Integer multiverseid) {
        this.multiverseid = multiverseid;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Ruling> getRulings() {
        return rulings;
    }

    public void setRulings(List<Ruling> rulings) {
        this.rulings = rulings;
    }

    public List<ForeignName> getForeignNames() {
        return foreignNames;
    }

    public void setForeignNames(List<ForeignName> foreignNames) {
        this.foreignNames = foreignNames;
    }

    public List<String> getPrintings() {
        return printings;
    }

    public void setPrintings(List<String> printings) {
        this.printings = printings;
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

    public List<Legality> getLegalities() {
        return legalities;
    }

    public void setLegalities(List<Legality> legalities) {
        this.legalities = legalities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public static Comparator<Card> byNameDesc = (o1, o2) -> o1.name.compareTo(o2.name);
    public static Comparator<Card> byManaCostAsc = (o1, o2) -> Integer.compare(o1.manaCost, o2.manaCost);
    public static Comparator<Card> byManaCostDesc = (o1, o2) -> Integer.compare(o2.manaCost, o1.manaCost);
    public static Comparator<Card> byRarityDesc = (o1, o2) -> Integer.compare(Rarity.Rarities.indexOf(o2.rarity),
                                                                Rarity.Rarities.indexOf(o1.rarity));
    public static Comparator<Card> byRarityAsc = (o1, o2) -> Integer.compare(Rarity.Rarities.indexOf(o1.rarity),
                                                               Rarity.Rarities.indexOf(o2.rarity));

    @Override
    public String toString() {
        return "\n------------------------------\n" +
                "name='" + name + '\'' +
                ", manaCost='" + manaCost + '\'' +
                ", cmc=" + cmc +
                ", colors=" + colors +
                ", colorIdentity=" + colorIdentity +
                ", type='" + type + '\'' +
                ", supertypes=" + supertypes +
                ", types=" + types +
                ", subtypes=" + subtypes +
                ", rarity='" + rarity + '\'' +
                ", set='" + set + '\'' +
                ", setName='" + setName + '\'' +
                ", text='" + text + '\'' +
                ", artist='" + artist + '\'' +
                ", number='" + number + '\'' +
                ", layout='" + layout + '\'' +
                ", multiverseid=" + multiverseid +
                ", imageUrl='" + imageUrl + '\'' +
                ", rulings=" + rulings +
                ", printings=" + printings +
                ", originalText='" + originalText + '\'' +
                ", originalType='" + originalType + '\'' +
                ", legalities=" + legalities +
                ", id='" + id + '\'' +
                '}';
    }
}

