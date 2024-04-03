package lab3.persons;

import lab3.enums.* ;
import lab3.exceptions.WrongHealthException;
import lab3.locations.AbstractLoc;
import lab3.nature.Subjects;
import lab3.nature.Things;
import lab3.interfaces.Adding;
import lab3.interfaces.Properties;


public class Charachters extends AbstractCharachters implements Properties, Adding {

    private AbstractLoc loc;
    private String name;
    private String property;
    private String add;
    private int level;
    private int health;
    private Reward rewards;
    private Posture.Pose posture;
    private AbstractLoc.Locations location;
    private String nameOfLoc;


    public Charachters(String name, Gender gender, int level, int health, Posture.Pose position, AbstractLoc.Locations locations) throws WrongHealthException {
        super(name,gender);
        this.name = name;
        this.level = level;
        if(health < 0){
            throw new WrongHealthException(this.name);
        }
        this.health = health;
        this.posture = position;
        this.location = locations;
    }

    public AbstractLoc.Locations getLocation() {
        return location;
    }
    public void moveTo(AbstractLoc.Locations otherLoc){
        this.location = otherLoc;
        System.out.println(this.name + " перемещается в " + this.location.getName());
    }

    public int getLevel(){
        return this.level;
    }

    @Override
    public void getProperty(String word) {
        this.property = word;
    }
    @Override
    public void getAdding(String add){
        this.add = add;
    }
    public void setSpeed(int speed){
        if (speed > 15){
            this.name = "Влетел " + this.name;
        }
        else if(speed > 10){
            this.name = "Ворвался " + this.name;
        } else {
            this.name = "Вошёл " + this.name;
        }
    }
    public void doSomethingPerson(Action act){
        switch ((act)){
            case See ->  System.out.print(this.name + " видел" + ending);
            case Stand -> System.out.print(this.name + " встал" + ending + this.property );
            case Pour -> System.out.print(this.name + " окатил" + Gender.Plural.getName() + this.property);
            case Felt -> System.out.print(this.name + " почувствовал" + ending);
            case Understand -> System.out.print(this.name + " понял" + ending);
            case Run -> System.out.print(this.name);
            case Rub -> System.out.print(" и растирал" + ending );
            case Sit -> System.out.print(this.name + " сел" + ending + this.property);
            case Clean -> System.out.print(this.property + " чистил" + ending + this.add);
        }
    }
    public void doSomethingPerson(Charachters o1,Action act, Charachters o){
        System.out.print(o1 + " и ");
        doSomethingPerson(act);
        System.out.print(o);
    }
    public void doSomethingtoPerson(Action act, Things o){
        if(act == Action.Dizzy){
            System.out.print("У " + this.name + " закружилась " + o.getName());
        }
    }
    public void doSomethingtoPerson(Action act, Charachters o){
        switch (act){
            case Hang -> System.out.print(this.name + " повесил" + ending + this.property  + " на " + o.getName());
            case Put -> System.out.print(this.name + " поставил" + ending + o.getName() + this.property);
        }
    }
    public void getPersonCondition(Action act, Subjects o) {
        switch (act){
            case Remember ->  System.out.print(this.name + " помнит " + this.add + o.getName() +", ");
            case NotRemeber -> System.out.print(this.name + " не помнит " + this.add + o.getName()+ ", ");
        }
    }
    public void doSomethingto(Action act,Subjects o){
        if(act == Action.Throw){
            System.out.print(this.name + " бросили на " + o.property + o.getName());
        }
        if(act == Action.Rub){
            System.out.print(this.name + " растирал" + Gender.Plural.getName() + o.property + o.getName());
        }
    }
    public void getStrength(Subjects o){
        if(this.getLevel() > 3) {
            System.out.print(o.getName() + " не обременило " + this.name);
        }
        else{
                System.out.print(o.getName() + " обременило " + this.name);
            }
        }
    public void getPosition(Subjects o){
        System.out.print("Cтоя у " + this.add +" "+ o.getName() + "а ");
    }
    public void receiveReward(Reward reward) {
        System.out.println(this.name + " получил" + ending + reward.getName());
        if (reward.getValue() > 0) {
            this.level += reward.getValue();
            System.out.println("Уровень повысился на " + reward.getValue());
        }
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void useHeal(Item item) {
        if (item.getRegen() > 0) {
            this.health += item.getRegen();
            System.out.println(this.name + " восстановил" + ending + "здоровье на " + item.getRegen() + " единиц");
        } else {
            System.out.println("Этот предмет не восстанавливает здоровье");
        }
    }
    public void changePosture(Posture.Pose newPosture) {
        this.posture = newPosture;
        System.out.println("Поменял" +ending+ "положение: " + this.posture.getName());
    }
    @Override
    public String toString() {
        return name;
    }
    public void think(Thoughts thoughts){
        System.out.println(this.getName() + " думает: " + thoughts.getThoughts());
        this.setHealth(this.health - 1);
    }

}