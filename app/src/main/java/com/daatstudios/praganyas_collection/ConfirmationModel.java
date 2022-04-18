package com.daatstudios.praganyas_collection;

public class ConfirmationModel {
    String main,price;

    public ConfirmationModel(String main, String price) {
        this.main = main;
        this.price = price;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
