package arrays;

public class BubbleSort {

    private static <T extends Comparable<T>> void sortArray(T ar[]){
        for (int i=0;i<ar.length-1;i++){
            for (int j=0;j< ar.length-i-1;j++){
                if(ar[j].compareTo(ar[j+1])>0){
                    T temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer array[] ={5,7,8,9,2};
        sortArray(array);
        System.out.println("After Sorting");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+"");
        }

        Double dArray[] ={1.5,7.3,0.9,1.2};
        sortArray(dArray);
        System.out.println("After Sorting");
        for (int i=0;i<dArray.length;i++){
            System.out.println(dArray[i]+"");
        }
    }
}
