public class DataTypesExample {
    public static void main(String[] args) {
        
        // 🔹 Primitive Data Types
        byte byteVar = 100;                // 1 byte, range: -128 to 127
        short shortVar = 20000;            // 2 bytes
        int intVar = 500000;               // 4 bytes
        long longVar = 15000000000L;       // 8 bytes (note the 'L' at the end)
        
        float floatVar = 5.75f;            // 4 bytes (note the 'f')
        double doubleVar = 19.99;          // 8 bytes
        
        char charVar = 'A';                // 2 bytes, single character
        boolean boolVar = true;            // 1 bit (true or false)
        
        // 🔹 Non-Primitive Data Types
        String strVar = "Hello, Java!";    // String is a class (non-primitive)
        
        // 🔹 Output all variables
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte value: " + byteVar);
        System.out.println("short value: " + shortVar);
        System.out.println("int value: " + intVar);
        System.out.println("long value: " + longVar);
        System.out.println("float value: " + floatVar);
        System.out.println("double value: " + doubleVar);
        System.out.println("char value: " + charVar);
        System.out.println("boolean value: " + boolVar);

        System.out.println("\n=== Non-Primitive Data Type ===");
        System.out.println("String value: " + strVar);
    }
}