/**
 * BiCurBaseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class BiCurBaseResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult biCurBaseResult;

    public BiCurBaseResponse() {
    }

    public BiCurBaseResponse(
           kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult biCurBaseResult) {
           this.biCurBaseResult = biCurBaseResult;
    }


    /**
     * Gets the biCurBaseResult value for this BiCurBaseResponse.
     * 
     * @return biCurBaseResult
     */
    public kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult getBiCurBaseResult() {
        return biCurBaseResult;
    }


    /**
     * Sets the biCurBaseResult value for this BiCurBaseResponse.
     * 
     * @param biCurBaseResult
     */
    public void setBiCurBaseResult(kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult biCurBaseResult) {
        this.biCurBaseResult = biCurBaseResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiCurBaseResponse)) return false;
        BiCurBaseResponse other = (BiCurBaseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biCurBaseResult==null && other.getBiCurBaseResult()==null) || 
             (this.biCurBaseResult!=null &&
              this.biCurBaseResult.equals(other.getBiCurBaseResult())));
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
        if (getBiCurBaseResult() != null) {
            _hashCode += getBiCurBaseResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiCurBaseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">BiCurBaseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biCurBaseResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BiCurBaseResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BiCurBaseResponse>BiCurBaseResult"));
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
