package com.example.day5;

public class BookShop {

    private String bookName;
    private  double bookPrice;
    private  int bookImg;
    private String bookType;

    public BookShop(String bookName, double phonePrice, int bookImg, String bookType) {
        this.bookName = bookName;
        this.bookPrice = phonePrice;
        this.bookImg = bookImg;
        this.bookType = bookType;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPhonePrice() {
        return bookPrice;
    }

    public void setPhonePrice(double phonePrice) {
        this.bookPrice = phonePrice;
    }

    public int getBookImg() {
        return bookImg;
    }

    public void setBookImg(int bookImg) {
        this.bookImg = bookImg;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
