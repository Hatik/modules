/**
 * GetReutersCursOnDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class GetReutersCursOnDateResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult getReutersCursOnDateResult;

    public GetReutersCursOnDateResponse() {
    }

    public GetReutersCursOnDateResponse(
           kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult getReutersCursOnDateResult) {
           this.getReutersCursOnDateResult = getReutersCursOnDateResult;
    }


    /**
     * Gets the getReutersCursOnDateResult value for this GetReutersCursOnDateResponse.
     * 
     * @return getReutersCursOnDateResult
     */
    public kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult getGetReutersCursOnDateResult() {
        return getReutersCursOnDateResult;
    }


    /**
     * Sets the getReutersCursOnDateResult value for this GetReutersCursOnDateResponse.
     * 
     * @param getReutersCursOnDateResult
     */
    public void setGetReutersCursOnDateResult(kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult getReutersCursOnDateResult) {
        this.getReutersCursOnDateResult = getReutersCursOnDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReutersCursOnDateResponse)) return false;
        GetReutersCursOnDateResponse other = (GetReutersCursOnDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getReutersCursOnDateResult==null && other.getGetReutersCursOnDateResult()==null) || 
             (this.getReutersCursOnDateResult!=null &&
              this.getReutersCursOnDateResult.equals(other.getGetReutersCursOnDateResult())));
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
        if (getGetReutersCursOnDateResult() != null) {
            _hashCode += getGetReutersCursOnDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetReutersCursOnDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursOnDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getReutersCursOnDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursOnDateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursOnDateResponse>GetReutersCursOnDateResult"));
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
