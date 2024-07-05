import java.util.ArrayList;
import java.util.List;

// Class representing a PC setup
public class PCSetup {
    private List<PCComponent> components; // List to hold PC components
    private String caseSize;              // Case size of the PC
    private boolean rgbLighting;          // Flag for RGB lighting
    private boolean liquidCooling;        // Flag for liquid cooling

    // Constructor to initialize PC setup with case size, RGB lighting, and liquid cooling options
    public PCSetup(String caseSize, boolean rgbLighting, boolean liquidCooling) {
        this.components = new ArrayList<>(); // Initialize the components list
        this.caseSize = caseSize;
        this.rgbLighting = rgbLighting;
        this.liquidCooling = liquidCooling;
    }

    // Method to add a component to the PC setup
    public void addComponent(PCComponent component) {
        components.add(component);
    }

    // Method to calculate the total cost of the PC setup
    public double calculateTotalCost() {
        double totalCost = 0.0;

        // Sum the cost of all components
        for (PCComponent component : components) {
            totalCost += component.getPrice();
        }

        // Add case size premium
        switch (caseSize.toLowerCase()) {
            case "small":
                totalCost += 50.0;
                break;
            case "medium":
                totalCost += 100.0;
                break;
            case "large":
                totalCost += 150.0;
                break;
        }

        // Add extra feature costs
        if (rgbLighting) {
            totalCost += 30.0;
        }

        if (liquidCooling) {
            totalCost += 70.0;
        }

        return totalCost; // Return the total cost of the setup
    }

    // Method to display the PC setup details and total cost
    public void displaySetup() {
        System.out.println("PC Setup:");
        for (PCComponent component : components) {
            System.out.println(component.getName() + ": $" + component.getPrice());
        }
        System.out.println("Case Size: " + caseSize);
        System.out.println("RGB Lighting: " + (rgbLighting ? "Yes" : "No"));
        System.out.println("Liquid Cooling: " + (liquidCooling ? "Yes" : "No"));
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
