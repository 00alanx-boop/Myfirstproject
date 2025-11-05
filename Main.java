import java.util.Scanner;

class Student {
    String name;
    double[] scores = new double[3];  // assignment, midterm, final

    // TODO A1: Add a constructor that sets the student name
    public Student(String name) {
        this.name = name;
    }

    // TODO A2: Add a method printInfo() that prints:
    // "<name> scores:"
    // "Assignment: <value>"
    // "Midterm: <value>"
    // "Final: <value>"
    public void printInfo() {
        System.out.println(name + " scores:");
        System.out.println("Assignment: " + scores[0]);
        System.out.println("Midterm: " + scores[1]);
        System.out.println("Final: " + scores[2]);
    }

    // TODO A3: Add a method calculateAverage()
    // - Return the average = (assignment + midterm + final) / 3
    public double calculateAverage() {
        return (scores[0] + scores[1] + scores[2]) / 3;
    }

    // TODO A4: Add a method checkPass()
    // - If average >= 60, print: "<name> passed."
    // - Else print: "<name> failed."
    public void checkPass() {
        double avg = calculateAverage();
        if (avg >= 60) {
            System.out.println(name + " passed.");
        } else {
            System.out.println(name + " failed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO B1: Ask "How many students?"
        System.out.print("How many students? ");
        int total = input.nextInt();
        input.nextLine();

        // TODO B2: Use a while loop that many times:
        int count = 1;
        while (count <= total) {
            System.out.print("Enter name for student " + count + ": ");
            String name = input.nextLine();
            Student s = new Student(name);

            System.out.print("Enter assignment score: ");
            s.scores[0] = input.nextDouble();

            System.out.print("Enter midterm score: ");
            s.scores[1] = input.nextDouble();

            System.out.print("Enter final score: ");
            s.scores[2] = input.nextDouble();
            input.nextLine();

            s.printInfo();
            s.checkPass();

            count++;
        }
    }
}
