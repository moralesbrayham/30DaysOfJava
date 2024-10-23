import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MySweetProgram{

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Students.txt"));

        List<String> students = new ArrayList<String>();

        while(in.hasNextLine()){
            students.add(in.nextLine());
        }
        for(int i = 0; i < students.size(); i++){
            System.out.println("name: " + students.get(i));
        }

        in.close();
        /*Scanner in = new Scanner(System.in);
        System.out.println("Give us a size");
        int size = in.nextInt();
        
        int[] grades = new int[size];

        System.out.println("Enter " + size + " numbers. Press enter after each");
        for(int i = 0; i < size; i++){
            grades[i] = in.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.println(grades[i]);
        }

        //String s = in.nextLine();

        /*if(s.equals("Caleb")){
            System.out.println("Hey Caleb");
        }
        else if(s.equals("Sally")){
            System.out.println("Hey Sally");
        }
        else{
            System.out.println("You're not welcome here");
        }*/

        //in.close();

        //loops

        /*int i = 0; //initialization
        while (i < 10 ){ //condition
            System.out.println("i is:" + i);
            i++; //update
        }*/

       /*for(int i = 0; i < 10; i++){
            System.out.println(i);
        }*/

        /*int i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while(i < 10);*/

    }
}