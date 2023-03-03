/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anupam_pathak
 */
public class CD implements Packable {

    private String artist;
    private String name;
    private int year;
    private double cdWeight;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.cdWeight = 0.1;
    }

    public double weight() {
        return this.cdWeight;
    }

    public String toString() {
//        Rendezvous Park: Closer to Being Here (2012)
        return this.artist + ": " + this.name + " (" + this.year + ")";
    }
}
