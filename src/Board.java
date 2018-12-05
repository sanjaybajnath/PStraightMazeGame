public class Board
{

    private Room[][]map;

    public Board(Room[][]Maze)
    {
        this.map=Maze;
    }

    public void print()
    {
        String row="";
        for(int x=0; x<map.length; x++)
        {
            row="";
            for(int y=0; y<map.length; y++)
            {
                row=row+map[x][y].toString();
            }
            System.out.println(row);
        }
    }







}
