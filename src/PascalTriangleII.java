
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        for(int i=0;i<rowIndex+2;i++){
            res.add(0);
        }
        res.set(1,1);
        for(int i=0;i < rowIndex;i++){
            for(int j = rowIndex+1;j>0;j--){
                res.set(j,res.get(j-1)+res.get(j));
            }
        }
        res.removeFirst();
        return res;
    }
}
