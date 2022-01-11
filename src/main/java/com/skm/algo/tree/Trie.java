package com.skm.algo.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saroj on 7/29/2020
 */
public class Trie {
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }

    /**
     * It will insert a word...
     * @param word
     */
    public void insertWord(String word){
        TrieNode currentNode = root;
        for(int i=0; i<word.length();i++){
            Character ch = word.charAt(i);
            TrieNode trieNode = currentNode.childNodes.get(ch);
            if(trieNode == null){
                trieNode = new TrieNode();
                currentNode.childNodes.put(ch,trieNode);
            }
            currentNode = trieNode;
        }
        currentNode.isEndOfWord = true;
        currentNode.wordCount++;
    }

    /**
     * It will search word...
     * @param word
     * @return
     */
    public boolean searchWord(String word){
        TrieNode currentNode = root;
        for(int i=0; i< word.length(); i++){
            Character character = word.charAt(i);
            TrieNode trieNode = currentNode.childNodes.get(character);
            if(trieNode == null)
                return false;
            currentNode = trieNode;
        }
        return currentNode.isEndOfWord;
    }

    /**
     * It will return count of words...
     * @param word
     * @return
     */
    public int wordCount(String word){
        TrieNode currentNode = root;
        for(int i=0; i< word.length(); i++){
            Character character = word.charAt(i);
            TrieNode trieNode = currentNode.childNodes.get(character);
            if(trieNode == null)
                return 0;
            currentNode = trieNode;
        }
        return currentNode.wordCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trie{");
        sb.append("root=").append(root);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("saroj");
        trie.insertWord("saroj");
        trie.insertWord("saishree");
        System.out.println("trie:"+trie);
        System.out.println("saroj exist:"+trie.searchWord("saroj"));
        System.out.println("saroj count:"+trie.wordCount("saroj"));
        System.out.println("saishree count:"+trie.wordCount("saishree"));

    }
}
class TrieNode{
    public Map<Character,TrieNode> childNodes;
    boolean isEndOfWord;
    int wordCount;

    TrieNode(){
        this.childNodes = new HashMap<>();
        this.isEndOfWord = false;
        this.wordCount = 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TrieNode{");
        sb.append("childNodes=").append(childNodes);
        sb.append(", isEndOfWord=").append(isEndOfWord);
        sb.append('}');
        return sb.toString();
    }
}
