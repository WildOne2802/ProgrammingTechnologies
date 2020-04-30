package Lab2_Lab3_Lab4_Lab6.ru.billing.exceptions;

import java.io.FileNotFoundException;

public class CatalogLoadException extends Exception {

    public CatalogLoadException() { }

    public CatalogLoadException(ItemAlreadyExistsException e) { }

    public CatalogLoadException(FileNotFoundException e) { }
}
