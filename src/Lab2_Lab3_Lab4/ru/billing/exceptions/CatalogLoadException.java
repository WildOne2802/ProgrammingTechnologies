package Lab2_Lab3_Lab4.ru.billing.exceptions;

public class CatalogLoadException extends Exception {

    public CatalogLoadException() {
    }

    public CatalogLoadException(ItemAlreadyExistsException e) {
    }
}
