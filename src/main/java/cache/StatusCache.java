package cache;

import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.HashMap;
import java.util.Map;

public class StatusCache {

    private static Map<Long, String> statusCache = new HashMap<>();


    public static String getStatus(Message message){
        return statusCache.get(message.getChatId());
    }

    public static void updateStatus(Message message, String status) {
        statusCache.put(message.getChatId(), status);
    }

    public static void setDefaultStatus(Message message){
        statusCache.put(message.getChatId(), "HEAD_MENU");

    }
}
