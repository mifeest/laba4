package lab3.nature;
import lab3.enums.WeatherCondition;
import lab3.interfaces.Adding;
import lab3.interfaces.Properties;

public class Weather extends Envinronment implements Adding, Properties {
    final private WeatherCondition weather;
    public Weather(String name,WeatherCondition weather) {
        super(name);
        this.name = name;
        this.weather = weather;
    }
    public void setTime(int time){
        if(21 < time || time < 3) {
            System.out.println("Близилась "+ WeatherCondition.NIGHT.getTime() + ".");
        }
        else if(time > 17) {
            System.out.println("Наступал " + WeatherCondition.EVENING.getTime() + ".");
        }
        else if(time > 11) {
            System.out.println("Близился " + WeatherCondition.DAY.getTime() + ".");
        }
        else if(time > 4) {
            System.out.println("Наступало " + WeatherCondition.MORNING.getTime() + ".");
        }
    }
    public void setWeather(){
        if(Math.random() < 0.25) {
            System.out.println("За окном " + WeatherCondition.CLEAR.getTime() + ".");
        }
        else if(Math.random() < 0.50) {
            System.out.println("За окном " + WeatherCondition.THUNDERSHTORM.getTime() + ".");
        }
        else if(Math.random() < 0.75) {
            System.out.println("За окном " + WeatherCondition.CLOUDLY.getTime() + ".");
        }
        else {
            System.out.println("За окном " + WeatherCondition.RAIN.getTime() + ".");
        }
    }


    @Override
    public void getAdding(String add) {

    }

    @Override
    public void getProperty(String word) {

    }
}
