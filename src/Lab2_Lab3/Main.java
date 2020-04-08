package Lab2_Lab3;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


//        GenericItem[] Array = new GenericItem[4];
//        Array[0] =
//                new FoodItem("Bread", 30.0f, null, new Date(2020, 3, 3), (short) 3);
//        Array[1] =
//                new TechnicalItem("PC", 60000.0f, null, Category.GENERAL, (short) 365);
//        Array[2] =
//                new FoodItem("Butter", 60.0f, null, new Date(2020, 3, 3), (short) 7);
//        Array[3] =
//                new TechnicalItem("Printer", 5000.0f, null, Category.GENERAL, (short) 120);
//
//        for (GenericItem item : Array) {
//            item.printAll();
//            System.out.println();
//        }
//
//        GenericItem analog = new GenericItem("Oreo", 45.0f, Category.FOOD);
//        GenericItem clonning = new GenericItem("Cookie", 30.0f, analog);
//
//        GenericItem clone = (GenericItem) clonning.clone();
//        clone.printAll();
//
//        System.out.println();
//
//        String line = "Конфеты ’Маска’;45;120";
//        String[] item_fld = line.split(";");
//        FoodItem newItem = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
//        newItem.printAll();

        ItemCatalog catalog = new ItemCatalog();

        FoodItem f1 = new FoodItem("f1");
        FoodItem f2 = new FoodItem("f2");
        FoodItem f3 = new FoodItem("f3");
        FoodItem f4 = new FoodItem("f4");
        FoodItem f5 = new FoodItem("f5");
        FoodItem f6 = new FoodItem("f6");
        FoodItem f7 = new FoodItem("f7");
        FoodItem f8 = new FoodItem("f8");
        FoodItem f9 = new FoodItem("f9");
        FoodItem f10 = new FoodItem("f10");

        System.out.println(GenericItem.currentID);

        long begin = new Date().getTime();

        for (int i = 0; i < 100000; i++)
            catalog.findItemByID(10);

        long end = new Date().getTime();

        System.out.println("In HashMap: " + (end - begin));

        begin = new Date().getTime();

        for (int i = 0; i < 100000; i++)
            catalog.findItemByIDAL(10);

        end = new Date().getTime();

        System.out.println("In ArrayList: " + (end - begin));

    }
}

