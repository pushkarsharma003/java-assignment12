import java.util.*; 
import java.util.HashMap;
class Hashmap
{ 
   public static void main(String args[]) 
   { 
       Map< String,Integer> hm = new HashMap <String,Integer>(); 
       hm.put("a", new Integer(100)); 
       hm.put("b", new Integer(200)); 
       hm.put("c", new Integer(300)); 
       hm.put("d", new Integer(400)); 
       Set<Map.Entry< String,Integer>> st = hm.entrySet();    
       Iterator it=st.iterator();
       while(it.hasNext()) 
       { 
           Map.Entry m=(Map.Entry)it.next();
           System.out.print(m.getKey()+":"); 
           System.out.println(m.getValue()); 
       } 
   } 
}