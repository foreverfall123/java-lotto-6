package lotto;

public class Calc {

    public static final int LottoAmount = 1000;

    private int buyAmount = 0;
    private long benefit = 0;

    public Calc(int buyAmount){
        this.buyAmount = buyAmount;
    }

    public int getLottoCount(){
        return buyAmount / LottoAmount;
    }

    public void setBenefit(int benefit){
        this.benefit = benefit;
    }

    public double getRateOfReturn(){
        return (((benefit - buyAmount) / buyAmount * 100.0) * 10.0) / 10.0;
    }
}
