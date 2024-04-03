package lab3.locations;

import lab3.enums.Thoughts;
import lab3.persons.Charachters;

public class Hall extends AbstractLoc {

    private String name;
 public Hall(String name){
     super(name);
    }
    public void enter(Charachters charachters){

     Hall.Doors.open();
     super.enter(charachters);
     Hall.Doors.close();
     if (charachters.getName().equals("Маргарита")){
         System.out.println(Thoughts.MargHall.getThoughts());
     }
    }
    public static class Doors extends AbstractLoc{
     public static boolean opened = false;
     public Doors(String n){
         super(n);
     }
        public static void open() {
            opened = true;
            System.out.println("Двери открываются");
        }

        public static void close() {
            opened = false;
            System.out.println("Двери закрываются");
        }

        static public boolean getOpened() {
            return opened;
        }

    }
    public String getName() {
        return name;
    }
}
