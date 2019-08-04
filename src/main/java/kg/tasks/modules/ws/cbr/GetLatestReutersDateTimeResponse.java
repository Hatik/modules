/**
 * GetLatestReutersDateTimeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class GetLatestReutersDateTimeResponse  implements java.io.Serializable {
    private java.util.Calendar getLatestReutersDateTimeResult;

    public GetLatestReutersDateTimeResponse() {
    }

    public GetLatestReutersDateTimeResponse(
           java.util.Calendar getLatestReutersDateTimeResult) {
           this.getLatestReutersDateTimeResult = getLatestReutersDateTimeResult;
    }


    /**
     * Gets the getLatestReutersDateTimeResult value for this GetLatestReutersDateTimeResponse.
     * 
     * @return getLatestReutersDateTimeResult
     */
    public java.util.Calendar getGetLatestReutersDateTimeResult() {
        return getLatestReutersDateTimeResult;
    }


    /**
     * Sets the getLatestReutersDateTimeResult value for this GetLatestReutersDateTimeResponse.
     * 
     * @param getLatestReutersDateTimeResult
     */
    public void setGetLatestReutersDateTimeResult(java.util.Calendar getLatestReutersDateTimeResult) {
        this.getLatestReutersDateTimeResult = getLatestReutersDateTimeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLatestReutersDateTimeResponse)) return false;
        GetLatestReutersDateTimeResponse other = (GetLatestReutersDateTimeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLatestReutersDateTimeResult==null && other.getGetLatestReutersDateTimeResult()==null) || 
             (this.getLatestReutersDateTimeResult!=null &&
              this.getLatestReutersDateTimeResult.equals(other.getGetLatestReutersDateTimeResult())));
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
        if (getGetLatestReutersDateTimeResult() != null) {
            _hashCode += getGetLatestReutersDateTimeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLatestReutersDateTimeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestReutersDateTimeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLatestReutersDateTimeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestReutersDateTimeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
