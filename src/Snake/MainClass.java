package Snake;

public class MainClass
{
    public static void main(String[] args)
    {
        Cube cube = new Cube();
        cube.printCube();
        cube.addSegment(2,Direction.north,1);
        cube.printCube();
    }
}
