package CollectionsFramework.Map.LinkedHashMap.LRUCache;


public class Main{
    public static void main(String[] args) {
        
        LruCache<String,Integer> map = new LruCache<>(5);
        map.put("Yatin", 1);
        map.put("Danish", 2);
        map.put("Parish", 3);
        map.put("Mishu", 4);
        map.put("Abhishek", 5);
        System.out.println(map);
       System.out.println( map.get("Yatin"));
        System.out.println(map);
        map.put("Anshu",10);
        System.out.println(map);
    }
}
