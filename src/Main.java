public class Main {
    public static void main(String [] args) {
        double purchasePrice = 13;
        double salesTax;
        double total;
        salesTax = purchasePrice * 0.05;
        total = salesTax + purchasePrice;
        System.out.println("Your purchase of $" + purchasePrice + " has a sales tax of $" + salesTax + " totalling out to $" + total);
    }
}