package task1;

public class Main {
    public static void main(String[] args) {
        DOCHandler doc= new DOCHandler();
        TXTHandler txt= new TXTHandler();
        XMLHandler xml= new XMLHandler();
        doc.open();
        doc.create();
        doc.change();
        doc.save();
        txt.open();
        xml.save();
    }
}
