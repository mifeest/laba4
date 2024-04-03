package lab3.enums;

public enum Fluids {
    Blood("кровью"),
    Oil("масла");

    private String name;
    Fluids(String name){
        this.name = name;
    }
    public String getFluid(){
        return name;
    }

}
