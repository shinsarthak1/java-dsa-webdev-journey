public class Traversal {
    public static void traversalEnhanced(int[] marks){
        for(int mark:marks){
            System.out.print(mark+" ");
        }
    }
    public static void main(String[] args) {
        // visiting every element of the array one by one
        int[] marks = {85,92,90,84,99};
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        traversalEnhanced(marks);

    }
}
