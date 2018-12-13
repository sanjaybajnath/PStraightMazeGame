package Rooms;

import People.Person;

public class Room
{
    Person person;
    int xLoc,yLoc;

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }


    /**
     * Method controls the results when a person enters this room.
     * @param x the People.Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You enter a plain old room");
        person = x;
        x.setXLoc(this.xLoc);
        x.setYLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        person = null;
    }
    public String toString(){
        return("[ ]");
    }

}