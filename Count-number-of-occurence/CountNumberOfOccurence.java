public class CountNumberOfOccurence {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int target = 3;
        int res  =  countOccurence(arr, target);
        System.out.println(res);

    }

    public static int countOccurence(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}