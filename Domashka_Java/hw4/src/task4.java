public class task4{
    public static void main(String[] args){
        int[][] a = {{1, 3, -7, 2}, {8, 2, 21, 5}, {4, 5, 3, 83}};
 
        for (int i = 0; i < a.length; i++){
            System.out.println(" ");
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j]+"  ");
            }
        }
    }
}