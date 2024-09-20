package com.example.D3;

import java.util.Arrays;

public class Operations_and_DataStructures {
    Operations_and_DataStructures(int wantedNumber, String wantedString){
        int[]  array = {1344, 23, 3, 455, 35};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.binarySearch(array, wantedNumber);
            
        

    }
}
