/**
 * SwapDayTotalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class SwapDayTotalResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult swapDayTotalResult;

    public SwapDayTotalResponse() {
    }

    public SwapDayTotalResponse(
           kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult swapDayTotalResult) {
           this.swapDayTotalResult = swapDayTotalResult;
    }


    /**
     * Gets the swapDayTotalResult value for this SwapDayTotalResponse.
     * 
     * @return swapDayTotalResult
     */
    public kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult getSwapDayTotalResult() {
        return swapDayTotalResult;
    }


    /**
     * Sets the swapDayTotalResult value for this SwapDayTotalResponse.
     * 
     * @param swapDayTotalResult
     */
    public void setSwapDayTotalResult(kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult swapDayTotalResult) {
        this.swapDayTotalResult = swapDayTotalResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapDayTotalResponse)) return false;
        SwapDayTotalResponse other = (SwapDayTotalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swapDayTotalResult==null && other.getSwapDayTotalResult()==null) || 
             (this.swapDayTotalResult!=null &&
              this.swapDayTotalResult.equals(other.getSwapDayTotalResult())));
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
        if (getSwapDayTotalResult() != null) {
            _hashCode += getSwapDayTotalResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapDayTotalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDayTotalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapDayTotalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDayTotalResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDayTotalResponse>SwapDayTotalResult"));
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
