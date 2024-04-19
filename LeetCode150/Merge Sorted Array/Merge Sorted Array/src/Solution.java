import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // m oznacza ilosc elementów w nums1, n oznacza ilosc elementów w nums2
        if(n!=0){
            int j=0;
            for(int i=m;i<n+m;i++){
                nums1[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}
