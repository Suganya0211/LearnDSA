package com.sugan.hashing;

import java.util.HashMap;

public class FrequencyCount {
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i] , 1);
            }
        }


        for(int i = 0; i < N; i++) {
            if(map.containsKey(i+1)) {
                arr[i] = map.get(i+1);
            } else {
                arr[i] = 0;
            }
        }
    }
}
