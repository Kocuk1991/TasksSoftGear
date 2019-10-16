import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        Parser parser = new Parser(temp);
        String letter = parser.letterPrs(temp);
        double num = parser.numTemp(temp);
        Convertor convertor = new Convertor (num);

        switch (letter) {
            case "C":
                System.out.println(convertor.celciumToFahrenheit(num) + "F");
                System.out.println(convertor.celciumToKalvin(num) + "K");
                break;
            case "F":
                System.out.println(convertor.fahrenheitToCelcium(num) + "C");
                System.out.println(convertor.fahrenheitToKalvin(num) + "K");
                break;
            case "K":
                System.out.println(convertor.kalvinToCelcium(num) + "C");
                System.out.println(convertor.kalvinToFahrenheit(num) + "F");
                break;
            default:
                System.out.println("Не вверно введено значение");
                break;
        }
    }
}
