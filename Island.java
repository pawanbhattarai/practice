import java.util.*;
public class Island {
   
        public static void DFShelp(char[][] grid, int i, int j){
            int n=grid.length;
            int m=grid[0].length;
            if(i>=0&&j>=0&&i<n&&j<m&&grid[i][j]=='1'){
    
    
            grid[i][j]='0';
            DFShelp(grid,i+1,j);
            DFShelp(grid,i-1,j);
            DFShelp(grid,i,j+1);
            DFShelp(grid,i,j-1);
        }
        }
        public static int numislands(char[][] grid) {
    
            int n=grid.length;
            int m=grid[0].length;
            int ans=0;
    
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]=='1'){
                    DFShelp(grid,i,j);
                    ans++;
                    }
                }
            }
            
            return ans;
        }
       
    

    public static void main(String[] args) {
        char grid[][]={
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

  System.out.println(numislands(grid));
    }
    
}
