package Day13;

public class Primenumber {
    public boolean isprimenumber(int a) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Negative numbers cannot be prime.");
        }
        if (a <= 1) {
            return false; 
            
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Primenumber p = new Primenumber();
        try {
            System.out.println(p.isprimenumber(7) ? "is a prime number" : "is not a prime number");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
