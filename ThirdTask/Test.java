package ThirdTask;

public class Test {
    public static void main(String[] args) {
        int perimetr,area,a,b,c;    //пускай у нас выходит целый пифагор и обойдемся интами
        a = 3;
        b = 4;
        c = (int) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        if(a==0||b==0){
            System.out.println("no such triangle exists");
            return;
        }
        perimetr = a+b+c;
        area = a*b;
        System.out.println("area is "+area +" perimetr is "+perimetr);
    }
}
