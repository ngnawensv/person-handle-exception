package cm.belrose.personhandleexception.service.exception;

/**
 * Cette classe est renvoyer par CarService en cas d'Exception
 */
public class CarServiceException extends Exception {

    public CarServiceException() {

    }

    public CarServiceException(String message) {
        super(message);
    }

    public CarServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
