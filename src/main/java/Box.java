
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anupam_pathak
 */
public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maxWt;
//    private double totalWt;

    public Box(double Maxwt) {
        this.maxWt = Maxwt;
        this.items = new ArrayList<>();
//        this.totalWt = 0;
    }

    public double weight() {
        double totalWt = 0.0;
        for (Packable prod : this.items) {
            totalWt += prod.weight();
        }
        return totalWt;
    }

    public void add(Packable item) {
        if (item.weight() <= this.maxWt) {
            this.items.add(item);
            this.maxWt -= item.weight();
//            this.totalWt += item.weight();
        } else {
            return;
        }
    }

    public String toString() {
//        Box: 6 items, total weight 4.0 kg
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

}
