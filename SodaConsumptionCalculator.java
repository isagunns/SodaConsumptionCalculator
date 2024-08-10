import java.util.Scanner;

public class SodaConsumptionCalculator {
    public static void main(String[] args) {
        double percentageOfSweetenerInASoda = 0.001;
        double amountOfSweetener, weightOfMice, weigthOfDieter;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of artificial sweetener required to kill one mouse(in g):");
        amountOfSweetener = scanner.nextDouble();// the amount of sweetener to kill a mouse
        amountOfSweetener = amountOfSweetener / 1000;// kilogram to gram conversion

        System.out.println("Enter the weight of mouse(in kg):");
        weightOfMice = scanner.nextDouble();

        System.out.println("Enter the weight of dieter(in kg):");
        weigthOfDieter = scanner.nextDouble();

        double howManySoda = ((weigthOfDieter / weightOfMice) * (amountOfSweetener)) / percentageOfSweetenerInASoda;// the
                                                                                                                    // amount
                                                                                                                    // of
                                                                                                                    // sweetener
                                                                                                                    // to
                                                                                                                    // kill
                                                                                                                    // a
                                                                                                                    // person
        int rounded = (int) Math.floor(howManySoda);

        System.out.println("At most you can consume soda " + rounded + " times.");
        scanner.close();

    }
}
