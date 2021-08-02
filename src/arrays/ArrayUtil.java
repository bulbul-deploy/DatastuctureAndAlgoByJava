package arrays;

public class ArrayUtil {

    public void printArray(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int findMinimum(int [] arr){
        if (arr==null || arr.length==0)
            throw new IllegalArgumentException("Invalid Input");
        int n=arr.length;
        int min=arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }

    public void arrayDemo(){
        int[] myArray = new int[5]; //default values
        printArray(myArray);

    }

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
        arrayUtil.printArray(new int[] {2,4,5,7,8,9});
        System.out.println("Min is "+arrayUtil.findMinimum(new int[] {2,4,5,7,8,9}));
    }
}
