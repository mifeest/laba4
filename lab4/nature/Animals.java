package lab3.nature;

public class Animals {
    private final String name;
    private int power;
    public Animals(String name, int power){
        this.name = name;
        this.power = power;
    }
    public void jump(){
        System.out.println(this.name + "прыгает");
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}
