package lab3.locations;

import lab3.persons.Charachters;

import java.util.Objects;

public class AbstractLoc {
    public enum Locations{
        Hall("зал"),
        Forest("лес");
        private final String name;
        Locations(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    private final String name;
    public AbstractLoc(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractLoc that)) return false;
        return Objects.equals(name, that.name);
    }
    public boolean getUslovie(Charachters charachters) {
        boolean uslovie = true;
        return uslovie;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "AbstractLoc{" +
                "name='" + name + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }
    public void enter(Charachters charachters){
        if(this.getUslovie(charachters)){
            System.out.println(charachters.getName() + " входит в " + this.name);
        }
    }
}
