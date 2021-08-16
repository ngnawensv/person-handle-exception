package cm.belrose.personhandleexception.service.exception;

/**
 * Cette classe est renvoyer par PersonService en cas d'Exception
 */
public class PersonServiceException extends Exception {

    public PersonServiceException() {
    }

    public PersonServiceException(String message) {
        super(message);
    }

    public PersonServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
