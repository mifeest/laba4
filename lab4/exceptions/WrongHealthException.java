package lab3.exceptions;

public class WrongHealthException extends Exception {
    public WrongHealthException(String n) {
        super("ну и зачем передавать отрицательное здоровье в " + n + " ?!");
    }
}

