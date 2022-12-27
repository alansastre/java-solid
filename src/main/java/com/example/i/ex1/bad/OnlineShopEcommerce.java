package com.example.i.ex1.bad;

public class OnlineShopEcommerce implements Ecommerce{
    @Override
    public void acceptOnlineOrder() {
        // ... implementación ...
    }

    @Override
    public void acceptPhoneOrder() {
        // ... implementación ...

    }

    @Override
    public void acceptPhysicalOrder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void payOnline() {
        // ... implementación ...

    }

    @Override
    public void payPhysical() {
        throw new UnsupportedOperationException();
    }
}
