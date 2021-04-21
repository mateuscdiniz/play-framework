package controllers;

import models.Products;

import play.mvc.Controller;
import play.mvc.Result;

import java.util.*;

import views.html.products.*;



public class ProductsController  extends Controller{



    public Result index(){
       Set<Products> products = Products.allProducts();
        return ok(index.render(products));
    }

    public Result show(Integer id){
        Products product = Products.findById(id);
        if(product==null){
            return notFound();
        }
        return ok(show.render(product));
    }


}
