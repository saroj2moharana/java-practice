package com.skm.algo.string;

/**
 * @author saroj on 30/05/23
 */
public class CheckNumberExist {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)
    }
}
class MyHashSet {
    private String str = null;
    public MyHashSet() {
        str = "";
    }

    public void add(int key) {
        if(!contains(key)) str += ","+key;
        System.out.println(str);
    }

    public void remove(int key) {
        str = str.replace(","+key,"");
    }

    public boolean contains(int key) {
        return str.contains(","+key);
    }

}
