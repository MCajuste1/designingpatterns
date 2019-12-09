package abstractfactory;

public class WorkFactory {


    public static void main(String[] args) {

        WoodenDoorFactory woodenFactory = new WoodenDoorFactory();

        Door door = woodenFactory.makeDoor();

        DoorFittingExpert expert  = woodenFactory.makeFittingExpert();

        door.getDescription();
        expert.getDescription();


        IronDoorFactory ironDoorFactory = new IronDoorFactory();

        Door door1 = ironDoorFactory.makeDoor();

        DoorFittingExpert expert1 = ironDoorFactory.makeFittingExpert();
        door1.getDescription();
        expert1.getDescription();






    }
}

