/**
 * OstatDepoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class OstatDepoResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult ostatDepoResult;

    public OstatDepoResponse() {
    }

    public OstatDepoResponse(
           kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult ostatDepoResult) {
           this.ostatDepoResult = ostatDepoResult;
    }


    /**
     * Gets the ostatDepoResult value for this OstatDepoResponse.
     * 
     * @return ostatDepoResult
     */
    public kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult getOstatDepoResult() {
        return ostatDepoResult;
    }


    /**
     * Sets the ostatDepoResult value for this OstatDepoResponse.
     * 
     * @param ostatDepoResult
     */
    public void setOstatDepoResult(kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult ostatDepoResult) {
        this.ostatDepoResult = ostatDepoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OstatDepoResponse)) return false;
        OstatDepoResponse other = (OstatDepoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ostatDepoResult==null && other.getOstatDepoResult()==null) || 
             (this.ostatDepoResult!=null &&
              this.ostatDepoResult.equals(other.getOstatDepoResult())));
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
        if (getOstatDepoResult() != null) {
            _hashCode += getOstatDepoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OstatDepoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDepoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ostatDepoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoResponse>OstatDepoResult"));
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
