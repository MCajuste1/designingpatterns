package factorymethod;

public class MarketingManager extends HiringManager {

    public Interviewer makeInterviewer(){

        return new CommunityExecutive();
    }
}
