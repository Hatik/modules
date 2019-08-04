/**
 * RepoDebtUSDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class RepoDebtUSDResponse  implements java.io.Serializable {
    private kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult repoDebtUSDResult;

    public RepoDebtUSDResponse() {
    }

    public RepoDebtUSDResponse(
           kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult repoDebtUSDResult) {
           this.repoDebtUSDResult = repoDebtUSDResult;
    }


    /**
     * Gets the repoDebtUSDResult value for this RepoDebtUSDResponse.
     * 
     * @return repoDebtUSDResult
     */
    public kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult getRepoDebtUSDResult() {
        return repoDebtUSDResult;
    }


    /**
     * Sets the repoDebtUSDResult value for this RepoDebtUSDResponse.
     * 
     * @param repoDebtUSDResult
     */
    public void setRepoDebtUSDResult(kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult repoDebtUSDResult) {
        this.repoDebtUSDResult = repoDebtUSDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RepoDebtUSDResponse)) return false;
        RepoDebtUSDResponse other = (RepoDebtUSDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.repoDebtUSDResult==null && other.getRepoDebtUSDResult()==null) || 
             (this.repoDebtUSDResult!=null &&
              this.repoDebtUSDResult.equals(other.getRepoDebtUSDResult())));
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
        if (getRepoDebtUSDResult() != null) {
            _hashCode += getRepoDebtUSDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RepoDebtUSDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">RepoDebtUSDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repoDebtUSDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RepoDebtUSDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RepoDebtUSDResponse>RepoDebtUSDResult"));
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
