package Linear Search;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23,20,10,28,-8,16,-4,56};
        int target = 28;
        boolean ans = linearSearch3(nums,target);
        System.out.println(ans);
    }


    public static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        // running a for loop
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        // this line will execute if target not found
        return -1;
    }

    // searching the target and returning the element
    public static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        // running a for loop
        for(int element : arr){
            if(element==target){
                return element;
            }
        }
        // this line will execute if target not found
        return Integer.MAX_VALUE;
    }
    public static boolean linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }

        // run a for loop
        for(int element:arr){
            if(element==target){
                return true;
            }
        }
        // this line will execute if target not found
        return false;
    }
    
}
