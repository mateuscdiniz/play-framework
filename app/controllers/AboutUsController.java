package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class AboutUsController extends Controller {

    public Result index() {

        return ok(views.html.aboutus.aboutus.render());
    }
}
