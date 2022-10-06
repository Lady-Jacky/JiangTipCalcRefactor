public class TipCalculator {
    private int numPeople;
    private int percentage;
    private double totalBillBeforeTip = 0.0;

    public TipCalculator(int numPeople, int percentage){
        this.numPeople = numPeople;
        this.percentage = percentage;
    }

    public int getTipPercentage() {
        return percentage;
    }

    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }


}
