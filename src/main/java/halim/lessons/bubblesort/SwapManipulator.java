/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.bubblesort;

/**
 *
 * @author AbdElHalim
 */
public class SwapManipulator {

    public static void main(String[] args) {
        countSwaps(new int[]{1, 2, 3});
    }

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        
        int swapCount = 0;
        boolean swapped = false;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
        
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
