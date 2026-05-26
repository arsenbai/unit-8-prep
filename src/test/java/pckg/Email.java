package pckg;

import java.util.List;

public class Email implements IMessageSender {
    public void send(String message) {
        // some email sending logic
    }

    public List<String> poll() {
        return List.of("A", "asdas");
    }
}
