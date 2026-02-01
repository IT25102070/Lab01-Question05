class Calculator { 
    public int add(int a, int b) { 
        return a + b; 
    }
     public int multiply(int a, int b) {
         return a * b; 
    } 
    public int square(int a) { 
        return a * a; 
    } 
}

public class Main {
     public static void main(String[] args) {

      Calculator calculator = new Calculator(); 
      
      // (3 * 4 + 5 * 7)^2 
      int x1 = calculator.multiply(3, 4);
      int x2 = calculator.multiply(5, 7); 
      int x3 = calculator.add(x1, x2); 
      int result1 = calculator.square(x3);
      
      // (4 + 7)^2 + (8 + 3) 
      int y1 = calculator.add(4, 7); 
      int y2 = calculator.square(y1); 
      int y3 = calculator.add(8, 3); 
      int result2 = calculator.add(y2, y3);

      System.out.println("(3 * 4 + 5 * 7)^2 = " + result1); 
      System.out.println("(4 + 7)^2 + (8 + 3) = " + result2); 
    } 
}
