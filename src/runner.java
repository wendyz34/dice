import java.util.Arrays;
import java.util.Scanner;
public class runner {
    private int[][]grid;

    public runner(String player){
    }
    public void grid(){
        grid = new int[5][5];
        for(int[] s: grid){
            System.out.println(Arrays.toString(s));
        }

    }
    public int randNum(){
        int num = (int)(Math.random()*10)+1;
        return num;
    }
    public int fillGrid(){
        int num=0;
            Scanner scan = new Scanner(System.in);
            System.out.println(grid);
            num = randNum();
            System.out.println("The num is: " + num);
            System.out.println("Which row do you want it in?: ");
            int row = scan.nextInt();
            System.out.println("Which column?: ");
            int column = scan.nextInt();
            grid[row][column] = num;

        return num;
    }
    public int calculate(){

    }

}
