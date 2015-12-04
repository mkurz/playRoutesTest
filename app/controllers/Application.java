package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import java.util.UUID;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result stringRoute(String id) {
        return ok("id: " + id);
    }

    public Result integerRoute(Integer id) {
        return ok("id: " + id);
    }

    public Result longRoute(Long id) {
        return ok("id: " + id);
    }

    public Result booleanRoute(Boolean id) {
        return ok("id: " + id);
    }

    public Result uuidRoute(UUID id) {
        return ok("id: " + id);
    }

    public Result jOptionRoute(java.util.Optional<Integer> id) {
        return ok("id: " + id);
    }

    public Result sOptionRoute(scala.Option<Integer> id) {
        return ok("id: " + id);
    }

    public Result scalaIntRoute(Integer id) {
        return ok("id: " + id);
    }

    public Result routesJS() {
        return ok(
            Routes.javascriptRouter("jsRoutes",
                controllers.routes.javascript.Application.stringRoute(),
                controllers.routes.javascript.Application.integerRoute(),
                controllers.routes.javascript.Application.longRoute(),
                controllers.routes.javascript.Application.booleanRoute(),
                controllers.routes.javascript.Application.uuidRoute(),
                controllers.routes.javascript.Application.jOptionRoute(),
                controllers.routes.javascript.Application.sOptionRoute(),
                controllers.routes.javascript.Application.scalaIntRoute(),
                controllers.routes.javascript.Assets.at()
            )
        ).as("text/javascript");
    }
}
