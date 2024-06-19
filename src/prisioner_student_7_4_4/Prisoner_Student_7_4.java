public class Prisoner_Student_7_4 {
    // Fields 
    public String name;
    public double height;
    public int sentence;
    
    // Constructor
    public Prisoner_Student_7_4(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
    
    // Methods
    public void think() {
        System.out.println("I'll have my revenge.");
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Sentence: " + sentence + " years");
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        Prisoner_Student_7_4 prisoner = new Prisoner_Student_7_4("John Doe", 1.80, 10);
        prisoner.display();
        prisoner.think();
    }
}
