package LogisticManagerPR2;

import java.util.ArrayList;
import java.util.List;

public class LogisticManager {
    private List<Moveable> moveables = new ArrayList<Moveable>();
    //TODO: revisar el tipo de lista

    public void addMoveable(Moveable moveable){
        moveables.add(moveable);
    }

    public void moveAll(String destination){
        for (Moveable moveable: moveables) {
            moveable.move(destination);
        }

    }
}
