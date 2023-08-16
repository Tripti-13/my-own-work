class RatAndMaze
        {



private static int[][] Rat = {
        {0,1,0,1,1},
        {0,0,0,0,0},
        {1,0,1,0,1},
        {0,0,1,0,0},
        {1,0,0,1,0}
        };


private static int[][] solution = new int[5][5];

//function to print the solution matrix
private static void printSolution()
        {
        for(int i=0;i<5;i++)
        {
        for(int j=0;j<5;j++)
        {
        System.out.print(solution[i][j]+"\t");
        }
        System.out.print("\n\n");
        }
        }


private static boolean solveRat(int x, int y)
        {

        if((x==4) && (y==4))
        {
        solution[x][y] = 1;
        return true;
        }

        if(x>=0 && y>=0 && x<5 && y<5 && solution[x][y] == 0 && Rat[x][y] == 0)
        {
        //safe
        solution[x][y] = 1;
        //going down
        if(solveRat(x+1, y))
        return true;
        //going right
        if(solveRat(x, y+1))
        return true;

        if(solveRat(x-1, y))
        return true;

        if(solveRat(x, y-1))
            return true;

            solution[x][y] = 0;
            return false;
        }
            return false;

        }

            public static void main(String[] args)
            {
                if (solveRat(0,0))
                    printSolution();
                else
                    System.out.println("No solution here");
            }
        }
