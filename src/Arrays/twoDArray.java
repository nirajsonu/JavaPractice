package Arrays;

public class twoDArray {
    public static void main(String[] args) {
        //1st way
        int[][] matrixs =new int[2][2];
        matrixs[0][0]=1;
        matrixs[0][1]=2;
        matrixs[1][0]=3;
        matrixs[1][1]=4;
        System.out.println("---------Before Transpose----");
       for(int i=0;i<matrixs.length;i++){
          for(int j=0;j<matrixs[i].length;j++){
              System.out.print(matrixs[i][j]+"  ");
          }
          System.out.println("");
      }

        //2nd way
        int[][] matrix={{1,2},{3,4},{5,6}};
      for(int[] col :matrix){
          for(int row:col){
        //      System.out.println(row+" ");
          }
        //  System.out.println("");
      }

        sumOfPrimaryDiagonal(matrixs);
        sumOfSecondaryDailgonal(matrixs);
        sumOfMatrix(matrixs);
        trasposeMatrix(matrixs);
        rotateMatrix(matrixs);
        multiplicationOfMatrix(matrixs);
    }

    private static void multiplicationOfMatrix(int[][] matrixs) {
    }

    private static void rotateMatrix(int[][] matrixs) {

    }

    private static void trasposeMatrix(int[][] matrixs) {
        System.out.println("-------After Transpose--------");
        for(int i=0;i<matrixs.length;i++){
            for(int j=0;j<matrixs[0].length;j++){
                matrixs[j][i]=matrixs[i][j];
                System.out.print(matrixs[j][i]+"  ");
            }
            System.out.println("");
        }
    }

    private static void sumOfMatrix(int[][] matrixs) {
    }

    private static void sumOfSecondaryDailgonal(int[][] matrixs) {
    }

    private static void sumOfPrimaryDiagonal(int[][] matrixs) {
        int sum=0;
        for(int i=0;i<matrixs.length;i++){
            for(int j=0;j<matrixs[i].length;j++){
                if(matrixs[i]==matrixs[j]){
                    sum=sum+matrixs[i][i];
                }
            }
        }
       // System.out.println(sum);
    }


}
