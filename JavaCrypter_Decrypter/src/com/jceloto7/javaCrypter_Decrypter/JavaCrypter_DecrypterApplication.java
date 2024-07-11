package com.jceloto7.javaCrypter_Decrypter;

import com.jceloto7.javaCrypter_Decrypter.view.MenuView;

public class JavaCrypter_DecrypterApplication {
    public static void main(String[] args){
        Bootstrap.start();
        MenuView menuView = new MenuView();
        menuView.menu();
    }

}