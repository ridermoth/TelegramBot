import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class MyFirstTelegramBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        // apakah update terdapat message dan message tersebut berupa pesan teks
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variabel
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            SendMessage message = new SendMessage() // membuat objek pengiriman
                    .setChatId(chat_id)
                    .setText(message_text);
            try {
                execute(message); // melakukan pengiriman chat ke user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "ridermothBot";
    }

    @Override
    public String getBotToken() {
        return "12345:ABCDE12345; // ubah dengan token bot masing-masing
    }
}
