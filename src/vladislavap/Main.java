package vladislavap;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        TaskOne(2);
        System.out.println("Task 2");

        TaskTwo();
    }

    private static ArrayList<BigInteger> numBox = new ArrayList<>(100);

    private static void fillBox(final int pow) {
        for (int i = 1; i < 101; i++) {
            numBox.add(new BigInteger(i+"").pow(pow));
        }
    }

    private static void TaskOne(final int pow) {
        BigInteger a, b, c;
        fillBox(pow);
        System.out.printf("Ищем числа для уравнения Ферма степени %d%n", pow);
        for (int i = 0; i < numBox.size(); i++) {
            a = numBox.get(i);
            for (int j = i; j < numBox.size(); j++) {
                b = numBox.get(j);
                c = a.add(b);
                if (numBox.contains(c))
                    System.out.printf("%d + %d = %d%n", a, b, c);
            }
        }
        numBox.clear();
    }


    public static void TaskTwo() {
        double a = 1;
        double s = 0, m = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("int your number: ");
        int num = scan.nextInt();

        for(int i = 1;i <= num;i++){
            m = i;
            if((m % 2) == 0){
                a += 1/m;
            }else {
                a -= 1/m;
            }
        }
        System.out.println("result is " + a);

    }
}
