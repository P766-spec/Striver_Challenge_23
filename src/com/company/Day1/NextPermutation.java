package com.company.Day1;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {
        ArrayList<Integer> permutation = new ArrayList<>(Arrays.asList(2, 1, 5, 4, 3, 0, 0));
        List<Integer> res = nextPermutation(permutation);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i) + " ");
        }
        System.out.println("]");
    }

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int ind = -1;
        int n = permutation.size();
        for (int i = n - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                ind = i;
                break;
            }
        }
        if (ind == -1)
            Collections.reverse(permutation);
        else {
            for (int i = n - 1; i > ind; i--) {
                if (permutation.get(i) > permutation.get(ind)) {
                    int temp = permutation.get(i);
                    permutation.set(i, permutation.get(ind));
                    permutation.set(ind, temp);
                    break;
                }
            }
            List<Integer> subList = permutation.subList(ind + 1, n);
            Collections.reverse(subList);
        }
        return permutation;
    }
}
