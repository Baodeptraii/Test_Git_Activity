import static java.util.Arrays.sort;

public class Matrix {
    private int[][] matrix;
    private int m,n,k;

    public Matrix(int[][] matrix, int n,int m,int k) {
        this.matrix = matrix;
        this.k = k;
        this.m = m;
        this.n = n;
    }

    public void sapXepTheoCot() {
        int[] tmp = new int[n];
        for(int i = 0; i < n; i++){
            tmp[i] = matrix[i][k];
        }
        sort(tmp);
        for(int i = 0; i < n; i++){
            matrix[i][k] = tmp[i];
        }
    }
    public void inMatrix(){
        sapXepTheoCot();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
