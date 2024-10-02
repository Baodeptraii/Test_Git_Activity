import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("MATRIX.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] matrix = new int[n][m];
            for(int i =0 ;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            Matrix mat = new Matrix(matrix,n,m,k-1);
            mat.inMatrix();
        }


    }
}