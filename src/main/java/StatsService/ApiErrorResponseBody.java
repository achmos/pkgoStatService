package StatsService;

import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ramin on 1/9/2017.
 */
public class ApiErrorResponseBody {
    private HttpStatus status;
    private String message;
    private List<String> errors; //FIXME: Better object to use instead of String

    public ApiErrorResponseBody(HttpStatus status, String message, List<String> errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ApiErrorResponseBody(HttpStatus status, String message, String error) {
        this.status = status;
        this.message = message;
        this.errors = Arrays.asList(error);
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}


//{
// "timestamp":1487646170257,
// "status":404,
// "error":"Not Found",
// "message":"No message available",
// "path":"/api/pokemon/107/stats/what"
// }