package Array.EasyProblems;

public class checkIfTheArrayIsSorted {
    public static void isSorted(){
        int [] arr = {1,2,3,10,4,5,6,7};
        boolean isSorted = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
               isSorted = true;
            }else{
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
