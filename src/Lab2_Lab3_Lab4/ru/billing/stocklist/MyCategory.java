package Lab2_Lab3_Lab4.ru.billing.stocklist;

public class MyCategory {
    public final static MyCategory FOOD = new MyCategory("FOOD");
    public final static MyCategory GENERAL = new MyCategory("GENERAL");
    public final static MyCategory DRESS = new MyCategory("DRESS");
    public final static MyCategory PRINT = new MyCategory("PRINT");

    private String value;

    public MyCategory() {
    }

    private MyCategory(String str) {
        value = str;
    }

    @Override
    public String toString() {
        return value;
    }
}
