/**
 * DVXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class DVXMLResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult DVXMLResult;

    public DVXMLResponse() {
    }

    public DVXMLResponse(
           kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult DVXMLResult) {
           this.DVXMLResult = DVXMLResult;
    }


    /**
     * Gets the DVXMLResult value for this DVXMLResponse.
     * 
     * @return DVXMLResult
     */
    public kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult getDVXMLResult() {
        return DVXMLResult;
    }


    /**
     * Sets the DVXMLResult value for this DVXMLResponse.
     * 
     * @param DVXMLResult
     */
    public void setDVXMLResult(kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult DVXMLResult) {
        this.DVXMLResult = DVXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVXMLResponse)) return false;
        DVXMLResponse other = (DVXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DVXMLResult==null && other.getDVXMLResult()==null) || 
             (this.DVXMLResult!=null &&
              this.DVXMLResult.equals(other.getDVXMLResult())));
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
        if (getDVXMLResult() != null) {
            _hashCode += getDVXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">DVXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DVXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DVXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVXMLResponse>DVXMLResult"));
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
