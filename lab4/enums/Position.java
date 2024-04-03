package lab3.enums;

public enum Position {
    Bed("на ложе"),
    Bottom("на дно"),
    Squat("на корточки"),
    Mirror("зеркало");


    private final String name;
    Position(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
