package com.entity;

public class Book {
    private int bookId;
    private String bookName;
    private String address;

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testBook(){
        System.out.println("bookId="+bookId+",bookName="+bookName+",address="+address);
    }

}
