package SecondLab;

public class TechnicalItem extends GenericItem implements Cloneable {
    protected short warrantyTime;

    public TechnicalItem(int ID, String name, float price, GenericItem analog, Category category, short warrantyTime) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.category = category;
        this.warrantyTime = warrantyTime;
    }

    public TechnicalItem(TechnicalItem obj) {
        this.ID = obj.ID;
        this.name = obj.name;
        this.price = obj.price;
        this.analog = obj.analog;
        this.category = obj.category;
    }

    @Override
    public void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , AnalogID: %d , Category: %-7s \n", ID, name, price, analog, category);
        System.out.println("Warranty Time: " + warrantyTime);
    }

    @Override
    public boolean equals(Object obj) {
        TechnicalItem newobj = (TechnicalItem) obj;
        return this.ID == newobj.ID
                && this.name.equals(newobj.name)
                && this.price == newobj.price
                && this.analog.equals(newobj.analog)
                && this.category.equals(newobj.category)
                && this.warrantyTime == newobj.warrantyTime;
    }

    @Override
    protected Object clone() {
        return new TechnicalItem(this);
    }

    @Override
    public String toString() {
        return this.ID + " "
                + this.name + " "
                + this.price + " "
                + this.analog.toString() + " "
                + this.category + " "
                + this.warrantyTime + "\n";
    }
}
