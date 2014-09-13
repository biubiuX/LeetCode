
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(target<matrix[0][0]){
            return false;
        }
        
        
        if(target>=matrix[matrix.length-1][0]){
            for(int j=0; j < matrix[0].length;j++){
                if(target==matrix[matrix.length-1][j]){
                    return true;
                }
            }
        }
        for(int i = 0; i < matrix.length-1;i++){
            if(target<matrix[i+1][0]&&target>=matrix[i][0]){
                for(int j = 0; j < matrix[0].length;j++){
                    if(target==matrix[i][j]){
                        return true;
                    }
                }
            }
            
        }
         return false;      
    }
}
