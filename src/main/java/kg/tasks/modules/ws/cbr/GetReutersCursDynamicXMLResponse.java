/**
 * GetReutersCursDynamicXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class GetReutersCursDynamicXMLResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult getReutersCursDynamicXMLResult;

    public GetReutersCursDynamicXMLResponse() {
    }

    public GetReutersCursDynamicXMLResponse(
           kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult getReutersCursDynamicXMLResult) {
           this.getReutersCursDynamicXMLResult = getReutersCursDynamicXMLResult;
    }


    /**
     * Gets the getReutersCursDynamicXMLResult value for this GetReutersCursDynamicXMLResponse.
     * 
     * @return getReutersCursDynamicXMLResult
     */
    public kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult getGetReutersCursDynamicXMLResult() {
        return getReutersCursDynamicXMLResult;
    }


    /**
     * Sets the getReutersCursDynamicXMLResult value for this GetReutersCursDynamicXMLResponse.
     * 
     * @param getReutersCursDynamicXMLResult
     */
    public void setGetReutersCursDynamicXMLResult(kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult getReutersCursDynamicXMLResult) {
        this.getReutersCursDynamicXMLResult = getReutersCursDynamicXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReutersCursDynamicXMLResponse)) return false;
        GetReutersCursDynamicXMLResponse other = (GetReutersCursDynamicXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getReutersCursDynamicXMLResult==null && other.getGetReutersCursDynamicXMLResult()==null) || 
             (this.getReutersCursDynamicXMLResult!=null &&
              this.getReutersCursDynamicXMLResult.equals(other.getGetReutersCursDynamicXMLResult())));
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
        if (getGetReutersCursDynamicXMLResult() != null) {
            _hashCode += getGetReutersCursDynamicXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetReutersCursDynamicXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursDynamicXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getReutersCursDynamicXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursDynamicXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursDynamicXMLResponse>GetReutersCursDynamicXMLResult"));
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
