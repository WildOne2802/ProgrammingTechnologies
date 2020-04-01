package SecondLab;

import java.util.Date;

public class FoodItem extends GenericItem implements Cloneable {
    protected Date dateOfIncome;
    protected short expires;

    public FoodItem(int ID, String name, float price, GenericItem analog, Category category, Date dateOfIncome, short expires) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.category = category;
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    public FoodItem(FoodItem obj) {
        this.ID = obj.ID;
        this.name = obj.name;
        this.price = obj.price;
        this.analog = obj.analog;
        this.category = obj.category;
        this.dateOfIncome = obj.dateOfIncome;
        this.expires = obj.expires;
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
