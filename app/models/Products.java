package models;


import io.ebean.*;
import play.data.validation.*;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Products extends Model {

    public Integer id;

    public String name;

    public double price;

    public String description;

    public Products() {
    }


    public Products(Integer id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    private static Set<Products> products;

    static {
        products = new HashSet<>();
        products.add(new Products(1, "Lake House", 200.000, "Lake house" ));
        products.add(new Products(2, "Apartament", 100.000, "Apartament" ));
        products.add(new Products(3, "Flat", 300.000, "Flat" ));
    }

    public static Set<Products> allProducts() {
        return products;
    }

    public static Products findById(Integer id) {
        for(Products product : products) {
            if(id.equals(product.id)) {
                return product;
            }

        }
        return null;
    }



    // public static final Finder<Long, Products> find = new Finder<>(Products.class);
}
