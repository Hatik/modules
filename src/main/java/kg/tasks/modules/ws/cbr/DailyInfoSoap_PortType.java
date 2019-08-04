/**
 * DailyInfoSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kg.tasks.modules.ws.cbr;

public interface DailyInfoSoap_PortType extends java.rmi.Remote {

    /**
     * Сальдо операций ЦБ РФ по предоставлению/абсорбированию ликвидности
     * (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.SaldoXMLResponseSaldoXMLResult saldoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставка ROISfix (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.ROISfixXMLResponseROISfixXMLResult ROISfixXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставка Ruonia (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.RuoniaXMLResponseRuoniaXMLResult ruoniaXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Депозиты банков в Банке России (млн. руб) (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.OstatDepoXMLResponseOstatDepoXMLResult ostatDepoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Данные по интервенциям Банка России на внутреннем валютном
     * рынке - Ежедневные значения (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.ValIntDayXMLResponseValIntDayXMLResult valIntDayXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Данные по интервенциям Банка России на внутреннем валютном
     * рынке - Ежедневные значения
     */
    public kg.tasks.modules.ws.cbr.ValIntDayResponseValIntDayResult valIntDay(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Депозиты банков в Банке России (млн. руб)
     */
    public kg.tasks.modules.ws.cbr.OstatDepoResponseOstatDepoResult ostatDepo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставка ROISfix (DataSet)
     */
    public kg.tasks.modules.ws.cbr.ROISfixResponseROISfixResult ROISfix(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставка RUONIA (DataSet)
     */
    public kg.tasks.modules.ws.cbr.RuoniaResponseRuoniaResult ruonia(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Международные резервы Российской Федерации, еженедельные значения
     * (DataSet)
     */
    public kg.tasks.modules.ws.cbr.Mrrf7DResponseMrrf7DResult mrrf7D(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Международные резервы Российской Федерации, еженедельные значения
     * (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.Mrrf7DXMLResponseMrrf7DXMLResult mrrf7DXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Задолженность кредитных организаций перед Банком России по
     * операциям РЕПО в иностранной валюте (DataSet)
     */
    public kg.tasks.modules.ws.cbr.RepoDebtUSDResponseRepoDebtUSDResult repoDebtUSD(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Задолженность кредитных организаций перед Банком России по
     * операциям РЕПО в иностранной валюте  (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.RepoDebtUSDXMLResponseRepoDebtUSDXMLResult repoDebtUSDXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Международные резервы Российской Федерации, ежемесячные значения
     * (DataSet)
     */
    public kg.tasks.modules.ws.cbr.MrrfResponseMrrfResult mrrf(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Международные резервы Российской Федерации, ежемесячные значения
     * (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.MrrfXMLResponseMrrfXMLResult mrrfXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Сальдо операций ЦБ РФ по предоставлению/абсорбированию ликвидности
     * (DataSet)
     */
    public kg.tasks.modules.ws.cbr.SaldoResponseSaldoResult saldo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Получение новостей сервера (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.NewsInfoXMLResponseNewsInfoXMLResult newsInfoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Операции на открытом рынке (как XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.OmodInfoXMLResponseOmodInfoXMLResult omodInfoXML() throws java.rmi.RemoteException;

    /**
     * Операции Банка России на рынке государственных ценных бумаг
     * по поручению Министерства финансов Российской Федерации (как DataSet)
     */
    public kg.tasks.modules.ws.cbr.XVolResponseXVolResult XVol(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Операции Банка России на рынке государственных ценных бумаг
     * по поручению Министерства финансов Российской Федерации  (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.XVolXMLResponseXVolXMLResult XVolXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Получение основной информации - Ставка рефинансирования, золотовалютные
     * резервы, денежная база, денежная масса (как XMLDocument) ver 28.05.2019
     */
    public kg.tasks.modules.ws.cbr.MainInfoXMLResponseMainInfoXMLResult mainInfoXML() throws java.rmi.RemoteException;

    /**
     * Получение всей оперативной информации (XmlDocument) ver 26.01.2017
     */
    public kg.tasks.modules.ws.cbr.AllDataInfoXMLResponseAllDataInfoXMLResult allDataInfoXML() throws java.rmi.RemoteException;

    /**
     * Получение новостей сервера (DataSet)
     */
    public kg.tasks.modules.ws.cbr.NewsInfoResponseNewsInfoResult newsInfo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Задолженность кредитных организаций перед Банком России по
     * сделкам «валютный своп» (DataSet)
     */
    public kg.tasks.modules.ws.cbr.SwapDayTotalResponseSwapDayTotalResult swapDayTotal(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Задолженность кредитных организаций перед Банком России по
     * сделкам «валютный своп» (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.SwapDayTotalXMLResponseSwapDayTotalXMLResult swapDayTotalXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Валютный своп buy/sell overnight (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.SwapDynamicXMLResponseSwapDynamicXMLResult swapDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Объем сделок «валютный своп» по продаже долларов США за рубли,
     * заключенных Банком России (XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolXMLResponseSwapInfoSellUSDVolXMLResult swapInfoSellUSDVolXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Объем сделок «валютный своп» по продаже долларов США за рубли,
     * заключенных Банком России (DataSet) ver 21.11.2014
     */
    public kg.tasks.modules.ws.cbr.SwapInfoSellUSDVolResponseSwapInfoSellUSDVolResult swapInfoSellUSDVol(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Условия заключения сделок «валютный своп» по продаже долларов
     * США за рубли (DataSet) ver 18.09.2014
     */
    public kg.tasks.modules.ws.cbr.SwapInfoSellUSDResponseSwapInfoSellUSDResult swapInfoSellUSD(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Условия заключения сделок «валютный своп» по продаже долларов
     * США за рубли (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult swapInfoSellUSDXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Стоимость бивалютной корзины (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.BiCurBaseXMLResponseBiCurBaseXMLResult biCurBaseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Стоимость бивалютной корзины (DataSet) ver 03.12.2014
     */
    public kg.tasks.modules.ws.cbr.BiCurBaseResponseBiCurBaseResult biCurBase(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Структура бивалютной корзины  (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.BiCurBacketXMLResponseBiCurBacketXMLResult biCurBacketXML() throws java.rmi.RemoteException;

    /**
     * Структура бивалютной корзины  (DataSet) ver 03.12.2014
     */
    public kg.tasks.modules.ws.cbr.BiCurBacketResponseBiCurBacketResult biCurBacket() throws java.rmi.RemoteException;

    /**
     * Условия заключения сделок «валютный своп» по покупке долларов
     * США и евро за рубли (DataSet) ver 31.07.2012
     */
    public kg.tasks.modules.ws.cbr.SwapDynamicResponseSwapDynamicResult swapDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Объем сделок 'валютный своп' Банка России (DataSet) ver 03.04.2014
     */
    public kg.tasks.modules.ws.cbr.SwapMonthTotalResponseSwapMonthTotalResult swapMonthTotal(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Объем сделок 'валютный своп' Банка России (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult swapMonthTotalXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставки межбанковского кредитного рынка  (DataSet) ver 31.07.2012
     */
    public kg.tasks.modules.ws.cbr.MKRResponseMKRResult MKR(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставки межбанковского кредитного рынка (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.MKRXMLResponseMKRXMLResult MKRXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Требования Банка России к кредитным организациям (DataSet)
     * ver 31.07.2012
     */
    public kg.tasks.modules.ws.cbr.DVResponseDVResult DV(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Требования Банка России к кредитным организациям (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.DVXMLResponseDVXMLResult DVXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Задолженность кредитных организаций перед Банком России по
     * операциям прямого РЕПО (DataSet) ver 18.06.2014
     */
    public kg.tasks.modules.ws.cbr.Repo_debtResponseRepo_debtResult repo_debt(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Задолженность кредитных организаций перед Банком России по
     * операциям прямого РЕПО (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.Repo_debtXMLResponseRepo_debtXMLResult repo_debtXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Отпускные цены Банка России на инвестиционные монеты (DataSet)
     * ver 31.07.2012
     */
    public kg.tasks.modules.ws.cbr.Coins_baseResponseCoins_baseResult coins_base(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Отпускные цены Банка России на инвестиционные монеты (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.Coins_baseXMLResponseCoins_baseXMLResult coins_baseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Фиксинги на драгоценные металлы (DataSet) ver 31.07.2012
     */
    public kg.tasks.modules.ws.cbr.FixingBaseResponseFixingBaseResult fixingBase(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Фиксинги на драгоценные металлы (как xmlDocument)
     */
    public kg.tasks.modules.ws.cbr.FixingBaseXMLResponseFixingBaseXMLResult fixingBaseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставки по кредиту 'overnight' (DataSet) ver 31.07.2012
     */
    public kg.tasks.modules.ws.cbr.OvernightResponseOvernightResult overnight(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставки по кредиту 'overnight' (как xmlDocument
     */
    public kg.tasks.modules.ws.cbr.OvernightXMLResponseOvernightXMLResult overnightXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * База данных по размещению бюджетных средств на депозиты коммерческих
     * банков (DataSet) ver 31.07.2012
     */
    public kg.tasks.modules.ws.cbr.BauctionResponseBauctionResult bauction(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * База данных по размещению бюджетных средств на депозиты коммерческих
     * банков (как xmlDocument
     */
    public kg.tasks.modules.ws.cbr.BauctionXMLResponseBauctionXMLResult bauctionXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамики ставок привлечения средств по депозитным операциям
     * (как xmlDocument
     */
    public kg.tasks.modules.ws.cbr.DepoDynamicXMLResponseDepoDynamicXMLResult depoDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамика ставок привлечения средств по депозитным операциям
     * (DataSet)
     */
    public kg.tasks.modules.ws.cbr.DepoDynamicResponseDepoDynamicResult depoDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамики сведений об остатках средств на корреспондентских
     * счетах кредитных организаций (XMLDocument).
     */
    public kg.tasks.modules.ws.cbr.OstatDynamicXMLResponseOstatDynamicXMLResult ostatDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамики сведений об остатках средств на корреспондентских
     * счетах кредитных организаций (DataSet)!
     */
    public kg.tasks.modules.ws.cbr.OstatDynamicResponseOstatDynamicResult ostatDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамика учетных цен драгоценных металлов (как XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.DragMetDynamicXMLResponseDragMetDynamicXMLResult dragMetDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамика учетных цен драгоценных металлов (DataSet)
     */
    public kg.tasks.modules.ws.cbr.DragMetDynamicResponseDragMetDynamicResult dragMetDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Последняя дата публикации курсов валют как DateTime (ежедневные
     * валюты)
     */
    public java.util.Calendar getLatestDateTime() throws java.rmi.RemoteException;

    /**
     * Последняя дата публикации курсов валют(ежемесячные валюты)
     * - строка
     */
    public java.lang.String getLatestDate() throws java.rmi.RemoteException;

    /**
     * Последняя дата публикации курсов валют как DateTime (ежемесячные
     * валюты)
     */
    public java.util.Calendar getLatestDateTimeSeld() throws java.rmi.RemoteException;

    /**
     * Последняя дата публикации курсов валют (ежемесячные валюты)
     * - строка yyyyMMdd
     */
    public java.lang.String getLatestDateSeld() throws java.rmi.RemoteException;

    /**
     * Справочник по кодам валют (как XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.EnumValutesXMLResponseEnumValutesXMLResult enumValutesXML(boolean seld) throws java.rmi.RemoteException;

    /**
     * Справочник по кодам валют (как DataSet)
     */
    public kg.tasks.modules.ws.cbr.EnumValutesResponseEnumValutesResult enumValutes(boolean seld) throws java.rmi.RemoteException;

    /**
     * Последняя дата публикации редких валют от Thomson Reuters как
     * DateTime (ежемесячные валюты)
     */
    public java.util.Calendar getLatestReutersDateTime() throws java.rmi.RemoteException;

    /**
     * Справочник по кодам редких валют от Thomson Reuters (как XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.EnumReutersValutesXMLResponseEnumReutersValutesXMLResult enumReutersValutesXML() throws java.rmi.RemoteException;

    /**
     * Справочник по кодам редких валют от Thomson Reuters  (как DataSet)
     */
    public kg.tasks.modules.ws.cbr.EnumReutersValutesResponseEnumReutersValutesResult enumReutersValutes() throws java.rmi.RemoteException;

    /**
     * Получение ежедневных курсов редких валют от Thomson Reuters
     * (как XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.GetReutersCursOnDateXMLResponseGetReutersCursOnDateXMLResult getReutersCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException;

    /**
     * Получение ежедневных курсов редких валют от Thomson Reuters
     * (как DataSet)
     */
    public kg.tasks.modules.ws.cbr.GetReutersCursOnDateResponseGetReutersCursOnDateResult getReutersCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException;

    /**
     * Получение динамики ежедневных курсов редкой валюты от Thomson
     * Reuters (как XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.GetReutersCursDynamicXMLResponseGetReutersCursDynamicXMLResult getReutersCursDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate, int numCode) throws java.rmi.RemoteException;

    /**
     * Получение динамики ежедневных курсов редкой валюты от Thomson
     * Reuters (как DataSet)
     */
    public kg.tasks.modules.ws.cbr.GetReutersCursDynamicResponseGetReutersCursDynamicResult getReutersCursDynamic(java.util.Calendar fromDate, java.util.Calendar toDate, int numCode) throws java.rmi.RemoteException;

    /**
     * Получение динамики ежедневных курсов валюты (как XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.GetCursDynamicXMLResponseGetCursDynamicXMLResult getCursDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String valutaCode) throws java.rmi.RemoteException;

    /**
     * Получение динамики ежедневных курсов валюты (как DataSet)
     */
    public kg.tasks.modules.ws.cbr.GetCursDynamicResponseGetCursDynamicResult getCursDynamic(java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String valutaCode) throws java.rmi.RemoteException;

    /**
     * Получение ежедневных курсов валют (как XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.GetCursOnDateXMLResponseGetCursOnDateXMLResult getCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException;

    /**
     * Получение ежемесячных курсов валют !*устаревший! (как XMLDocument)
     */
    public kg.tasks.modules.ws.cbr.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult getSeldCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException;

    /**
     * Получение ежемесячных курсов валют !*устаревший! (как DataSet)
     */
    public kg.tasks.modules.ws.cbr.GetSeldCursOnDateResponseGetSeldCursOnDateResult getSeldCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException;

    /**
     * Получение ежедневных курсов валют (как DataSet)
     */
    public kg.tasks.modules.ws.cbr.GetCursOnDateResponseGetCursOnDateResult getCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException;
}
