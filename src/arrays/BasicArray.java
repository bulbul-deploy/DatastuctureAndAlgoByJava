package arrays;

import java.util.Scanner;

public class BasicArray {
    /*A Method Creating Array List*/
    /*SINGLE DIMENSIONAL ARRAY*/

    public static void createArray(int arr[]){

        /*Declaration*/
        int array[] = new int[5];

        /*Initialization*/
        array[0]=10;
        array[1]=13;
        array[2]=65;
        array[3]=34;
        array[4]=45;

        /*Print array with index*/
        System.out.println("Print Arrays with Index");
        System.out.println(array[1]);

        /*Print all array with iteration*/
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        /*Getting Input From User to store Data Into Array*/
        Scanner input = new Scanner(System.in);

        System.out.println("How many Elements you wanna add?");
        int n = input.nextInt();

        int arrayInput[]=new int[n];
        System.out.println("Enter "+n + "Elements: ");
        for (int i=0;i<n;i++){
            arrayInput[i]=input.nextInt();
        }

        System.out.println("Showing the array with loop");
        for (int i=0;i<n;i++){
            System.out.println("\t"+ arrayInput[i]);
        }
        input.close();

        /*receives array from parameter */
        System.out.println("Receiving array as a parameter");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();


     }

    public static void main(String[] args) {
        createArray(new int[]{10, 22, 44, 66 });
    }

}
