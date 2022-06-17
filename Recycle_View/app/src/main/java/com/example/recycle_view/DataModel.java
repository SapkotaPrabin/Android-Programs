package com.example.recycle_view;

public class DataModel {
    private String name;
    private int num;
    private int price;
    private String date;

    public DataModel(String name, int num, int price, String date) {
        this.name = name;
        this.num = num;
        this.price = price;
        this.date = date;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }


    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }


    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }
}
