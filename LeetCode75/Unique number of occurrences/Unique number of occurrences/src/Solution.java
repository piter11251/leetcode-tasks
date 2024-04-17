import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // utworzyc mape i dodac do niej elementy, jesli mapa zawiera juz dany element to zaktualizuj jego ilosc, a jesli nie to dodaj ten element z iloscia 1
        // utworzyc set i dodac elementy, jesli w secie jest juz dany element to zwrocic false, a jesli nie to dodac
        // go do seta
        Map<Integer, Integer> mapOfOccurrances = new HashMap<>();
        for(int n : arr){
            if(mapOfOccurrances.containsKey(n)){
                mapOfOccurrances.put(n, mapOfOccurrances.get(n)+1);
            }
            else{
                mapOfOccurrances.put(n, 1);
            }
        }
        Set<Integer> newSet = new HashSet<>();
        for(int n: mapOfOccurrances.values()){
            if(newSet.contains(n)){
                return false;
            }
            else{
                newSet.add(n);
            }
        }
        return true;
    }
}