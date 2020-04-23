package Lab2_Lab3_Lab4_Lab6.ru.billing.stocklist;

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
        setCategory(Category.FOOD);

        this.dateOfIncome = dateOfIncome;
        this.expires = expires;

        setID(GenericItem.getCurrentID());
        setCurrentID(getCurrentID() + 1);
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
        super.printAll();
        System.out.println("Date of income: " + dateOfIncome + "\nExpires: " + expires);
    }

    @Override
    public boolean equals(Object obj) {
        FoodItem newobj = (FoodItem) obj;
        return super.equals(newobj)
                && this.dateOfIncome.equals(newobj.dateOfIncome)
                && this.expires == newobj.expires;
    }

    @Override
    public FoodItem clone() {
        return (FoodItem) super.clone();
    }

    //TODO:


    @Override
    public String toString() {
        return super.toString() + " "
                + this.dateOfIncome + " "
                + this.expires;
    }
}
