/**
 * ValIntDayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class ValIntDayResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult valIntDayResult;

    public ValIntDayResponse() {
    }

    public ValIntDayResponse(
           kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult valIntDayResult) {
           this.valIntDayResult = valIntDayResult;
    }


    /**
     * Gets the valIntDayResult value for this ValIntDayResponse.
     * 
     * @return valIntDayResult
     */
    public kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult getValIntDayResult() {
        return valIntDayResult;
    }


    /**
     * Sets the valIntDayResult value for this ValIntDayResponse.
     * 
     * @param valIntDayResult
     */
    public void setValIntDayResult(kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult valIntDayResult) {
        this.valIntDayResult = valIntDayResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValIntDayResponse)) return false;
        ValIntDayResponse other = (ValIntDayResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.valIntDayResult==null && other.getValIntDayResult()==null) || 
             (this.valIntDayResult!=null &&
              this.valIntDayResult.equals(other.getValIntDayResult())));
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
        if (getValIntDayResult() != null) {
            _hashCode += getValIntDayResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValIntDayResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">ValIntDayResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valIntDayResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValIntDayResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ValIntDayResponse>ValIntDayResult"));
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
