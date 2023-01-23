package academy.prog.extra.oop.lesson02.extraHW;

public class InverseTransformer extends TextTransformer{

    public InverseTransformer(String text) {
        super(text);
    }

    public InverseTransformer() {
    }

    @Override
    public String transform(String text){
        return new StringBuffer(text).reverse().toString();
    }

    @Override
    public String toString() {
        return "InverseTransformer{}";
    }
}
