package lab3.enums;

public enum WeatherCondition {
    NIGHT("ночь"),
    MORNING("утро"),
    DAY("день"),
    EVENING("вечер"),
    CLOUDLY("облачно"),
    CLEAR("ни облачка"),
    THUNDERSHTORM("гроза"),
    RAIN("дождь");
    private String name;
    WeatherCondition(String name){
        this.name = name;
    }
    public String getTime(){
        return name;
    }
}
