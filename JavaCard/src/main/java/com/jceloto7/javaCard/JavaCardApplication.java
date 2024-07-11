package com.jceloto7.javaCard;

import com.jceloto7.javaCard.view.JavaCardView;

public class JavaCardApplication {
    public static void main(String[] args) {
        Bootstrap.start();
        JavaCardView javaCardView = new JavaCardView();
        javaCardView.menu();
    }
}