
// Base class for PC components
public class PCComponent {
    private String name;  // Name of the component
    private double price; // Price of the component

    // Constructor to initialize component name and price
    public PCComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for component name
    public String getName() {
        return name;
    }

    // Getter for component price
    public double getPrice() {
        return price;
    }
}

// Subclass for CPU
class CPU extends PCComponent {
    // Constructor to initialize CPU with name and price
    public CPU(String name, double price) {
        super(name, price);
    }
}

// Subclass for GPU
class GPU extends PCComponent {
    // Constructor to initialize GPU with name and price
    public GPU(String name, double price) {
        super(name, price);
    }
}

// Subclass for RAM
class RAM extends PCComponent {
    // Constructor to initialize RAM with name and price
    public RAM(String name, double price) {
        super(name, price);
    }
}

// Subclass for Storage
class Storage extends PCComponent {
    // Constructor to initialize Storage with name and price
    public Storage(String name, double price) {
        super(name, price);
    }
}
