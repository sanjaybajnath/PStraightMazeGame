package Rooms;

import People.Person;

public class PortalRoom extends Room

    /**
     *This class will create a random room that transports the player halfway through the maze
     *It can be a shortcut or a setback, depending on the positions of the room and the person*/
{

    public PortalRoom(int x, int y)
    {

        super(x,y);

    }

    @Override

    public void enterRoom(Person x) {
        System.out.println("YOU'VE FOUND THE PORTAL! COMPLETE THIS MAZE TO CONTINUE");
        person = x;
        x.setXLoc(this.xLoc);
        x.setYLoc(this.yLoc);
    }


        public void leaveRoom(Person x)
        {
            person = null;
        }




}
