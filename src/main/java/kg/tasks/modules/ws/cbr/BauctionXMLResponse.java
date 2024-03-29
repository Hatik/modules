/**
 * BauctionXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class BauctionXMLResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult bauctionXMLResult;

    public BauctionXMLResponse() {
    }

    public BauctionXMLResponse(
           kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult bauctionXMLResult) {
           this.bauctionXMLResult = bauctionXMLResult;
    }


    /**
     * Gets the bauctionXMLResult value for this BauctionXMLResponse.
     * 
     * @return bauctionXMLResult
     */
    public kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult getBauctionXMLResult() {
        return bauctionXMLResult;
    }


    /**
     * Sets the bauctionXMLResult value for this BauctionXMLResponse.
     * 
     * @param bauctionXMLResult
     */
    public void setBauctionXMLResult(kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult bauctionXMLResult) {
        this.bauctionXMLResult = bauctionXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BauctionXMLResponse)) return false;
        BauctionXMLResponse other = (BauctionXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bauctionXMLResult==null && other.getBauctionXMLResult()==null) || 
             (this.bauctionXMLResult!=null &&
              this.bauctionXMLResult.equals(other.getBauctionXMLResult())));
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
        if (getBauctionXMLResult() != null) {
            _hashCode += getBauctionXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BauctionXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">BauctionXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bauctionXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionXMLResponse>BauctionXMLResult"));
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
