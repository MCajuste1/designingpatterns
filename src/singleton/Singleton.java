package singleton;

public class Singleton {
    public static void main(String[] args) {


        President president1 = new President().getInstance();
        President president2 = new President().getInstance();
        System.out.println(president1 == president1);

        System.out.println(president2 == president2);

    }


}
