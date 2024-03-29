/**
 * OvernightResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class OvernightResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult overnightResult;

    public OvernightResponse() {
    }

    public OvernightResponse(
           kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult overnightResult) {
           this.overnightResult = overnightResult;
    }


    /**
     * Gets the overnightResult value for this OvernightResponse.
     * 
     * @return overnightResult
     */
    public kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult getOvernightResult() {
        return overnightResult;
    }


    /**
     * Sets the overnightResult value for this OvernightResponse.
     * 
     * @param overnightResult
     */
    public void setOvernightResult(kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult overnightResult) {
        this.overnightResult = overnightResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvernightResponse)) return false;
        OvernightResponse other = (OvernightResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.overnightResult==null && other.getOvernightResult()==null) || 
             (this.overnightResult!=null &&
              this.overnightResult.equals(other.getOvernightResult())));
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
        if (getOvernightResult() != null) {
            _hashCode += getOvernightResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvernightResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">OvernightResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overnightResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightResponse>OvernightResult"));
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
