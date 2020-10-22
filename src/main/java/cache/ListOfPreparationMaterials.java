package cache;

import org.telegram.telegrambots.meta.api.methods.send.SendDocument;

import java.util.HashMap;
import java.util.Map;

public class ListOfPreparationMaterials {

    public static final String PRE_MAT_1 = "СамоорганАлгоритм";
    public static final String PRE_MAT_2 = "Нечеткий метод индуктивного модел (МГУА)";
    public static final String PRE_MAT_3 = "Нечеткие нейронные сети TSK и Ванга-Менделя";
    public static final String PRE_MAT_4 = "Радиальные нейронный сети";
    public static final String PRE_MAT_5 = "Fuzzy Logic Systems and Fuzzy Neural Networks";
    public static final String PRE_MAT_6 = "GROUP METHOD OF DATA HANDLING (GMDH)";
    public static final String PRE_MAT_7 = "Каскадные NEO-FUZZY нейронные сети";


    public static Map<String, SendDocument> MaterialsMap = new HashMap<>();
    static {
        MaterialsMap.put("PRE_MAT_1", new SendDocument().setDocument("BQACAgIAAxkBAAIDO1-Ou2TiI5-CN1e9EVMGgPbmvo4dAAIbCAACdot4SNAl8rTE1mhJGwQ").setCaption(PRE_MAT_1));
        MaterialsMap.put("PRE_MAT_2", new SendDocument().setDocument("BQACAgIAAxkBAAIDPV-Ou3O67Qrlfsm3bIcK8HfiP0XbAAIcCAACdot4SH8KJKunkN2vGwQ").setCaption(PRE_MAT_2));
        MaterialsMap.put("PRE_MAT_3", new SendDocument().setDocument("BQACAgIAAxkBAAIDP1-Ou4GpTyVwK6c0NlXgvfhnm3HsAAIeCAACdot4SGV1bbPY2K6lGwQ").setCaption(PRE_MAT_3));
        MaterialsMap.put("PRE_MAT_4", new SendDocument().setDocument("BQACAgIAAxkBAAIDQV-Ou42vH0WY0ywm0Q2IyIQ3cN4vAAIfCAACdot4SIU2owT_B6DHGwQ").setCaption(PRE_MAT_4));
        MaterialsMap.put("PRE_MAT_5", new SendDocument().setDocument("BQACAgIAAxkBAAIDQ1-Ou6Jm-AGmLeGxp7V0HCVskuyjAAIgCAACdot4SJ5ngGMMFtJUGwQ").setCaption(PRE_MAT_5));
        MaterialsMap.put("PRE_MAT_6", new SendDocument().setDocument("BQACAgIAAxkBAAIDRV-Ou6486Al13gPPdtnKifxOHyUgAAIhCAACdot4SIKOcI1ofCpqGwQ").setCaption(PRE_MAT_6));
        MaterialsMap.put("PRE_MAT_7", new SendDocument().setDocument("BQACAgIAAxkBAAIDR1-Ou7xW4t8KI2ZKKZs1eb2hEZGoAAIiCAACdot4SPT_W2jlPyr8GwQ").setCaption(PRE_MAT_7));
    }
}
