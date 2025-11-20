package datastuctures.array;

public class MutliDimensionArray {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{3,4,5},{5,6,7}};
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        System.out.println("length of row in matrix ");
        System.out.println(rowLength);
        System.out.println("length of columns in matrix");
        System.out.println(colLength);


        // print all
        System.out.println("print in matrix form");
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        // print only rows
        System.out.println("Print Columns");
        for(int i=0;i<colLength;i++){
             System.out.print(matrix[0][i] + " ");
             System.out.print(matrix[1][i] + " ");
             System.out.print(matrix[2][i] + " ");
            System.out.println(" ");
        }

        // print columns
        System.out.println("Print rows");
        for(int j=0;j<colLength;j++){
            System.out.print(matrix[j][0] + " ");
            System.out.print(matrix[j][1] + " ");
            System.out.print(matrix[j][2] + " ");
            System.out.println(" ");
        }

        // print only diagonal (primary and secondary diagonal) // 1,4,7 and 3,4,5


        // transpose row into columns
        // Row → Column
        //Column → Row

        // identity matrix primary diagonal one only

        // zigzag
        System.out.println("Zigzag pattern");
        for(int i=0 ;i<rowLength;i++){
                if(i%2==0){
                    for(int j=0;j<colLength;j++){
                        System.out.print(matrix[i][j] +" ");
                    }
                    System.out.println(" ");
                }
                else{
                    for(int col=colLength-1;col>=0;col--){
                        System.out.print(matrix[i][col]+ " ");
                    }
                    System.out.println(" ");
                }
        }

        // sprial four pointers top,bottom, left,right
        System.out.println("Spiral array");
        //1st way
        int[][] matrixs =new int[2][2];
        matrixs[0][0]=1;
        matrixs[0][1]=2;
        matrixs[1][0]=3;
        matrixs[1][1]=4;

        sumOfPrimaryDiagonal(matrixs);
        trasposeMatrix(matrixs);

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
