// Longest Increasing Subsequence 
public class Longest {
    public static int longestInc(int[] arr){

        int n = arr.length;
        int[] l = new int[n];

        for(int i = 0 ; i<n; i++){
            l[i] = 1;
        }

        for (int i = 1; i<n; i++){
            for (int j = 0 ; j<i; j++){
                if (arr[i] > arr[j] && l[i] < l[j] + 1){
                    l[i] = l[j] + 1;
                }
            }
        }

        int max1 = 0 ;
        for (int i = 0 ; i<n; i++){
            if (l[i] > max1){
                max1 = l[i];
            }
        }

        return max1;

    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 35, 80};
        System.out.println("the Length of Longest =" + longestInc(arr));
    }
}