package task1;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Open Doc");
    }

    @Override
    void create() {
        System.out.println("Create Doc");
    }

    @Override
    void change() {
        System.out.println("Change Doc");
    }

    @Override
    void save() {
        System.out.println("Save Doc");

    }
}
