package com.hashtable;

public class HashNode<K, V> implements INode<K>{
    K key;
    V value;
    HashNode<K, V> next;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNextNode() {
        return next;
    }

    @Override
    public void setNextNode(INode<K> next) {
        this.next = (HashNode<K, V>)next;
    }

    public String toString() {
        StringBuilder hashNodeString = new StringBuilder();
        hashNodeString.append("MyHashTableNode {" +"K = ").append(key)
                .append("V = ").append(value).append("}");
        if (next != null)
            hashNodeString.append(" -> ").append(next);
        return hashNodeString.toString();
    }
}
