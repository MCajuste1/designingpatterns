package simplefactory;

public class DoorFactory {


    //DoorFactory class makes door and returns it
    public static Door makeDoor(float width, float height){

        return new WoodenDoor(width,height) {
        };
    }
}
