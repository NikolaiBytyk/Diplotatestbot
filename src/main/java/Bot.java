import cache.ListOfLab;
import cache.ListOfPreparationMaterials;
import cache.StatusCache;
import cache.TableStatuses;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.net.MalformedURLException;

import static cache.TableStatuses.*;

public class Bot extends TelegramLongPollingBot {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(Message message) throws MalformedURLException {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Це тестовый бот для роботы викладача з студентами");
        sendMessage.setChatId(message.getChatId()).setReplyMarkup(ListOfButtonForInterface.headMakeKeyboard());


        if ((TableStatuses.statusMap.get(message.getText()) != null)){
            StatusCache.updateStatus(message, TableStatuses.statusMap.get(message.getText()));

        }
        if (StatusCache.getStatus(message).equals(LABORATORY_MENU)) {
            sendMessage.setReplyMarkup(ListOfButtonForInterface.labMenuMakeInlineKeyboard())
                    .setText("Лабораторна робота №1\n" +
                            "Дослiдження генетичного алгоритму навчання нейронної мережi back propagation\n" +
                            "20.09.2020\n" +
                            "\n" +
                            "Лабораторна робота №2\n" +
                            "Дослiдження комбiнованого алгоритму навчання (genetic + gradient)нейронно мережi \"back propagation\"\n" +
                            "1.10.2020\n" +
                            "\n" +
                            "Лабораторна робота №3\n" +
                            "Градiєнтний алгоритм навчання нейронної мережі \"back propagation\"\n" +
                            "10.10.2020\n" +
                            "\n" +
                            "Лабораторна робота №4\n" +
                            "Градієнтний  алгоритм  навчання нейронної мережі \"classical forward propagation\"\n" +
                            "24.10.2020\n" +
                            "\n" +
                            "Лабораторна робота №5\n" +
                            "Алгоритм  спряжених градієнтів нейронної мережі \"back propagation\"\n" +
                            "4.11.2020\n" +
                            "\n" +
                            "Лабораторна робота №6\n" +
                            "Нечітка нейронна мережа anfis\n" +
                            "18.11.2020\n");
        }
        if (StatusCache.getStatus(message).equals(SCHEDULE_MENU)) {
            sendMessage
                    .setText("Вівторок\n" +
                            "1) Постреляційні бази даних Лек 302-05\n" +
                            "2) Апаратно-програмні засоби збору та обробки екологічної інформації Лек 519-05\n" +
                            "4) Апаратно-програмні засоби збору та обробки екологічної інформації Прак 519-05\n" +
                            "\n" +
                            "Середа\n" +
                            "1) Проектування систем з розподіленими базами даних Лек 419-05 \n" +
                            "2) Менеджмент стартап-проектів Прак 214-05\n" +
                            "3) Проектування систем з розподіленими базами даних Прак 524-05\n" +
                            "\n" +
                            "П’ятниця\n" +
                            "1) Соціально-економічний потенціал управління станом довкілля Лек 415-05\n" +
                            "2) Соціально-економічний потенціал управління станом довкілля Прак 415-05");
           // RozkladApi.showRozklad();
        }
        if (StatusCache.getStatus(message).equals(PREPARATION_MATERIALS_MENU)) {
            sendMessage.setReplyMarkup(ListOfButtonForInterface.preparationMaterialsMenuMakeInlineKeyboard())
                    .setText("1- Самоорганизующиеся НС. Алгоритмы обучения Кохонена" + "\n" +
                            "2- Нечеткий метод индуктивного моделирования (МГУА)" + "\n" +
                            "3- Нечеткие нейронные сети TSK и Ванга-Менделя" + "\n" +
                            "4- Радиальные нейронный сети" + "\n" +
                            "5- Fuzzy Logic Systems and Fuzzy Neural Networks" + "\n" +
                            "6- GROUP METHOD OF DATA HANDLING (GMDH)" + "\n" +
                            "7- Каскадные NEO-FUZZY нейронные сети и их алгоритмы обучения");
        }
        if (StatusCache.getStatus(message).equals(WORKSHOP_MENU)) {
            sendMessage
                    .setText("Викладач не додав завдання на практичні заняття");
        }
        if (StatusCache.getStatus(message).equals(FAQ_MENU)) {
            sendMessage
                    .setText("Викладач не додав відповіді на найпопулярніші питання");
        }
        if (StatusCache.getStatus(message).equals(CONTACTS_MENU)) {
            sendMessage
                    .setText("Ім'я - Микола Битик\n" +
                            "Посада -  Ст викладач\n" +
                            "Предмет -  Нейросети\n" +
                            "Номер телефона: +38 (063) 123 23 12\n" +
                            "Email: Mykola.Bytyk@apeps.com");
        }
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public SendMessage selectKeyboard(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setReplyMarkup(ListOfButtonForInterface.getMap().get(StatusCache.getStatus(message)));

        return sendMessage;
    }

    public void sendDocument(SendMessage message) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(message.getChatId());
        if (ListOfPreparationMaterials.MaterialsMap.get(message.getText()) != null){
            sendDocument.setDocument(ListOfPreparationMaterials.MaterialsMap.get(message.getText()).getDocument());
            sendDocument.setCaption(ListOfPreparationMaterials.MaterialsMap.get(message.getText()).getCaption());
        }
        if (ListOfLab.labMap.get(message.getText()) != null) {
            sendDocument.setDocument(ListOfLab.labMap.get(message.getText()));
        }
        try {
             execute(sendDocument);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendPhoto(Message message) {
        SendPhoto sendPhoto = new SendPhoto()
                .setChatId(message.getChatId().toString())
                .setReplyToMessageId(message.getMessageId())
                .setPhoto(message.getText())
                .setCaption("Photo");
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if (!update.hasCallbackQuery()) {
            try {
                sendMsg(message);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else {
            sendDocument(ProcessCallbackQuery.processCallbackQuery(update.getCallbackQuery()));
        }
    }

        //Код который позволяет взять ID файлов
        /*if (message != null && message.hasDocument()) {
            SendDocument sendDocument = new SendDocument()
                    .setChatId(message.getChatId());
            message.getDocument();
            String s = message.getDocument().getFileId();
            SendMessage sendMessage = new SendMessage().setChatId(message.getChatId()).setText(s);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }*/
        /*if (message != null && message.hasDocument()) {
            sendDocument(message);
        }
    }*/

    public String getBotUsername() {
        return "test353_bot";
    }

    public String getBotToken() {
        return "946114875:AAGCtXQK5fLyuQ0QhKNrxsdWEo5rOBKQgOw";
    }
}
