package lab3.persons;

public class Posture {
    public enum Pose {
        SIT("сел на место"),
        STAND("встал с места");
        private String name;
        Pose(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    private Pose posture;
    public void changePosture(Pose newPose) {
        this.posture = newPose;
        System.out.println("Поменял " + "местоположение: " + this.getPosture().getName());
    }
    public Pose getPosture() {
        return this.posture;
    }
}



