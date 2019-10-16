import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String a = "slot_a";
        String b = "slot_b";
        String c = "slot_c";
        int num;
        System.out.println("Укажите количество плит от 1 до 8:");
        Scanner scanner = new Scanner (System.in);
        num = scanner.nextInt();
        if (num > 0 && num <=8) {
            System.out.println("Алгоритм перемещения следующий:");
            Crane crane = new Crane();
            crane.craneLoadingAlgorithm(a,b,c,num);
        } else if (num <=0) {
            System.out.println("Недопустимое количество заданных плит");
        } else {
            System.out.println("Превышено значение плит");
        }
    }
}
