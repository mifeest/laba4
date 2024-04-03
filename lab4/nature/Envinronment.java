package lab3.nature;
import java.util.Objects;

import lab3.interfaces.Properties;

import lab3.interfaces.Adding;

public abstract class Envinronment implements Adding, Properties {
    protected String name;
    protected int brightness;
    public Envinronment(String name){
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return this.getClass().getName() + '{' + "name= " + this.getName() + ", adjective=" + this.brightness + '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, brightness);
    }
}
