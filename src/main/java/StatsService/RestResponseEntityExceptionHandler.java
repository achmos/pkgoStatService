package StatsService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by Ramin on 1/9/2017.
 */

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value={IllegalArgumentException.class})
    protected ResponseEntity<Object> handleResourceIdNotFound(Exception ex, WebRequest request){
        String bodyOfResponse = "Resource not found";
        ApiErrorResponseBody error = new ApiErrorResponseBody(HttpStatus.NOT_FOUND, bodyOfResponse,ex.getMessage());



        return handleExceptionInternal(ex, error,
                new HttpHeaders(), error.getStatus(), request);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String bodyOfResponse = "kjsahdgohwgoiwehjoaweigjwepigj";
        ApiErrorResponseBody error = new ApiErrorResponseBody(status,bodyOfResponse,ex.getMessage());
        return handleExceptionInternal(ex, error, headers, error.getStatus(), request);
    }
}
