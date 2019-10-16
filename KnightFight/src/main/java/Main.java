
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int step=10;
        int firstplayer;
        double acc;
        double knight1 [] = new double [step];
        double knight2 [] = new double [step];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите изначальную точность первого рыцаря от 0.1 до 0.3:");
        acc = scanner.nextDouble();
        while (acc<0.1 || acc>0.3) {
            System.out.println("Вы ввели неверно, попробуйте еще:");
            acc = scanner.nextDouble();
        }
                for (int i = 0; i<knight1.length; i++) {
            knight1[i] = acc + ((1-acc)/step)*(i+1);
        }
        System.out.println("Укажите изначальную точность второго рыцаря от 0.1 до 0.3:");
        acc = scanner.nextDouble();
        while (acc<0.1 || acc>0.3) {
            System.out.println("Вы ввели неверно, попробуйте еще:");
            acc = scanner.nextDouble();
        }
        for (int i = 0; i<knight2.length; i++) {
            knight2[i] = acc + ((1-acc)/step)*(i+1);
        }
        System.out.println("Укажите какой игрок ходит первым 1 или 2");
        firstplayer = scanner.nextInt();

        switch (firstplayer) {
            case (1):
                if (knight1[8] < knight2[8]) {
                    System.out.println("Нет наиболее оптимального решения, " +
                            "так как соперник имеет больше шансов на победу");
                } else {
                    for (int i = 0; i < knight1.length; i++) {
                        if (knight1[i] > 0.5 && knight1[i] > knight2[i]) {
                            System.out.println("Ваш оптимальный шаг для выстрела: " + (i + 1));
                            break;
                        }
                    }
                }break;
            case (2):
                if (knight1[7] < knight2[8]) {
                    System.out.println("Нет наиболее оптимального решения, " +
                            "так как соперник имеет больше шансов на победу");
                } else {
                    for (int i = 0; i < knight2.length - 1; i++) {
                        if (knight1[i] > 0.5 && knight1[i] > knight2[i + 1]) {
                            System.out.println("Ваш оптимальный шаг для выстрела: " + (i + 1));
                            break;
                        }
                    }
                }break;
            default:
                System.out.println("Значение введено неверно");
                break;
        }
    }
}
