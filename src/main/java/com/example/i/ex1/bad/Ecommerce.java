package com.example.i.ex1.bad;

public interface Ecommerce {

    // temática pedidos
    void acceptOnlineOrder();
    void acceptPhoneOrder();
    void acceptPhysicalOrder();

    // temática pagos
    void payOnline();
    void payPhysical();

}
