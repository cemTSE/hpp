package fr.tse.hpp.labs.utils;

import java.util.Random;

public class MergeSort {

	
	private int[] tab;
    private int[] tmptab;
    private int length;
    
    public void sort(int inputArr[]) {
        this.tab = inputArr;
        this.length = inputArr.length;
        this.tmptab = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lower, int higher) {
        
        if (lower < higher) {
            int middle = lower + (higher - lower) / 2;
            doMergeSort(lower, middle);
            doMergeSort(middle + 1, higher);
            merge(lower, middle, higher);
        }
    }
    
    private void merge(int lower, int middle, int higher) {
    	 
        for (int i = lower; i <= higher; i++) {
            tmptab[i] = tab[i];
        }
        int i = lower;
        int j = middle + 1;
        int k = lower;
        while (i <= middle && j <= higher) {
            if (tmptab[i] <= tmptab[j]) {
                tab[k] = tmptab[i];
                i++;
            } else {
                tab[k] = tmptab[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            tab[k] = tmptab[i];
            k++;
            i++;
        }
 
    }
    
    public static void main(String a[]){
        
    	Random rand = new Random();
    	int longueur = 1000;
        int[] inputArr=new int[longueur];
        for (int i=0; i<longueur; i++) {
        	inputArr[i]=rand.nextInt(longueur + 1);

        }
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }

}
