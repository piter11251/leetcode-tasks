import java.util.*;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        Set<Integer> newSet = new TreeSet<>();
        for(int n: nums){
            if(newSet.add(n)){
                nums[i++] = n;
            }
        }
        for(int j=newSet.size();j<nums.length;j++){
            nums[j] = 0;
        }
        return newSet.size();
    }
}
