import java.util.*;
class BubbleSort{
    public static void main(String args[]){
        int arr[]={1,5,9,2,3,4};

        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int swapp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swapp;
                }
            }
        }

        System.out.println("Array in descending order is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}