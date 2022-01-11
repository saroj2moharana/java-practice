package com.skm.algo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by saroj on 7/12/2019.
 */
public class MapDisplay {
    public static void main(String arg[]) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("saroj", 10);
        maps.put("saroj1", 30);
        maps.put("saroj2", 15);
        maps.put("saroj3", 40);
        maps.put("saroj4", 25);
        System.out.println("Maps:" + maps);
        Set<Map.Entry<String,Integer>> entrySet = maps.entrySet();
        for(Map.Entry<String,Integer> entry: entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
        }

        Map map = new HashMap();
        A a1 = new A(10);
        A a2 = new A(11);
        map.put(a1,100);
        map.put(a2,200);
        map.put(a2,400);
        System.out.println("New Map:"+map);
        System.out.println(a1.hashCode()+","+a2.hashCode());
    }
}

class A {
    int a;
    @Override
    public int hashCode() {
        return 35;
    }
    A(int a){
        this.a = a;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("A{");
        sb.append("a=").append(a);
        sb.append('}');
        return sb.toString();
    }
}
