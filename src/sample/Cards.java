package sample;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cards {

    private List<Card> cards = null;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Card> getCards() {
        return cards;
    }

    public void setCards() throws IOException {
        this.cards = cards;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public static Cards fromJSONToObjects(String jsonData) throws IOException {
       ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
       //mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
       return mapper.readValue(jsonData, Cards.class);
    }

    @Override
    public String toString() {
        return "" + cards;
    }
}
