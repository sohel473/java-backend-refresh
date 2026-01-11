public class TextBox {
    String text = "default text";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}
