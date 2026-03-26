public class demo {
    public static void main(String[] args) {
        // 1. Print Hello World
        System.out.println("Hello World! Welcome to Java");
        
        // 2. Variables and Data Types
        int age = 25;
        String name = "Muzammil darbar";
        double salary = 50000.50;
        boolean isJavaDeveloper = true;
        
        System.out.println("\n--- Variables ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Java Developer: " + isJavaDeveloper);
        
        // 3. Arithmetic Operations
        System.out.println("\n--- Arithmetic Operations ---");
        int a = 10, b = 20;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (b - a));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));
        
        // 4. If-Else Statement
        System.out.println("\n--- If-Else Statement ---");
        if (age >= 18) {
            System.out.println(name + " is an Adult");
        } else {
            System.out.println(name + " is a Minor");
        }
        
        // 5. For Loop
        System.out.println("\n--- For Loop ---");
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 6. While Loop
        System.out.println("\n--- While Loop ---");
        int count = 1;
        System.out.println("Counting to 3:");
        while (count <= 3) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // 7. Array
        System.out.println("\n--- Array ---");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 8. Method Call
        System.out.println("\n--- Method Call ---");
        int sum = addNumbers(5, 15);
        System.out.println("Sum of 5 and 15: " + sum);
        
        greetUser(name);
    }
    
    // Simple Method to Add Two Numbers
    public static int addNumbers(int x, int y) {
        return x + y;
    }
    
    // Method to Greet User
    public static void greetUser(String userName) {
        System.out.println("Welcome " + userName + "! Keep learning Java.");
    }
}
