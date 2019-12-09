package factorymethod;
//Factory method - It provides a way to delegate the instantiation logic to child classes.


public class Developer implements Interviewer {

    public void askQuestions(){
        System.out.println("Asking about design patterns!");
    }


}
