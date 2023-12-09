package chatbox.components;

public class MyBubble extends Bubble{
    public MyBubble(String message) {
        super(message);
        this.bubbleStyle =  "    -fx-border-radius: 24px;\n" + //
                "    -fx-border-color: #9DCAFF;\n" + //
                "    -fx-border-width: 8px; \n" + //
                "    -fx-font-size: 14px;\n" + //
                "    -fx-background-color: #9DCAFF; \n" + //
                "    -fx-fill: #9DCAFF;\n" + //
                "    -fx-alignment: top-left;\n" + //
                "    -fx-text-fill: #fff;\n" + //
                "    -fx-arc-height: 24px;\n" + //
                "    -fx-arc-width: 24px;\n" + //
                "    -fx-background-radius: 24px;";
        messageLabel.setStyle(bubbleStyle);

    }
}
