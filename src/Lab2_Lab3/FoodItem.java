package Lab2_Lab3;

import java.util.Date;

public class FoodItem extends GenericItem implements Cloneable {
    protected Date dateOfIncome;
    protected short expires;

    public FoodItem() {
    }

    public FoodItem(String name, float price, FoodItem analog, Date dateOfIncome, short expires) {
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;

        this.ID = GenericItem.currentID++;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, new Date(2020, 1, 1), expires);
    }

    public FoodItem(String name) {
        this(name, 50.0f, null, new Date(2020, 1, 1), (short) 3);
    }

    @Override

    public void printAll() {
        System.out.printf("ID: %d , Name: %-10s , price:%5.2f , AnalogID: %d , Category: %-7s \n", ID, name, price, analog, category);
        System.out.println("Date of income: " + dateOfIncome + " , Expires: " + expires);
    }

    @Override
    public boolean equals(Object obj) {
        FoodItem newobj = (FoodItem) obj;
        return this.ID == newobj.ID
                && this.name.equals(newobj.name)
                && this.price == newobj.price
                && (this.analog == null ? newobj.analog == null : this.analog.equals(newobj.analog))
                && this.category.equals(newobj.category)
                && this.dateOfIncome.equals(newobj.dateOfIncome)
                && this.expires == newobj.expires;
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
                + this.dateOfIncome + " "
                + this.expires + "\n";
    }
}
