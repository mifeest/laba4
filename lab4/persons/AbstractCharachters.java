package lab3.persons;

import lab3.enums.Gender;
import lab3.interfaces.Adding;
import lab3.interfaces.Properties;
import lab3.locations.AbstractLoc;

import java.util.Objects;

abstract public class AbstractCharachters implements Adding, Properties {
    private final String name;
    private String property;
    private String add;
    final private Gender gender;
    protected final String ending;
    public AbstractCharachters(String name, Gender gender){
        this.name = name;
        this.gender = gender;
        this.ending = gender.getName();
    }
    public String getName() {
        return name;
    }
    @Override
    public void getProperty(String word) {
        this.property = word;
    }

    @Override
    public void getAdding(String add){
        this.add = add;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass()) return false;
        AbstractCharachters that = (AbstractCharachters) other;
        return Objects.equals(name, that.name)  && gender == that.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    @Override
    public String toString() {
        return "AbstractCharachters{" +
                "name='" + name + '\'' +
                ", property='" + property + '\'' +
                ", add='" + add + '\'' +
                ", gender=" + gender +
                ", ending='" + ending + '\'' +
                '}';
    }
}
