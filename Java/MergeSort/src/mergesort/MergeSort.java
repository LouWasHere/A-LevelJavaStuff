/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.*;

/**
 *
 * @author l-bishop
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
    }
    
    public static void mergeSort(int[] a, int n) {
    if (n < 2) 
    {
        return;
    }
    int mid = n / 2;
    
    int[] l = new int[mid];
    int[] r = new int[n - mid];
 
    for (int i = 0; i < mid; i++) 
    {
        l[i] = a[i];
    }
    for (int i = mid; i < n; i++)
    {
        r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);
 
    merge(a, l, r, mid, n - mid);
}
    
    public static void merge(
      int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
