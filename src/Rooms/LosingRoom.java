package Rooms;

import People.Person;

public class LosingRoom extends Room

        /**
         *This class will create a random room that transports the player halfway through the maze
         *It can be a shortcut or a setback, depending on the positions of the room and the person*/
{

    public LosingRoom(int x, int y) {

        super(x, y);

    }

    @Override

    public void enterRoom(Person x)
    {
        if(x.health == 0) {
            System.out.println("YOU'VE DIED. SO SAD");
            person = x;
            x.setXLoc(this.xLoc);
            x.setYLoc(this.yLoc);

        }
        else
        {
            System.out.println("NICE TRY! YOU HAVE " + x.health + " LIVES LEFT");
            person=x;
            x.setXLoc(0);
            x.setYLoc(0);
        }
    }


    public void leaveRoom(Person x) {
        person = null;
    }

    public String toString() {
        return ("[L]");
    }
}