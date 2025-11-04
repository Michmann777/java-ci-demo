// CalculatorTest.java
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int failed = 0;
        System.out.println("=== Calculator Tests START ===");
        if (calc.add(2,3) != 5) { System.out.println("FAIL: add"); failed++; } else System.out.println("OK: add");
        if (calc.subtract(5,3) != 2) { System.out.println("FAIL: subtract"); failed++; } else System.out.println("OK: subtract");
        if (calc.multiply(4,3) != 12) { System.out.println("FAIL: multiply"); failed++; } else System.out.println("OK: multiply");
        try {
            double res = calc.divide(10,2);
            if (res != 5.0) { System.out.println("FAIL: divide"); failed++; } else System.out.println("OK: divide");
        } catch (Exception e) { System.out.println("FAIL: divide threw " + e.getMessage()); failed++; }
        try {
            calc.divide(1,0);
            System.out.println("FAIL: divide by zero expected exception"); failed++;
        } catch (ArithmeticException e) { System.out.println("OK: divide by zero threw ArithmeticException"); }
        System.out.println("=== Calculator Tests END ===");
        if (failed > 0) {
            System.out.println("TESTS FAILED: " + failed);
            System.exit(1);
        } else {
            System.out.println("ALL TESTS PASSED.");
            System.exit(0);
        }
    }
}
