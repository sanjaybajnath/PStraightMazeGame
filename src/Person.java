public class Person
{
        String firstName;
        String familyName;
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

        public Person (String firstName, String familyName, int xLoc, int yLoc)
        {
            this.firstName = firstName;
            this.familyName = familyName;
            this.xLoc = xLoc;
            this.yLoc = yLoc;
        }


    }

