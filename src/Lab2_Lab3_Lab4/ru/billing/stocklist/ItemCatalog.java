package Lab2_Lab3_Lab4.ru.billing.stocklist;

import Lab2_Lab3_Lab4.ru.billing.exceptions.ItemAlreadyExistsException;

import java.util.*;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog =
            new HashMap<Integer, GenericItem>();
    private ArrayList<GenericItem> ALCatalog =
            new ArrayList<GenericItem>();
    private HashMap<Pair<String, Category>, GenericItem> elseCatalog = new HashMap<>();

    public void addItem(GenericItem item) throws ItemAlreadyExistsException {

        if (catalog.containsKey(item.getID()) || ALCatalog.contains(item) || elseCatalog.containsKey(new Pair<>(item.getName(), item.getCategory())))
            throw new ItemAlreadyExistsException();

        else {

            catalog.put(item.getID(), item);
            ALCatalog.add(item);
            elseCatalog.put(new Pair<>(item.getName(), item.getCategory()), item);
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

    public GenericItem[] specialSearchAL(String name, Category category) {
        GenericItem[] resultArray = new GenericItem[ALCatalog.size()];
        int count = 0;
        for (GenericItem i : ALCatalog)
            if (i.getName().equals(name) && i.getCategory() == category)
                resultArray[count++] = i;
        return resultArray;
    }

    public GenericItem specialSearch(String name, Category category) {
//        GenericItem[] resultArray = new GenericItem[catalog.size()];
//        int count = 0;
        return elseCatalog.getOrDefault(new Pair<>(name, category), null);

    }

}

class Pair<T, S> {
    public T firstValue;
    public S secondValue;

    Pair(T firstValue, S secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public boolean equals(Object obj) {
        Pair newobj = (Pair) obj;
        return (this.firstValue.equals(newobj.firstValue)) && (this.secondValue.equals(newobj.secondValue));
    }
}

//TODO
//запись нового айтема +
//поиск айтема по айди +
//удаление айтема по айди +
//поиск айтемов по паре name and category +

