/**
 * SwapInfoSellUSDVolResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class SwapInfoSellUSDVolResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult swapInfoSellUSDVolResult;

    public SwapInfoSellUSDVolResponse() {
    }

    public SwapInfoSellUSDVolResponse(
           kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult swapInfoSellUSDVolResult) {
           this.swapInfoSellUSDVolResult = swapInfoSellUSDVolResult;
    }


    /**
     * Gets the swapInfoSellUSDVolResult value for this SwapInfoSellUSDVolResponse.
     * 
     * @return swapInfoSellUSDVolResult
     */
    public kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult getSwapInfoSellUSDVolResult() {
        return swapInfoSellUSDVolResult;
    }


    /**
     * Sets the swapInfoSellUSDVolResult value for this SwapInfoSellUSDVolResponse.
     * 
     * @param swapInfoSellUSDVolResult
     */
    public void setSwapInfoSellUSDVolResult(kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult swapInfoSellUSDVolResult) {
        this.swapInfoSellUSDVolResult = swapInfoSellUSDVolResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapInfoSellUSDVolResponse)) return false;
        SwapInfoSellUSDVolResponse other = (SwapInfoSellUSDVolResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swapInfoSellUSDVolResult==null && other.getSwapInfoSellUSDVolResult()==null) || 
             (this.swapInfoSellUSDVolResult!=null &&
              this.swapInfoSellUSDVolResult.equals(other.getSwapInfoSellUSDVolResult())));
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
        if (getSwapInfoSellUSDVolResult() != null) {
            _hashCode += getSwapInfoSellUSDVolResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapInfoSellUSDVolResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDVolResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapInfoSellUSDVolResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDVolResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDVolResponse>SwapInfoSellUSDVolResult"));
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
