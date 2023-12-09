package chatbox.ui;

import chatbox.Main;
import chatbox.components.AutoBubble;
import chatbox.components.MyBubble;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class ChatBoxController implements Initializable {
    @FXML
    private TextField message;
    @FXML
    private ScrollPane messagesArea;
    @FXML
    private VBox vBox;
    private int numOfMessages;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        message.requestFocus();
        numOfMessages = 0;
    }

    public void handleKeyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            String messageText = message.getText();
            MyBubble myBubble = new MyBubble(messageText);

            Label date = new Label(myBubble.getSentDate().format(DateTimeFormatter.ISO_LOCAL_DATE));
            date.setFont(new Font(8));
            date.setMaxWidth(51);
            date.setMaxHeight(11);
            date.setTextAlignment(TextAlignment.CENTER);
            Label time = new Label(myBubble.getSentTime().format(DateTimeFormatter.ofPattern("HH:mm")));
            time.setFont(new Font(8));
            time.setMaxWidth(51);
            time.setMaxHeight(11);
            time.setTextAlignment(TextAlignment.CENTER);
            VBox dateTime = new VBox();
            dateTime.setAlignment(Pos.CENTER);
            dateTime.getChildren().addAll(date, time);

            HBox hBox = new HBox(dateTime, myBubble.getMessageLabel());
            hBox.setAlignment(Pos.BASELINE_RIGHT);
            hBox.setSpacing(10);
            hBox.setPadding(new Insets(10, 0, 0, 0));
            vBox.getChildren().add(hBox);
            numOfMessages++;
            messagesArea.vvalueProperty().bind(vBox.heightProperty());

            message.clear();

            if (numOfMessages % 8 == 0) {
                reply();
            }
        }
    }

    public void reply() {
        AutoBubble autoBubble = new AutoBubble("Hello there!");
        InputStream inputStream = Main.class.getResourceAsStream("images/Ellipse 35.png");
        Image image = new Image(inputStream);
        ImageView imageView = new ImageView(image);
        Label date = new Label(autoBubble.getSentDate().format(DateTimeFormatter.ISO_LOCAL_DATE));
        date.setFont(new Font(8));
        date.setMaxWidth(51);
        date.setMaxHeight(11);
        date.setTextAlignment(TextAlignment.CENTER);
        Label time = new Label(autoBubble.getSentTime().format(DateTimeFormatter.ofPattern("HH:mm")));
        time.setFont(new Font(8));
        time.setMaxWidth(51);
        time.setMaxHeight(11);
        time.setTextAlignment(TextAlignment.CENTER);
        VBox dateTime = new VBox();
        dateTime.setAlignment(Pos.CENTER);
        dateTime.getChildren().addAll(date, time);

        HBox hBox = new HBox(imageView, autoBubble.getMessageLabel(), dateTime);
        hBox.setAlignment(Pos.CENTER_LEFT);
        hBox.setPadding(new Insets(10, 0, 0, 20));
        hBox.setSpacing(10);
        vBox.getChildren().add(hBox);
        messagesArea.vvalueProperty().bind(vBox.heightProperty());

    }
}
