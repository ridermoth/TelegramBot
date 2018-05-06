import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Main {
    public static void main(String[] args) {

        // inisialisasi ApiContext
        ApiContextInitializer.init();

        // inisialisasi telegram bot API
        TelegramBotsApi botsApi = new TelegramBotsApi();

        // register bot
        try {
            botsApi.registerBot(new MyFirstTelegramBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
