package kg.tasks.modules.models.currency;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Vname",
        "Vnom",
        "Vcurs",
        "Vcode",
        "VchCode"
})
public class ValuteCursOnDate {

    @JsonProperty("Vname")
    private String vname;
    @JsonProperty("Vnom")
    private String vnom;
    @JsonProperty("Vcurs")
    private String vcurs;
    @JsonProperty("Vcode")
    private String vcode;
    @JsonProperty("VchCode")
    private String vchCode;

    /**
     * No args constructor for use in serialization
     *
     */
    public ValuteCursOnDate() {
    }

    /**
     *
     * @param vchCode
     * @param vnom
     * @param vcurs
     * @param vname
     * @param vcode
     */
    public ValuteCursOnDate(String vname, String vnom, String vcurs, String vcode, String vchCode) {
        super();
        this.vname = vname;
        this.vnom = vnom;
        this.vcurs = vcurs;
        this.vcode = vcode;
        this.vchCode = vchCode;
    }

    @JsonProperty("Vname")
    public String getVname() {
        return vname;
    }

    @JsonProperty("Vname")
    public void setVname(String vname) {
        this.vname = vname;
    }

    @JsonProperty("Vnom")
    public String getVnom() {
        return vnom;
    }

    @JsonProperty("Vnom")
    public void setVnom(String vnom) {
        this.vnom = vnom;
    }

    @JsonProperty("Vcurs")
    public String getVcurs() {
        return vcurs;
    }

    @JsonProperty("Vcurs")
    public void setVcurs(String vcurs) {
        this.vcurs = vcurs;
    }

    @JsonProperty("Vcode")
    public String getVcode() {
        return vcode;
    }

    @JsonProperty("Vcode")
    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    @JsonProperty("VchCode")
    public String getVchCode() {
        return vchCode;
    }

    @JsonProperty("VchCode")
    public void setVchCode(String vchCode) {
        this.vchCode = vchCode;
    }


}