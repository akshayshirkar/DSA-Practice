package Array.EasyProblems;

public class kTimesreverse {
    public static void reverseArrayKTime(int [] arr, int n, int k) {
        int i = n;
        int j = k;
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length-1;
        int k = 3;

        // this is to handle the big number which are multile of the k
        int newk = k % n;

        // Reverse the entire array
        reverseArrayKTime(arr,0,n);
        for(int l = 0; l<n; l++) {
            System.out.print(" "+ arr[l]);
        }

        System.out.println();
        // reverse k elements
        reverseArrayKTime(arr,0,k-1);
        for(int l = 0; l<n; l++) {
            System.out.print(" "+arr[l]);
        }

        // reverse last k - n elements
        reverseArrayKTime(arr,k,n);
        System.out.println();
        for(int l = 0; l<n; l++) {
            System.out.print(" "+arr[l]);
        }
    }

}
