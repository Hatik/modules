/**
 * GetReutersCursOnDateXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class GetReutersCursOnDateXMLResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult getReutersCursOnDateXMLResult;

    public GetReutersCursOnDateXMLResponse() {
    }

    public GetReutersCursOnDateXMLResponse(
           kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult getReutersCursOnDateXMLResult) {
           this.getReutersCursOnDateXMLResult = getReutersCursOnDateXMLResult;
    }


    /**
     * Gets the getReutersCursOnDateXMLResult value for this GetReutersCursOnDateXMLResponse.
     * 
     * @return getReutersCursOnDateXMLResult
     */
    public kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult getGetReutersCursOnDateXMLResult() {
        return getReutersCursOnDateXMLResult;
    }


    /**
     * Sets the getReutersCursOnDateXMLResult value for this GetReutersCursOnDateXMLResponse.
     * 
     * @param getReutersCursOnDateXMLResult
     */
    public void setGetReutersCursOnDateXMLResult(kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult getReutersCursOnDateXMLResult) {
        this.getReutersCursOnDateXMLResult = getReutersCursOnDateXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReutersCursOnDateXMLResponse)) return false;
        GetReutersCursOnDateXMLResponse other = (GetReutersCursOnDateXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getReutersCursOnDateXMLResult==null && other.getGetReutersCursOnDateXMLResult()==null) || 
             (this.getReutersCursOnDateXMLResult!=null &&
              this.getReutersCursOnDateXMLResult.equals(other.getGetReutersCursOnDateXMLResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetReutersCursOnDateXMLResult() != null) {
            _hashCode += getGetReutersCursOnDateXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetReutersCursOnDateXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursOnDateXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getReutersCursOnDateXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursOnDateXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursOnDateXMLResponse>GetReutersCursOnDateXMLResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
