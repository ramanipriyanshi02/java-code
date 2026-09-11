class p23 {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }
    }
}