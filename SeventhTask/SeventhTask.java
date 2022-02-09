package SeventhTask;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        int x = 0;
        double a,b;
        double result;
        double first;
        double second;
        System.out.println("Введите координаты a");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        System.out.println("Введите координаты b");
        Scanner sc2 = new Scanner(System.in);
        b = sc2.nextInt();
        if(a<b){
            System.out.println("Длинна отрезка равна "+(b-a));
        }else {
            System.out.println("Длинна отрезка равна " + (b+a));
        }
        first = Math.pow(Math.sin(x),2);
        second = Math.sin(2*x);
        result = first - second;
        System.out.println("результат равен "+result);
    }
}
