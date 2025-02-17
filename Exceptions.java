import java.util.Scanner;
public class Exceptions{
    // Customised Exception
    public static class OwnException extends Exception{

        // constructor
        public OwnException(String message){
            super(message);
        }
    
    }
    
    public static void IntroToTryCatch(){
        int i=0;
        int j=18;

        // Handeling Exceptions

        try{
            j=20/0;
        }
        catch(Exception e){
            System.out.println("Something Went wrong, Error Msg: "+e);  // e=>java.lang.ArithmeticException: / by zero
        }
        // Without Try Catch block below statement will not execute
        System.out.println(j);

    }

    public static void multipleCatches(){
        int i=0;
        int nums[]=new int [5];
        String s=null;
        int j=0;

        try{
            j=18/i;   //ArithmeticException
            System.out.println(nums[5]);  //ArrayIndexOutOfBoundsException
            System.out.println(s.length()); // Exception we don't know about
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }
        catch(Exception e){   //handeling Exception we don't know about 
            System.out.println("Something went wrong"+e);
        }
    }

    public static void throwKeyword(){
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                // We create a object of exception class also we can create message for this exception in constructor
                throw new ArithmeticException("calculated value was 0");
            }

        }
        catch(ArithmeticException e){
            j=18;
            System.out.println("Default value is: "+j+ e);
        }

    }

    public static void callCustomException(){
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new OwnException("I didn't want to Print Zero..!");
            }
           
        }
        catch(OwnException e){
            System.out.println("Something Went Wrong! "+e);
        }
    }
// Exception Ducking using Throws Keyword
    public static void childFunc(int j) throws Exception{
        int i=0;
        j=18/i;
        System.out.println(j);
    }

    public static void parentFunc(){
        int j=18;
        try{
            childFunc(j);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void TryFinally(){
        Scanner sc=new Scanner (System.in);
        try{
            System.out.println("Enter number");
            int num=sc.nextInt();
            System.out.println("Entered number is "+num);
        }
        finally{
            sc.close();
            System.out.println("Closed");
        }
    }


    public static void main(String args[]){
        // IntroToTryCatch();
        // multipleCatches();
        // throwKeyword();
        // callCustomException();
        // ----Throws Keyword----
        // parentFunc();
        //------------------
        // TryFinally();

        
    }
}