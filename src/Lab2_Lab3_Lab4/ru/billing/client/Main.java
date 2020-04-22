package Lab2_Lab3_Lab4.ru.billing.client;

import Lab2_Lab3_Lab4.ru.itmo.exceptions.ItemAlreadyExistsException;
import Lab2_Lab3_Lab4.ru.billing.stocklist.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

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
//        String line = "                          Конфеты ’Маска’      ;         45     ;      120      ";
//        line=line.trim();
//        String[] item_fld = line.split("[\\s]*[;]+[\\s]*");
//
//
//        System.out.println(Arrays.toString(item_fld));
//        FoodItem newItem = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
//        newItem.printAll();

        ItemCatalog catalog = new ItemCatalog();

        try {
            FoodItem f1 = new FoodItem("f1");
            catalog.addItem(f1);
            FoodItem f2 = new FoodItem("f2");
            catalog.addItem(f2);
            FoodItem f3 = new FoodItem("f3");
            catalog.addItem(f3);
            FoodItem f4 = new FoodItem("f4");
            catalog.addItem(f4);
            FoodItem f5 = new FoodItem("f5");
            catalog.addItem(f5);
            FoodItem f6 = new FoodItem("f6");
            catalog.addItem(f6);
            FoodItem f7 = new FoodItem("f7");
            catalog.addItem(f7);
            FoodItem f8 = new FoodItem("f8");
            catalog.addItem(f8);
            FoodItem f9 = new FoodItem("f9");
            catalog.addItem(f9);
            FoodItem f10 = new FoodItem("f10");
            catalog.addItem(f10);
            GenericItem f11 = new GenericItem("COCA-COLA", 45.0f, Category.FOOD);
            catalog.addItem(f11);
            GenericItem f12 = new GenericItem("COCA-COLA", 56.0f, Category.FOOD);
            catalog.addItem(f12);
            GenericItem f13 = new GenericItem("f13", 10.0f, Category.GENERAL);
            catalog.addItem(f13);


            System.out.println(GenericItem.getCurrentID());

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

            System.out.println();

            catalog.printItems();

            System.out.println();

            System.out.println(catalog.specialSearch("COCA-COLA", Category.FOOD));

            System.out.println(catalog.specialSearch("f5", Category.FOOD));
            System.out.println(catalog.specialSearch("f12", Category.DRESS));

        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
        }


//        System.out.println();
//        MyCategory cat = MyCategory.FOOD;
//        System.out.println(cat);

    }
}

