/**
 * DailyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public interface DailyInfo extends javax.xml.rpc.Service {

/**
 * Веб сервис для получения ежедневных данных ver 28.05.2019
 */
    public java.lang.String getDailyInfoSoapAddress();

    public kg.tasks.modules.ws.cbr.DailyInfoSoap_PortType getDailyInfoSoap() throws javax.xml.rpc.ServiceException;

    public kg.tasks.modules.ws.cbr.DailyInfoSoap_PortType getDailyInfoSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getDailyInfoSoap12Address();

    public kg.tasks.modules.ws.cbr.DailyInfoSoap_PortType getDailyInfoSoap12() throws javax.xml.rpc.ServiceException;

    public kg.tasks.modules.ws.cbr.DailyInfoSoap_PortType getDailyInfoSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
