/**
 * GetSeldCursOnDateXML.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class GetSeldCursOnDateXML  implements java.io.Serializable {
    private java.util.Calendar on_date;

    public GetSeldCursOnDateXML() {
    }

    public GetSeldCursOnDateXML(
           java.util.Calendar on_date) {
           this.on_date = on_date;
    }


    /**
     * Gets the on_date value for this GetSeldCursOnDateXML.
     * 
     * @return on_date
     */
    public java.util.Calendar getOn_date() {
        return on_date;
    }


    /**
     * Sets the on_date value for this GetSeldCursOnDateXML.
     * 
     * @param on_date
     */
    public void setOn_date(java.util.Calendar on_date) {
        this.on_date = on_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSeldCursOnDateXML)) return false;
        GetSeldCursOnDateXML other = (GetSeldCursOnDateXML) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.on_date==null && other.getOn_date()==null) || 
             (this.on_date!=null &&
              this.on_date.equals(other.getOn_date())));
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
        if (getOn_date() != null) {
            _hashCode += getOn_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSeldCursOnDateXML.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetSeldCursOnDateXML"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("on_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
