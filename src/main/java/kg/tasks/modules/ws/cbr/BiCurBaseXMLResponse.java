/**
 * BiCurBaseXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class BiCurBaseXMLResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult biCurBaseXMLResult;

    public BiCurBaseXMLResponse() {
    }

    public BiCurBaseXMLResponse(
           kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult biCurBaseXMLResult) {
           this.biCurBaseXMLResult = biCurBaseXMLResult;
    }


    /**
     * Gets the biCurBaseXMLResult value for this BiCurBaseXMLResponse.
     * 
     * @return biCurBaseXMLResult
     */
    public kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult getBiCurBaseXMLResult() {
        return biCurBaseXMLResult;
    }


    /**
     * Sets the biCurBaseXMLResult value for this BiCurBaseXMLResponse.
     * 
     * @param biCurBaseXMLResult
     */
    public void setBiCurBaseXMLResult(kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult biCurBaseXMLResult) {
        this.biCurBaseXMLResult = biCurBaseXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiCurBaseXMLResponse)) return false;
        BiCurBaseXMLResponse other = (BiCurBaseXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biCurBaseXMLResult==null && other.getBiCurBaseXMLResult()==null) || 
             (this.biCurBaseXMLResult!=null &&
              this.biCurBaseXMLResult.equals(other.getBiCurBaseXMLResult())));
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
        if (getBiCurBaseXMLResult() != null) {
            _hashCode += getBiCurBaseXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiCurBaseXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">BiCurBaseXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biCurBaseXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BiCurBaseXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BiCurBaseXMLResponse>BiCurBaseXMLResult"));
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
