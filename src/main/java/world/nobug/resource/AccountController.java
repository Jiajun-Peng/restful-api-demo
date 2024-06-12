package world.nobug.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import world.nobug.domain.Account;
import world.nobug.exception.CustomException;

@Path("/accounts")
public class AccountController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Account getUser() {
        return new Account("hello");
    }


    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccountByName(@PathParam("name") String name) {
       return new Account(name);
    }


    @GET
    @Path("/customException")
    @Produces(MediaType.APPLICATION_JSON)
    public Account testException() {
        throw new CustomException("自定义异常", "自定义异常详情");
    }

    @GET
    @Path("/otherException")
    @Produces(MediaType.APPLICATION_JSON)
    public Account otherException() {
        int[] a = new int[2];
        a[3] = 1;
        return new Account("hello");
    }


}
