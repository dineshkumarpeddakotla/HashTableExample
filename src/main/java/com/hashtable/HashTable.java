package com.hashtable;

public class HashTable<K, V> {
    LinkedList<K> linkedList;

    public HashTable() {
        this.linkedList = new LinkedList<>();
    }

    public V get(K key){
        HashNode<K, V> hashNode = (HashNode<K, V>)this.linkedList.search(key);
        return (hashNode == null) ? null : hashNode.getValue();
    }

    public void add(K key, V value) {
        HashNode<K, V> hashNode = (HashNode<K, V>) this.linkedList.search(key);
        if (hashNode == null) {
            hashNode = new HashNode<>(key, value);
            this.linkedList.append(hashNode);
        } else {
            hashNode.setValue(value);
        }
    }
}
