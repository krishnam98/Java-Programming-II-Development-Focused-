public class Enums{
    // Enums are named constant
    // helpfull when we want specific constants
    enum status{
        // Different constant values of status.
       success,Pending,Running,Failed;
    };
  
    public static void main(String args[]){
        // Accessing Enum
        status s=status.success;

        System.out.println(s);  // o/p -> success
    }
}