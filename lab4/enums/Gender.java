package lab3.enums;

public enum Gender {
    Male(" "),
    Female("а "),
    Plural("и ");
    private final String name;
    Gender(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }




}
