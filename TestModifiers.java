class TestModifiers {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40; // default access modifier

    public void showPublic() {
        System.out.println("Public Method: publicVar = " + publicVar);
    }

    private void showPrivate() {
        System.out.println("Private Method: privateVar = " + privateVar);
    }

    protected void showProtected() {
        System.out.println("Protected Method: protectedVar = " + protectedVar);
    }

    void showDefault() {
        System.out.println("Default Method: defaultVar = " + defaultVar);
    }

    // Method to access private member within the class
    public void accessPrivateInside() {
        showPrivate(); // calling private method from within the class
    }
}

class SubTestModifiers extends TestModifiers {
    public void accessInherited() {
        System.out.println("Accessing inherited protectedVar: " + protectedVar);
        showProtected();
        // Cannot access privateVar or private method
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        TestModifiers obj = new TestModifiers();

        // Accessing public members
        System.out.println("Accessing publicVar: " + obj.publicVar);
        obj.showPublic();

        // Accessing private members - Not allowed directly
        // System.out.println(obj.privateVar);         // ❌ Error
        // obj.showPrivate();                          // ❌ Error

        obj.accessPrivateInside();                    // ✅ Allowed via public method inside class

        // Accessing protected and default (from same package)
        System.out.println("Accessing protectedVar: " + obj.protectedVar);
        obj.showProtected();

        System.out.println("Accessing defaultVar: " + obj.defaultVar);
        obj.showDefault();

        // Accessing inherited protected member from subclass
        SubTestModifiers subObj = new SubTestModifiers();
        subObj.accessInherited();
    }
}
