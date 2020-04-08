package Lab2_Lab3;

public class TechnicalItem extends GenericItem implements Cloneable {
    protected short warrantyTime;

    public TechnicalItem() {
    }

    public TechnicalItem(String name, float price, GenericItem analog, Category category, short warrantyTime) {
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.category = category;
        this.warrantyTime = warrantyTime;

        this.ID = GenericItem.currentID++;
    }

    public TechnicalItem(TechnicalItem obj) {
        this.name = obj.name;
        this.price = obj.price;
        this.analog = obj.analog;
        this.category = obj.category;

        this.ID = GenericItem.currentID++;
    }

    @Override
    public void printAll() {
        System.out.printf("ID: %d , Name: %-10s , price:%5.2f , AnalogID: %d , Category: %-7s \n", ID, name, price, analog, category);
        System.out.println("Warranty Time: " + warrantyTime);
    }

    @Override
    public boolean equals(Object obj) {
        TechnicalItem newobj = (TechnicalItem) obj;
        return this.ID == newobj.ID
                && this.name.equals(newobj.name)
                && this.price == newobj.price
                && (this.analog == null ? newobj.analog == null : this.analog.equals(newobj.analog))
                && this.category.equals(newobj.category)
                && this.warrantyTime == newobj.warrantyTime;
    }

    @Override
    protected Object clone() {
        return this.analog;
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
