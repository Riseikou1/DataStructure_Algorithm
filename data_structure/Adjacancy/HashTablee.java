package Adjacancy;
import java.util.*;
public class HashTablee {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>(10);
        table.put("100","SpongeBob");
        table.put("123","Patrick");
        table.put("321","Sandy");
        table.put("555","SquidWard");
        table.put("777","Gary");
    
        for(String key : table.keySet()){
            //System.out.println(key.hashCode()+"\t"+key +"\t"+ table.get(key)); // ene shit ni zugeer l hashcode iig ni haruulna.
            System.out.println(key.hashCode()%10+"\t"+key +"\t"+ table.get(key));  // harin ene bol,hashtable-iin heddh index deer irj buig ni haruulna.
        }
    } 
}
