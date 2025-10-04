package CollectionsFramework.Map.LinkedHashMap.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

class LruCache<K,V> extends LinkedHashMap<K,V>{
    
    private int capacity;
    public LruCache(int capacity){
        super(capacity, 0.75f , true);
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<K,V> entry){
        return size() > capacity;
    }
}
