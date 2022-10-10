import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        int numberPeople;
        int percentTip;

        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How much people are in your group?: ");
        numberPeople = scan.nextInt();
        System.out.print("What is the tip percentage? (Choose from 0-100): ");
        percentTip = scan.nextInt();
        double priceTotal = 0;
        double prices = 0;
        System.out.println("Enter a cost in dollars and cents (Insert -1 to end adding prices): ");
        priceTotal = scan.nextDouble();
        while (prices != -1) {
            System.out.print("Enter a cost in dollars and cents (Insert -1 to end adding prices): ");
            prices = scan.nextDouble();
            priceTotal += prices;
        }
            priceTotal += 1;
            TipCalculator calc = new TipCalculator(numberPeople, percentTip, priceTotal);

        String priceDeciTotal = formatter.format(calc.totalBillBeforeTip());
        String totalDeciTip = formatter.format(calc.tipAmount());
        String totalRound = formatter.format(calc.totalBill());
        String costBeforePerRound = formatter.format(calc.perPersonCostBeforeTip());
        String tipRound = formatter.format(calc.perPersonTipAmount());
        String totalRound2 = formatter.format(calc.perPersonTotalCost());


        System.out.println("----------------------------------------");
        System.out.println("Total Bill Before Tip: $" + priceDeciTotal);
        System.out.println("Tip Percentage: " + calc.getTipPercentage() + "%");
        System.out.println("Total tip: $" + totalDeciTip);
        System.out.println("Total bill with tip: $" + totalRound);
        System.out.println("Per person cost before tip: $" +  costBeforePerRound);
        System.out.println("Tip per person: $" + tipRound);
        System.out.println("Total cost per person: $" + totalRound2);
        }

}
