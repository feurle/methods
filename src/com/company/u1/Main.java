package com.company.u1;

public class Main {


    public static void main(String[] args) {

        double weightOfApples = 3.5;
        double pricePerAppleKilo = 1.5;

        double weightOfBananas = 4.5;
        double pricePerBananaKilo = 1.75;

        System.out.println("my apple price:" + calculateTotalPrice(weightOfApples,pricePerAppleKilo));
        System.out.println("my banana price:" + calculateTotalPrice(weightOfBananas,pricePerBananaKilo));


        System.out.println("my apple price: " + calculateTotalPrice("APPLE", weightOfApples));
        System.out.println("my banana price:" + calculateTotalPrice("BANANA", weightOfBananas));
    }


    public static double calculateTotalPrice(String fruit, double weight) {
        double pricePerKilo = 0.0;

        switch (fruit) {
            case "APPLE":
                pricePerKilo = 1.50;
                break;
            case "BANANA":
                pricePerKilo = 1.75;
                break;
            default:
                System.out.println("dont know the price");
                break;
        }

        return calculateTotalPrice(weight, pricePerKilo);
    }

    public static double calculateTotalPrice(double weight, double pricePerKilo) {
        double result = weight * pricePerKilo;
        return result;
    }
}
