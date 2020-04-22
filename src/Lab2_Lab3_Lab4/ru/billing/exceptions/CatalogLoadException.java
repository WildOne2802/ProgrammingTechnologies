package Lab2_Lab3_Lab4.ru.billing.exceptions;

import Lab2_Lab3_Lab4.ru.billing.client.CatalogLoader;

import java.io.FileNotFoundException;

public class CatalogLoadException extends Exception {

    public CatalogLoadException() {
    }

    public CatalogLoadException(ItemAlreadyExistsException e) {
    }

    public CatalogLoadException(FileNotFoundException e) {
    }
}
