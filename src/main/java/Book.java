/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anupam_pathak
 */
public class Book implements Packable {

    private String author;
    private String name;
    private double bookWeight;

    public Book(String author, String name, double bookWeight) {
        this.author = author;
        this.name = name;
        this.bookWeight = bookWeight;
    }

    public double weight() {
        return this.bookWeight;
    }

    public String toString() {
//    Fyodor Dostoevsky: Crime and Punishment
        return this.author + ": " + this.name;
    }
}
