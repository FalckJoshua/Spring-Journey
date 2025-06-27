package com.remove.springshoppingcart.cart.exception;

public class ProductNotFoundException extends  RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
