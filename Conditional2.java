import java.util.*;

public class Conditional2{

    public Conditional2(){
        
    }

    public void getAge(){
       boolean foo = true;
        while ( foo == true){
            System.out.println("Please enter age: ");
            Scanner scn = new Scanner(System.in);
            int startAge = scn.nextInt();
            
             if( startAge >= 18){
                foo = false;
                System.out.println("Congrats you're old!");
                }                      
        }       
    }


    public static void main(String[] args){
        Conditional2 ageTest1 = new Conditional2();
        ageTest1.getAge();
        

    }

}
