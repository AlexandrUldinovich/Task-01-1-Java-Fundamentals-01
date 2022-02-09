package EighthTask;

public class EighthTask {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int sum = 0;
        for(int x:nums){
            if(x%k==0){
               sum = sum+x;
            }
        }
        System.out.println(sum);
    }
}
