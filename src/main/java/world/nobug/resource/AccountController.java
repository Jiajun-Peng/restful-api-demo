package world.nobug.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import world.nobug.domain.Account;

@Path("/accounts")
public class AccountController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Account getUser() {
        return new Account("hello");
    }
}
