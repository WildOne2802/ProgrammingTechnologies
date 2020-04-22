package Lab2_Lab3_Lab4.ru.billing.client;

import Lab2_Lab3_Lab4.ru.billing.exceptions.CatalogLoadException;
import Lab2_Lab3_Lab4.ru.billing.exceptions.ItemAlreadyExistsException;
import Lab2_Lab3_Lab4.ru.billing.stocklist.Category;
import Lab2_Lab3_Lab4.ru.billing.stocklist.FoodItem;
import Lab2_Lab3_Lab4.ru.billing.stocklist.GenericItem;
import Lab2_Lab3_Lab4.ru.billing.stocklist.ItemCatalog;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog catalog) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, null, new Date(), (short) 10);
        try {
            catalog.addItem(item1);
            catalog.addItem(item2);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
    }
}
