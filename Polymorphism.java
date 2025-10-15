// File: Polymorphism.java

// Demonstration of Compile-time and Runtime Polymorphism
class Payment {
    // Method Overloading (Compile-time Polymorphism)
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using cash.");
    }

    void pay(double amount, String cardNumber) {
        System.out.println("Paid ₹" + amount + " using card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }

    void pay(double amount, String upiId, boolean upi) {
        System.out.println("Paid ₹" + amount + " via UPI ID: " + upiId);
    }
}

// Base class for Method Overriding (Runtime Polymorphism)
class PaymentMethod {
    void processPayment() {
        System.out.println("Processing a generic payment...");
    }
}

// Derived classes override the same method
class CreditCardPayment extends PaymentMethod {
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

class UPIPayment extends PaymentMethod {
    @Override
    void processPayment() {
        System.out.println("Processing UPI payment...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("=== Compile-time Polymorphism (Method Overloading) ===");
        Payment p = new Payment();
        p.pay(500);
        p.pay(1200, "9876543210123456");
        p.pay(800, "varshini@upi", true);

        System.out.println("\n=== Runtime Polymorphism (Method Overriding) ===");
        PaymentMethod m1 = new CreditCardPayment(); // Upcasting
        PaymentMethod m2 = new UPIPayment();        // Upcasting

        m1.processPayment(); // Calls overridden method in CreditCardPayment
        m2.processPayment(); // Calls overridden method in UPIPayment
    }
}
