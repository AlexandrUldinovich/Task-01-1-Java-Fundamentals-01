package NinthTask;

public class NinthTask {
    public static void main(String[] args) {
     int[] nums1 = {1,3,5,7,9};
     int[] nums2 = {2,4,6,8,10};
     int[] result = new int[(nums1.length+nums2.length)];
        int count = 0;
        for(int i = 0; i<nums1.length; i++) {
            result[i] = nums1[i];
            count++;
        }
        for(int y = 0;y<nums2.length;y++) {
            result[count++] = nums2[y];
        }
        for(int i = 0;i<result.length;i++)
            System.out.print(result[i]+" ");
    }
    }
