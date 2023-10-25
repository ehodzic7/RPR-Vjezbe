package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<Double>(); // Ovdje eksplicitno navodimo tip u ArrayList<>.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite brojeve (ili 'stop' za kraj unosa):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Neispravan unos. Molimo unesite broj ili 'stop' za kraj unosa.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("Nema unesenih brojeva.");
        } else {
            double min = findMin(numbers);
            double max = findMax(numbers);
            double mean = calculateMean(numbers);
            double stdDev = calculateStandardDeviation(numbers);

            System.out.println("Minimum: " + min);
            System.out.println("Maksimum: " + max);
            System.out.println("Srednja vrijednost (mean): " + mean);
            System.out.println("Standardna devijacija: " + stdDev);
        }

        scanner.close();
    }

    private static double findMin(List<Double> numbers) {
        double min = Double.POSITIVE_INFINITY;
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    private static double findMax(List<Double> numbers) {
        double max = Double.NEGATIVE_INFINITY;
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    private static double calculateMean(List<Double> numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    private static double calculateStandardDeviation(List<Double> numbers) {
        double mean = calculateMean(numbers);
        double sumOfSquaredDifferences = 0;
        for (double number : numbers) {
            double difference = number - mean;
            sumOfSquaredDifferences += difference * difference;
        }
        double variance = sumOfSquaredDifferences / numbers.size();
        return Math.sqrt(variance);
    }
}
