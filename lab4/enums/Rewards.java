package lab3.enums;

public enum Rewards {
    REWARD("награда");
    private String name;

    Rewards(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
