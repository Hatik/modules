
package kg.tasks.modules.models.weather;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Minimum",
    "Maximum"
})
public class Temperature {

    @JsonProperty("Minimum")
    private TemperatureItem minimum;
    @JsonProperty("Maximum")
    private TemperatureItem maximum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Temperature() {
    }

    public Temperature(TemperatureItem TemperatureItem, TemperatureItem maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    @JsonProperty("Minimum")
    public TemperatureItem getMinimum() {
        return minimum;
    }

    @JsonProperty("Minimum")
    public void setMinimum(TemperatureItem minimum) {
        this.minimum = minimum;
    }

    @JsonProperty("Maximum")
    public TemperatureItem getMaximum() {
        return maximum;
    }

    @JsonProperty("Maximum")
    public void setMaximum(TemperatureItem maximum) {
        this.maximum = maximum;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
