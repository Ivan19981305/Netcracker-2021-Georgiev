package ivge;

import java.lang.invoke.SwitchPoint;
import java.util.*;
import java.util.function.Supplier;


public class Main {

    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<Integer>(){{
            for (int i = 0; i < 10; i++)
                add(i);
        }};
        HashSet<Integer> set2 = new HashSet<Integer>(){{
            for (int i = 0; i < 10; i++)
                add(i + 5);
        }};

        union(set1,set2).forEach(System.out::println);
        xor(set1,set2).forEach(System.out::println);

    }

    public static HashSet<Integer> union(HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> ans = new HashSet<>(set1);
        ans.addAll(set2);
        return ans;
    }

    public static HashSet<Integer> xor(HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> ans = new HashSet<>();
        for (Integer set2Element:
                set2) {
            if (!set1.contains(set2Element))
                ans.add(set2Element);
        }
        for (Integer set1Element:
                set1) {
            if (!set2.contains(set1Element))
                ans.add(set1Element);
        }
        return ans;
    }
}