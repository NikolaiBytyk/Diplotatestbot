import java.net.MalformedURLException;
import java.net.URL;

public class RozkladApi {

    URL url = new URL("http://rozklad.kpi.ua/Schedules/ViewSchedule.aspx?v=f27f3be3-e9af-4138-8cbe-c89f2334df69");
    public RozkladApi() throws MalformedURLException {
    }

    public static void showRozklad() throws MalformedURLException{
        URL url = new URL("http://api.rozklad.org.ua/v2/teachers/Зайченко+Юрій+Петрович/lessons");
        System.out.println(url.toString());

    }

}
