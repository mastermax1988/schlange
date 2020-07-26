package Snake;

public enum Direction
{
    north, east, south, west, up, down;

    public Direction[] getPossibleDirections(Direction d)
    {
        switch (d)
        {
            case north:
            case south:
                return new Direction[]{east, west, up, down};
            case east:
            case west:
                return new Direction[]{north, south, up, down};
            default: //up or down;
                return new Direction[]{north, east, south, west};
        }
    }
}