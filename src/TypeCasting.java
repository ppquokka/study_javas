public class TypeCasting {
    public static void main(String[] args) throws Exception {
        double myDouble = 9.78d;  
    int myInt = (int) myDouble; // Manual casting: double to int
                                // int는 정수만 들어갈 수 있음 
    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
        //return 0;
    }
}
