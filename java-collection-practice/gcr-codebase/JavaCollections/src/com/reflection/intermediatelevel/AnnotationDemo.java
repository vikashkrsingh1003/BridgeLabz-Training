package com.reflection.intermediatelevel;

public class AnnotationDemo {
    public static void main(String[] args) {
        Author author = Book.class.getAnnotation(Author.class);
        System.out.println("Author: " + author.name());
    }
}