package world.nobug.jaxrs;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import world.nobug.exception.CustomException;
import world.nobug.exception.ErrorBody;

@Provider
public class CustomExceptionMapper implements ExceptionMapper<CustomException> {

    @Override
    public Response toResponse(CustomException e) {
        ErrorBody errorBody = new ErrorBody();
        errorBody.setCode(e.getCode());
        errorBody.setMessage(e.getMessage());
        errorBody.setDetail(e.getDetail());
        return Response.status(e.getStatus()).entity(errorBody).build();
    }
}
