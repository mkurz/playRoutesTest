package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import java.util.UUID;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result stringRoute(String id) {
        return ok("id: " + id);
    }

    public static Result integerRoute(Integer id) {
        return ok("id: " + id);
    }

    public static Result longRoute(Long id) {
        return ok("id: " + id);
    }

    public static Result booleanRoute(Boolean id) {
        return ok("id: " + id);
    }

    public static Result uuidRoute(UUID id) {
        return ok("id: " + id);
    }

    public static Result jOptionRoute(play.libs.F.Option<Integer> id) {
        return ok("id: " + id);
    }

    public static Result sOptionRoute(scala.Option<Integer> id) {
        return ok("id: " + id);
    }

    public static Result scalaIntRoute(Integer id) {
        return ok("id: " + id);
    }

    public static Result routesJS() {
        response().setContentType("text/javascript");
        return ok(
            Routes.javascriptRouter("jsRoutes",
                controllers.routes.javascript.Application.stringRoute(),
                controllers.routes.javascript.Application.integerRoute(),
                controllers.routes.javascript.Application.longRoute(),
                controllers.routes.javascript.Application.booleanRoute(),
                controllers.routes.javascript.Application.uuidRoute(),
                controllers.routes.javascript.Application.jOptionRoute(),
                controllers.routes.javascript.Application.sOptionRoute(),
                controllers.routes.javascript.Application.scalaIntRoute()
            )
        );
    }
}
