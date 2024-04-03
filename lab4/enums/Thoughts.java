package lab3.enums;

public enum Thoughts {
    MargHall("Этот зал, так же как и лес, был совершенно пуст"),
    MargForest("Зеленые листья деревьев, лианы и пестрые птицы создавали волшебную атмосферу," +
            " наполненную живыми красками и звуками");

    private final String thoughts;
    Thoughts(String thoughts ){
        this.thoughts = thoughts;
    }
    public String getThoughts(){
        return thoughts;
    }
}
