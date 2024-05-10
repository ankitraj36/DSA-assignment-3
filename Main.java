class Mark {
    String name;
    int marks;

    public Mark(String name, int marks) {
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfBoundException("Marks out of bound: " + marks);
        }
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("NAME: " + name);
        System.out.println("MARKS: " + marks);
    }
}

class MarksOutOfBoundException extends RuntimeException {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Mark m1 = new Mark("Ankit raj", 40);
            Mark m2 = new Mark("Ankita", 30);
            Mark m3 = new Mark("Ankit kumar", 100);
            m1.display();
            m2.display();
            m3.display();
        } catch (MarksOutOfBoundException e) {
            System.out.println("Mark can't be greater than 100");
        }
    }
}
