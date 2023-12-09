package chatbox.components;

public class AutoBubble extends Bubble {
    public AutoBubble(String message) {
        super(message);
        this.bubbleStyle =  "    -fx-border-radius: 24px;\n" + //
                "    -fx-border-color: #FFC5C5;\n" + //
                "    -fx-border-width: 8px; \n" + //
                "    -fx-font-size: 14px;\n" + //
                "    -fx-background-color: #FFC5C5; \n" + //
                "    -fx-fill: #FFC5C5;\n" + //
                "    -fx-alignment: top-left;\n" + //
                "    -fx-text-fill: #fff;\n" + //
                "    -fx-arc-height: 24px;\n" + //
                "    -fx-arc-width: 24px;\n" + //
                "    -fx-background-radius: 24px;";
        messageLabel.setStyle(bubbleStyle);

    }
}
