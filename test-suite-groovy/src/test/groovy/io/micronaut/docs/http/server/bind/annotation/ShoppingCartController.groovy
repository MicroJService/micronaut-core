package io.micronaut.docs.http.server.bind.annotation

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/customBinding")
class ShoppingCartController {

    // tag::method[]
    @Get("/annotated")
    HttpResponse<String> checkSession(@ShoppingCart Long sessionId) { //<1>
        HttpResponse.ok("Session:" + sessionId)
    }
    // end::method

    @Post("/customBody")
    @Consumes(MediaType.TEXT_PLAIN)
    HttpResponse<String> checkCustomPost( @ShoppingCart String body) { //<1>
        HttpResponse.ok("Body:" + body)
    }
}
