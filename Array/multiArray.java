public class multiArray {

    public static void main(String[] args) {
        String[][] Names = {{"ruturaj", "sairaj"}, {"raviraj", "aditya"}};

        System.out.println("+++++++++++++++++++++++");
        for (int i = 0; i < Names.length; i++) {
            for (int j = 0; j < Names.length; j++) {
                System.out.print(Names[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++");


        System.out.println("\n+++++++++++++++++++++++");
        System.out.println("For each loop");
        for (String[] name : Names) {
            for (String name1 : name) {
                System.out.println(name1);
            }
        }
        System.out.println("+++++++++++++++++++++++");


        System.out.println("\n+++++++++++++++++++++++");

        System.out.println("Changing elements through index ");

        System.out.println("Before changing value of index [0][1] is " + Names[1][0]);
        Names[1][0] = "Shivraj";
        System.out.println("After changing value of index [0][1] is " + Names[1][0]);

        System.out.println("+++++++++++++++++++++++");
    }
}
