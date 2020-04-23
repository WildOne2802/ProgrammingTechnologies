package Lab2_Lab3_Lab4_Lab6.ru.billing.client;

import Lab2_Lab3_Lab4_Lab6.ru.billing.exceptions.CatalogLoadException;
import Lab2_Lab3_Lab4_Lab6.ru.billing.stocklist.ItemCatalog;


public interface CatalogLoader {

    public void load(ItemCatalog catalog) throws CatalogLoadException;
}
