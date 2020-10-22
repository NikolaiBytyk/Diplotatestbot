import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cache.ListOfPreparationMaterials.*;
import static cache.TableStatuses.*;

public class ListOfButtonForInterface {
    private static Map<String, ReplyKeyboardMarkup> menu = new HashMap<>();


    public static ReplyKeyboardMarkup headMakeKeyboard(){
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add("Лабораторні роботі");
        row.add("Теми практичних робіт");
        keyboard.add(row);
        row = new KeyboardRow();
        row.add("Матеріали для підготовки");
        row.add("Часті питання");
        keyboard.add(row);
        row = new KeyboardRow();
        row.add("Розклад викладача");
        row.add("Контакти викладача");
        keyboard.add(row);
        keyboardMarkup.setKeyboard(keyboard);
        keyboardMarkup.setResizeKeyboard(true);
        return keyboardMarkup;

    }


    public static InlineKeyboardMarkup labMenuMakeInlineKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup =new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList= new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("1")
                .setCallbackData("/Lab1"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("2")
                .setCallbackData("/Lab2"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("3")
                .setCallbackData("/Lab3"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("4")
                .setCallbackData("/Lab4"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("5")
                .setCallbackData("/Lab5"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("6")
                .setCallbackData("/Lab6"));
        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }
    public static InlineKeyboardMarkup preparationMaterialsMenuMakeInlineKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup =new InlineKeyboardMarkup();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList= new ArrayList<>();
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("1")
                .setCallbackData("PRE_MAT_1"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("2")
                .setCallbackData("PRE_MAT_2"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("3")
                .setCallbackData("PRE_MAT_3"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("4")
                .setCallbackData("PRE_MAT_4"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("5")
                .setCallbackData("PRE_MAT_5"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("6")
                .setCallbackData("PRE_MAT_6"));
        keyboardButtonsRow1.add(new InlineKeyboardButton().setText("7")
                .setCallbackData("PRE_MAT_7"));
        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }


    public static Map<String, ReplyKeyboardMarkup> getMap() {
        return menu;
    }
}
