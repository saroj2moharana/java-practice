package com.skm.algo.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClassDemo {
    public static void main(String arg[]){
        Set<String> set = new LinkedHashSet<>();
        set.add("saroj");
        set.add("kumar");
        set.add("moharana");
        System.out.println("Set Contents:"+set);
        set.contains("saroj");
        System.out.println("hashCode:"+set.hashCode());
    }
}
