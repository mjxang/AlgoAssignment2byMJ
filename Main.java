public class Main {
    public static void main(String[] args) {
        // Create first PC setup
        PCSetup setup1 = new PCSetup("medium", true, false);
        // Add components to the first setup
        setup1.addComponent(new CPU("Intel i7", 300.0));
        setup1.addComponent(new GPU("NVIDIA GTX 1660", 250.0));
        setup1.addComponent(new RAM("16GB DDR4", 80.0));
        setup1.addComponent(new Storage("1TB SSD", 100.0));
        // Display the first setup details and total cost
        setup1.displaySetup();

        System.out.println(); // Line break between setups

        // Create second PC setup
        PCSetup setup2 = new PCSetup("large", true, true);
        // Add components to the second setup
        setup2.addComponent(new CPU("AMD Ryzen 9", 400.0));
        setup2.addComponent(new GPU("NVIDIA RTX 3080", 700.0));
        setup2.addComponent(new RAM("32GB DDR4", 160.0));
        setup2.addComponent(new Storage("2TB SSD", 200.0));
        // Display the second setup details and total cost
        setup2.displaySetup();
    }
}
