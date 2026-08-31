public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {21,13,-8,0,90};
        System.out.println(min(arr));
    }
    public static int min(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
