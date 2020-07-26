package Snake;

public class Koord
{
    public int x,y,z;
    public Koord(int x, int y, int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public  Koord clone()
    {
        return  new Koord(x,y,z);
    }
    public void step(Direction dir)
    {
        switch (dir)
        {
            case north:
                x++;
                break;
            case east:
                y++;
                break;
            case south:
                x--;
                break;
            case west:
                y--;
                break;
            case up:
                z++;
                break;
            default:
                z--;
        }
    }
}

