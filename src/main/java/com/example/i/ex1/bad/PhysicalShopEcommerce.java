package com.example.i.ex1.bad;

public class PhysicalShopEcommerce implements Ecommerce{


    @Override
    public void acceptOnlineOrder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void acceptPhoneOrder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void acceptPhysicalOrder() {
        // implementation
    }

    @Override
    public void payOnline() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void payPhysical() {
        // implementation
    }
}
