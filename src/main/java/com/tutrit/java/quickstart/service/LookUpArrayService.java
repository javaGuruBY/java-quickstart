package com.tutrit.java.quickstart.service;

public class LookUpArrayService {

    public int findMax(int[] array) {
        if (array.length == 0){
            return 0;
        }
        return findMaxIfNotZero(array);
    }

    private int findMaxIfNotZero(int[] array) {
        int max= array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int indexOfMax(int[] array) {
        int max= array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        return index;
    }
}
