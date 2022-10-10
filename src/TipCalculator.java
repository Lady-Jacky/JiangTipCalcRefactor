public class TipCalculator {
    private int numPeople;
    private int percentage;
    private double totalBillBeforeTip = 0.0;

    public TipCalculator(int numPeople, int percentage, double totalBillBeforeTip){
        this.numPeople = numPeople;
        this.percentage = percentage;
        this.totalBillBeforeTip = totalBillBeforeTip;
    }

    public int getTipPercentage() {

        return percentage;
    }

    public void addMeal(double cost){

        totalBillBeforeTip += cost;
    }

    public double totalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double tipAmount() {
        return totalBillBeforeTip * (percentage/100.0);
    }

    public double totalBill() {
        return totalBillBeforeTip() + tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip/numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount()/numPeople;
    }

    public double perPersonTotalCost() {
        return totalBill()/numPeople;
    }
}
