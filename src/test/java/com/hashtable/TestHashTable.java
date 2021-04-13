package com.hashtable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHashTable {

    @Test
    public void givenASentenceWhenWordsAreAddedToListShouldReturnWorldFrequency(){
        String sentence = "To be or not to be";
        HashTable<String, Integer> hashTable = new HashTable<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = hashTable.get(word);
            if (value == null) value = 1;
            else  value = value + 1;
            hashTable.add(word, value);
        }
        int frequency = hashTable.get("to");
        System.out.print(hashTable);
        Assertions.assertEquals(2,frequency);
    }
}
