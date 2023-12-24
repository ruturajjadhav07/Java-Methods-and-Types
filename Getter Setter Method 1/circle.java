// Getter Setter Method 1

public class circle {
    private String triangleName;
    private String circleName;
    private String squareName;

    public String getTriangleName() {
        return triangleName;
    }

    public void setTriangleName(String triangleName) {
        this.triangleName = triangleName;
    }

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    public String getSquareName() {
        return squareName;
    }

    public void setSquareName(String squareName) {
        this.squareName = squareName;
    }

    public void printTriangle() {
        System.out.println("Triangle: " + triangleName);
    }

    public void printCircle() {
        System.out.println("Circle: " + circleName);
    }

    public void printSquare() {
        System.out.println("Square: " + squareName);
    }

    void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        circle triangle = new circle();

        triangle.hello();


        triangle.setTriangleName("Equilateral");
        triangle.setCircleName("Sphere");
        triangle.setSquareName("Rhombus");


        triangle.printTriangle();
        triangle.printCircle();
        triangle.printSquare();
    }
}
