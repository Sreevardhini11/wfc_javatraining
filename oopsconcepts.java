// Abstraction - using interface
interface OOP_Interface {
    void display1(); // method declaration (abstract by default)
}

// Implementing abstraction
class OOP_Interface_Impl implements OOP_Interface {
    public void display1() {
        System.err.println("Abstraction in OOP");
    }
}

// Base class - Encapsulation via private data (example)
class OOP {
    private String message = "Encapsulation in OOP"; // encapsulated data

    public void showMessage() {
        System.err.println(message); // public method to access private data
    }

    public void display() {
        System.err.println("Polymorphism in OOP");
    }
}

// Inheritance + Polymorphism
class OOP_Inherit extends OOP {
    @Override
    public void display() {
        System.err.println("Inheritance and Polymorphism in OOP");
    }
}

// Main class with objects
public class MainOOP {
    public static void main(String[] args) {
        // Inheritance + Polymorphism
        OOP obj1 = new OOP_Inherit(); // upcasting
        obj1.display(); // will call child class method

        OOP obj2 = new OOP();
        obj2.display();

        // Encapsulation
        obj2.showMessage();

        // Abstraction
        OOP_Interface obj3 = new OOP_Interface_Impl();
        obj3.display1();
    }
}
