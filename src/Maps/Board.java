package Maps;

import Rooms.Room;

public class Board

{

    private Room[][]map;

    public Board(Room[][]Maze)
    {
        this.map=Maze;
    }

    public void print(int x,int y)
    {
        map=new Room[x][y];
        for(int i=0; i<map.length; i++)
        {

        }
    }
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
    //setup half-way through maze to equal position of half the number of rows, half the number of columns







}
