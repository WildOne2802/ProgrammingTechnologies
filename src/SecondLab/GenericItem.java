package SecondLab;

public class GenericItem implements Cloneable {
    protected int ID;
    protected String name;
    protected float price;
    protected GenericItem analog;
    protected Category category = Category.GENERAL;

    static int currentID = 0;

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
                + this.analog.toString() + " "
                + this.category + "\n";
    }
}
