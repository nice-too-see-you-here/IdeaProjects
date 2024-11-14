public class Main {
    public static void main(String[] args) {
        int[] matrix =new int [10];
        int[][] matrix2 = new int[4][4];;
        int sum = 0;
        int max2 = 0;
        String str = "";
        String matdisp = "";
        for (int i = 0; i < 10; i++) {
            matrix[i] = (int) (Math.random()*99+1);
            sum += matrix[i];
            matdisp += matrix[i] + " ";
        }
        System.out.println(matdisp);
        System.out.println(sum);
        for (int i = 0; i < 4; i++){
            int max = 0;
            for (int c = 0; c < 4; c++){
                matrix2[i][c] = (int) (Math.random()*99+1);
                str += matrix2[i][c] + " ";
                int current = matrix2[i][c];
                if (max < current) {
                    max = current;
                } else {
                }

                }
            System.out.println(str);
            str = "";
            if (max2 < max) {max2 = max;}
            }
        System.out.println("Наибольшее число рандомной мартицы 4х4 - " + max2);
        }


}