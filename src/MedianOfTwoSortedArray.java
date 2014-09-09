
public class MedianOfTwoSortedArray {
	public double findMedianSortedArrays(int A[], int B[]) {
        int len = A.length + B.length;
        int t = 0;
        if(len%2 == 0){
            t = len/2;
        }else{
            t = len/2 + 1;
        }
        int i = 0, j = 0;
        double res = 0;
        for (int s = 0; s < t; s++){
            if(i==A.length){
                res = B[j];
                j++;
            }else if(j == B.length){
                res = A[i];
                i++;
            }else if(A[i]<=B[j]){
                res = A[i];
                i++;
            }else{
                res = B[j];
                j++;
            }
        }
        if(len%2==0){
            if(i==A.length){
                res = (res + B[j])/2;
            }else if(j == B.length){
                res = (A[i]+res)/2;
            }else if(A[i]<=B[j]){
                res = (A[i]+res)/2;
            }else{
                res = (B[j]+res)/2;
            }
        }
        return res;
    }
}
