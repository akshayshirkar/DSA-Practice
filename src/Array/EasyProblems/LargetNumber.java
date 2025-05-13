package Array.EasyProblems;

public class LargetNumber {
    public static void findLargestNumber(){
        int [] arr = {2,5,1,3,0};
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        int i = 0;
        int j = arr.length-1;
        int max = arr[i];
        while(i<=j){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[j]>max){
                max = arr[j];
            }
            i++;
            j--;
        }
        System.out.println("\nLargest Number is "+max);
    }
}
