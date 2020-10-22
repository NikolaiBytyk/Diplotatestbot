package cache;

import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;
import java.util.Map;

public class ListOfLab {

    public static final String LAB_1 = "BQACAgIAAxkBAAIDL1-Oupxts5izFi8_Qc0B65ODkQGzAAIVCAACdot4SKYNV5JU3l49GwQ";
    public static final String LAB_2 = "BQACAgIAAxkBAAIDMV-OuxTXmJtfnT0CLTAX3DjjCk0aAAIWCAACdot4SMzVbCaUpcjRGwQ";
    public static final String LAB_3 = "BQACAgIAAxkBAAIDM1-Oux7yf92x2ZOti12CRT3wgjsMAAIXCAACdot4SNR_u0FHed9UGwQ";
    public static final String LAB_4 = "BQACAgIAAxkBAAIDNV-Ouyn9WD69WQveGvEdifGP7_aDAAIYCAACdot4SItJVAOq8m8eGwQ";
    public static final String LAB_5 = "BQACAgIAAxkBAAIDN1-OuzQqcuUWfzGKbnOdpczMSFo9AAIZCAACdot4SGq3TcdsUHxkGwQ";
    public static final String LAB_6 = "BQACAgIAAxkBAAIDOV-Ou0gKgLJlUqtp4tr-u0o-ZnwYAAIaCAACdot4SCahRWeizRCiGwQ";


    public static Map<String,String> labMap = new HashMap<>();
    static {
        labMap.put("/Lab1", LAB_1);
        labMap.put("/Lab2", LAB_2);
        labMap.put("/Lab3", LAB_3);
        labMap.put("/Lab4", LAB_4);
        labMap.put("/Lab5", LAB_5);
        labMap.put("/Lab6", LAB_6);
    }
}
