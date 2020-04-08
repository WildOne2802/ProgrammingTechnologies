package Lab2_Lab3_Lab4.ru.billing.stocklist;

public class GenericItem implements Cloneable {
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private GenericItem analog;

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    private Category category = Category.GENERAL;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private static int currentID = 0;

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }

    public GenericItem() {
    }

    public GenericItem(String name, float price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;

        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.name = name;
        this.price = price;
        this.analog = analog;

        this.ID = GenericItem.currentID++;
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-10s , price:%5.2f , AnalogID: %d , Category: %-7s \n", ID, name, price, analog, category);
    }

    @Override
    public boolean equals(Object obj) {
        GenericItem newobj = (GenericItem) obj;
        return this.ID == newobj.ID
                && this.name.equals(newobj.name)
                && this.price == newobj.price
                && (this.analog == null ? newobj.analog == null : this.analog.equals(newobj.analog))
                && this.category.equals(newobj.category);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.analog;
    }

    @Override
    public String toString() {
        return this.ID + " "
                + this.name + " "
                + this.price + " "
                + (this.analog != null ? this.analog.toString() : null) + " "
                + this.category + "\n";
    }
}
