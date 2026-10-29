//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//import java.util.Collection;
//public class HashMapbasics {
//    static void main(String[] args) {
//        // Hashmap = is a collection of key and value
//        // for insert we use put method
//        Map<String,String> mapping = new HashMap<>();
//        //insertion
//        mapping.put("in", "india");
//       // mapping.put("in", "india2");// this will modify the first vlaue
//        mapping.put("en", "england");
//        mapping.put("us", "united state");
//        System.out.println(mapping);
//        Map<String,String> mapping1 = new HashMap<>();
//        mapping1.put("br","brazil");
//        System.out.println("before:" + mapping1);
//        mapping1.putAll(mapping);// mapping ki sari entries mapping1 me aa jayegi
//        System.out.println("after: " +mapping1);
//        //deletion
//        mapping1.remove("en");
//        System.out.println(mapping1);
//        //size
//        System.out.println(mapping1.size());
////        mapping1.clear();
////        System.out.println(mapping1.size());
//        // putIfAbsent =agr koi entry phle se present nhi hai to wo create kr deta h
//        mapping1.putIfAbsent("is","india3");
//        System.out.println(mapping1);
//        System.out.println(mapping1.get("br"));
//        System.out.println(mapping1.getOrDefault("usa","none"));//jo key present nhi hai agr wo hm dekhe or na mile to none print hota h
//        // contains all method check that any entry present or not
//        System.out.println(mapping1.containsKey("in"));
//        System.out.println(mapping1.containsKey("im"));
//        // contains value = check that any vlaue present or not
//        System.out.println(mapping1.containsValue("united state"));
//        // replace method = replace the vlaue
//        mapping1.replace("in","indonesia");
//        System.out.println(mapping1);
//
//        Set<String> keyset = mapping1.keySet();// this return all keys
//        System.out.println(keyset);
//
//        Collection<String> valueSet = mapping1.values();
//        System.out.println(valueSet);// this return all values
//
//        //get all the entries from map
//       Set<Map.Entry<String,String>> entrySet = mapping1.entrySet();// returns set of entries
//        System.out.println("printing entries:" + entrySet);
//        //iterating over a map
//      Map<Integer,String> map = new HashMap<>();
//      map.put(1,"one");
//      map.put(2,"two");
//      for(Map.Entry<Integer,String> entry: map.entrySet()){
//          System.out.println("key: " + entry.getKey() +", value:" + entry.getValue());
//      }
//
//    }
//}
