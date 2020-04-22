package Lab2_Lab3_Lab4.ru.itmo.exceptions;

public class CatalogLoadException extends RuntimeException{

    public CatalogLoadException() {
    }

    public CatalogLoadException(ItemAlreadyExistsException e) {
    }
}
