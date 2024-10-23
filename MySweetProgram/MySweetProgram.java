import java.util.Scanner;
public class MySweetProgram{

    public static void main(String[] args) {
        System.out.println("Enter your name");
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        if(s.equals("Caleb")){
            System.out.println("Hey Caleb");
        }
        else if(s.equals("Sally")){
            System.out.println("Hey Sally");
        }
        else{
            System.out.println("You're not welcome here");
        }

        in.close();

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