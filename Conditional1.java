
public class Conditional1{
    int heightDot;
    int heightPyramid;

    public Conditional1(){}

    public void printDots(int heightOfDots){
         heightDot = heightOfDots;
        //int i;
        for(int i = 0; i < heightDot; i++){
            System.out.println("*");
        }
    }

    public void printPyramid(int heightOfPyramid){
        heightPyramid = heightOfPyramid;
        for(int i = 0; i < heightPyramid; i++){
            
            //internal for loop 1 for the spaces.
            //it starts at the height desired minus i which increases for each full line printed 
            for(int j = heightPyramid - i; j > 1; j--){
                System.out.print(" ");
            }
            //internal for loop 2 for the stars, a space after each star is need for shape
            //without the space after each star its a like a step formation
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            //end of full line printing so place new line here before another line loop
            System.out.println();
        }
    }

    public void printBox(int givenBoxSize){
        for(int i = 0; i < givenBoxSize; i++){
            for(int j = 0; j < givenBoxSize; j++){
            System.out.print("*");    
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Conditional1 test1 = new Conditional1();
        //test1.printDots(5);
        //test1.printPyramid(5);
        test1.printBox(5);

    }
}