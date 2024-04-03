package lab3.nature;

import lab3.enums.Condition;
import lab3.enums.Fluids;
import lab3.interfaces.Adding;
import lab3.interfaces.Properties;

public class Things extends Envinronment implements Properties, Adding {
    protected String property;
    protected String add;
    final private Condition condition;
    public Things(String name, Condition condition) {
        super(name);
        this.condition = condition;
    }
    public void taste(Condition taste){
        if(taste == Condition.Bitter){
            System.out.print(Condition.Bitter.getName() + " вкус на губах");
        }
    }


    public void condition(Fluids fluids){
        System.out.print(" " + property + " " + fluids.getFluid());
    }
    @Override
    public void getProperty(String property) {
        this.property = property;
    }
    @Override
    public void getAdding(String add){
        this.add = add;
    }
}
