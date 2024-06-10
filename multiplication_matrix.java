public class multiplication_matrix {

    public static void printM(int m[][]) {
        for (int r[] : m) {
          for(int e : r) {
            System.out.print(e + "  ");
          }
          System.out.println();
        }
    }




    public static int[][] matrixMul(int[][]m1 , int[][]m2) {
        int m3 [][] = new int[m1.length][m2[0].length];
        int sum =0;
        //check m1 col == m2 row
        if(m1[0].length == m2.length) {

            for(int i=0; i<m1.length; i++) { //m1 row

                for(int k=0; k<m2[0].length; k++) {  //m2 col

                    for(int j=0; j<m1[0].length; j++) {//m1 col, m2 row

                       sum+= m1[i][j] * m2[j][k];
                    }
                    m3[i][k] = sum;    //m3 row = i ; m3 col = k ;
                    sum=0;
                 }
            }
        } else return null;

        return m3;
    }



    
    public static void main(String[] args) {
        int m1 [][] = {{1,2,3},{4,5,6}};
        int m2 [][] = {{10,11},{20,21},{30,31}};

        int m3[][] = matrixMul(m1, m2);

        printM(m3);

        
    }
}
