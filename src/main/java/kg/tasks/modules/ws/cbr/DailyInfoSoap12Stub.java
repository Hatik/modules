/**
 * DailyInfoSoap12Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public class DailyInfoSoap12Stub extends org.apache.axis.client.Stub implements kg.tasks.modules.ws.cbr.DailyInfoSoap_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[76];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaldoXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoXMLResponse>SaldoXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SaldoXMLResponseSaldoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SaldoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ROISfixXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixXMLResponse>ROISfixXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.ROISfixXMLResponseROISfixXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RuoniaXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaXMLResponse>RuoniaXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.RuoniaXMLResponseRuoniaXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RuoniaXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OstatDepoXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoXMLResponse>OstatDepoXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.OstatDepoXMLResponseOstatDepoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValIntDayXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ValIntDayXMLResponse>ValIntDayXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.ValIntDayXMLResponseValIntDayXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValIntDayXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValIntDay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ValIntDayResponse>ValIntDayResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValIntDayResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OstatDepo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoResponse>OstatDepoResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ROISfix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixResponse>ROISfixResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.ROISfixResponseROISfixResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ruonia");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaResponse>RuoniaResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.RuoniaResponseRuoniaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RuoniaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mrrf7D");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DResponse>mrrf7DResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.Mrrf7DResponseMrrf7DResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mrrf7DXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DXMLResponse>mrrf7DXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.Mrrf7DXMLResponseMrrf7DXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RepoDebtUSD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RepoDebtUSDResponse>RepoDebtUSDResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RepoDebtUSDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RepoDebtUSDXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RepoDebtUSDXMLResponse>RepoDebtUSDXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RepoDebtUSDXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mrrf");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfResponse>mrrfResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.MrrfResponseMrrfResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mrrfXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfXMLResponse>mrrfXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.MrrfXMLResponseMrrfXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Saldo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoResponse>SaldoResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SaldoResponseSaldoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SaldoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NewsInfoXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoXMLResponse>NewsInfoXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.NewsInfoXMLResponseNewsInfoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OmodInfoXML");
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OmodInfoXMLResponse>OmodInfoXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.OmodInfoXMLResponseOmodInfoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OmodInfoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("XVol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolResponse>XVolResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.XVolResponseXVolResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("XVolXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolXMLResponse>XVolXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.XVolXMLResponseXVolXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MainInfoXML");
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MainInfoXMLResponse>MainInfoXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.MainInfoXMLResponseMainInfoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MainInfoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllDataInfoXML");
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>AllDataInfoXMLResponse>AllDataInfoXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.AllDataInfoXMLResponseAllDataInfoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "AllDataInfoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NewsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoResponse>NewsInfoResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.NewsInfoResponseNewsInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapDayTotal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDayTotalResponse>SwapDayTotalResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDayTotalResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapDayTotalXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDayTotalXMLResponse>SwapDayTotalXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDayTotalXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicXMLResponse>SwapDynamicXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SwapDynamicXMLResponseSwapDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapInfoSellUSDVolXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDVolXMLResponse>SwapInfoSellUSDVolXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDVolXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapInfoSellUSDVol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDVolResponse>SwapInfoSellUSDVolResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDVolResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapInfoSellUSD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDResponse>SwapInfoSellUSDResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SwapInfoSellUSDResponseSwapInfoSellUSDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapInfoSellUSDXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDXMLResponse>SwapInfoSellUSDXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BiCurBaseXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BiCurBaseXMLResponse>BiCurBaseXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BiCurBaseXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BiCurBase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BiCurBaseResponse>BiCurBaseResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BiCurBaseResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BiCurBacketXML");
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BiCurBacketXMLResponse>BiCurBacketXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.BiCurBacketXMLResponseBiCurBacketXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BiCurBacketXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BiCurBacket");
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BiCurBacketResponse>BiCurBacketResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.BiCurBacketResponseBiCurBacketResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BiCurBacketResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicResponse>SwapDynamicResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SwapDynamicResponseSwapDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapMonthTotal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalResponse>SwapMonthTotalResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SwapMonthTotalResponseSwapMonthTotalResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapMonthTotalXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalXMLResponse>SwapMonthTotalXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MKR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRResponse>MKRResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.MKRResponseMKRResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MKRXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRXMLResponse>MKRXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.MKRXMLResponseMKRXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVResponse>DVResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.DVResponseDVResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DVResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DVXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVXMLResponse>DVXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DVXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Repo_debt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtResponse>Repo_debtResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.Repo_debtResponseRepo_debtResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Repo_debtXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtXMLResponse>Repo_debtXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.Repo_debtXMLResponseRepo_debtXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Coins_base");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseResponse>Coins_baseResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.Coins_baseResponseCoins_baseResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Coins_baseXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseXMLResponse>Coins_baseXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.Coins_baseXMLResponseCoins_baseXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FixingBase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseResponse>FixingBaseResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.FixingBaseResponseFixingBaseResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FixingBaseXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseXMLResponse>FixingBaseXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.FixingBaseXMLResponseFixingBaseXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Overnight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightResponse>OvernightResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OvernightXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightXMLResponse>OvernightXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.OvernightXMLResponseOvernightXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Bauction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionResponse>BauctionResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.BauctionResponseBauctionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BauctionXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionXMLResponse>BauctionXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DepoDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicXMLResponse>DepoDynamicXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DepoDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicResponse>DepoDynamicResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.DepoDynamicResponseDepoDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OstatDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicXMLResponse>OstatDynamicXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.OstatDynamicXMLResponseOstatDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OstatDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicResponse>OstatDynamicResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.OstatDynamicResponseOstatDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DragMetDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DragMetDynamicXMLResponse>DragMetDynamicXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.DragMetDynamicXMLResponseDragMetDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DragMetDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DragMetDynamicResponse>DragMetDynamicResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.DragMetDynamicResponseDragMetDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLatestDateTime");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLatestDate");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLatestDateTimeSeld");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeSeldResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLatestDateSeld");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateSeldResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnumValutesXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "Seld"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesXMLResponse>EnumValutesXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.EnumValutesXMLResponseEnumValutesXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnumValutes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "Seld"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesResponse>EnumValutesResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.EnumValutesResponseEnumValutesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLatestReutersDateTime");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestReutersDateTimeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnumReutersValutesXML");
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumReutersValutesXMLResponse>EnumReutersValutesXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.EnumReutersValutesXMLResponseEnumReutersValutesXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumReutersValutesXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnumReutersValutes");
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumReutersValutesResponse>EnumReutersValutesResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.EnumReutersValutesResponseEnumReutersValutesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumReutersValutesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReutersCursOnDateXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursOnDateXMLResponse>GetReutersCursOnDateXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursOnDateXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReutersCursOnDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursOnDateResponse>GetReutersCursOnDateResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursOnDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReutersCursDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "FromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "NumCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursDynamicXMLResponse>GetReutersCursDynamicXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReutersCursDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "FromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "NumCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursDynamicResponse>GetReutersCursDynamicResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.GetReutersCursDynamicResponseGetReutersCursDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCursDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "FromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValutaCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicXMLResponse>GetCursDynamicXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.GetCursDynamicXMLResponseGetCursDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCursDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "FromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValutaCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicResponse>GetCursDynamicResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.GetCursDynamicResponseGetCursDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCursOnDateXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateXMLResponse>GetCursOnDateXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.GetCursOnDateXMLResponseGetCursOnDateXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDateXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSeldCursOnDateXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetSeldCursOnDateXMLResponse>GetSeldCursOnDateXMLResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDateXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSeldCursOnDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetSeldCursOnDateResponse>GetSeldCursOnDateResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.GetSeldCursOnDateResponseGetSeldCursOnDateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCursOnDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateResponse>GetCursOnDateResult"));
        oper.setReturnClass(kg.tasks.modules.ws.cbr.GetCursOnDateResponseGetCursOnDateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

    }

    public DailyInfoSoap12Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DailyInfoSoap12Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DailyInfoSoap12Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>AllDataInfoXMLResponse>AllDataInfoXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.AllDataInfoXMLResponseAllDataInfoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionResponse>BauctionResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BauctionResponseBauctionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionXMLResponse>BauctionXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BiCurBacketResponse>BiCurBacketResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBacketResponseBiCurBacketResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BiCurBacketXMLResponse>BiCurBacketXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBacketXMLResponseBiCurBacketXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BiCurBaseResponse>BiCurBaseResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BiCurBaseXMLResponse>BiCurBaseXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseResponse>Coins_baseResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Coins_baseResponseCoins_baseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseXMLResponse>Coins_baseXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Coins_baseXMLResponseCoins_baseXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicResponse>DepoDynamicResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DepoDynamicResponseDepoDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicXMLResponse>DepoDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DragMetDynamicResponse>DragMetDynamicResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DragMetDynamicResponseDragMetDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DragMetDynamicXMLResponse>DragMetDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DragMetDynamicXMLResponseDragMetDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVResponse>DVResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DVResponseDVResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVXMLResponse>DVXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumReutersValutesResponse>EnumReutersValutesResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumReutersValutesResponseEnumReutersValutesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumReutersValutesXMLResponse>EnumReutersValutesXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumReutersValutesXMLResponseEnumReutersValutesXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesResponse>EnumValutesResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumValutesResponseEnumValutesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesXMLResponse>EnumValutesXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumValutesXMLResponseEnumValutesXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseResponse>FixingBaseResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.FixingBaseResponseFixingBaseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseXMLResponse>FixingBaseXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.FixingBaseXMLResponseFixingBaseXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicResponse>GetCursDynamicResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursDynamicResponseGetCursDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicXMLResponse>GetCursDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursDynamicXMLResponseGetCursDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateResponse>GetCursOnDateResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursOnDateResponseGetCursOnDateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateXMLResponse>GetCursOnDateXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursOnDateXMLResponseGetCursOnDateXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursDynamicResponse>GetReutersCursDynamicResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursDynamicResponseGetReutersCursDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursDynamicXMLResponse>GetReutersCursDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursOnDateResponse>GetReutersCursOnDateResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetReutersCursOnDateXMLResponse>GetReutersCursOnDateXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetSeldCursOnDateResponse>GetSeldCursOnDateResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetSeldCursOnDateResponseGetSeldCursOnDateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetSeldCursOnDateXMLResponse>GetSeldCursOnDateXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MainInfoXMLResponse>MainInfoXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MainInfoXMLResponseMainInfoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRResponse>MKRResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MKRResponseMKRResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRXMLResponse>MKRXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MKRXMLResponseMKRXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DResponse>mrrf7DResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Mrrf7DResponseMrrf7DResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DXMLResponse>mrrf7DXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Mrrf7DXMLResponseMrrf7DXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfResponse>mrrfResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MrrfResponseMrrfResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfXMLResponse>mrrfXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MrrfXMLResponseMrrfXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoResponse>NewsInfoResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.NewsInfoResponseNewsInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoXMLResponse>NewsInfoXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.NewsInfoXMLResponseNewsInfoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OmodInfoXMLResponse>OmodInfoXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OmodInfoXMLResponseOmodInfoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoResponse>OstatDepoResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoXMLResponse>OstatDepoXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDepoXMLResponseOstatDepoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicResponse>OstatDynamicResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDynamicResponseOstatDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicXMLResponse>OstatDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDynamicXMLResponseOstatDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightResponse>OvernightResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightXMLResponse>OvernightXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OvernightXMLResponseOvernightXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtResponse>Repo_debtResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Repo_debtResponseRepo_debtResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtXMLResponse>Repo_debtXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Repo_debtXMLResponseRepo_debtXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RepoDebtUSDResponse>RepoDebtUSDResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RepoDebtUSDXMLResponse>RepoDebtUSDXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixResponse>ROISfixResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ROISfixResponseROISfixResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixXMLResponse>ROISfixXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ROISfixXMLResponseROISfixXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaResponse>RuoniaResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RuoniaResponseRuoniaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaXMLResponse>RuoniaXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RuoniaXMLResponseRuoniaXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoResponse>SaldoResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SaldoResponseSaldoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoXMLResponse>SaldoXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SaldoXMLResponseSaldoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDayTotalResponse>SwapDayTotalResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDayTotalXMLResponse>SwapDayTotalXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicResponse>SwapDynamicResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDynamicResponseSwapDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicXMLResponse>SwapDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDynamicXMLResponseSwapDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDResponse>SwapInfoSellUSDResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDResponseSwapInfoSellUSDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDVolResponse>SwapInfoSellUSDVolResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDVolXMLResponse>SwapInfoSellUSDVolXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDXMLResponse>SwapInfoSellUSDXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalResponse>SwapMonthTotalResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapMonthTotalResponseSwapMonthTotalResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalXMLResponse>SwapMonthTotalXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ValIntDayResponse>ValIntDayResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ValIntDayXMLResponse>ValIntDayXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ValIntDayXMLResponseValIntDayXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolResponse>XVolResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.XVolResponseXVolResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolXMLResponse>XVolXMLResult");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.XVolXMLResponseXVolXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">AllDataInfoXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.AllDataInfoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">AllDataInfoXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.AllDataInfoXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Bauction");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Bauction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BauctionResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BauctionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BauctionXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BauctionXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BauctionXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BauctionXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BiCurBacket");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBacket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BiCurBacketResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBacketResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BiCurBacketXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBacketXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BiCurBacketXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBacketXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BiCurBase");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BiCurBaseResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BiCurBaseXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBaseXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BiCurBaseXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.BiCurBaseXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Coins_base");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Coins_base.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Coins_baseResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Coins_baseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Coins_baseXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Coins_baseXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Coins_baseXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Coins_baseXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DepoDynamic");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DepoDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DepoDynamicResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DepoDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DepoDynamicXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DepoDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DepoDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DepoDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DragMetDynamic");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DragMetDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DragMetDynamicResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DragMetDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DragMetDynamicXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DragMetDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DragMetDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DragMetDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DV");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DVResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DVResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DVXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DVXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DVXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.DVXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumReutersValutes");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumReutersValutes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumReutersValutesResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumReutersValutesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumReutersValutesXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumReutersValutesXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumReutersValutesXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumReutersValutesXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumValutes");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumValutes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumValutesResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumValutesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumValutesXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumValutesXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumValutesXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.EnumValutesXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">FixingBase");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.FixingBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">FixingBaseResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.FixingBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">FixingBaseXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.FixingBaseXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">FixingBaseXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.FixingBaseXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursDynamic");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursDynamicResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursDynamicXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursOnDate");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursOnDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursOnDateResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursOnDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursOnDateXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursOnDateXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursOnDateXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetCursOnDateXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDate");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetLatestDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetLatestDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateSeld");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetLatestDateSeld.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateSeldResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetLatestDateSeldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateTime");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetLatestDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateTimeResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetLatestDateTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateTimeSeld");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetLatestDateTimeSeld.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateTimeSeldResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetLatestDateTimeSeldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestReutersDateTime");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetLatestReutersDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestReutersDateTimeResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetLatestReutersDateTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursDynamic");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursDynamicResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursDynamicXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursOnDate");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursOnDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursOnDateResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursOnDateXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursOnDateXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetReutersCursOnDateXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetSeldCursOnDate");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetSeldCursOnDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetSeldCursOnDateResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetSeldCursOnDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetSeldCursOnDateXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetSeldCursOnDateXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetSeldCursOnDateXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.GetSeldCursOnDateXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MainInfoXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MainInfoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MainInfoXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MainInfoXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MKR");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MKR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MKRResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MKRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MKRXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MKRXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MKRXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MKRXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Mrrf.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf7D");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Mrrf7D.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf7DResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Mrrf7DResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf7DXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Mrrf7DXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf7DXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Mrrf7DXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrfResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MrrfResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrfXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MrrfXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrfXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.MrrfXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">NewsInfo");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.NewsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">NewsInfoResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.NewsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">NewsInfoXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.NewsInfoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">NewsInfoXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.NewsInfoXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OmodInfoXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OmodInfoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OmodInfoXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OmodInfoXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDepo");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDepo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDepoResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDepoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDepoXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDepoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDepoXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDepoXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDynamic");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDynamicResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDynamicXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OstatDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Overnight");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Overnight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OvernightResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OvernightResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OvernightXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OvernightXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OvernightXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.OvernightXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Repo_debt");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Repo_debt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Repo_debtResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Repo_debtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Repo_debtXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Repo_debtXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Repo_debtXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Repo_debtXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">RepoDebtUSD");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RepoDebtUSD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">RepoDebtUSDResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RepoDebtUSDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">RepoDebtUSDXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RepoDebtUSDXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">RepoDebtUSDXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ROISfix");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ROISfix.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ROISfixResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ROISfixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ROISfixXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ROISfixXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ROISfixXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ROISfixXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Ruonia");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Ruonia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">RuoniaResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RuoniaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">RuoniaXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RuoniaXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">RuoniaXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.RuoniaXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Saldo");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.Saldo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SaldoResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SaldoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDayTotal");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDayTotal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDayTotalResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDayTotalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDayTotalXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDayTotalXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDayTotalXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDynamic");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDynamicResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDynamicXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSD");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDVol");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDVol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDVolResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDVolXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDVolXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapInfoSellUSDXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapMonthTotal");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapMonthTotal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapMonthTotalResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapMonthTotalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapMonthTotalXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapMonthTotalXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapMonthTotalXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.SwapMonthTotalXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ValIntDay");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ValIntDay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ValIntDayResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ValIntDayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ValIntDayXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ValIntDayXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ValIntDayXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.ValIntDayXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">XVol");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.XVol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">XVolResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.XVolResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">XVolXML");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.XVolXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">XVolXMLResponse");
            cachedSerQNames.add(qName);
            cls = kg.tasks.modules.ws.cbr.XVolXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public kg.tasks.modules.ws.cbr.SaldoXMLResponseSaldoXMLResult saldoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SaldoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SaldoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SaldoXMLResponseSaldoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SaldoXMLResponseSaldoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SaldoXMLResponseSaldoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.ROISfixXMLResponseROISfixXMLResult ROISfixXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/ROISfixXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.ROISfixXMLResponseROISfixXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.ROISfixXMLResponseROISfixXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.ROISfixXMLResponseROISfixXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.RuoniaXMLResponseRuoniaXMLResult ruoniaXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/RuoniaXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RuoniaXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.RuoniaXMLResponseRuoniaXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.RuoniaXMLResponseRuoniaXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.RuoniaXMLResponseRuoniaXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.OstatDepoXMLResponseOstatDepoXMLResult ostatDepoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OstatDepoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.OstatDepoXMLResponseOstatDepoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.OstatDepoXMLResponseOstatDepoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.OstatDepoXMLResponseOstatDepoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.ValIntDayXMLResponseValIntDayXMLResult valIntDayXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/ValIntDayXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValIntDayXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.ValIntDayXMLResponseValIntDayXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.ValIntDayXMLResponseValIntDayXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.ValIntDayXMLResponseValIntDayXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult valIntDay(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/ValIntDay");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValIntDay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult ostatDepo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OstatDepo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.ROISfixResponseROISfixResult ROISfix(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/ROISfix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.ROISfixResponseROISfixResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.ROISfixResponseROISfixResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.ROISfixResponseROISfixResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.RuoniaResponseRuoniaResult ruonia(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Ruonia");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Ruonia"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.RuoniaResponseRuoniaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.RuoniaResponseRuoniaResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.RuoniaResponseRuoniaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.Mrrf7DResponseMrrf7DResult mrrf7D(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/mrrf7D");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7D"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.Mrrf7DResponseMrrf7DResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.Mrrf7DResponseMrrf7DResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.Mrrf7DResponseMrrf7DResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.Mrrf7DXMLResponseMrrf7DXMLResult mrrf7DXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/mrrf7DXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.Mrrf7DXMLResponseMrrf7DXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.Mrrf7DXMLResponseMrrf7DXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.Mrrf7DXMLResponseMrrf7DXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult repoDebtUSD(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/RepoDebtUSD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RepoDebtUSD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult repoDebtUSDXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/RepoDebtUSDXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RepoDebtUSDXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.MrrfResponseMrrfResult mrrf(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/mrrf");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.MrrfResponseMrrfResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.MrrfResponseMrrfResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.MrrfResponseMrrfResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.MrrfXMLResponseMrrfXMLResult mrrfXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/mrrfXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.MrrfXMLResponseMrrfXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.MrrfXMLResponseMrrfXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.MrrfXMLResponseMrrfXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SaldoResponseSaldoResult saldo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Saldo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Saldo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SaldoResponseSaldoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SaldoResponseSaldoResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SaldoResponseSaldoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.NewsInfoXMLResponseNewsInfoXMLResult newsInfoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/NewsInfoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.NewsInfoXMLResponseNewsInfoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.NewsInfoXMLResponseNewsInfoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.NewsInfoXMLResponseNewsInfoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.OmodInfoXMLResponseOmodInfoXMLResult omodInfoXML() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OmodInfoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OmodInfoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.OmodInfoXMLResponseOmodInfoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.OmodInfoXMLResponseOmodInfoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.OmodInfoXMLResponseOmodInfoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.XVolResponseXVolResult XVol(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/XVol");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.XVolResponseXVolResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.XVolResponseXVolResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.XVolResponseXVolResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.XVolXMLResponseXVolXMLResult XVolXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/XVolXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.XVolXMLResponseXVolXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.XVolXMLResponseXVolXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.XVolXMLResponseXVolXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.MainInfoXMLResponseMainInfoXMLResult mainInfoXML() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/MainInfoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MainInfoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.MainInfoXMLResponseMainInfoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.MainInfoXMLResponseMainInfoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.MainInfoXMLResponseMainInfoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.AllDataInfoXMLResponseAllDataInfoXMLResult allDataInfoXML() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/AllDataInfoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "AllDataInfoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.AllDataInfoXMLResponseAllDataInfoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.AllDataInfoXMLResponseAllDataInfoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.AllDataInfoXMLResponseAllDataInfoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.NewsInfoResponseNewsInfoResult newsInfo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/NewsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.NewsInfoResponseNewsInfoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.NewsInfoResponseNewsInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.NewsInfoResponseNewsInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult swapDayTotal(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapDayTotal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDayTotal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult swapDayTotalXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapDayTotalXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDayTotalXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SwapDynamicXMLResponseSwapDynamicXMLResult swapDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SwapDynamicXMLResponseSwapDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SwapDynamicXMLResponseSwapDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SwapDynamicXMLResponseSwapDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult swapInfoSellUSDVolXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapInfoSellUSDVolXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDVolXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult swapInfoSellUSDVol(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapInfoSellUSDVol");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDVol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SwapInfoSellUSDResponseSwapInfoSellUSDResult swapInfoSellUSD(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapInfoSellUSD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SwapInfoSellUSDResponseSwapInfoSellUSDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SwapInfoSellUSDResponseSwapInfoSellUSDResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SwapInfoSellUSDResponseSwapInfoSellUSDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult swapInfoSellUSDXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapInfoSellUSDXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult biCurBaseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/BiCurBaseXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BiCurBaseXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult biCurBase(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/BiCurBase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BiCurBase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.BiCurBacketXMLResponseBiCurBacketXMLResult biCurBacketXML() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/BiCurBacketXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BiCurBacketXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.BiCurBacketXMLResponseBiCurBacketXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.BiCurBacketXMLResponseBiCurBacketXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.BiCurBacketXMLResponseBiCurBacketXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.BiCurBacketResponseBiCurBacketResult biCurBacket() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/BiCurBacket");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BiCurBacket"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.BiCurBacketResponseBiCurBacketResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.BiCurBacketResponseBiCurBacketResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.BiCurBacketResponseBiCurBacketResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SwapDynamicResponseSwapDynamicResult swapDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SwapDynamicResponseSwapDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SwapDynamicResponseSwapDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SwapDynamicResponseSwapDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SwapMonthTotalResponseSwapMonthTotalResult swapMonthTotal(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapMonthTotal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SwapMonthTotalResponseSwapMonthTotalResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SwapMonthTotalResponseSwapMonthTotalResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SwapMonthTotalResponseSwapMonthTotalResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult swapMonthTotalXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapMonthTotalXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.MKRResponseMKRResult MKR(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/MKR");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.MKRResponseMKRResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.MKRResponseMKRResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.MKRResponseMKRResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.MKRXMLResponseMKRXMLResult MKRXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/MKRXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.MKRXMLResponseMKRXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.MKRXMLResponseMKRXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.MKRXMLResponseMKRXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.DVResponseDVResult DV(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DV");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.DVResponseDVResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.DVResponseDVResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.DVResponseDVResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult DVXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DVXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DVXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.Repo_debtResponseRepo_debtResult repo_debt(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Repo_debt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.Repo_debtResponseRepo_debtResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.Repo_debtResponseRepo_debtResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.Repo_debtResponseRepo_debtResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.Repo_debtXMLResponseRepo_debtXMLResult repo_debtXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Repo_debtXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.Repo_debtXMLResponseRepo_debtXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.Repo_debtXMLResponseRepo_debtXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.Repo_debtXMLResponseRepo_debtXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.Coins_baseResponseCoins_baseResult coins_base(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Coins_base");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_base"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.Coins_baseResponseCoins_baseResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.Coins_baseResponseCoins_baseResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.Coins_baseResponseCoins_baseResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.Coins_baseXMLResponseCoins_baseXMLResult coins_baseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Coins_baseXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.Coins_baseXMLResponseCoins_baseXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.Coins_baseXMLResponseCoins_baseXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.Coins_baseXMLResponseCoins_baseXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.FixingBaseResponseFixingBaseResult fixingBase(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/FixingBase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.FixingBaseResponseFixingBaseResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.FixingBaseResponseFixingBaseResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.FixingBaseResponseFixingBaseResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.FixingBaseXMLResponseFixingBaseXMLResult fixingBaseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/FixingBaseXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.FixingBaseXMLResponseFixingBaseXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.FixingBaseXMLResponseFixingBaseXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.FixingBaseXMLResponseFixingBaseXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult overnight(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Overnight");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Overnight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.OvernightXMLResponseOvernightXMLResult overnightXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OvernightXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.OvernightXMLResponseOvernightXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.OvernightXMLResponseOvernightXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.OvernightXMLResponseOvernightXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.BauctionResponseBauctionResult bauction(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Bauction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Bauction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.BauctionResponseBauctionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.BauctionResponseBauctionResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.BauctionResponseBauctionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult bauctionXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/BauctionXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult depoDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DepoDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.DepoDynamicResponseDepoDynamicResult depoDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DepoDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.DepoDynamicResponseDepoDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.DepoDynamicResponseDepoDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.DepoDynamicResponseDepoDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.OstatDynamicXMLResponseOstatDynamicXMLResult ostatDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OstatDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.OstatDynamicXMLResponseOstatDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.OstatDynamicXMLResponseOstatDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.OstatDynamicXMLResponseOstatDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.OstatDynamicResponseOstatDynamicResult ostatDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OstatDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.OstatDynamicResponseOstatDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.OstatDynamicResponseOstatDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.OstatDynamicResponseOstatDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.DragMetDynamicXMLResponseDragMetDynamicXMLResult dragMetDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DragMetDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.DragMetDynamicXMLResponseDragMetDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.DragMetDynamicXMLResponseDragMetDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.DragMetDynamicXMLResponseDragMetDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.DragMetDynamicResponseDragMetDynamicResult dragMetDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DragMetDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.DragMetDynamicResponseDragMetDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.DragMetDynamicResponseDragMetDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.DragMetDynamicResponseDragMetDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Calendar getLatestDateTime() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetLatestDateTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getLatestDate() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetLatestDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Calendar getLatestDateTimeSeld() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetLatestDateTimeSeld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeSeld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getLatestDateSeld() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetLatestDateSeld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateSeld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.EnumValutesXMLResponseEnumValutesXMLResult enumValutesXML(boolean seld) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/EnumValutesXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(seld)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.EnumValutesXMLResponseEnumValutesXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.EnumValutesXMLResponseEnumValutesXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.EnumValutesXMLResponseEnumValutesXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.EnumValutesResponseEnumValutesResult enumValutes(boolean seld) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/EnumValutes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(seld)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.EnumValutesResponseEnumValutesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.EnumValutesResponseEnumValutesResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.EnumValutesResponseEnumValutesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Calendar getLatestReutersDateTime() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetLatestReutersDateTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestReutersDateTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.EnumReutersValutesXMLResponseEnumReutersValutesXMLResult enumReutersValutesXML() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/EnumReutersValutesXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumReutersValutesXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.EnumReutersValutesXMLResponseEnumReutersValutesXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.EnumReutersValutesXMLResponseEnumReutersValutesXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.EnumReutersValutesXMLResponseEnumReutersValutesXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.EnumReutersValutesResponseEnumReutersValutesResult enumReutersValutes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/EnumReutersValutes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumReutersValutes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.EnumReutersValutesResponseEnumReutersValutesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.EnumReutersValutesResponseEnumReutersValutesResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.EnumReutersValutesResponseEnumReutersValutesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult getReutersCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetReutersCursOnDateXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursOnDateXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {on_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult getReutersCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetReutersCursOnDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursOnDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {on_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult getReutersCursDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate, int numCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetReutersCursDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate, new java.lang.Integer(numCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.GetReutersCursDynamicResponseGetReutersCursDynamicResult getReutersCursDynamic(java.util.Calendar fromDate, java.util.Calendar toDate, int numCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetReutersCursDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetReutersCursDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate, new java.lang.Integer(numCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.GetReutersCursDynamicResponseGetReutersCursDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.GetReutersCursDynamicResponseGetReutersCursDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.GetReutersCursDynamicResponseGetReutersCursDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.GetCursDynamicXMLResponseGetCursDynamicXMLResult getCursDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String valutaCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetCursDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate, valutaCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.GetCursDynamicXMLResponseGetCursDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.GetCursDynamicXMLResponseGetCursDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.GetCursDynamicXMLResponseGetCursDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.GetCursDynamicResponseGetCursDynamicResult getCursDynamic(java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String valutaCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetCursDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate, valutaCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.GetCursDynamicResponseGetCursDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.GetCursDynamicResponseGetCursDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.GetCursDynamicResponseGetCursDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.GetCursOnDateXMLResponseGetCursOnDateXMLResult getCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetCursOnDateXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDateXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {on_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.GetCursOnDateXMLResponseGetCursOnDateXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.GetCursOnDateXMLResponseGetCursOnDateXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.GetCursOnDateXMLResponseGetCursOnDateXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult getSeldCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetSeldCursOnDateXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDateXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {on_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.GetSeldCursOnDateResponseGetSeldCursOnDateResult getSeldCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetSeldCursOnDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {on_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.GetSeldCursOnDateResponseGetSeldCursOnDateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.GetSeldCursOnDateResponseGetSeldCursOnDateResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.GetSeldCursOnDateResponseGetSeldCursOnDateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public kg.tasks.modules.ws.cbr.GetCursOnDateResponseGetCursOnDateResult getCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetCursOnDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {on_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (kg.tasks.modules.ws.cbr.GetCursOnDateResponseGetCursOnDateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (kg.tasks.modules.ws.cbr.GetCursOnDateResponseGetCursOnDateResult) org.apache.axis.utils.JavaUtils.convert(_resp, kg.tasks.modules.ws.cbr.GetCursOnDateResponseGetCursOnDateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
