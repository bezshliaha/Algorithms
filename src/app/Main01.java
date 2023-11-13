package app;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int days = 7;
        double[] prices = new double[days];

        for (int i = 0; i < days; i++) {
            System.out.print("\nEnter price for day " + (i + 1) + ": ");
            String input = sc.next();
            prices[i] = Double.parseDouble(input.replace(",", "."));
        }

        for (int i = 0; i < days; i++) {
            for (int j = 0; j < (days - i - 1); j++) {
                if (prices[j] > prices[j + 1]) {
                    double temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
        }

        System.out.println("\nPrices in ascending order:");
        for (double price : prices) {
            System.out.println(price);
        }

        double total = 0;
        for (double price : prices) {
            total += price;
        }
        double average = total / days;
        System.out.printf("\nAverage price for the entire period: %.2f\n", average);

        sc.close();
    }
}