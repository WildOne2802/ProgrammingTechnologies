package SecondLab;

public class GenericItem implements Cloneable {
    protected int ID;
    protected String name;
    protected float price;
    protected GenericItem analog;
    protected Category category = Category.GENERAL;

    public GenericItem() {
    }

    public GenericItem(int ID, String name, float price, GenericItem analog, Category category) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.category = category;
    }

    public GenericItem(GenericItem obj) {
        this.ID = obj.ID;
        this.name = obj.name;
        this.price = obj.price;
        this.analog = obj.analog;
        this.category = obj.category;
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , AnalogID: %d , Category: %-7s \n", ID, name, price, analog, category);
    }

    @Override
    public boolean equals(Object obj) {
        GenericItem newobj = (GenericItem) obj;
        return this.ID == newobj.ID
                && this.name.equals(newobj.name)
                && this.price == newobj.price
                && this.analog.equals(newobj.analog)
                && this.category.equals(newobj.category);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new GenericItem(this);
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
