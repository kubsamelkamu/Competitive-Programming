import java.util.HashMap;

public class FirstRepeatingElement {
    public static int findFirstRepeatingElement(int[] arr) {
        
        HashMap<Integer, Integer> elementIndexMap = new HashMap<>();
        int minIndex = Integer.MAX_VALUE; 
        
        for (int i = 0; i < arr.length; i++) {
            if (elementIndexMap.containsKey(arr[i])) {
                minIndex = Math.min(minIndex, elementIndexMap.get(arr[i]));
            } else {
                elementIndexMap.put(arr[i], i + 1);
            }
        }

        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(findFirstRepeatingElement(arr1)); 
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(findFirstRepeatingElement(arr2));
    }
}
