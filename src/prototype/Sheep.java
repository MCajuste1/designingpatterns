package prototype;

public class Sheep {

    protected String name;
    protected String category;


    public Sheep(String name, String category){
        this.name = name;
        this.category = name;

    }

    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return name;

    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;

    }



}
