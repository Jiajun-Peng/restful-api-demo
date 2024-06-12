package world.nobug.jaxrs;


import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import world.nobug.exception.ErrorBody;

@Provider
public class OtherExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable throwable) {
        ErrorBody errorBody = new ErrorBody();
        errorBody.setCode("SYSTEM_ERROR");
        errorBody.setMessage("系统异常，请稍后重试");
        errorBody.setDetail(throwable.getMessage());
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorBody).build();
    }
}
