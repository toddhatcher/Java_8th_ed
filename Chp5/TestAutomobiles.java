
// TestAutomobiles.java

// Declares several Automobile objecets and demonstrates 
// that all the methods work correctly.

public class TestAutomobiles
{
    public static void main(String[] args)
    {
        // Declare objects
        Automobile auto1 = new Automobile(5555, "Chevy", "Equinox", "Blue", 2008, 20);
        Automobile auto2 = new Automobile(111111, "Dodge", "Ram", "Grey", 2020, 250);

        // All Get Methods
        System.out.println("The ID number is: " + auto1.getAutomobileIDNumber());
        System.out.println("The make of this automobile is: " + auto1.getAutomobileMake());
        System.out.println("The model of this automobile is: " + auto1.getAutomobileModel());
        System.out.println("This color of this automobile is: " + auto1.getAutomobileColor());
        System.out.println("The year this automobile was manufactured is: " + auto1.getAutomobileYear());
        System.out.println("The rated MPG for this automobile is: " + auto1.getAutomobileRatedMPG() + " mpg.");
        
        // All Set Methods
        auto1.setAutomobileIDNumber(8888);
        auto1.setAutomobileMake("GMC");
        auto1.setAutomobileModel("Terrain");
        auto1.setAutomobileColor("Red");
        auto1.setAutomobileYear(2011);
        auto1.setAutomobileRatedMPG(25);
        
        // All Get Methods again
        System.out.println("\nAfter using each of the set methods, the new values are as follows.\n");

        System.out.println("The ID number is: " + auto1.getAutomobileIDNumber());
        System.out.println("The make of this automobile is: " + auto1.getAutomobileMake());
        System.out.println("The model of this automobile is: " + auto1.getAutomobileModel());
        System.out.println("This color of this automobile is: " + auto1.getAutomobileColor());
        System.out.println("The year this automobile was manufactured is: " + auto1.getAutomobileYear());
        System.out.println("The rated MPG for this automobile is: " + auto1.getAutomobileRatedMPG() + " mpg.");
        
        // Show the invalid input's effects on the output. (Set to zero).
        System.out.println("\nAfter entering invalid numbers during object construction, the values have been set to zero.\n");
        
        System.out.println("The ID number is: " + auto2.getAutomobileIDNumber());
        System.out.println("The make of this automobile is: " + auto2.getAutomobileMake());
        System.out.println("The model of this automobile is: " + auto2.getAutomobileModel());
        System.out.println("This color of this automobile is: " + auto2.getAutomobileColor());
        System.out.println("The year this automobile was manufactured is: " + auto2.getAutomobileYear());
        System.out.println("The rated MPG for this automobile is: " + auto2.getAutomobileRatedMPG() + " mpg.");
    }
}