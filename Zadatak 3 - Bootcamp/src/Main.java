import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;

        while (true) {
            System.out.print("Unesite cijeli broj: ");
            while (!input.hasNextInt()) {
                System.out.println("Niste unijeli cijeli broj! Pokušajte ponovo.");
                input.next();
            }
            num = input.nextInt();

            if (num < 0) {
                System.out.println("Unesen je negativan broj. Kraj programa.");
                break;
            } else if (num == 0) {
                continue;
            } else if (num % 2 != 0 && num > 0) {
                System.out.println("Unesen je pozitivan neparan broj. Kraj programa.");
                break;
            } else {
                switch (num % 7) {
                    case 0:
                        System.out.println("Nedjelja");
                        break;
                    case 1:
                        System.out.println("Ponedjeljak");
                        break;
                    case 2:
                        System.out.println("Utorak");
                        break;
                    case 3:
                        System.out.println("Srijeda");
                        break;
                    case 4:
                        System.out.println("Četvrtak");
                        break;
                    case 5:
                        System.out.println("Petak");
                        break;
                    case 6:
                        System.out.println("Subota");
                        break;
                }
                if (num % 2 == 0) {
                    sum += num;
                }
            }
        }

        System.out.println("Zbroj svih unesenih parnih brojeva iznosi: " + sum);
    }
}