package cm.belrose.personhandleexception.exceptionHandling;

import lombok.Data;

@Data
public class ExceptionResponse {

    private String errorMessage;
    private String requestURI;

}
