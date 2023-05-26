public class ReadOnly {

    private String name = "Bartek";

    public String getName(){
        return name + "jest ok";
    }

    public void setName(String name){
        this.name = name;
    }
}
