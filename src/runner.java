import java.util.*;
import java.util.Scanner;
public class runner {
    private int[][]grid=new int[2][2];
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
            while(c!=4) {
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
        //count row num
        int sumRow =0;
        int sumColumn=0;
        int count =0;
        for(int r =0;r< grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                num.add(grid[r][c]);
               // System.out.println(Arrays.toString(num));
               /* for(int s=0;s<num.size();s++){
                    if(num.get(s)==num.get(s+1)) count++;
                    if(count==1){
                        num.remove(num.get(s));
                        s--;
                    }*/
                for (int i = 0; i < num.size(); i++) {
                    for (int j = 0; j <num.size(); j++) {
                        if (num.get(i) == num.get(j)) sumRow+=num.get(i);

                    }
                   /* for(int x:num){
                        sumRow+=x;
                    }*/
                    num.clear();
                }

            }
        }
        //count column sum
       /* for(int c =0;c< grid[0].length;c++){
            for(int r=0;r<grid.length;r++){
                num.add(grid[r][c]);
                System.out.println(num);
                for(int s=0;s<num.size();s++){
                    if(num.contains(num.get(s))) count++;
                    if(count==1){
                        num.remove(num.get(s));
                        s--;
                    }
                    for(int x:num){
                        sumRow+=x;
                    }
                }

            }
            num.clear();
        }*/
        return sumRow+sumColumn;

    }

}
