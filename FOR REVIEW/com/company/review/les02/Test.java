package com.company.review.les02;

import java.util.Scanner;

public class Test {

     public static class dataInput{
         public int getFirstLeg(){
             System.out.println("Введите первый катет ");
             Scanner sc1 = new Scanner(System.in);
             int num = sc1.nextInt();
             return num;

         }

         public int getSecondLeg(){
             System.out.println("Введите второй катет ");
             Scanner sc1 = new Scanner(System.in);
             int num = sc1.nextInt();
             return num;

         }

    }

     public static class taskLogic{

         public int perimetr(int a,int b){
             int c;
             int perimetr;
             c = (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
                                            perimetr = a + b + c;
                           System.out.println("Периметр равен "+perimetr);
             return perimetr;

         }
         public int area(int a,int b){
                                 int area;
                           area = a * b;
             System.out.println("Площадь прямоугольного треугольника равна "+area);
             return area;
         }

    }

     public static class taskView {

         //Выводит первый катет
         public void printLeg(int a) {
             System.out.println("Первый катет равен " + a);

         }

         public void printSecondLeg(int b) {
             System.out.println("Второй катет равен " + b);

         }

         public void printHypotenuse() {
             int c = (int) Math.sqrt(Math.pow(3,2)+Math.pow(4,2));
             System.out.println("Гипотенуза равна " + c);
         }

         public void showResult(){
             System.out.println("Периметр треугольника равен "+12 +",а Площадь равна "+12);
         }

     }

    public static void main(String[] args) {
//        int perimetr,area,a,b,c;
//        a = 3;
//        b = 4;
//        c = (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//        if(a==0||b==0){
//            System.out.println("no such triangle exists");
//            return;
//        }
//        perimetr = a+b+c;
//        area = a*b;
//        System.out.println("area is "+area +" perimetr is "+perimetr);
      dataInput input = new dataInput();
      taskLogic logic = new taskLogic();
      taskView view = new taskView();
      logic.perimetr(input.getFirstLeg(),input.getSecondLeg());
      logic.area(input.getFirstLeg(),input.getSecondLeg());
      view.printHypotenuse();
      view.showResult();
    }
}


