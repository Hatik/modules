/**
 * SwapInfoSellUSDVolXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class SwapInfoSellUSDVolXMLResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult swapInfoSellUSDVolXMLResult;

    public SwapInfoSellUSDVolXMLResponse() {
    }

    public SwapInfoSellUSDVolXMLResponse(
           kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult swapInfoSellUSDVolXMLResult) {
           this.swapInfoSellUSDVolXMLResult = swapInfoSellUSDVolXMLResult;
    }


    /**
     * Gets the swapInfoSellUSDVolXMLResult value for this SwapInfoSellUSDVolXMLResponse.
     * 
     * @return swapInfoSellUSDVolXMLResult
     */
    public kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult getSwapInfoSellUSDVolXMLResult() {
        return swapInfoSellUSDVolXMLResult;
    }


    /**
     * Sets the swapInfoSellUSDVolXMLResult value for this SwapInfoSellUSDVolXMLResponse.
     * 
     * @param swapInfoSellUSDVolXMLResult
     */
    public void setSwapInfoSellUSDVolXMLResult(kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult swapInfoSellUSDVolXMLResult) {
        this.swapInfoSellUSDVolXMLResult = swapInfoSellUSDVolXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapInfoSellUSDVolXMLResponse)) return false;
        SwapInfoSellUSDVolXMLResponse other = (SwapInfoSellUSDVolXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swapInfoSellUSDVolXMLResult==null && other.getSwapInfoSellUSDVolXMLResult()==null) || 
             (this.swapInfoSellUSDVolXMLResult!=null &&
              this.swapInfoSellUSDVolXMLResult.equals(other.getSwapInfoSellUSDVolXMLResult())));
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
        if (getSwapInfoSellUSDVolXMLResult() != null) {
            _hashCode += getSwapInfoSellUSDVolXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapInfoSellUSDVolXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDVolXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapInfoSellUSDVolXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDVolXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDVolXMLResponse>SwapInfoSellUSDVolXMLResult"));
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
