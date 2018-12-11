package People;

public class Person
{
        String level;
        int xLoc, yLoc;




        public int getXLoc()
        {
            return xLoc;
        }

        public void setXLoc(int xLoc) {
            this.xLoc = xLoc;
        }

        public int getYLoc() {
            return yLoc;
        }

        public void setYLoc(int yLoc) {
            this.yLoc = yLoc;
        }

        public Person (String level, int xLoc, int yLoc)
        {
            this.level = level;
            this.xLoc = xLoc;
            this.yLoc = yLoc;
        }


    }

