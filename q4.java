public class q4 {
    public static void main(String[] args) {
        // Experiment 1: Boxed String object
        Box<String> box1 = new Box<>("Hello");
        Box<String> box2 = box1;
        System.out.println("Box 1: " + box1.get());
        System.out.println("Box 2: " + box2.get());
        box1.set("World");
        System.out.println("Box 1: " + box1.get());
        System.out.println("Box 2: " + box2.get());

        // Experiment 2: Boxed Integer object
        Box<Integer> box3 = new Box<>(10);
        Box<Integer> box4 = box3;
        System.out.println("Box 3: " + box3.get());
        System.out.println("Box 4: " + box4.get());
        box3.set(20);
        System.out.println("Box 3: " + box3.get());
        System.out.println("Box 4: " + box4.get());

        // Experiment 3: Boxed Object object
        Box<Object> box5 = new Box<>("Hello");
        Box<Object> box6 = box5;
        System.out.println("Box 5: " + box5.get());
        System.out.println("Box 6: " + box6.get());
        box5.set(10);
        System.out.println("Box 5: " + box5.get());
        System.out.println("Box 6: " + box6.get());
    }
}

class Box<T> {
    public T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}