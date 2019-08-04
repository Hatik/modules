/**
 * RepoDebtUSDXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class RepoDebtUSDXMLResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult repoDebtUSDXMLResult;

    public RepoDebtUSDXMLResponse() {
    }

    public RepoDebtUSDXMLResponse(
           kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult repoDebtUSDXMLResult) {
           this.repoDebtUSDXMLResult = repoDebtUSDXMLResult;
    }


    /**
     * Gets the repoDebtUSDXMLResult value for this RepoDebtUSDXMLResponse.
     * 
     * @return repoDebtUSDXMLResult
     */
    public kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult getRepoDebtUSDXMLResult() {
        return repoDebtUSDXMLResult;
    }


    /**
     * Sets the repoDebtUSDXMLResult value for this RepoDebtUSDXMLResponse.
     * 
     * @param repoDebtUSDXMLResult
     */
    public void setRepoDebtUSDXMLResult(kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult repoDebtUSDXMLResult) {
        this.repoDebtUSDXMLResult = repoDebtUSDXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RepoDebtUSDXMLResponse)) return false;
        RepoDebtUSDXMLResponse other = (RepoDebtUSDXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.repoDebtUSDXMLResult==null && other.getRepoDebtUSDXMLResult()==null) || 
             (this.repoDebtUSDXMLResult!=null &&
              this.repoDebtUSDXMLResult.equals(other.getRepoDebtUSDXMLResult())));
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
        if (getRepoDebtUSDXMLResult() != null) {
            _hashCode += getRepoDebtUSDXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RepoDebtUSDXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">RepoDebtUSDXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repoDebtUSDXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RepoDebtUSDXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RepoDebtUSDXMLResponse>RepoDebtUSDXMLResult"));
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
