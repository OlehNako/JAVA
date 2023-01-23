package academy.prog.extra.oop.lesson02.extraHW;

public class TextTransformer {

    private String text;

    public TextTransformer(String text) {
        this.text = text;
    }

    public TextTransformer() {
    }

    public String transform(String text){
     return text.toUpperCase();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextTransformer{" +
                "text='" + text + '\'' +
                '}';
    }
}
