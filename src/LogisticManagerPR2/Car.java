package LogisticManagerPR2;

public class Car implements Moveable{
    private String type;
    private String color;
    private double weight;

    public Car(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(type +" "+color+" will be moved to " + destination);
    }
}
