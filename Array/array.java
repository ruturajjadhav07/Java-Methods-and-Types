public class array {

    public static void main(String[] args) {
        String[] Names = {"ruturaj", "sairaj", "raviraj", "aditya"};

        System.out.println("+++++++++++++++++++++++");
        for (int i = 0; i < Names.length; i++) {
            System.out.println(Names[i]);
        }
        System.out.println("+++++++++++++++++++++++");


        System.out.println("\n+++++++++++++++++++++++");
        System.out.println("For each loop");
        for (String name : Names) {
            System.out.println(name);
        }
        System.out.println("+++++++++++++++++++++++");


        System.out.println("\n+++++++++++++++++++++++");

        System.out.println("Changing elements through index ");

        System.out.println("Before changing value of index [1] is " + Names[1]);
        Names[1] = "Shivraj";
        System.out.println("After changing value of index [1] is " + Names[1]);

        System.out.println("+++++++++++++++++++++++");
    }
}
