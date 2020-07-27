package Snake;

public class Snake
{
    private static final int[] segmente=new int[]{2,2,1,2,1,2,1,1,2,2,1,1,1,2,2,2,2};

    public static int getSegment(int i)
    {
        return segmente[i];
    }
    public static int getSegmentCount()
    {
        return segmente.length;
    }
}
