package Snake;

public class Cube
{
    int[][][] cubeOccupied = new int[3][3][3];
    Coordinates currentCoordinates;
    Direction currentDirection;

    public Cube()
    {
        currentCoordinates = new Coordinates(0,0,0);
    }
    public boolean addSegment(int length, Direction dir, int index)
    {
        currentDirection = dir;
        Coordinates oldStartCoordinates = currentCoordinates.clone();
        int[][][] oldCube = cubeOccupied.clone();
        for(int i=0;i<length;i++)
        {
            currentCoordinates.step(dir);
            if(!coordinatesInBounds(currentCoordinates) || coordinatesOccupied(currentCoordinates))
            {
                currentCoordinates = oldStartCoordinates;
                cubeOccupied = oldCube;
                return false;
            }
            cubeOccupied[currentCoordinates.x][currentCoordinates.y][currentCoordinates.z]=index;
        }
        return  true;
    }
    private boolean coordinatesInBounds(Coordinates k)
    {
        return k.x >= 0 && k.x <= 2 && k.y >= 0 && k.y <= 2 && k.z >= 0 && k.z <= 2;
    }
    private  boolean coordinatesOccupied(Coordinates k)
    {
        return cubeOccupied[k.x][k.y][k.z]>0;
    }
    public void printCube()
    {
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++)
                System.out.println(cubeOccupied[i][j][0] + "\t" + cubeOccupied[i][j][1] + "\t" + cubeOccupied[i][j][2]);
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
