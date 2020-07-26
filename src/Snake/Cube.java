package Snake;

public class Cube
{
    boolean[][][] cubeOccupied = new boolean[3][3][3];
    Koord currentKoord;
    Direction currentDirection;

    public Cube()
    {
        currentKoord = new Koord(0,0,0);
    }
    public boolean addSegment(int length, Direction dir)
    {
        currentDirection = dir;
        Koord oldCoord = currentKoord.clone();
        boolean[][][] oldCube = cubeOccupied.clone();
        for(int i=0;i<length;i++)
        {
            currentKoord.step(dir);
            if(!koordInBounds(currentKoord) || koordOccupied(currentKoord))
            {
                currentKoord = oldCoord;
                cubeOccupied = oldCube;
                return false;
            }
            cubeOccupied[currentKoord.x][currentKoord.y][currentKoord.z]=true;
        }
        return  true;
    }
    private boolean koordInBounds(Koord k)
    {
        return k.x >= 0 && k.x <= 2 && k.y >= 0 && k.y <= 2 && k.z >= 0 && k.z <= 2;
    }
    private  boolean koordOccupied(Koord k)
    {
        return !cubeOccupied[k.x][k.y][k.z];
    }
}
