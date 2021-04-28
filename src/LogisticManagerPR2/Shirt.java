package LogisticManagerPR2;

public class Shirt implements Moveable {
    private String brand;
    private String size;
    private String color;

    //constructor
    public Shirt(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    //own implementation of method move
    @Override
    public void move(String destination) {
        System.out.println(brand +" "+ size +" " + color + " will be moved to " + destination);
    }
}
