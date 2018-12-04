public class PortalRoom extends Room
{

    public PortalRoom(int x, int y)
    {

        super(x,y);

    }

    @Override
    public PortalRoom extends Room
    public void enterRoom(Person x)
    {
        person=x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("YOU'VE PASSED THROUGH A PORTAL. IT SHOULD BE EASY NOW");

        x.setxLoc(PortalRoom.length());

    }


}
