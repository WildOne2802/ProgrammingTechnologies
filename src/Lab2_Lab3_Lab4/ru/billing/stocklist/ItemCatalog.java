package Lab2_Lab3_Lab4.ru.billing.stocklist;

import Lab2_Lab3_Lab4.ru.billing.exceptions.ItemAlreadyExistsException;

import java.util.*;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog =
            new HashMap<Integer, GenericItem>();
    private ArrayList<GenericItem> ALCatalog =
            new ArrayList<GenericItem>();
    private HashMap<Pair<String, Category>, Set<GenericItem>> elseCatalog = new HashMap<>();

//    public int hashFunction(String value) {
//        int hash = 7;
//        for (int i = 0; i < value.length(); i++) {
//            hash = hash * 31 + value.charAt(i);
//        }
//        return hash;
//    }

    public void addItem(GenericItem item) throws ItemAlreadyExistsException {

        Pair<String, Category> pair = new Pair<>(item.getName(), item.getCategory());
        if (catalog.containsKey(item.getID()) || ALCatalog.contains(item))
            throw new ItemAlreadyExistsException();
        if (elseCatalog.containsKey(pair) && elseCatalog.get(pair).contains(item)) {
            throw new ItemAlreadyExistsException();
        } else {

            catalog.put(item.getID(), item);
            ALCatalog.add(item);
            if (elseCatalog.containsKey(pair))
                elseCatalog.get(pair).add(item);
            else {
                Set<GenericItem> set = new HashSet<>();
                set.add(item);
                elseCatalog.put(pair, set);
            }
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
        elseCatalog.get(new Pair<>(catalog.get(id).getName(), catalog.get(id).getCategory())).remove(catalog.get(id));
        catalog.remove(id);
        ALCatalog.removeIf(i -> i.getID() == id);

    }


    public GenericItem[] specialSearchAL(String name, Category category) {
        GenericItem[] resultArray = new GenericItem[ALCatalog.size()];
        int count = 0;
        for (GenericItem i : ALCatalog)
            if (i.getName().equals(name) && i.getCategory() == category)
                resultArray[count++] = i;
        return resultArray;
    }

    public Set<GenericItem> specialSearch(String name, Category category) {
        return elseCatalog.get(new Pair<>(name, category));
    }



}

//TODO
//запись нового айтема +
//поиск айтема по айди +
//удаление айтема по айди +
//поиск айтемов по паре name and category +

