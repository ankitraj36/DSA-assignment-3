
// public class Box<T> {
//     public T value;
    
//     public Box(T value){
//         this.value = value;

//     }
//     void display(){
//         System.out.println();
//     }
//     @Override
//     public String toString() {
//         return String.valueOf(value);
//     }

    
// }

//  class Main {
//     public static void main(String[] args) {
//         Box<String> b1 = new Box<>("Ankit");
//         Box<String> b2 = new Box<>("RAJ");
//         // i want to add b1 + b2

//         String result = b1.toString() + " " + b2.toString();
//         System.out.println(result);
//     }
// }
public class Box<T> {
    public T value;
    
    public Box(T value) {
        this.value = value;
    }
    T get
    void display() {
        System.out.println();
    }
    
    // @Override
    // public String toString() {
    //     return String.valueOf(value);
    // }
}
class Main {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>("Ankit");
        Box<String> b2 = new Box<>("RAJ");
        
        // Concatenate the values of b1 and b2
        String result = b1.toString() + " " + b2.toString();
        System.out.println(result); // Output: Ankit RAJ
    }
}
