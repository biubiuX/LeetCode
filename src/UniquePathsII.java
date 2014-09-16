
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowLength = obstacleGrid[0].length;
        int[] path = new int[rowLength];
        if(obstacleGrid[0][0]==1){
            path[0]=0;
        }else{
            path[0]=1;   
        }
        for(int i=1;i<rowLength;i++){
            if(obstacleGrid[0][i]==1){
                path[i] = 0;
            }else{
                path[i]=path[i-1];
            }
        }
        
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=0;j<rowLength;j++){
                if(obstacleGrid[i][j]==1){
                    path[j]=0;
                }else{
                    if(j!=0){
                        path[j] = path[j]+path[j-1];    
                    }
                }
            }
        }
        return path[obstacleGrid[0].length-1];
    }
}
