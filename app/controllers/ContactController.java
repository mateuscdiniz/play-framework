package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class ContactController extends Controller {

    public Result index() {

        return ok(views.html.contact.contact.render());
    }
}
