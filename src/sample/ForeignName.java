package sample;

import java.util.HashMap;
import java.util.Map;

public class ForeignName {

    private String name;
    private String text;
    private Object flavor;
    private String imageUrl;
    private String language;
    private Integer multiverseid;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getFlavor() {
        return flavor;
    }

    public void setFlavor(Object flavor) {
        this.flavor = flavor;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getMultiverseid() {
        return multiverseid;
    }

    public void setMultiverseid(Integer multiverseid) {
        this.multiverseid = multiverseid;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "sample.ForeignName{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", flavor=" + flavor +
                ", imageUrl='" + imageUrl + '\'' +
                ", language='" + language + '\'' +
                ", multiverseid=" + multiverseid +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
