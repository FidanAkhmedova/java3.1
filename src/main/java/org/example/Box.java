package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Box<A extends Fruit> {
    ArrayList<A> box;
    public Box() {
        this.box = new ArrayList<A>();
    }
    public Box(A box) {
        this.box = new ArrayList<A>();
        this.box.add(box);
    }
    public Box(Collection<A> box) {
        this.box = new ArrayList<A>();
        this.box.addAll(box);
    }
    public float getWeight(){
        float weight = 0;
        for (Fruit f: box
             ) {
            weight += f.getWeight();
        }
        System.out.println("Weight ");
            return weight;
    }
    public void pour(Box<A> fruits){
        System.out.println("Pouring from one box to another ...");
        fruits.addFruit(this.box);
        this.box.clear();
    }
    public void addFruit(A fruit){
        this.box.add(fruit);
    }
    public void addFruit(Collection<A> fruits){
          this.box.addAll(fruits);
    }
    public boolean compare(Box fruits){
        if (fruits.getWeight() == this.getWeight()){
            System.out.println("Their weights are equal");
            return true;
        }
        System.out.println("Their weights are different");
        return false;
    }
    public void printObj(){
        System.out.println("Printing ...");
        for (Fruit f: box) {
//            System.out.println(f.getClass().getName());
            System.out.println(f.getWeight());
        }
    }
}
