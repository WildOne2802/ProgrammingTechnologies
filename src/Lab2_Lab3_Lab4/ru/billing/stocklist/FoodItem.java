package Lab2_Lab3_Lab4.ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem implements Cloneable {
    protected Date dateOfIncome;
    protected short expires;

    public FoodItem() {
    }

    public FoodItem(String name, float price, FoodItem analog, Date dateOfIncome, short expires) {
        setName(name);
        //this.name = name;
        setPrice(price);
        //this.price = price;
        setAnalog(analog);
        //this.analog = analog;
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;

        setID(GenericItem.getCurrentID());
        setCurrentID(getCurrentID()+1);
        //this.ID = GenericItem.currentID++;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, new Date(120, 1, 1), expires);
    }

    public FoodItem(String name) {
        this(name, 50.0f, null, new Date(120, 1, 1), (short) 3);
    }

    @Override

    public void printAll() {
        System.out.printf("ID: %d , Name: %-10s , price:%5.2f , AnalogID: %d , Category: %-7s \n", getID(), getName(), getPrice(), getAnalog(), getCategory());
        System.out.println("Date of income: " + dateOfIncome + " , Expires: " + expires);
    }

    @Override
    public boolean equals(Object obj) {
        FoodItem newobj = (FoodItem) obj;
        return getID() == newobj.getID()
                && this.getName().equals(newobj.getName())
                && this.getPrice() == newobj.getPrice()
                && (this.getAnalog() == null ? newobj.getAnalog() == null : this.getAnalog().equals(newobj.getAnalog()))
                && this.getCategory().equals(newobj.getCategory())
                && this.dateOfIncome.equals(newobj.dateOfIncome)
                && this.expires == newobj.expires;
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
                + this.dateOfIncome + " "
                + this.expires + "\n";
    }
}
