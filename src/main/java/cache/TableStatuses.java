package cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableStatuses {

    public static final String HEAD_MENU = "Head menu";
    public static final String HELP_MENU = "Help menu";
    public static final String SETTING_MENU = "Setting menu";
    public static final String FAQ_MENU = "FAQ menu";
    public static final String PREPARATION_MATERIALS_MENU = "Preparation materials menu";
    public static final String SCHEDULE_MENU = "Schedule menu";
    public static final String LABORATORY_MENU = "Laboratory menu";
    public static final String CONTACTS_MENU = "Contact menu";
    public static final String WORKSHOP_MENU = "Topic for workshop menu";

    public static Map<String, String> statusMap = new HashMap<>();
    static {
        statusMap.put("/help",HELP_MENU);
        statusMap.put("/headMenu",HEAD_MENU);
        statusMap.put("Часті питання",FAQ_MENU);
        statusMap.put("Матеріали для підготовки",PREPARATION_MATERIALS_MENU);
        statusMap.put("Теми практичних робіт",WORKSHOP_MENU);
        statusMap.put("/setting",SETTING_MENU);
        statusMap.put("Контакти викладача",CONTACTS_MENU);
        statusMap.put("Розклад викладача",SCHEDULE_MENU);
        statusMap.put("Лабораторні роботі",LABORATORY_MENU);
        statusMap.put("/start",HEAD_MENU);

    }

}
