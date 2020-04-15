package Lab2_Lab3_Lab4.ru.billing.client;

import Lab2_Lab3_Lab4.ru.billing.exceptions.CatalogLoadException;
import Lab2_Lab3_Lab4.ru.billing.stocklist.ItemCatalog;

import java.io.CharArrayReader;


public interface CatalogLoader {

    public void load(ItemCatalog catalog);
}
