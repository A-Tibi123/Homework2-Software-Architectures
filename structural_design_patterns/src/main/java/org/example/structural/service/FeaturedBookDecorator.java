package org.example.structural.service;

import org.example.structural.entity.Book;

public class FeaturedBookDecorator implements BookDecorator {
    private final Book book;

    public FeaturedBookDecorator(Book book) {
        this.book = book;
    }

    @Override
    public String getDescription() {
        return book.getDescription() + " (Featured)";
    }

    @Override
    public double getPrice() {
        return book.getPrice();
    }
}
