package academy.prog.extra.oop.lesson02.extraHW;

public class UpDownTransformer extends TextTransformer{

    public UpDownTransformer(String text) {
        super(text);
    }

    public UpDownTransformer() {
    }

    @Override
    public String transform(String text){
        text=text.toLowerCase();
        char[] chars = text.toCharArray();
        text=text.toUpperCase();
        char[] upChars = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (i%2==0){
                chars[i]=upChars[i];
            }
        }
        return String.valueOf(chars);
    }

}
