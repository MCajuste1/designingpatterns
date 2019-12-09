package factorymethod;


//Any child can extend it and provide the required interviewer
public class DevolopmentManager extends HiringManager {

    public Interviewer makeInterviewer(){

        return new Developer();
    }

}
