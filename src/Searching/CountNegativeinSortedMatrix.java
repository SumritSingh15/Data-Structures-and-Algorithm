package Searching;

public class CountNegativeinSortedMatrix {
    public static void main(String[] args) {
        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int count = 0;
        int ans = negativenumber(grid,count);
        System.out.println(ans);

    }
    public static int negativenumber(int [][] grid,int count){
        int row =0;
        int col = grid[0].length-1;
        while(row<grid.length && col>=0){
            if(grid[row][col] < 0){
                count +=grid.length- row;
                col--;
            }else{
                row++;
            }
        }
        return count;
    }
}
