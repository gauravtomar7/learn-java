package basics;

class Marker {

    String name;
    String color;
    int year;
    int price;

    // Constructor
    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}

// basics.Main class to run program
public class Main {
    public static void main(String[] args) {

        // Creating object and passing values
        Marker m1 = new Marker("Camlin", "Blue", 2022, 50);

        // Printing values
        System.out.println("Name: " + m1.name);
        System.out.println("Color: " + m1.color);
        System.out.println("Year: " + m1.year);
        System.out.println("Price: " + m1.price);
    }
}