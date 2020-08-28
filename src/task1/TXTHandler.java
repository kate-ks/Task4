package task1;

public class TXTHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("open Txt");
    }

    @Override
    void create() {
        System.out.println("create Txt");
    }

    @Override
    void change() {
        System.out.println("change Txt");
    }

    @Override
    void save() {
        System.out.println("save Txt");
    }
}
