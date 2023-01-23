package academy.prog.extra.oop.lesson02.extraHW;

import java.io.File;
import java.io.FileWriter;

public class TextSaver {
    private TextTransformer transformer;
    private File file;

    public TextSaver(TextTransformer transformer, File file) {
        this.transformer = transformer;
        this.file = file;
    }

    public TextSaver() {
    }

    public void saveTextToFile(String text){
        text=transformer.transform(text);
//        System.out.println(text);

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(text);
        } catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    public TextTransformer getTransformer() {
        return transformer;
    }

    public void setTransformer(TextTransformer transformer) {
        this.transformer = transformer;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "TextSaver{" +
                "transformer=" + transformer +
                ", file=" + file +
                '}';
    }
}
