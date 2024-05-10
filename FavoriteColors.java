public class FavoriteColors {
    public static void main(String[] args) {

        String[] colors = {"blue", "green", "red", "yellow"};

        try {

            System.out.println("My fourth colour is" + colors[4]);
          }
         catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("\nException caught: Tried to access element beyond array length.");
        }

        try {
            colors[1] = null;
            System.out.println("My second favorite color is: " + colors[1].toUpperCase());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
