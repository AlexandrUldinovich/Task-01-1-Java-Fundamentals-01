package SixthTask;

public class Test {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = 9;
        int max = 0;
        int min = 0;
        int sum = 0;
        if(a>b){
            max = a;
        }else {
            min = a;
        }
        if(b>a){
            max = b;
        }else {
            min = b;
        }
        if(c>b){
            max = c;
        }else{
            min = c;
        }
        sum = max + min;
        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);
        System.out.println("Sum of nums equals "+sum);
    }
}
