import java.util.*;
import java.util.Scanner;
public class runner {
    private int[][]grid=new int[5][5];
    private ArrayList<Integer>num = new ArrayList<Integer>();

    public runner(String player){
    }
    public int[][] grid(){
        for(int[] s: grid){
            System.out.println(Arrays.toString(s));
        }
        return grid;
    }
    public int randNum(){
        int num = (int)(Math.random()*10)+1;
        return num;
    }
    public int[][] fillGrid(){
        int num=0;
        int c =0;
        Scanner scan = new Scanner(System.in);
        while(c!=25) {
            grid();
            num = randNum();
            System.out.println("The num is: " + num);
            System.out.println("Which row do you want it in?: ");
            int row = scan.nextInt();
            System.out.println("Which column?: ");
            int column = scan.nextInt();
            grid[row][column] = num;
            c++;
        }

        return grid();
    }
    public int calculate(){
        //count row sum
        int sumRow =0;
        int sumColumn=0;
        for(int r =0;r< grid.length;r++){
            for(int c=0;c<grid[0].length-1;c++){
                if (grid[r][c] == grid[r][c+1])
                {
                    sumRow+= grid[r][c] + grid[r][c+1];
                    c++;
                }
                if (c != 0 && grid[r][c] == grid[r][c-1])
                {
                    sumRow+= grid[r][c];
                }


            }
        }
        //count column sum
        for(int c =0;c< grid[0].length;c++){
            for(int r=0;r<grid.length-1;r++){
                if (grid[r][c] == grid[r+1][c])
                {
                    sumColumn+= grid[r][c] + grid[r+1][c];
                    r++;
                }
                if (r != 0 && grid[r][c] == grid[r-1][c])
                {
                    sumColumn+= grid[r][c];
                }


            }
        }

        return sumRow+sumColumn;

    }

}
