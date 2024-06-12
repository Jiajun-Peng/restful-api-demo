package world.nobug.exception;

import jakarta.ws.rs.core.Response;

public class CustomException extends RuntimeException {
    private final Response.Status status = Response.Status.BAD_REQUEST;
    private final String code = "Some_Custom_Error_Code";
    private String message;
    private Object detail;

    public CustomException() {
        super();
    }

    public CustomException(String message, Object detail) {
        super(message);
        this.message = message;
        this.detail = detail;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Response.Status getStatus() {
        return status;
    }
}
