package LogisticManagerPR2;

public class LogisticManagerDemoApp {
    public static void main(String[] args) {

        //instanciar la clase LogisticManager
        LogisticManager logico = new LogisticManager();
        logico.addMoveable(new Car("Renault", "azul", 2599.00));
        logico.addMoveable(new Shirt("Foot of the Loom", "M", "blanca"));
        logico.addMoveable(new Car("Volkswagen", "rosa", 2339.00));
        logico.addMoveable(new Shirt("Adidas", "M", "black"));

        logico.moveAll("Graz");


    }
}
