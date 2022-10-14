package com.guess.service;

import com.guess.model.Player;

import java.util.ArrayList;
import java.util.List;

public class SortService {
    public List<Player> insertionSort(List<Player> arr){
        int i, key, j;
        for (i = 1; i < arr.size(); i++)
        {
            key = arr.get(i).getSeq();
            j = i - 1;
            while (j >= 0 && arr.get(j).getSeq() > key)
            {
                arr.get(j+1).setSeq(arr.get(j).getSeq());
                j = j - 1;
            }
            arr.get(j+1).setSeq(key);
        }
        return arr;
    }
}
