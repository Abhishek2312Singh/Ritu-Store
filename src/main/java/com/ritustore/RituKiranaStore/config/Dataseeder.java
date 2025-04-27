package com.ritustore.RituKiranaStore.config;

import com.ritustore.RituKiranaStore.model.Category;
import com.ritustore.RituKiranaStore.model.Product;
import com.ritustore.RituKiranaStore.repository.Categoryrepository;
import com.ritustore.RituKiranaStore.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class Dataseeder implements CommandLineRunner {

    @Autowired
    Productrepository productrepository;
    @Autowired
    Categoryrepository categoryrepository;

    @Override
    public void run(String... args) throws Exception {
        //Clear data
        productrepository.deleteAll();
        categoryrepository.deleteAll();

        //Categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothings = new Category();
        clothings.setName("Clothings");

        Category home = new Category();
        home.setName("Home & Kitchen");

        categoryrepository.saveAll(Arrays.asList(electronics,home,clothings));

        //Products
        Product mobile = new Product();
        mobile.setName("iPhone");
        mobile.setCategory(electronics);
        mobile.setDescription("Latest mobile in the market");
        mobile.setPrice(999.99);
        mobile.setImgUrl("https://placehold.co/600x400");

        Product tshirt = new Product();
        tshirt.setCategory(clothings);
        tshirt.setDescription("Latest clothes in the market");
        tshirt.setPrice(349.99);
        tshirt.setName("US Polo");
        tshirt.setImgUrl("https://placehold.co/600x400");

        Product shirt = new Product();
        shirt.setName("Shirt");
        shirt.setCategory(clothings);
        shirt.setDescription("Latest shirt in the market");
        shirt.setPrice(499.99);
        shirt.setImgUrl("https://placehold.co/600x400");

        Product spoon = new Product();
        spoon.setName("Steel Spoon");
        spoon.setCategory(home);
        spoon.setDescription("Stainless Steel Spoon");
        spoon.setPrice(49.00);
        spoon.setImgUrl("https://placehold.co/600x400");

        productrepository.saveAll(Arrays.asList(spoon,shirt,tshirt,mobile));
    }
}
