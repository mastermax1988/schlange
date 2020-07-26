package Snake;

public class Snake
{
    private final int[] segmente=new int[]{2,2,1,2,1,2,1,1,2,2,1,1,1,2,2,2,2};
    public  int getSegment(int i)
    {
        return segmente[i];
    }
    public int getAnzahlSegmente()
    {
        return segmente.length;
    }
}
