import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> someList = new ArrayList<>();
        int maximum = maximum(candies);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maximum){
                someList.add(true);
            }
            else{
                someList.add(false);
            }
        }
        return someList;
    }
    public int maximum(int[] candies){
        int maxx = Integer.MIN_VALUE;
        for(int el: candies){
            if(el>maxx){
                maxx = el;
            }
        }
        return maxx;
    }
}
