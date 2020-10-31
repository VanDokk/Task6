package sample;

import java.util.HashMap;
import java.util.Map;

public class Ruling {

    private String date;
    private String text;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "sample.Ruling{" +
                "date='" + date + '\'' +
                ", text='" + text + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
