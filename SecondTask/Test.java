package SecondTask;

public class Test {
    public static void main(String[] args) {
        int a,b,c,d;
        a=b=c=d=1;
        double result;
        double denominator = 2*a;
        double mysqrt = Math.sqrt(b*b +4*a*c);
        if(denominator==0 || mysqrt ==0){
            System.out.println("denominator must be positive");      //тут в принципе и с && можно было
        }

        double upper = b + mysqrt;

        double firstNum = upper/ denominator;

        double secondNum = Math.pow(a,3)*c+Math.pow(b,-2);
        result = firstNum - secondNum;

        System.out.println(result);
    }
}
