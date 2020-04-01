package SecondLab;

import java.util.Date;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {


        GenericItem[] Array = new GenericItem[4];
        Array[0] =
                new FoodItem("Bread", 30.0f, null, new Date(2020, 3, 3), (short) 3);
        Array[1] =
                new TechnicalItem("PC", 60000.0f, null, Category.GENERAL, (short) 365);
        Array[2] =
                new FoodItem("Butter", 60.0f, null, new Date(2020, 3, 3), (short) 7);
        Array[3] =
                new TechnicalItem("Printer", 5000.0f, null, Category.GENERAL, (short) 120);

        for (GenericItem item : Array) {
            item.printAll();
            System.out.println();
        }

        GenericItem analog = new GenericItem("Oreo", 45.0f, Category.FOOD);
        GenericItem clonning = new GenericItem("Cookie", 30.0f, analog);

        GenericItem clone = (GenericItem) clonning.clone();
        clone.printAll();


    }
}

