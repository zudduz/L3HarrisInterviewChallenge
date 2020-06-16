package com.steinbox.sandbox.l3harris;

import java.util.HashMap;

/**
 * This Class should extend HashMap and do the following
 *  1) Support a readOnly mode which does not allow modification
 *  2) Record changes made to the data preserving order
 *  3) Print out all changes to the underlying map
 */
public class HistoryHashMap <K, V> extends HashMap<K,V> {
    
    @Override
    public V put(K key, V val){
        System.out.println("put(" + key + " " + val + ")");
        return super.put(key,val);
    }

}