package lab3;

import lab3.enums.*;
import lab3.exceptions.WrongHealthException;
import lab3.locations.AbstractLoc;
import lab3.locations.Forest;
import lab3.locations.Hall;
import lab3.nature.Animals;
import lab3.persons.*;
import lab3.nature.Subjects;
import lab3.nature.Things;
import lab3.nature.Weather;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws WrongHealthException {

        Weather weather = new Weather("Дождь", WeatherCondition.NIGHT);
        Charachters marg = new Charachters("Маргарита", Gender.Female, 10, 100, Posture.Pose.SIT, AbstractLoc.Locations.Hall);
        Charachters natasha = new Charachters("Наташа", Gender.Female, 10, 100, Posture.Pose.SIT, AbstractLoc.Locations.Hall);
        Charachters gella = new Charachters("Гелла", Gender.Female, 10, 100, Posture.Pose.SIT, AbstractLoc.Locations.Hall);
        Charachters cat = new Charachters("Бегемот", Gender.Male, 10, 100, Posture.Pose.SIT, AbstractLoc.Locations.Hall);
        Charachters supernatural = new Charachters("Какая-то сила", Gender.Female, 10, 100, Posture.Pose.SIT, AbstractLoc.Locations.Hall);
        Charachters korovev = new Charachters("Коровьев", Gender.Male, 10, 100, Posture.Pose.SIT, AbstractLoc.Locations.Hall);
        AbstractLoc hall = new Hall("зал");
        AbstractLoc forest = new Forest("лес");
        Subjects pool = new Subjects("бассейн");
        Subjects bed = new Subjects("ложе");
        Subjects leaf = new Subjects("листьями");
        Subjects shoes = new Subjects("туфли");
        Subjects crown = new Subjects("венец");
        Subjects chain = new Subjects("цепь");
        Subjects picture = new Subjects("изображение");

        Item heal_potion = new Item("Лечебное зелье", 1, 100);
        Things lips = new Things("губы", Condition.Normal);
        Things head = new Things("голова", Condition.Normal);
        Things neck = new Things("шея", Condition.Normal);

        Reward respect = new Reward("почтительность", 5);
        Dialog speaker1 = new Dialog(korovev);
        Posture posture = new Posture();


        weather.setTime(16);
        weather.setWeather();
        heal_potion.setOwner(marg);
        heal_potion.heal(marg);
        //1
        marg.doSomethingPerson(Action.See);
        pool.getBrigtness(75);
        pool.getDescription();
        System.out.println(".");

        //2
        marg.getProperty(Position.Bottom.getName());
        marg.changePosture(Posture.Pose.STAND);

        //3
        gella.getProperty("красной жидкостью ");
        gella.doSomethingPerson(natasha, Action.Pour, marg);
        System.out.println(".");

        //4
        marg.doSomethingPerson(Action.Felt);
        lips.taste(Condition.Bitter);
        System.out.print(" и ");
        marg.doSomethingPerson(Action.Understand);

        System.out.print(", что её моют ");
        System.out.print(Fluids.Blood.getFluid());
        System.out.println(".");

        //5
        marg.doSomethingtoPerson(Action.Dizzy, head);
        head.getProperty("от розового");
        head.condition(Fluids.Oil);
        System.out.println(".");

        //6
        bed.getProperty("хрустальное ");
        marg.doSomethingto(Action.Throw, bed);
        leaf.getProperty("большими зелеными ");
        marg.doSomethingto(Action.Rub, leaf);
        System.out.println(".");
        posture.changePosture(Posture.Pose.STAND);

        //7
        cat.setSpeed(13);
        cat.doSomethingPerson(Action.Run);
        cat.getAdding("ступни");
        cat.doSomethingPerson(Action.Rub);
        System.out.println(".");

        //8
        cat.getProperty(Position.Squat.getName());
        cat.doSomethingPerson(Action.Sit);
        cat.doSomethingPerson(Action.Rub);
        cat.getProperty("как будто");
        cat.getAdding("сапоги на улице");
        cat.doSomethingPerson(Action.Clean);
        System.out.println(".");

        //9
        marg.getAdding(", кто сшил ");
        shoes.getAdding(" из лепестков бледной розы, ");
        marg.getPersonCondition(Action.NotRemeber, shoes);
        shoes.getAdding("золотыми пряжками");
        shoes.doThing(Action.Buttoned);
        System.out.println(".");

        //10
        supernatural.getProperty(" к " + Position.Mirror.getName());
        supernatural.doSomethingtoPerson(Action.Put, marg);
        crown.getProperty(", у " + marg + " в волосах ");
        crown.getVision(19);

        //11
        chain.getWeight(4);
        korovev.getProperty(chain.getName());
        korovev.doSomethingtoPerson(Action.Hang, marg);
        System.out.println(".");
        //12
        marg.getStrength(chain);
        System.out.println(".");
        //13
        chain.getProperty("сейчас же");
        chain.doThing(Action.Chafe, neck);
        System.out.print(", ");
        picture.doThing(Action.Pull, marg);
        System.out.println(".");

        marg.useHeal(heal_potion);
        marg.getAdding("Кое-что ");
        marg.receiveReward(respect);


        speaker1.said("Ничего не поделаешь, надо, надо ");
        korovev.getAdding("дверей");
        korovev.getPosition(pool);

        speaker1.saidTo(marg, "Разрешите дать вам совет? ");
        speaker1.saidTo(marg, "Среди гостей будут различные люди");
        forest.enter(marg);
        marg.moveTo(AbstractLoc.Locations.Forest);
        hall.enter(marg);

        Animals parrot = new Animals("Попугай", 100) {
            public void jump() {
                if (getPower() > 50) {
                    System.out.println(this.getName() + " прыгает высоко");
                } else {
                    System.out.println(this.getName() + " еле прыгает");
                }
            }
        };
        parrot.jump();

        Class<?> clazz = Charachters.class;
        for(Field field : clazz.getDeclaredFields()){
            System.out.println(field.getName());
        }
        for(Field methods : clazz.getDeclaredFields()) {
            System.out.println(methods.getName());
        }
    }
}

