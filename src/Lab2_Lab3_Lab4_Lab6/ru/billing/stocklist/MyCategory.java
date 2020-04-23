package Lab2_Lab3_Lab4_Lab6.ru.billing.stocklist;

public class MyCategory {
    public final static MyCategory FOOD = new MyCategory("FOOD");
    public final static MyCategory GENERAL = new MyCategory("GENERAL");
    public final static MyCategory DRESS = new MyCategory("DRESS");
    public final static MyCategory PRINT = new MyCategory("PRINT");

    private String value;

    private MyCategory(String str) {
        value = str;
    }

    @Override
    public String toString() {
        return value;
    }
}
