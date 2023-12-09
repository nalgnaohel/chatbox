package chatbox.components;

import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Bubble {
    protected String messageContent;
    protected Label messageLabel = new Label();
    protected String bubbleStyle;
    protected LocalDate sentDate;
    protected LocalTime sentTime;

    public Bubble(String message) {
        this.messageContent = message;
        this.sentDate = LocalDate.now();
        this.sentTime = LocalTime.now();
        messageLabel.setText(messageContent);

    }

    public String getMessageContent() {
        return messageContent;
    }

    public LocalDate getSentDate() {
        return sentDate;
    }

    public LocalTime getSentTime() {
        return sentTime;
    }

    public Label getMessageLabel() {
        return messageLabel;
    }
}
