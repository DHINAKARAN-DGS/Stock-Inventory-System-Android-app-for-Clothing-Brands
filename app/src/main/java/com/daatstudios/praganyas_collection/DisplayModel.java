package com.daatstudios.praganyas_collection;

public class DisplayModel {
    String title,price,image,size,cat,id;

    public DisplayModel(String title, String price, String image, String size, String cat, String id) {
        this.title = title;
        this.price = price;
        this.image = image;
        this.size = size;
        this.cat = cat;
        this.id = id;
    }

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

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
