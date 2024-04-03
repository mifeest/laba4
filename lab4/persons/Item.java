package lab3.persons;

public class Item {
    public Item(String name, int weight, int regeneration){
        this.name = name;
        this.weight = weight;
        this.regeneration = regeneration;
    }
    private String name;
    private int weight;
    private int regeneration;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRegen(){
        return regeneration;
    }
    public void heal(Charachters charachters){
        charachters.setHealth(charachters.getHealth() + regeneration);
        System.out.println(charachters.getName() + " получил лечение на " + regeneration + " очков здоровья.");
    }
    private Charachters charachters;
    public void setOwner(Charachters charachters){
        this.charachters = charachters;
    }


}
