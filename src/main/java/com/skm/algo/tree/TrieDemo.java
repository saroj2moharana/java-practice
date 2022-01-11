package com.skm.algo.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author saroj on 7/30/2020
 */
/*
 * Auto-complete using tries in java
 */
public class TrieDemo {
    public TriNode root;
    public TrieDemo(){
        root = new TriNode(' ');
    }

    public void insertInTrie(String str){
        str = str.toLowerCase();
        int strLen = str.length();
        if (strLen == 0) {
            root.isEndOfString = true;
        } else {
            int i=0;
            TriNode current = root, child=null;
            while (i<strLen){
                Character ch = str.charAt(i);
                child = current.child.get(ch);
                //if it is null then it is new childNode to insert...
                if (child == null){
                    child = new TriNode(ch);
                    current.child.put(ch,child);
                }
                current = child;
                i++;
            }
            current.isEndOfString  = true;
            current.leafNodeStr = str;
        }
    }

    public TriNode getLocationOfStringInTrie(String str){
        str = str.toLowerCase();
        TriNode current = this.root, child;
        int strLen = str.length();
        int i=0;
        while(i<strLen){
            child = current.child.get(str.charAt(i));
            if (child != null) {
                current = child;
            } else {
                return null;
            }
            i++;
        }
        if ( i == strLen){
            return current;
        }
        return null;
    }

    public void autocomplete(TriNode node){
        if (node.isEndOfString) {
            System.out.println("-"+node.leafNodeStr);
        }
        node.child.values().parallelStream().forEach(childNode -> autocomplete(childNode));
    }

    public static void main(String[] args) throws IOException {
        TrieDemo trie = new TrieDemo();
        trie.insertInTrie("analyse");
        trie.insertInTrie("boondock");
        trie.insertInTrie("extend");
        trie.insertInTrie("append");
        trie.insertInTrie("insert");
        trie.insertInTrie("remove");
        trie.insertInTrie("free");
        trie.insertInTrie("Free weblog publishing tool from Google, for sharing text, photos and vide");
        trie.insertInTrie("clear");
        trie.insertInTrie("blog");
        trie.insertInTrie("what is autocomplete");
        trie.insertInTrie("blog is your best bet for a voice among the online crowd");
        trie.insertInTrie("start a WordPress blog or create a free website in seconds");
        trie.insertInTrie("start");
        trie.insertInTrie("While we hope these tips are informative, we are unable to answer individua");
        trie.insertInTrie("while");
        trie.insertInTrie("base ment");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String keyword;
        TriNode location = null;
        System.out.println("Enter your keywords::");
        while (true) {
            keyword = br.readLine();
            if (keyword.equals("Y")){
                break;
            }
            location = trie.getLocationOfStringInTrie(keyword);
            if (location != null){
                trie.autocomplete(location);
            }else {
                System.out.println("No Match found for [ "+keyword+" ] in our data base");
            }
        }
    }
}
class TriNode {
    public char data;
    public boolean isEndOfString;
    public Map<Character,TriNode> child;
    public String leafNodeStr;

    public TriNode(char data){
        this.data = data;
        child = new HashMap<>();
        this.isEndOfString = false;
    }

    public TriNode getChildNode(char data){
        if (child != null) {
            return child.get(data);
        }
        return null;
    }
}