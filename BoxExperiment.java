public class BoxExperiment {
    public static void main(String[] args) {
        // Experiment 1: Boxed String object
        Box<String> stringBox = new Box<>("Hello");
        Box<String> stringBoxRef = stringBox;
        System.out.println("Initial stringBox: " + stringBox.get());
        System.out.println("Initial stringBoxRef: " + stringBoxRef.get());
        stringBox.set("Goodbye");
        System.out.println("After changing stringBox: " + stringBox.get());
        System.out.println("After changing stringBox: " + stringBoxRef.get());

        // Experiment 2: Boxed Integer object
        Box<Integer> intBox = new Box<>(42);
        Box<Integer> intBoxRef = intBox;
        System.out.println("Initial intBox: " + intBox.get());
        System.out.println("Initial intBoxRef: " + intBoxRef.get());
        intBox.set(21);
        System.out.println("After changing intBox: " + intBox.get());
        System.out.println("After changing intBox: " + intBoxRef.get());

        // Experiment 3: Boxed Object object
        Box<Object> objectBox = new Box<>(new Object());
        System.out.println("Initial objectBox: " + objectBox.get());
        objectBox.set("Hello, Object!");
        System.out.println("After setting string in objectBox: " + objectBox.get());
        objectBox.set(42);
        System.out.println("After setting integer in objectBox: " + objectBox.get());
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