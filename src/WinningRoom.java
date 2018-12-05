public class WinningRoom extends Room
{
    public WinningRoom(int x, int y)
    {

        super(x,y);

    }

    @Override

    public void enterRoom(Person x)
    {
        System.out.println("YOU'VE FOUND THE WINNING ROOM! NICE JOB!!!!!");

        person=x;
        x.setXLoc(this.xLoc);
        x.setYLoc(this.yLoc);



    }
    public void leaveRoom(Person x)
    {
        person = null;
    }

}
