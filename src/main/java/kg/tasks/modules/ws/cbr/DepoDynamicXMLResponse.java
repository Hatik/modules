/**
 * DepoDynamicXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class DepoDynamicXMLResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult depoDynamicXMLResult;

    public DepoDynamicXMLResponse() {
    }

    public DepoDynamicXMLResponse(
           kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult depoDynamicXMLResult) {
           this.depoDynamicXMLResult = depoDynamicXMLResult;
    }


    /**
     * Gets the depoDynamicXMLResult value for this DepoDynamicXMLResponse.
     * 
     * @return depoDynamicXMLResult
     */
    public kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult getDepoDynamicXMLResult() {
        return depoDynamicXMLResult;
    }


    /**
     * Sets the depoDynamicXMLResult value for this DepoDynamicXMLResponse.
     * 
     * @param depoDynamicXMLResult
     */
    public void setDepoDynamicXMLResult(kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult depoDynamicXMLResult) {
        this.depoDynamicXMLResult = depoDynamicXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepoDynamicXMLResponse)) return false;
        DepoDynamicXMLResponse other = (DepoDynamicXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depoDynamicXMLResult==null && other.getDepoDynamicXMLResult()==null) || 
             (this.depoDynamicXMLResult!=null &&
              this.depoDynamicXMLResult.equals(other.getDepoDynamicXMLResult())));
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
        if (getDepoDynamicXMLResult() != null) {
            _hashCode += getDepoDynamicXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepoDynamicXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">DepoDynamicXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depoDynamicXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicXMLResponse>DepoDynamicXMLResult"));
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
