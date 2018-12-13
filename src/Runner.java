    import People.Person;
    import Rooms.Room;
    import Rooms.WinningRoom;
    import Maps.Board;

    import java.util.Scanner;
    public class Runner {


        private static boolean gameOn = true;



        public static void main(String[] args)
        {
            Room[][] normal = new Room[5][5];

            //Fill the building with normal rooms
            for (int x = 0; x<normal.length; x++)
            {
                for (int y = 0; y < normal[x].length; y++)
                {
                    normal[x][y] = new Room(x,y);
                }
            }

            
            //Create a random WINNING room




                int i = (int) (Math.random() * normal.length);
                int z = (int) (Math.random() * normal.length);
                normal[i][z] = new WinningRoom(i, z);


            //Create a random LOSING room

            int j=(int)(Math.random()*normal.length);
            int k=(int)(Math.random()*normal.length);
            normal[j][k]= new WinningRoom(j,k);


            Board b = new Board(normal);
            //Setup beginner player and the input scanner
            Person player1 = new Person(1, 3, 0,0);
            normal[0][0].enterRoom(player1);
            Scanner in = new Scanner(System.in);
            b.print();
            while(gameOn)
            {
                System.out.println("Where would you like to move? (Choose W for up, S for down, D for right, or A for left)");
                String move = in.nextLine();
                if(validMove(move, player1, normal))
                {
                    System.out.println("Your coordinates: row = " + player1.getXLoc() + " col = " + player1.getYLoc());
                    


                }
                else {
                    System.out.println("YOU CAN'T DO THAT! Please pick another move.");
                }


            }
            in.close();
        }

        /**
         * Checks that the movement chosen is within the valid game map.
         * @param move the move chosen
         * @param p person moving
         * @param map the 2D array of rooms
         * @return
         */
        public static boolean validMove(String move, Person p, Room[][] map)
        {
            move = move.toLowerCase().trim();
            switch (move)
            {

                case "w":
                    if (p.getXLoc() > 0)
                    {
                        map[p.getXLoc()][p.getYLoc()].leaveRoom(p);
                        map[p.getXLoc()-1][p.getYLoc()].enterRoom(p);
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                case "d":
                    if (p.getYLoc()< map[p.getYLoc()].length -1)
                    {
                        map[p.getXLoc()][p.getYLoc()].leaveRoom(p);
                        map[p.getXLoc()][p.getYLoc() + 1].enterRoom(p);
                        return true;
                    }
                    else
                    {
                        return false;
                    }

                case "s":
                    if (p.getXLoc() < map.length - 1)
                    {
                        map[p.getXLoc()][p.getYLoc()].leaveRoom(p);
                        map[p.getXLoc()+1][p.getYLoc()].enterRoom(p);
                        return true;
                    }
                    else
                    {
                        return false;
                    }

                case "a":
                    if (p.getYLoc() > 0)
                    {
                        map[p.getXLoc()][p.getYLoc()].leaveRoom(p);
                        map[p.getXLoc()][p.getYLoc()-1].enterRoom(p);
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                default:
                    break;

            }
            return true;
        }
        public static void gameOff()
        {
            gameOn = false;
        }




    }

