package kg.tasks.modules.models.currency;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ValuteData"
})
public class Currency
{
    @JsonProperty("ValuteData")
    private ValuteData ValuteData;

    public ValuteData getValuteData ()
    {
        return ValuteData;
    }

    @JsonProperty("ValuteData")
    public void setValuteData (ValuteData ValuteData)
    {
        this.ValuteData = ValuteData;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ValuteData = "+ValuteData+"]";
    }
}