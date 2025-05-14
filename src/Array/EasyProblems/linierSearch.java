package Array.EasyProblems;

public class linierSearch {
    public static void search() {
        int [] arr = {1,3,4,5};
        int target = 5;
        for(int j =0;j<arr.length;j++){
            if(arr[j]==target){
                System.out.println(j);;
                break;
            }
        }
    }
}
