package Lab2_Lab3_Lab4.ru.billing.stocklist;

public class TechnicalItem extends GenericItem implements Cloneable {
    protected short warrantyTime;

    public TechnicalItem() {
    }

    public TechnicalItem(String name, float price, GenericItem analog, Category category, short warrantyTime) {
        setName(name);
        //this.name = name;
        setPrice(price);
        //this.price = price;
        setAnalog(analog);
        //this.analog = analog;
        setCategory(category);
        //this.category = category;
        this.warrantyTime = warrantyTime;

        setID(GenericItem.getCurrentID());
        setCurrentID(getCurrentID() + 1);
        //this.ID = GenericItem.currentID++;
    }

    public TechnicalItem(TechnicalItem obj) {
        setName(obj.getName());
        //this.name = obj.name;
        setPrice(obj.getPrice());
        //this.price = obj.price;
        setAnalog(obj.getAnalog());
        //this.analog = obj.analog;
        setCategory(obj.getCategory());
        //this.category = obj.category;

        setID(GenericItem.getCurrentID());
        setCurrentID(getCurrentID() + 1);
        //this.ID = GenericItem.currentID++;
    }

    @Override
    public void printAll() {
        System.out.printf("ID: %d , Name: %-10s , price:%5.2f , AnalogID: %d , Category: %-7s \n", getID(), getName(), getPrice(), getAnalog(), getCategory());
        System.out.println("Warranty Time: " + warrantyTime);
    }

    @Override
    public boolean equals(Object obj) {
        TechnicalItem newobj = (TechnicalItem) obj;
        return this.getID() == newobj.getID()
                && this.getName().equals(newobj.getName())
                && this.getAnalog() == null ? newobj.getAnalog() == null : this.getAnalog().equals(newobj.getAnalog())
                && this.getCategory().equals(newobj.getCategory())
                && this.warrantyTime == newobj.warrantyTime;
    }

    @Override
    protected Object clone() {
        return this.getAnalog();
    }

    @Override
    public String toString() {
        return this.getID() + " "
                + this.getName() + " "
                + this.getPrice() + " "
                + (this.getAnalog() != null ? this.getAnalog().toString() : null) + " "
                + this.getCategory() + " "
                + this.warrantyTime + "\n";
    }
}
