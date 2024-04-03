package lab3.nature;

import lab3.enums.Action;
import lab3.enums.Adverbs;

import lab3.interfaces.Adding;
import lab3.interfaces.Properties;
import lab3.persons.Charachters;

public class Subjects extends Envinronment implements Properties, Adding {
    protected String name;
    public String property;
    protected String add;
    public Subjects(String name){
        super(name);
    }
    public void getBrigtness(int brightness) {
        if (brightness > 76) {
            this.name = Adverbs.YANSO.getAdverb() + " " + super.name;
        } else if (brightness > 51) {
            this.name = Adverbs.SMUTNO.getAdverb() + " " + super.name;
        } else if (brightness > 26) {
            this.name = Adverbs.PLOHO.getAdverb() + " " + super.name;
        } else {
            this.name = Adverbs.UZASNO.getAdverb() + " " + super.name;
        }
    }
    public void getDescription(){
        System.out.print(name);
    }
    @Override
    public void getProperty(String property){
        this.property = property;
    }
    public void doThing(Action act){
        if(act == Action.Buttoned && add != null) {
            System.out.print(super.name + " застегнулись " + this.add);
        }
    }
    public void doThing(Action act,Things o) {
        if(act == Action.Buttoned){
            System.out.print(super.name + " застегнулись " + this.add);
        }
        if(act == Action.Chafe){
            System.out.print(super.name  + " стала натирать " + o.name +" " + property);
        }
    }

    public void doThing(Action act, Charachters o) {
        if(act == Action.Pull){
            System.out.print(super.name + " тянуло " + o.getName());
        }
    }


    public void getVision(int vision) {
        if(vision > 50) {
            System.out.println(property + " блестел " + super.name);
        } else {
            System.out.println(property +" висел " + super.name);
        }
    }
    public void getWeight(int weight){
        if(weight > 3) {
            super.name = "тяжелая " + super.name;
        } else {
            super.name = "легкая " + super.name;
        }
    }
    @Override
    public void getAdding(String add){
        this.add = add;
    }
}
