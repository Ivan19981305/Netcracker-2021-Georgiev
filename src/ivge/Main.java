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
        HashSet<Integer> ans1 = new HashSet<>(set1);
        ans1.removeAll(set2);

        HashSet<Integer> ans2 = new HashSet<>(set2);
        ans2.removeAll(set1);
        return union(ans1, ans2);
    }
}