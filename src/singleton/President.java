package singleton;




public final class President {

     private static President instance;

    public President(){

        }

     public static President getInstance(){
        if(instance == null){
            instance = new President();
        }
        return instance;

     }

}
