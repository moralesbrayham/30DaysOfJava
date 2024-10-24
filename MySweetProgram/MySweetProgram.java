import java.util.Iterator;
import java.util.LinkedList;

public class MySweetProgram{

    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<String>();
        names.push("Caleb");
        names.push("Sue");
        names.push("Sally");

        Iterator<String> it = names.iterator();

        /*System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/

        while(it.hasNext()){
            System.out.println(it.next());
        }

        names.add(2, "Susan");
        
        for(String s: names){
            System.out.println(s);
        }
       

        

    }
}