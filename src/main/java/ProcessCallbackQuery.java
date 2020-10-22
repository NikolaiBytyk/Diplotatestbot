import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

public class ProcessCallbackQuery {

    public static SendMessage processCallbackQuery(CallbackQuery buttonQuery){
        SendMessage sendMessage = new SendMessage()
                .setText(buttonQuery.getMessage().getText())
                .setChatId(buttonQuery.getMessage().getChatId());
        sendMessage.setText(buttonQuery.getData());

        /*if (buttonQuery.getData().equals("/Lab1")){
            return sendMessage.setText("/Lab1");
        }
        if (buttonQuery.getData().equals("/Lab2")){
            return sendMessage.setText("/Lab2");
        }
        if (buttonQuery.getData().equals("/Lab3")){
            return sendMessage.setText("/Lab3");
        }
        if (buttonQuery.getData().equals("/Lab4")){
            return sendMessage.setText("/Lab4");
        }
        if (buttonQuery.getData().equals("/Lab5")){
            return sendMessage.setText("/Lab5");
        }
        if (buttonQuery.getData().equals("/Lab6")){
            return sendMessage.setText("/Lab6");
        }*/
        return sendMessage;
    }
}