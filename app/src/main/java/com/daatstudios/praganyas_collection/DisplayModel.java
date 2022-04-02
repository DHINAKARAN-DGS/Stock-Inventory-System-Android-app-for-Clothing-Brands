package com.daatstudios.praganyas_collection;

public class DisplayModel {
    String title,price,image,size;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public DisplayModel(String title, String price, String image, String size) {
        this.title = title;
        this.price = price;
        this.image = image;
        this.size = size;
    }
}
