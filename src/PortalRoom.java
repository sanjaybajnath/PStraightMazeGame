public class PortalRoom extends Room
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
