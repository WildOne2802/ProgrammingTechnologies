package Lab2_Lab3_Lab4.ru.billing.stocklist;

import Lab2_Lab3_Lab4.ru.billing.exceptions.ItemAlreadyExistsException;

import java.util.*;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog =
            new HashMap<Integer, GenericItem>();
    private ArrayList<GenericItem> ALCatalog =
            new ArrayList<GenericItem>();

    public void addItem(GenericItem item) throws ItemAlreadyExistsException {

        if (catalog.containsKey(item.getID()) || ALCatalog.contains(item)) throw new ItemAlreadyExistsException();

        else {

            catalog.put(item.getID(), item);
            ALCatalog.add(item);
        }
    }

    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id) {
        return catalog.getOrDefault(id, null);
    }

    public GenericItem findItemByIDAL(int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id) return i;
        }
        return null;
    }

    public void deleteItemByID(int id) {
        catalog.remove(id);
    }

    public void deleteItemByIDAL(int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id)
                ALCatalog.remove(i);
        }
    }

    public GenericItem specialSearchAL(String name, Category category) {
        for (GenericItem i : ALCatalog)
            if (i.getName().equals(name) && i.getCategory() == category)
                return i;
        return null;
    }

    public GenericItem specialSearch(String name, Category category) {

        for (Map.Entry<Integer, GenericItem> pair : catalog.entrySet()) {
            if (pair.getValue().getName().equals(name) && pair.getValue().getCategory() == category)
                return pair.getValue();
        }
        return null;
    }
}

//TODO
//запись нового айтема +
//поиск айтема по айди +
//удаление айтема по айди +
//поиск айтемов по паре name and category +

