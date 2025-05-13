package Array.EasyProblems;

public class findTheSecondLargestAndSmallest {
    public static void findLargestAndSmallest(){
        int [] arr = {1,2,3,4,5,6,7};
        //op = 2 and 6
        int max = arr[0];
        int secondMax = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println(secondMax);
        int min = arr[0];
        int n = arr.length;
        int secondMin = arr[n-1];
        // this code is to find the second smallest element
        for(int i =1;i<arr.length;i++){
            if( arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }else if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }
        System.out.println(secondMin);
    }
}
