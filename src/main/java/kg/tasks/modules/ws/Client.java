package kg.tasks.modules.ws;

import kg.tasks.modules.ws.cbr.DailyInfoLocator;
import kg.tasks.modules.ws.cbr.GetCursOnDateXMLResponseGetCursOnDateXMLResult;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Calendar;

public class Client {
    public String getJson(Calendar cal) {
        try {
            DailyInfoLocator locator = new DailyInfoLocator();
            GetCursOnDateXMLResponseGetCursOnDateXMLResult response = locator.getDailyInfoSoap().getCursOnDateXML(cal);

            String elem = response.get_any()[0].getAsString();
            return elem;
        } catch (RemoteException | ServiceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
