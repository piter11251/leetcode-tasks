import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {

        //zapisujemy do mapy jako klucz liczbe z tablicy, a jako wartosc ile razy powtarza sie w tablicy

        Map<Integer, Integer> newMap = generateMap(nums);
        int n = nums.length/2, element=0;
        int max = Integer.MIN_VALUE;
        for(int value: newMap.values()){
            if(value>max){
                max = value;
            }
        }
        for(Map.Entry<Integer, Integer> entry: newMap.entrySet()){
            if(entry.getValue() >= n && entry.getValue()==max){
                element = entry.getKey();
            }
        }
        return element;
    }
    private Map<Integer, Integer> generateMap(int[] nums){
        Map<Integer, Integer> newMap = new HashMap<>();
        for(int num:nums){
            if(newMap.containsKey(num)){
                newMap.put(num, newMap.get(num)+1);
            }
            else{
                newMap.put(num, 1);
            }
        }
        return newMap;
    }
}
