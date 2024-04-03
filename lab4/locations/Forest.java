package lab3.locations;

import lab3.enums.Thoughts;
import lab3.persons.Charachters;

public class Forest extends AbstractLoc {
    public Forest(String name) {
        super(name);
    }
    public void enter(Charachters charachters){
        super.enter(charachters);
        if (charachters.getName().equals("Маргарита")){
            System.out.println(Thoughts.MargForest.getThoughts());
        }
    }
}
