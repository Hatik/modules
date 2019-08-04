<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://web.kg.tasks.modules.ws.cbr.ru/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://web.kg.tasks.modules.ws.cbr.ru/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Веб сервис для получения ежедневных данных ver 28.05.2019</wsdl:documentation>
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://web.kg.tasks.modules.ws.cbr.ru/">
      <s:element name="SaldoXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SaldoXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SaldoXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ROISfixXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ROISfixXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ROISfixXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RuoniaXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RuoniaXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RuoniaXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OstatDepoXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OstatDepoXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="OstatDepoXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ValIntDayXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ValIntDayXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ValIntDayXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ValIntDay">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ValIntDayResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ValIntDayResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OstatDepo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OstatDepoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="OstatDepoResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ROISfix">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ROISfixResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ROISfixResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Ruonia">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RuoniaResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RuoniaResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="mrrf7D">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="mrrf7DResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mrrf7DResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="mrrf7DXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="mrrf7DXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mrrf7DXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RepoDebtUSD">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RepoDebtUSDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RepoDebtUSDResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RepoDebtUSDXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RepoDebtUSDXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RepoDebtUSDXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="mrrf">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="mrrfResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mrrfResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="mrrfXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="mrrfXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="mrrfXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Saldo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SaldoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SaldoResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewsInfoXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewsInfoXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="NewsInfoXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OmodInfoXML">
        <s:complexType />
      </s:element>
      <s:element name="OmodInfoXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="OmodInfoXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="XVol">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="XVolResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="XVolResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="XVolXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="XVolXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="XVolXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="MainInfoXML">
        <s:complexType />
      </s:element>
      <s:element name="MainInfoXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="MainInfoXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AllDataInfoXML">
        <s:complexType />
      </s:element>
      <s:element name="AllDataInfoXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AllDataInfoXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewsInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewsInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="NewsInfoResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapDayTotal">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapDayTotalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SwapDayTotalResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapDayTotalXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapDayTotalXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SwapDayTotalXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapDynamicXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapDynamicXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SwapDynamicXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapInfoSellUSDVolXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapInfoSellUSDVolXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SwapInfoSellUSDVolXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapInfoSellUSDVol">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapInfoSellUSDVolResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SwapInfoSellUSDVolResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapInfoSellUSD">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapInfoSellUSDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SwapInfoSellUSDResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapInfoSellUSDXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapInfoSellUSDXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SwapInfoSellUSDXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="BiCurBaseXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="BiCurBaseXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="BiCurBaseXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="BiCurBase">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="BiCurBaseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="BiCurBaseResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="BiCurBacketXML">
        <s:complexType />
      </s:element>
      <s:element name="BiCurBacketXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="BiCurBacketXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="BiCurBacket">
        <s:complexType />
      </s:element>
      <s:element name="BiCurBacketResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="BiCurBacketResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapDynamic">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapDynamicResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SwapDynamicResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapMonthTotal">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapMonthTotalResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SwapMonthTotalResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapMonthTotalXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SwapMonthTotalXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SwapMonthTotalXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="MKR">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="MKRResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="MKRResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="MKRXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="MKRXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="MKRXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DV">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DVResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DVResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DVXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DVXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DVXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Repo_debt">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Repo_debtResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Repo_debtResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Repo_debtXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Repo_debtXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Repo_debtXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Coins_base">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Coins_baseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Coins_baseResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Coins_baseXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Coins_baseXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Coins_baseXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FixingBase">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FixingBaseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FixingBaseResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FixingBaseXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FixingBaseXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FixingBaseXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Overnight">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OvernightResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="OvernightResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OvernightXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OvernightXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="OvernightXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Bauction">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="BauctionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="BauctionResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="BauctionXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="BauctionXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="BauctionXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DepoDynamicXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DepoDynamicXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DepoDynamicXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DepoDynamic">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DepoDynamicResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DepoDynamicResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OstatDynamicXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OstatDynamicXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="OstatDynamicXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OstatDynamic">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="OstatDynamicResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="OstatDynamicResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DragMetDynamicXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DragMetDynamicXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DragMetDynamicXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DragMetDynamic">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="fromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DragMetDynamicResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DragMetDynamicResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLatestDateTime">
        <s:complexType />
      </s:element>
      <s:element name="GetLatestDateTimeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetLatestDateTimeResult" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLatestDate">
        <s:complexType />
      </s:element>
      <s:element name="GetLatestDateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLatestDateResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLatestDateTimeSeld">
        <s:complexType />
      </s:element>
      <s:element name="GetLatestDateTimeSeldResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetLatestDateTimeSeldResult" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLatestDateSeld">
        <s:complexType />
      </s:element>
      <s:element name="GetLatestDateSeldResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLatestDateSeldResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EnumValutesXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="Seld" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EnumValutesXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="EnumValutesXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EnumValutes">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="Seld" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EnumValutesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="EnumValutesResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLatestReutersDateTime">
        <s:complexType />
      </s:element>
      <s:element name="GetLatestReutersDateTimeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetLatestReutersDateTimeResult" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EnumReutersValutesXML">
        <s:complexType />
      </s:element>
      <s:element name="EnumReutersValutesXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="EnumReutersValutesXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EnumReutersValutes">
        <s:complexType />
      </s:element>
      <s:element name="EnumReutersValutesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="EnumReutersValutesResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetReutersCursOnDateXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="On_date" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetReutersCursOnDateXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetReutersCursOnDateXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetReutersCursOnDate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="On_date" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetReutersCursOnDateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetReutersCursOnDateResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetReutersCursDynamicXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="FromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="NumCode" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetReutersCursDynamicXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetReutersCursDynamicXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetReutersCursDynamic">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="FromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="NumCode" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetReutersCursDynamicResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetReutersCursDynamicResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCursDynamicXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="FromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
            <s:element minOccurs="0" maxOccurs="1" name="ValutaCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCursDynamicXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCursDynamicXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCursDynamic">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="FromDate" type="s:dateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="ToDate" type="s:dateTime" />
            <s:element minOccurs="0" maxOccurs="1" name="ValutaCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCursDynamicResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCursDynamicResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCursOnDateXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="On_date" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCursOnDateXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCursOnDateXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeldCursOnDateXML">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="On_date" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeldCursOnDateXMLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeldCursOnDateXMLResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeldCursOnDate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="On_date" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeldCursOnDateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeldCursOnDateResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCursOnDate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="On_date" type="s:dateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCursOnDateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCursOnDateResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="SaldoXMLSoapIn">
    <wsdl:part name="parameters" element="tns:SaldoXML" />
  </wsdl:message>
  <wsdl:message name="SaldoXMLSoapOut">
    <wsdl:part name="parameters" element="tns:SaldoXMLResponse" />
  </wsdl:message>
  <wsdl:message name="ROISfixXMLSoapIn">
    <wsdl:part name="parameters" element="tns:ROISfixXML" />
  </wsdl:message>
  <wsdl:message name="ROISfixXMLSoapOut">
    <wsdl:part name="parameters" element="tns:ROISfixXMLResponse" />
  </wsdl:message>
  <wsdl:message name="RuoniaXMLSoapIn">
    <wsdl:part name="parameters" element="tns:RuoniaXML" />
  </wsdl:message>
  <wsdl:message name="RuoniaXMLSoapOut">
    <wsdl:part name="parameters" element="tns:RuoniaXMLResponse" />
  </wsdl:message>
  <wsdl:message name="OstatDepoXMLSoapIn">
    <wsdl:part name="parameters" element="tns:OstatDepoXML" />
  </wsdl:message>
  <wsdl:message name="OstatDepoXMLSoapOut">
    <wsdl:part name="parameters" element="tns:OstatDepoXMLResponse" />
  </wsdl:message>
  <wsdl:message name="ValIntDayXMLSoapIn">
    <wsdl:part name="parameters" element="tns:ValIntDayXML" />
  </wsdl:message>
  <wsdl:message name="ValIntDayXMLSoapOut">
    <wsdl:part name="parameters" element="tns:ValIntDayXMLResponse" />
  </wsdl:message>
  <wsdl:message name="ValIntDaySoapIn">
    <wsdl:part name="parameters" element="tns:ValIntDay" />
  </wsdl:message>
  <wsdl:message name="ValIntDaySoapOut">
    <wsdl:part name="parameters" element="tns:ValIntDayResponse" />
  </wsdl:message>
  <wsdl:message name="OstatDepoSoapIn">
    <wsdl:part name="parameters" element="tns:OstatDepo" />
  </wsdl:message>
  <wsdl:message name="OstatDepoSoapOut">
    <wsdl:part name="parameters" element="tns:OstatDepoResponse" />
  </wsdl:message>
  <wsdl:message name="ROISfixSoapIn">
    <wsdl:part name="parameters" element="tns:ROISfix" />
  </wsdl:message>
  <wsdl:message name="ROISfixSoapOut">
    <wsdl:part name="parameters" element="tns:ROISfixResponse" />
  </wsdl:message>
  <wsdl:message name="RuoniaSoapIn">
    <wsdl:part name="parameters" element="tns:Ruonia" />
  </wsdl:message>
  <wsdl:message name="RuoniaSoapOut">
    <wsdl:part name="parameters" element="tns:RuoniaResponse" />
  </wsdl:message>
  <wsdl:message name="mrrf7DSoapIn">
    <wsdl:part name="parameters" element="tns:mrrf7D" />
  </wsdl:message>
  <wsdl:message name="mrrf7DSoapOut">
    <wsdl:part name="parameters" element="tns:mrrf7DResponse" />
  </wsdl:message>
  <wsdl:message name="mrrf7DXMLSoapIn">
    <wsdl:part name="parameters" element="tns:mrrf7DXML" />
  </wsdl:message>
  <wsdl:message name="mrrf7DXMLSoapOut">
    <wsdl:part name="parameters" element="tns:mrrf7DXMLResponse" />
  </wsdl:message>
  <wsdl:message name="RepoDebtUSDSoapIn">
    <wsdl:part name="parameters" element="tns:RepoDebtUSD" />
  </wsdl:message>
  <wsdl:message name="RepoDebtUSDSoapOut">
    <wsdl:part name="parameters" element="tns:RepoDebtUSDResponse" />
  </wsdl:message>
  <wsdl:message name="RepoDebtUSDXMLSoapIn">
    <wsdl:part name="parameters" element="tns:RepoDebtUSDXML" />
  </wsdl:message>
  <wsdl:message name="RepoDebtUSDXMLSoapOut">
    <wsdl:part name="parameters" element="tns:RepoDebtUSDXMLResponse" />
  </wsdl:message>
  <wsdl:message name="mrrfSoapIn">
    <wsdl:part name="parameters" element="tns:mrrf" />
  </wsdl:message>
  <wsdl:message name="mrrfSoapOut">
    <wsdl:part name="parameters" element="tns:mrrfResponse" />
  </wsdl:message>
  <wsdl:message name="mrrfXMLSoapIn">
    <wsdl:part name="parameters" element="tns:mrrfXML" />
  </wsdl:message>
  <wsdl:message name="mrrfXMLSoapOut">
    <wsdl:part name="parameters" element="tns:mrrfXMLResponse" />
  </wsdl:message>
  <wsdl:message name="SaldoSoapIn">
    <wsdl:part name="parameters" element="tns:Saldo" />
  </wsdl:message>
  <wsdl:message name="SaldoSoapOut">
    <wsdl:part name="parameters" element="tns:SaldoResponse" />
  </wsdl:message>
  <wsdl:message name="NewsInfoXMLSoapIn">
    <wsdl:part name="parameters" element="tns:NewsInfoXML" />
  </wsdl:message>
  <wsdl:message name="NewsInfoXMLSoapOut">
    <wsdl:part name="parameters" element="tns:NewsInfoXMLResponse" />
  </wsdl:message>
  <wsdl:message name="OmodInfoXMLSoapIn">
    <wsdl:part name="parameters" element="tns:OmodInfoXML" />
  </wsdl:message>
  <wsdl:message name="OmodInfoXMLSoapOut">
    <wsdl:part name="parameters" element="tns:OmodInfoXMLResponse" />
  </wsdl:message>
  <wsdl:message name="XVolSoapIn">
    <wsdl:part name="parameters" element="tns:XVol" />
  </wsdl:message>
  <wsdl:message name="XVolSoapOut">
    <wsdl:part name="parameters" element="tns:XVolResponse" />
  </wsdl:message>
  <wsdl:message name="XVolXMLSoapIn">
    <wsdl:part name="parameters" element="tns:XVolXML" />
  </wsdl:message>
  <wsdl:message name="XVolXMLSoapOut">
    <wsdl:part name="parameters" element="tns:XVolXMLResponse" />
  </wsdl:message>
  <wsdl:message name="MainInfoXMLSoapIn">
    <wsdl:part name="parameters" element="tns:MainInfoXML" />
  </wsdl:message>
  <wsdl:message name="MainInfoXMLSoapOut">
    <wsdl:part name="parameters" element="tns:MainInfoXMLResponse" />
  </wsdl:message>
  <wsdl:message name="AllDataInfoXMLSoapIn">
    <wsdl:part name="parameters" element="tns:AllDataInfoXML" />
  </wsdl:message>
  <wsdl:message name="AllDataInfoXMLSoapOut">
    <wsdl:part name="parameters" element="tns:AllDataInfoXMLResponse" />
  </wsdl:message>
  <wsdl:message name="NewsInfoSoapIn">
    <wsdl:part name="parameters" element="tns:NewsInfo" />
  </wsdl:message>
  <wsdl:message name="NewsInfoSoapOut">
    <wsdl:part name="parameters" element="tns:NewsInfoResponse" />
  </wsdl:message>
  <wsdl:message name="SwapDayTotalSoapIn">
    <wsdl:part name="parameters" element="tns:SwapDayTotal" />
  </wsdl:message>
  <wsdl:message name="SwapDayTotalSoapOut">
    <wsdl:part name="parameters" element="tns:SwapDayTotalResponse" />
  </wsdl:message>
  <wsdl:message name="SwapDayTotalXMLSoapIn">
    <wsdl:part name="parameters" element="tns:SwapDayTotalXML" />
  </wsdl:message>
  <wsdl:message name="SwapDayTotalXMLSoapOut">
    <wsdl:part name="parameters" element="tns:SwapDayTotalXMLResponse" />
  </wsdl:message>
  <wsdl:message name="SwapDynamicXMLSoapIn">
    <wsdl:part name="parameters" element="tns:SwapDynamicXML" />
  </wsdl:message>
  <wsdl:message name="SwapDynamicXMLSoapOut">
    <wsdl:part name="parameters" element="tns:SwapDynamicXMLResponse" />
  </wsdl:message>
  <wsdl:message name="SwapInfoSellUSDVolXMLSoapIn">
    <wsdl:part name="parameters" element="tns:SwapInfoSellUSDVolXML" />
  </wsdl:message>
  <wsdl:message name="SwapInfoSellUSDVolXMLSoapOut">
    <wsdl:part name="parameters" element="tns:SwapInfoSellUSDVolXMLResponse" />
  </wsdl:message>
  <wsdl:message name="SwapInfoSellUSDVolSoapIn">
    <wsdl:part name="parameters" element="tns:SwapInfoSellUSDVol" />
  </wsdl:message>
  <wsdl:message name="SwapInfoSellUSDVolSoapOut">
    <wsdl:part name="parameters" element="tns:SwapInfoSellUSDVolResponse" />
  </wsdl:message>
  <wsdl:message name="SwapInfoSellUSDSoapIn">
    <wsdl:part name="parameters" element="tns:SwapInfoSellUSD" />
  </wsdl:message>
  <wsdl:message name="SwapInfoSellUSDSoapOut">
    <wsdl:part name="parameters" element="tns:SwapInfoSellUSDResponse" />
  </wsdl:message>
  <wsdl:message name="SwapInfoSellUSDXMLSoapIn">
    <wsdl:part name="parameters" element="tns:SwapInfoSellUSDXML" />
  </wsdl:message>
  <wsdl:message name="SwapInfoSellUSDXMLSoapOut">
    <wsdl:part name="parameters" element="tns:SwapInfoSellUSDXMLResponse" />
  </wsdl:message>
  <wsdl:message name="BiCurBaseXMLSoapIn">
    <wsdl:part name="parameters" element="tns:BiCurBaseXML" />
  </wsdl:message>
  <wsdl:message name="BiCurBaseXMLSoapOut">
    <wsdl:part name="parameters" element="tns:BiCurBaseXMLResponse" />
  </wsdl:message>
  <wsdl:message name="BiCurBaseSoapIn">
    <wsdl:part name="parameters" element="tns:BiCurBase" />
  </wsdl:message>
  <wsdl:message name="BiCurBaseSoapOut">
    <wsdl:part name="parameters" element="tns:BiCurBaseResponse" />
  </wsdl:message>
  <wsdl:message name="BiCurBacketXMLSoapIn">
    <wsdl:part name="parameters" element="tns:BiCurBacketXML" />
  </wsdl:message>
  <wsdl:message name="BiCurBacketXMLSoapOut">
    <wsdl:part name="parameters" element="tns:BiCurBacketXMLResponse" />
  </wsdl:message>
  <wsdl:message name="BiCurBacketSoapIn">
    <wsdl:part name="parameters" element="tns:BiCurBacket" />
  </wsdl:message>
  <wsdl:message name="BiCurBacketSoapOut">
    <wsdl:part name="parameters" element="tns:BiCurBacketResponse" />
  </wsdl:message>
  <wsdl:message name="SwapDynamicSoapIn">
    <wsdl:part name="parameters" element="tns:SwapDynamic" />
  </wsdl:message>
  <wsdl:message name="SwapDynamicSoapOut">
    <wsdl:part name="parameters" element="tns:SwapDynamicResponse" />
  </wsdl:message>
  <wsdl:message name="SwapMonthTotalSoapIn">
    <wsdl:part name="parameters" element="tns:SwapMonthTotal" />
  </wsdl:message>
  <wsdl:message name="SwapMonthTotalSoapOut">
    <wsdl:part name="parameters" element="tns:SwapMonthTotalResponse" />
  </wsdl:message>
  <wsdl:message name="SwapMonthTotalXMLSoapIn">
    <wsdl:part name="parameters" element="tns:SwapMonthTotalXML" />
  </wsdl:message>
  <wsdl:message name="SwapMonthTotalXMLSoapOut">
    <wsdl:part name="parameters" element="tns:SwapMonthTotalXMLResponse" />
  </wsdl:message>
  <wsdl:message name="MKRSoapIn">
    <wsdl:part name="parameters" element="tns:MKR" />
  </wsdl:message>
  <wsdl:message name="MKRSoapOut">
    <wsdl:part name="parameters" element="tns:MKRResponse" />
  </wsdl:message>
  <wsdl:message name="MKRXMLSoapIn">
    <wsdl:part name="parameters" element="tns:MKRXML" />
  </wsdl:message>
  <wsdl:message name="MKRXMLSoapOut">
    <wsdl:part name="parameters" element="tns:MKRXMLResponse" />
  </wsdl:message>
  <wsdl:message name="DVSoapIn">
    <wsdl:part name="parameters" element="tns:DV" />
  </wsdl:message>
  <wsdl:message name="DVSoapOut">
    <wsdl:part name="parameters" element="tns:DVResponse" />
  </wsdl:message>
  <wsdl:message name="DVXMLSoapIn">
    <wsdl:part name="parameters" element="tns:DVXML" />
  </wsdl:message>
  <wsdl:message name="DVXMLSoapOut">
    <wsdl:part name="parameters" element="tns:DVXMLResponse" />
  </wsdl:message>
  <wsdl:message name="Repo_debtSoapIn">
    <wsdl:part name="parameters" element="tns:Repo_debt" />
  </wsdl:message>
  <wsdl:message name="Repo_debtSoapOut">
    <wsdl:part name="parameters" element="tns:Repo_debtResponse" />
  </wsdl:message>
  <wsdl:message name="Repo_debtXMLSoapIn">
    <wsdl:part name="parameters" element="tns:Repo_debtXML" />
  </wsdl:message>
  <wsdl:message name="Repo_debtXMLSoapOut">
    <wsdl:part name="parameters" element="tns:Repo_debtXMLResponse" />
  </wsdl:message>
  <wsdl:message name="Coins_baseSoapIn">
    <wsdl:part name="parameters" element="tns:Coins_base" />
  </wsdl:message>
  <wsdl:message name="Coins_baseSoapOut">
    <wsdl:part name="parameters" element="tns:Coins_baseResponse" />
  </wsdl:message>
  <wsdl:message name="Coins_baseXMLSoapIn">
    <wsdl:part name="parameters" element="tns:Coins_baseXML" />
  </wsdl:message>
  <wsdl:message name="Coins_baseXMLSoapOut">
    <wsdl:part name="parameters" element="tns:Coins_baseXMLResponse" />
  </wsdl:message>
  <wsdl:message name="FixingBaseSoapIn">
    <wsdl:part name="parameters" element="tns:FixingBase" />
  </wsdl:message>
  <wsdl:message name="FixingBaseSoapOut">
    <wsdl:part name="parameters" element="tns:FixingBaseResponse" />
  </wsdl:message>
  <wsdl:message name="FixingBaseXMLSoapIn">
    <wsdl:part name="parameters" element="tns:FixingBaseXML" />
  </wsdl:message>
  <wsdl:message name="FixingBaseXMLSoapOut">
    <wsdl:part name="parameters" element="tns:FixingBaseXMLResponse" />
  </wsdl:message>
  <wsdl:message name="OvernightSoapIn">
    <wsdl:part name="parameters" element="tns:Overnight" />
  </wsdl:message>
  <wsdl:message name="OvernightSoapOut">
    <wsdl:part name="parameters" element="tns:OvernightResponse" />
  </wsdl:message>
  <wsdl:message name="OvernightXMLSoapIn">
    <wsdl:part name="parameters" element="tns:OvernightXML" />
  </wsdl:message>
  <wsdl:message name="OvernightXMLSoapOut">
    <wsdl:part name="parameters" element="tns:OvernightXMLResponse" />
  </wsdl:message>
  <wsdl:message name="BauctionSoapIn">
    <wsdl:part name="parameters" element="tns:Bauction" />
  </wsdl:message>
  <wsdl:message name="BauctionSoapOut">
    <wsdl:part name="parameters" element="tns:BauctionResponse" />
  </wsdl:message>
  <wsdl:message name="BauctionXMLSoapIn">
    <wsdl:part name="parameters" element="tns:BauctionXML" />
  </wsdl:message>
  <wsdl:message name="BauctionXMLSoapOut">
    <wsdl:part name="parameters" element="tns:BauctionXMLResponse" />
  </wsdl:message>
  <wsdl:message name="DepoDynamicXMLSoapIn">
    <wsdl:part name="parameters" element="tns:DepoDynamicXML" />
  </wsdl:message>
  <wsdl:message name="DepoDynamicXMLSoapOut">
    <wsdl:part name="parameters" element="tns:DepoDynamicXMLResponse" />
  </wsdl:message>
  <wsdl:message name="DepoDynamicSoapIn">
    <wsdl:part name="parameters" element="tns:DepoDynamic" />
  </wsdl:message>
  <wsdl:message name="DepoDynamicSoapOut">
    <wsdl:part name="parameters" element="tns:DepoDynamicResponse" />
  </wsdl:message>
  <wsdl:message name="OstatDynamicXMLSoapIn">
    <wsdl:part name="parameters" element="tns:OstatDynamicXML" />
  </wsdl:message>
  <wsdl:message name="OstatDynamicXMLSoapOut">
    <wsdl:part name="parameters" element="tns:OstatDynamicXMLResponse" />
  </wsdl:message>
  <wsdl:message name="OstatDynamicSoapIn">
    <wsdl:part name="parameters" element="tns:OstatDynamic" />
  </wsdl:message>
  <wsdl:message name="OstatDynamicSoapOut">
    <wsdl:part name="parameters" element="tns:OstatDynamicResponse" />
  </wsdl:message>
  <wsdl:message name="DragMetDynamicXMLSoapIn">
    <wsdl:part name="parameters" element="tns:DragMetDynamicXML" />
  </wsdl:message>
  <wsdl:message name="DragMetDynamicXMLSoapOut">
    <wsdl:part name="parameters" element="tns:DragMetDynamicXMLResponse" />
  </wsdl:message>
  <wsdl:message name="DragMetDynamicSoapIn">
    <wsdl:part name="parameters" element="tns:DragMetDynamic" />
  </wsdl:message>
  <wsdl:message name="DragMetDynamicSoapOut">
    <wsdl:part name="parameters" element="tns:DragMetDynamicResponse" />
  </wsdl:message>
  <wsdl:message name="GetLatestDateTimeSoapIn">
    <wsdl:part name="parameters" element="tns:GetLatestDateTime" />
  </wsdl:message>
  <wsdl:message name="GetLatestDateTimeSoapOut">
    <wsdl:part name="parameters" element="tns:GetLatestDateTimeResponse" />
  </wsdl:message>
  <wsdl:message name="GetLatestDateSoapIn">
    <wsdl:part name="parameters" element="tns:GetLatestDate" />
  </wsdl:message>
  <wsdl:message name="GetLatestDateSoapOut">
    <wsdl:part name="parameters" element="tns:GetLatestDateResponse" />
  </wsdl:message>
  <wsdl:message name="GetLatestDateTimeSeldSoapIn">
    <wsdl:part name="parameters" element="tns:GetLatestDateTimeSeld" />
  </wsdl:message>
  <wsdl:message name="GetLatestDateTimeSeldSoapOut">
    <wsdl:part name="parameters" element="tns:GetLatestDateTimeSeldResponse" />
  </wsdl:message>
  <wsdl:message name="GetLatestDateSeldSoapIn">
    <wsdl:part name="parameters" element="tns:GetLatestDateSeld" />
  </wsdl:message>
  <wsdl:message name="GetLatestDateSeldSoapOut">
    <wsdl:part name="parameters" element="tns:GetLatestDateSeldResponse" />
  </wsdl:message>
  <wsdl:message name="EnumValutesXMLSoapIn">
    <wsdl:part name="parameters" element="tns:EnumValutesXML" />
  </wsdl:message>
  <wsdl:message name="EnumValutesXMLSoapOut">
    <wsdl:part name="parameters" element="tns:EnumValutesXMLResponse" />
  </wsdl:message>
  <wsdl:message name="EnumValutesSoapIn">
    <wsdl:part name="parameters" element="tns:EnumValutes" />
  </wsdl:message>
  <wsdl:message name="EnumValutesSoapOut">
    <wsdl:part name="parameters" element="tns:EnumValutesResponse" />
  </wsdl:message>
  <wsdl:message name="GetLatestReutersDateTimeSoapIn">
    <wsdl:part name="parameters" element="tns:GetLatestReutersDateTime" />
  </wsdl:message>
  <wsdl:message name="GetLatestReutersDateTimeSoapOut">
    <wsdl:part name="parameters" element="tns:GetLatestReutersDateTimeResponse" />
  </wsdl:message>
  <wsdl:message name="EnumReutersValutesXMLSoapIn">
    <wsdl:part name="parameters" element="tns:EnumReutersValutesXML" />
  </wsdl:message>
  <wsdl:message name="EnumReutersValutesXMLSoapOut">
    <wsdl:part name="parameters" element="tns:EnumReutersValutesXMLResponse" />
  </wsdl:message>
  <wsdl:message name="EnumReutersValutesSoapIn">
    <wsdl:part name="parameters" element="tns:EnumReutersValutes" />
  </wsdl:message>
  <wsdl:message name="EnumReutersValutesSoapOut">
    <wsdl:part name="parameters" element="tns:EnumReutersValutesResponse" />
  </wsdl:message>
  <wsdl:message name="GetReutersCursOnDateXMLSoapIn">
    <wsdl:part name="parameters" element="tns:GetReutersCursOnDateXML" />
  </wsdl:message>
  <wsdl:message name="GetReutersCursOnDateXMLSoapOut">
    <wsdl:part name="parameters" element="tns:GetReutersCursOnDateXMLResponse" />
  </wsdl:message>
  <wsdl:message name="GetReutersCursOnDateSoapIn">
    <wsdl:part name="parameters" element="tns:GetReutersCursOnDate" />
  </wsdl:message>
  <wsdl:message name="GetReutersCursOnDateSoapOut">
    <wsdl:part name="parameters" element="tns:GetReutersCursOnDateResponse" />
  </wsdl:message>
  <wsdl:message name="GetReutersCursDynamicXMLSoapIn">
    <wsdl:part name="parameters" element="tns:GetReutersCursDynamicXML" />
  </wsdl:message>
  <wsdl:message name="GetReutersCursDynamicXMLSoapOut">
    <wsdl:part name="parameters" element="tns:GetReutersCursDynamicXMLResponse" />
  </wsdl:message>
  <wsdl:message name="GetReutersCursDynamicSoapIn">
    <wsdl:part name="parameters" element="tns:GetReutersCursDynamic" />
  </wsdl:message>
  <wsdl:message name="GetReutersCursDynamicSoapOut">
    <wsdl:part name="parameters" element="tns:GetReutersCursDynamicResponse" />
  </wsdl:message>
  <wsdl:message name="GetCursDynamicXMLSoapIn">
    <wsdl:part name="parameters" element="tns:GetCursDynamicXML" />
  </wsdl:message>
  <wsdl:message name="GetCursDynamicXMLSoapOut">
    <wsdl:part name="parameters" element="tns:GetCursDynamicXMLResponse" />
  </wsdl:message>
  <wsdl:message name="GetCursDynamicSoapIn">
    <wsdl:part name="parameters" element="tns:GetCursDynamic" />
  </wsdl:message>
  <wsdl:message name="GetCursDynamicSoapOut">
    <wsdl:part name="parameters" element="tns:GetCursDynamicResponse" />
  </wsdl:message>
  <wsdl:message name="GetCursOnDateXMLSoapIn">
    <wsdl:part name="parameters" element="tns:GetCursOnDateXML" />
  </wsdl:message>
  <wsdl:message name="GetCursOnDateXMLSoapOut">
    <wsdl:part name="parameters" element="tns:GetCursOnDateXMLResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeldCursOnDateXMLSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeldCursOnDateXML" />
  </wsdl:message>
  <wsdl:message name="GetSeldCursOnDateXMLSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeldCursOnDateXMLResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeldCursOnDateSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeldCursOnDate" />
  </wsdl:message>
  <wsdl:message name="GetSeldCursOnDateSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeldCursOnDateResponse" />
  </wsdl:message>
  <wsdl:message name="GetCursOnDateSoapIn">
    <wsdl:part name="parameters" element="tns:GetCursOnDate" />
  </wsdl:message>
  <wsdl:message name="GetCursOnDateSoapOut">
    <wsdl:part name="parameters" element="tns:GetCursOnDateResponse" />
  </wsdl:message>
  <wsdl:portType name="DailyInfoSoap">
    <wsdl:operation name="SaldoXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Сальдо операций ЦБ РФ по предоставлению/абсорбированию ликвидности (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:SaldoXMLSoapIn" />
      <wsdl:output message="tns:SaldoXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ROISfixXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ставка ROISfix (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:ROISfixXMLSoapIn" />
      <wsdl:output message="tns:ROISfixXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RuoniaXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ставка Ruonia (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:RuoniaXMLSoapIn" />
      <wsdl:output message="tns:RuoniaXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="OstatDepoXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Депозиты банков в Банке России (млн. руб) (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:OstatDepoXMLSoapIn" />
      <wsdl:output message="tns:OstatDepoXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ValIntDayXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Данные по интервенциям Банка России на внутреннем валютном рынке - Ежедневные значения (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:ValIntDayXMLSoapIn" />
      <wsdl:output message="tns:ValIntDayXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ValIntDay">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Данные по интервенциям Банка России на внутреннем валютном рынке - Ежедневные значения</wsdl:documentation>
      <wsdl:input message="tns:ValIntDaySoapIn" />
      <wsdl:output message="tns:ValIntDaySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="OstatDepo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Депозиты банков в Банке России (млн. руб)</wsdl:documentation>
      <wsdl:input message="tns:OstatDepoSoapIn" />
      <wsdl:output message="tns:OstatDepoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ROISfix">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ставка ROISfix (DataSet)</wsdl:documentation>
      <wsdl:input message="tns:ROISfixSoapIn" />
      <wsdl:output message="tns:ROISfixSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Ruonia">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ставка RUONIA (DataSet)</wsdl:documentation>
      <wsdl:input message="tns:RuoniaSoapIn" />
      <wsdl:output message="tns:RuoniaSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="mrrf7D">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Международные резервы Российской Федерации, еженедельные значения (DataSet)</wsdl:documentation>
      <wsdl:input message="tns:mrrf7DSoapIn" />
      <wsdl:output message="tns:mrrf7DSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="mrrf7DXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Международные резервы Российской Федерации, еженедельные значения  (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:mrrf7DXMLSoapIn" />
      <wsdl:output message="tns:mrrf7DXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RepoDebtUSD">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Задолженность кредитных организаций перед Банком России по операциям РЕПО в иностранной валюте (DataSet)</wsdl:documentation>
      <wsdl:input message="tns:RepoDebtUSDSoapIn" />
      <wsdl:output message="tns:RepoDebtUSDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RepoDebtUSDXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Задолженность кредитных организаций перед Банком России по операциям РЕПО в иностранной валюте  (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:RepoDebtUSDXMLSoapIn" />
      <wsdl:output message="tns:RepoDebtUSDXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="mrrf">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Международные резервы Российской Федерации, ежемесячные значения  (DataSet)</wsdl:documentation>
      <wsdl:input message="tns:mrrfSoapIn" />
      <wsdl:output message="tns:mrrfSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="mrrfXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Международные резервы Российской Федерации, ежемесячные значения  (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:mrrfXMLSoapIn" />
      <wsdl:output message="tns:mrrfXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Saldo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Сальдо операций ЦБ РФ по предоставлению/абсорбированию ликвидности (DataSet)</wsdl:documentation>
      <wsdl:input message="tns:SaldoSoapIn" />
      <wsdl:output message="tns:SaldoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="NewsInfoXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение новостей сервера (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:NewsInfoXMLSoapIn" />
      <wsdl:output message="tns:NewsInfoXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="OmodInfoXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Операции на открытом рынке (как XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:OmodInfoXMLSoapIn" />
      <wsdl:output message="tns:OmodInfoXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="XVol">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Операции Банка России на рынке государственных ценных бумаг по поручению Министерства финансов Российской Федерации (как DataSet)</wsdl:documentation>
      <wsdl:input message="tns:XVolSoapIn" />
      <wsdl:output message="tns:XVolSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="XVolXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Операции Банка России на рынке государственных ценных бумаг по поручению Министерства финансов Российской Федерации  (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:XVolXMLSoapIn" />
      <wsdl:output message="tns:XVolXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="MainInfoXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение основной информации - Ставка рефинансирования, золотовалютные резервы, денежная база, денежная масса (как XMLDocument) ver 28.05.2019</wsdl:documentation>
      <wsdl:input message="tns:MainInfoXMLSoapIn" />
      <wsdl:output message="tns:MainInfoXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AllDataInfoXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение всей оперативной информации (XmlDocument) ver 26.01.2017</wsdl:documentation>
      <wsdl:input message="tns:AllDataInfoXMLSoapIn" />
      <wsdl:output message="tns:AllDataInfoXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="NewsInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение новостей сервера (DataSet)</wsdl:documentation>
      <wsdl:input message="tns:NewsInfoSoapIn" />
      <wsdl:output message="tns:NewsInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SwapDayTotal">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Задолженность кредитных организаций перед Банком России по сделкам «валютный своп» (DataSet)</wsdl:documentation>
      <wsdl:input message="tns:SwapDayTotalSoapIn" />
      <wsdl:output message="tns:SwapDayTotalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SwapDayTotalXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Задолженность кредитных организаций перед Банком России по сделкам «валютный своп» (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:SwapDayTotalXMLSoapIn" />
      <wsdl:output message="tns:SwapDayTotalXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SwapDynamicXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Валютный своп buy/sell overnight (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:SwapDynamicXMLSoapIn" />
      <wsdl:output message="tns:SwapDynamicXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSDVolXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Объем сделок «валютный своп» по продаже долларов США за рубли, заключенных Банком России (XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:SwapInfoSellUSDVolXMLSoapIn" />
      <wsdl:output message="tns:SwapInfoSellUSDVolXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSDVol">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Объем сделок «валютный своп» по продаже долларов США за рубли, заключенных Банком России (DataSet) ver 21.11.2014</wsdl:documentation>
      <wsdl:input message="tns:SwapInfoSellUSDVolSoapIn" />
      <wsdl:output message="tns:SwapInfoSellUSDVolSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSD">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Условия заключения сделок «валютный своп» по продаже долларов США за рубли (DataSet) ver 18.09.2014</wsdl:documentation>
      <wsdl:input message="tns:SwapInfoSellUSDSoapIn" />
      <wsdl:output message="tns:SwapInfoSellUSDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSDXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Условия заключения сделок «валютный своп» по продаже долларов США за рубли (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:SwapInfoSellUSDXMLSoapIn" />
      <wsdl:output message="tns:SwapInfoSellUSDXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="BiCurBaseXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Стоимость бивалютной корзины (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:BiCurBaseXMLSoapIn" />
      <wsdl:output message="tns:BiCurBaseXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="BiCurBase">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Стоимость бивалютной корзины (DataSet) ver 03.12.2014</wsdl:documentation>
      <wsdl:input message="tns:BiCurBaseSoapIn" />
      <wsdl:output message="tns:BiCurBaseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="BiCurBacketXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Структура бивалютной корзины  (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:BiCurBacketXMLSoapIn" />
      <wsdl:output message="tns:BiCurBacketXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="BiCurBacket">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Структура бивалютной корзины  (DataSet) ver 03.12.2014</wsdl:documentation>
      <wsdl:input message="tns:BiCurBacketSoapIn" />
      <wsdl:output message="tns:BiCurBacketSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SwapDynamic">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Условия заключения сделок «валютный своп» по покупке долларов США и евро за рубли (DataSet) ver 31.07.2012</wsdl:documentation>
      <wsdl:input message="tns:SwapDynamicSoapIn" />
      <wsdl:output message="tns:SwapDynamicSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SwapMonthTotal">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Объем сделок 'валютный своп' Банка России (DataSet) ver 03.04.2014</wsdl:documentation>
      <wsdl:input message="tns:SwapMonthTotalSoapIn" />
      <wsdl:output message="tns:SwapMonthTotalSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SwapMonthTotalXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Объем сделок 'валютный своп' Банка России (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:SwapMonthTotalXMLSoapIn" />
      <wsdl:output message="tns:SwapMonthTotalXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="MKR">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ставки межбанковского кредитного рынка  (DataSet) ver 31.07.2012</wsdl:documentation>
      <wsdl:input message="tns:MKRSoapIn" />
      <wsdl:output message="tns:MKRSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="MKRXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ставки межбанковского кредитного рынка (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:MKRXMLSoapIn" />
      <wsdl:output message="tns:MKRXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DV">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Требования Банка России к кредитным организациям (DataSet) ver 31.07.2012</wsdl:documentation>
      <wsdl:input message="tns:DVSoapIn" />
      <wsdl:output message="tns:DVSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DVXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Требования Банка России к кредитным организациям (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:DVXMLSoapIn" />
      <wsdl:output message="tns:DVXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Repo_debt">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Задолженность кредитных организаций перед Банком России по операциям прямого РЕПО (DataSet) ver 18.06.2014</wsdl:documentation>
      <wsdl:input message="tns:Repo_debtSoapIn" />
      <wsdl:output message="tns:Repo_debtSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Repo_debtXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Задолженность кредитных организаций перед Банком России по операциям прямого РЕПО (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:Repo_debtXMLSoapIn" />
      <wsdl:output message="tns:Repo_debtXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Coins_base">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Отпускные цены Банка России на инвестиционные монеты (DataSet) ver 31.07.2012</wsdl:documentation>
      <wsdl:input message="tns:Coins_baseSoapIn" />
      <wsdl:output message="tns:Coins_baseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Coins_baseXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Отпускные цены Банка России на инвестиционные монеты (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:Coins_baseXMLSoapIn" />
      <wsdl:output message="tns:Coins_baseXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="FixingBase">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Фиксинги на драгоценные металлы (DataSet) ver 31.07.2012</wsdl:documentation>
      <wsdl:input message="tns:FixingBaseSoapIn" />
      <wsdl:output message="tns:FixingBaseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="FixingBaseXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Фиксинги на драгоценные металлы (как xmlDocument)</wsdl:documentation>
      <wsdl:input message="tns:FixingBaseXMLSoapIn" />
      <wsdl:output message="tns:FixingBaseXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Overnight">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ставки по кредиту 'overnight' (DataSet) ver 31.07.2012</wsdl:documentation>
      <wsdl:input message="tns:OvernightSoapIn" />
      <wsdl:output message="tns:OvernightSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="OvernightXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Ставки по кредиту 'overnight' (как xmlDocument</wsdl:documentation>
      <wsdl:input message="tns:OvernightXMLSoapIn" />
      <wsdl:output message="tns:OvernightXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Bauction">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">База данных по размещению бюджетных средств на депозиты коммерческих банков (DataSet) ver 31.07.2012</wsdl:documentation>
      <wsdl:input message="tns:BauctionSoapIn" />
      <wsdl:output message="tns:BauctionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="BauctionXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">База данных по размещению бюджетных средств на депозиты коммерческих банков (как xmlDocument</wsdl:documentation>
      <wsdl:input message="tns:BauctionXMLSoapIn" />
      <wsdl:output message="tns:BauctionXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DepoDynamicXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Динамики ставок привлечения средств по депозитным операциям (как xmlDocument</wsdl:documentation>
      <wsdl:input message="tns:DepoDynamicXMLSoapIn" />
      <wsdl:output message="tns:DepoDynamicXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DepoDynamic">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Динамика ставок привлечения средств по депозитным операциям (DataSet) </wsdl:documentation>
      <wsdl:input message="tns:DepoDynamicSoapIn" />
      <wsdl:output message="tns:DepoDynamicSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="OstatDynamicXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Динамики сведений об остатках средств на корреспондентских счетах кредитных организаций (XMLDocument).</wsdl:documentation>
      <wsdl:input message="tns:OstatDynamicXMLSoapIn" />
      <wsdl:output message="tns:OstatDynamicXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="OstatDynamic">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Динамики сведений об остатках средств на корреспондентских счетах кредитных организаций (DataSet)!</wsdl:documentation>
      <wsdl:input message="tns:OstatDynamicSoapIn" />
      <wsdl:output message="tns:OstatDynamicSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DragMetDynamicXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Динамика учетных цен драгоценных металлов (как XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:DragMetDynamicXMLSoapIn" />
      <wsdl:output message="tns:DragMetDynamicXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DragMetDynamic">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Динамика учетных цен драгоценных металлов (DataSet)</wsdl:documentation>
      <wsdl:input message="tns:DragMetDynamicSoapIn" />
      <wsdl:output message="tns:DragMetDynamicSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLatestDateTime">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Последняя дата публикации курсов валют как DateTime (ежедневные валюты)</wsdl:documentation>
      <wsdl:input message="tns:GetLatestDateTimeSoapIn" />
      <wsdl:output message="tns:GetLatestDateTimeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLatestDate">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Последняя дата публикации курсов валют(ежемесячные валюты) - строка</wsdl:documentation>
      <wsdl:input message="tns:GetLatestDateSoapIn" />
      <wsdl:output message="tns:GetLatestDateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLatestDateTimeSeld">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Последняя дата публикации курсов валют как DateTime (ежемесячные валюты)</wsdl:documentation>
      <wsdl:input message="tns:GetLatestDateTimeSeldSoapIn" />
      <wsdl:output message="tns:GetLatestDateTimeSeldSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLatestDateSeld">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Последняя дата публикации курсов валют (ежемесячные валюты) - строка yyyyMMdd</wsdl:documentation>
      <wsdl:input message="tns:GetLatestDateSeldSoapIn" />
      <wsdl:output message="tns:GetLatestDateSeldSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EnumValutesXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Справочник по кодам валют (как XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:EnumValutesXMLSoapIn" />
      <wsdl:output message="tns:EnumValutesXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EnumValutes">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Справочник по кодам валют (как DataSet)</wsdl:documentation>
      <wsdl:input message="tns:EnumValutesSoapIn" />
      <wsdl:output message="tns:EnumValutesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLatestReutersDateTime">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Последняя дата публикации редких валют от Thomson Reuters как DateTime (ежемесячные валюты)</wsdl:documentation>
      <wsdl:input message="tns:GetLatestReutersDateTimeSoapIn" />
      <wsdl:output message="tns:GetLatestReutersDateTimeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EnumReutersValutesXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Справочник по кодам редких валют от Thomson Reuters (как XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:EnumReutersValutesXMLSoapIn" />
      <wsdl:output message="tns:EnumReutersValutesXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EnumReutersValutes">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Справочник по кодам редких валют от Thomson Reuters  (как DataSet)</wsdl:documentation>
      <wsdl:input message="tns:EnumReutersValutesSoapIn" />
      <wsdl:output message="tns:EnumReutersValutesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursOnDateXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение ежедневных курсов редких валют от Thomson Reuters (как XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:GetReutersCursOnDateXMLSoapIn" />
      <wsdl:output message="tns:GetReutersCursOnDateXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursOnDate">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение ежедневных курсов редких валют от Thomson Reuters (как DataSet)</wsdl:documentation>
      <wsdl:input message="tns:GetReutersCursOnDateSoapIn" />
      <wsdl:output message="tns:GetReutersCursOnDateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursDynamicXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение динамики ежедневных курсов редкой валюты от Thomson Reuters (как XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:GetReutersCursDynamicXMLSoapIn" />
      <wsdl:output message="tns:GetReutersCursDynamicXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursDynamic">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение динамики ежедневных курсов редкой валюты от Thomson Reuters (как DataSet)</wsdl:documentation>
      <wsdl:input message="tns:GetReutersCursDynamicSoapIn" />
      <wsdl:output message="tns:GetReutersCursDynamicSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCursDynamicXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение динамики ежедневных курсов валюты (как XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:GetCursDynamicXMLSoapIn" />
      <wsdl:output message="tns:GetCursDynamicXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCursDynamic">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение динамики ежедневных курсов валюты (как DataSet)</wsdl:documentation>
      <wsdl:input message="tns:GetCursDynamicSoapIn" />
      <wsdl:output message="tns:GetCursDynamicSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCursOnDateXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение ежедневных курсов валют (как XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:GetCursOnDateXMLSoapIn" />
      <wsdl:output message="tns:GetCursOnDateXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeldCursOnDateXML">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение ежемесячных курсов валют !*устаревший! (как XMLDocument)</wsdl:documentation>
      <wsdl:input message="tns:GetSeldCursOnDateXMLSoapIn" />
      <wsdl:output message="tns:GetSeldCursOnDateXMLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeldCursOnDate">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение ежемесячных курсов валют !*устаревший! (как DataSet)</wsdl:documentation>
      <wsdl:input message="tns:GetSeldCursOnDateSoapIn" />
      <wsdl:output message="tns:GetSeldCursOnDateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCursOnDate">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Получение ежедневных курсов валют (как DataSet)</wsdl:documentation>
      <wsdl:input message="tns:GetCursOnDateSoapIn" />
      <wsdl:output message="tns:GetCursOnDateSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="DailyInfoSoap" type="tns:DailyInfoSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="SaldoXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SaldoXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ROISfixXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/ROISfixXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RuoniaXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/RuoniaXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OstatDepoXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OstatDepoXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ValIntDayXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/ValIntDayXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ValIntDay">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/ValIntDay" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OstatDepo">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OstatDepo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ROISfix">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/ROISfix" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Ruonia">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Ruonia" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="mrrf7D">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/mrrf7D" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="mrrf7DXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/mrrf7DXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RepoDebtUSD">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/RepoDebtUSD" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RepoDebtUSDXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/RepoDebtUSDXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="mrrf">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/mrrf" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="mrrfXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/mrrfXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Saldo">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Saldo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewsInfoXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/NewsInfoXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OmodInfoXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OmodInfoXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="XVol">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/XVol" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="XVolXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/XVolXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="MainInfoXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/MainInfoXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AllDataInfoXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/AllDataInfoXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewsInfo">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/NewsInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapDayTotal">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapDayTotal" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapDayTotalXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapDayTotalXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapDynamicXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapDynamicXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSDVolXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapInfoSellUSDVolXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSDVol">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapInfoSellUSDVol" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSD">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapInfoSellUSD" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSDXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapInfoSellUSDXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BiCurBaseXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/BiCurBaseXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BiCurBase">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/BiCurBase" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BiCurBacketXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/BiCurBacketXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BiCurBacket">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/BiCurBacket" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapDynamic">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapDynamic" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapMonthTotal">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapMonthTotal" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapMonthTotalXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapMonthTotalXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="MKR">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/MKR" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="MKRXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/MKRXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DV">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DV" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DVXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DVXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Repo_debt">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Repo_debt" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Repo_debtXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Repo_debtXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Coins_base">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Coins_base" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Coins_baseXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Coins_baseXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FixingBase">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/FixingBase" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FixingBaseXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/FixingBaseXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Overnight">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Overnight" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OvernightXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OvernightXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Bauction">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Bauction" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BauctionXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/BauctionXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DepoDynamicXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DepoDynamicXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DepoDynamic">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DepoDynamic" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OstatDynamicXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OstatDynamicXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OstatDynamic">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OstatDynamic" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DragMetDynamicXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DragMetDynamicXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DragMetDynamic">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DragMetDynamic" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLatestDateTime">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetLatestDateTime" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLatestDate">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetLatestDate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLatestDateTimeSeld">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetLatestDateTimeSeld" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLatestDateSeld">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetLatestDateSeld" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EnumValutesXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/EnumValutesXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EnumValutes">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/EnumValutes" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLatestReutersDateTime">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetLatestReutersDateTime" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EnumReutersValutesXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/EnumReutersValutesXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EnumReutersValutes">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/EnumReutersValutes" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursOnDateXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetReutersCursOnDateXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursOnDate">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetReutersCursOnDate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursDynamicXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetReutersCursDynamicXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursDynamic">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetReutersCursDynamic" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCursDynamicXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetCursDynamicXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCursDynamic">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetCursDynamic" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCursOnDateXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetCursOnDateXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeldCursOnDateXML">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetSeldCursOnDateXML" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeldCursOnDate">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetSeldCursOnDate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCursOnDate">
      <soap:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetCursOnDate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="DailyInfoSoap12" type="tns:DailyInfoSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="SaldoXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SaldoXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ROISfixXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/ROISfixXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RuoniaXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/RuoniaXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OstatDepoXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OstatDepoXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ValIntDayXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/ValIntDayXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ValIntDay">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/ValIntDay" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OstatDepo">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OstatDepo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ROISfix">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/ROISfix" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Ruonia">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Ruonia" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="mrrf7D">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/mrrf7D" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="mrrf7DXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/mrrf7DXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RepoDebtUSD">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/RepoDebtUSD" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RepoDebtUSDXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/RepoDebtUSDXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="mrrf">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/mrrf" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="mrrfXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/mrrfXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Saldo">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Saldo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewsInfoXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/NewsInfoXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OmodInfoXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OmodInfoXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="XVol">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/XVol" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="XVolXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/XVolXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="MainInfoXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/MainInfoXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AllDataInfoXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/AllDataInfoXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewsInfo">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/NewsInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapDayTotal">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapDayTotal" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapDayTotalXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapDayTotalXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapDynamicXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapDynamicXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSDVolXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapInfoSellUSDVolXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSDVol">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapInfoSellUSDVol" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSD">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapInfoSellUSD" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapInfoSellUSDXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapInfoSellUSDXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BiCurBaseXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/BiCurBaseXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BiCurBase">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/BiCurBase" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BiCurBacketXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/BiCurBacketXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BiCurBacket">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/BiCurBacket" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapDynamic">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapDynamic" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapMonthTotal">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapMonthTotal" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SwapMonthTotalXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/SwapMonthTotalXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="MKR">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/MKR" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="MKRXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/MKRXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DV">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DV" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DVXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DVXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Repo_debt">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Repo_debt" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Repo_debtXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Repo_debtXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Coins_base">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Coins_base" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Coins_baseXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Coins_baseXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FixingBase">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/FixingBase" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FixingBaseXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/FixingBaseXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Overnight">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Overnight" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OvernightXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OvernightXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Bauction">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/Bauction" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BauctionXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/BauctionXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DepoDynamicXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DepoDynamicXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DepoDynamic">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DepoDynamic" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OstatDynamicXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OstatDynamicXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="OstatDynamic">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/OstatDynamic" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DragMetDynamicXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DragMetDynamicXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DragMetDynamic">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/DragMetDynamic" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLatestDateTime">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetLatestDateTime" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLatestDate">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetLatestDate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLatestDateTimeSeld">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetLatestDateTimeSeld" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLatestDateSeld">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetLatestDateSeld" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EnumValutesXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/EnumValutesXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EnumValutes">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/EnumValutes" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLatestReutersDateTime">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetLatestReutersDateTime" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EnumReutersValutesXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/EnumReutersValutesXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EnumReutersValutes">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/EnumReutersValutes" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursOnDateXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetReutersCursOnDateXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursOnDate">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetReutersCursOnDate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursDynamicXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetReutersCursDynamicXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetReutersCursDynamic">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetReutersCursDynamic" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCursDynamicXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetCursDynamicXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCursDynamic">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetCursDynamic" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCursOnDateXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetCursOnDateXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeldCursOnDateXML">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetSeldCursOnDateXML" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeldCursOnDate">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetSeldCursOnDate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCursOnDate">
      <soap12:operation soapAction="http://web.kg.tasks.modules.ws.cbr.ru/GetCursOnDate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="DailyInfo">
    <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Веб сервис для получения ежедневных данных ver 28.05.2019</wsdl:documentation>
    <wsdl:port name="DailyInfoSoap" binding="tns:DailyInfoSoap">
      <soap:address location="http://www.kg.tasks.modules.ws.cbr.ru/DailyInfoWebServ/DailyInfo.asmx" />
    </wsdl:port>
    <wsdl:port name="DailyInfoSoap12" binding="tns:DailyInfoSoap12">
      <soap12:address location="http://www.kg.tasks.modules.ws.cbr.ru/DailyInfoWebServ/DailyInfo.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>