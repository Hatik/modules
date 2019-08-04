/**
 * SwapDayTotalXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class SwapDayTotalXMLResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult swapDayTotalXMLResult;

    public SwapDayTotalXMLResponse() {
    }

    public SwapDayTotalXMLResponse(
           kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult swapDayTotalXMLResult) {
           this.swapDayTotalXMLResult = swapDayTotalXMLResult;
    }


    /**
     * Gets the swapDayTotalXMLResult value for this SwapDayTotalXMLResponse.
     * 
     * @return swapDayTotalXMLResult
     */
    public kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult getSwapDayTotalXMLResult() {
        return swapDayTotalXMLResult;
    }


    /**
     * Sets the swapDayTotalXMLResult value for this SwapDayTotalXMLResponse.
     * 
     * @param swapDayTotalXMLResult
     */
    public void setSwapDayTotalXMLResult(kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult swapDayTotalXMLResult) {
        this.swapDayTotalXMLResult = swapDayTotalXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapDayTotalXMLResponse)) return false;
        SwapDayTotalXMLResponse other = (SwapDayTotalXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swapDayTotalXMLResult==null && other.getSwapDayTotalXMLResult()==null) || 
             (this.swapDayTotalXMLResult!=null &&
              this.swapDayTotalXMLResult.equals(other.getSwapDayTotalXMLResult())));
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
        if (getSwapDayTotalXMLResult() != null) {
            _hashCode += getSwapDayTotalXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapDayTotalXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDayTotalXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapDayTotalXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDayTotalXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDayTotalXMLResponse>SwapDayTotalXMLResult"));
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
