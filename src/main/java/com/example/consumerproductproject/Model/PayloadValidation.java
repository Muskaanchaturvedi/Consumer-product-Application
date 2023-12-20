package com.example.consumerproductproject.Model;

import com.example.consumerproductproject.Model.Category;
import com.example.consumerproductproject.Model.Product;

public class PayloadValidation {
    public static boolean payloadValCat(Category category) {
        if(category.getId() != null) {
            return false;
        }
        return true;
    }

    public static boolean payloadValProd(Product product) {
        if(product.getId() != null) {
            return false;
        }
        return true;
    }
}

