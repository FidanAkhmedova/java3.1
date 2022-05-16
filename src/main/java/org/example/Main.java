package org.example;
import java.util.ArrayList;
public class Main <T>{
    private T obj;
    private Integer[] arr = {1, 2, 4, 5};
    ArrayList<Integer> Numbers = new ArrayList<Integer>();
    //T[] = new T[10];
//    public Main(T... arr) {
//        this.arr = arr;
//    }
    public Main(T оbj) {
        this.obj = оbj;
    }
    public T getObj() {
        return obj;
    }
    public void swap(int i, int j){
        Integer w = arr[i]; arr[i] = arr[j]; arr[j] = w;
    }
    public void printArr(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void convertToArrayList(){
        for (int i = 0; i < arr.length; i++) {
            Numbers.add(arr[i]);
        }
        return;
    }
    public void printArrayList(){
        System.out.println("Arraylist");
        for (Integer arrList : Numbers
             ) {
            System.out.println(arrList);
        }
    }
    public static void main(String[] args) {
    //1
        Main<String> num = new Main<>("num");
        num.swap(1, 3);
        num.printArr();

    //2
        num.convertToArrayList();
        num.printArrayList();

    //3
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Apple apple1 = new Apple();

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();

        box1.addFruit(apple1);
        box1.addFruit(apple1);
        box1.addFruit(apple1);

        box2.addFruit(orange1);
        box2.addFruit(orange1);
        box3.addFruit(orange2);
        box3.addFruit(orange3);

        System.out.println("of box1 = " + box1.getWeight());
        System.out.println("of box2 = " + box2.getWeight());
        System.out.println("Comparing weights of box1 and box2 " + box1.compare(box2));

        System.out.println("Box1");box1.printObj();
        System.out.println("Box2");box2.printObj();
        System.out.println("Box3");box2.pour(box3);

        System.out.println("Box2");box2.printObj();
        System.out.println("Box3");box3.printObj();
    }
}