import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> newList = new ArrayList<>();
        StringBuilder newStringBuiler = new StringBuilder();
        if(nums.length == 0 || nums.length == 1){
            return newList;
        }
        newStringBuiler.append(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]+1){
                if(nums[i-1] != Integer.parseInt(newStringBuiler.toString())){
                    newStringBuiler.append("->").append(nums[i-1]);
                }
                newList.add(newStringBuiler.toString());
                newStringBuiler.setLength(0);
                newStringBuiler.append(nums[i]);
            }
        }

        if(Integer.parseInt(newStringBuiler.toString()) != nums[nums.length - 1]) {
            newStringBuiler.append("->").append(nums[nums.length - 1]);
        }
        newList.add(newStringBuiler.toString());

        return newList;
    }
}
