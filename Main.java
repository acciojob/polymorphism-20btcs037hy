// Task 1 
public class Main{
    static class Product{
        // Task 3
        public int product(int x, int y){
            return x*y;
        }
        // Task 4
        public int product(int x, int y, int z){
            return x+y+z;
        }
        // Task 5
        public double product(double x, double y){
            return x*y;  
        }

    }

    public static void main(String[] args) {
        // Task 2
        Product p = new Product();
        int result1 = p.product(10, 20);
        int result2 = p.product(20, 30, 40);
        double result3 = p.product(10.50, 20.40);


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}