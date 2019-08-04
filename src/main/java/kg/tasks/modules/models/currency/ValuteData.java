package kg.tasks.modules.models.currency;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OnDate",
        "ValuteCursOnDate"
})
public class ValuteData {

    @JsonProperty("OnDate")
    private String onDate;
    @JsonProperty("ValuteCursOnDate")
    private List<ValuteCursOnDate> valuteCursOnDate = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ValuteData() {
    }

    /**
     *
     * @param onDate
     * @param valuteCursOnDate
     */
    public ValuteData(String onDate, List<ValuteCursOnDate> valuteCursOnDate) {
        super();
        this.onDate = onDate;
        this.valuteCursOnDate = valuteCursOnDate;
    }

    @JsonProperty("OnDate")
    public String getOnDate() {
        return onDate;
    }

    @JsonProperty("OnDate")
    public void setOnDate(String onDate) {
        this.onDate = onDate;
    }

    @JsonProperty("ValuteCursOnDate")
    public List<ValuteCursOnDate> getValuteCursOnDate() {
        return valuteCursOnDate;
    }

    @JsonProperty("ValuteCursOnDate")
    public void setValuteCursOnDate(List<ValuteCursOnDate> valuteCursOnDate) {
        this.valuteCursOnDate = valuteCursOnDate;
    }


}