

public class SearchInNumber {
    public static void main(String[] args) {
        int[] arr = {12,34,21,-9,0,-7,88};
        int target = 0;
        System.out.println(linearSearch(arr,target,1,5));
    }
    public static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }

        // running a for loop
        for(int index=start; index<=end; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
         // this line will execute if target not found
        return -1;
    }
    
}
