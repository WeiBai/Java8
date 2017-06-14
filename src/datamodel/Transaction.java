package datamodel;

/**
 * Created by baiwe on 2017/6/14.
 */
public class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString(){
        return "{ " + this.trader + ", " +
                "year: " + this.year + ", " +
                " value: " + this.value + "}";
    }
}
