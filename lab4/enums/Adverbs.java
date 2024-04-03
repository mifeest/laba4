package lab3.enums;

public enum Adverbs {
    SMUTNO("смутно"),
    YANSO("ясно"),
    PLOHO("плохо"),
    UZASNO("ужасно")
    ;

    protected final String adverb;
    Adverbs(String adverb) {
        this.adverb = adverb;
    }
    public String getAdverb(){
        return adverb;
    }
}
