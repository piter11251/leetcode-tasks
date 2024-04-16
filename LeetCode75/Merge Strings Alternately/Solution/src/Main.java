public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abc","pqr"));
        System.out.println(solution.mergeAlternately("ab", "pqrs"));
        System.out.println(solution.mergeAlternately("abcd", "pq"));
    }
}