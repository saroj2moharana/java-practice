package com.skm.algo.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saroj on 6/3/2019.
 */
public class PermutationUsingList {
    public static void main(String a[]) {

        List<String> output = generatePermutations("xyz");
        System.out.println("Result size: "+output.size());
        output.stream().forEach(System.out::println);
        System.out.println("------------------");

        /*output = generatePermutations("AABC");
        System.out.println("Result size: "+output.size());
        output.stream().forEach(System.out::println);*/
    }

    public static List<String> generatePermutations(String input) {

        List<String> strList = new ArrayList<>();
        permutations("", input, strList);

        return strList;
    }

    private static void permutations(String consChars, String input, List<String> opContainer) {
        System.out.println("\nConsChar:"+consChars+",input:"+input);
        if(input.isEmpty()) {
            opContainer.add(consChars+input);
            return;
        }

        for(int i=0; i<input.length(); i++) {
            System.out.println("Prior to call Permutations,i:"+i);
            permutations(consChars+input.charAt(i),
                    input.substring(0, i)+input.substring(i+1),
                    opContainer);
            System.out.println("Post to call Permutations,i:"+i);
        }
    }
}
