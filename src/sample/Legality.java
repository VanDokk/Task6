package sample;

import java.util.HashMap;
import java.util.Map;

public class Legality {

    private String format;
    private String legality;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLegality() {
        return legality;
    }

    public void setLegality(String legality) {
        this.legality = legality;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "sample.Legality{" +
                "format='" + format + '\'' +
                ", legality='" + legality + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
