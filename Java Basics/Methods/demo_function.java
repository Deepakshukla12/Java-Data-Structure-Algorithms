// Illustrating a demo function without parameters


package Methods;

public class demo_function {
    
        public static void main(String[] args) {
            for(int i=0;i<5;i++){
                print_hello();
            }
            System.out.println(print_hello_int());       // To print the return value we have imposed the function into the print statement
        };
    
        public static void print_hello() {
            System.out.println("Hello world");
      }

      public static int print_hello_int(){
        System.out.print("How are you? ");
        return 1;
      }

}


// Here in this, VOID and INT are the return types of the function.

// If the return type is INT then, we have to always return a value within the function.
