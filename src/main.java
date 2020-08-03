import java.util.Arrays;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
/*
        String[][][][] arr1=new String[2][2][2][2];
*/
        //Массив с разным количеством столбцов
        int [] arr3 = new int[5];

        int [][] arr2 = new int[5][];
        //инициализируем массив, заполняя его массивами разной длины
        arr2[0] = new int[]{1, 2, 3, 4, 5};
        arr2[1] = new int[]{1,2,3,4};
        arr2[2] = new int[]{1,2,3};
        arr2[3] = new int[]{1,2};
        arr2[4] = new int[]{1};

        //Сумма эллементов в одномерном массиве
        //int total = IntStream.of(arr2).sum();
        //System.out.println(Arrays.stream(arr3).sum());

        String[][] arr=new String[][]{
                {"1","2","3","4"},
                {"5","6","7c","8"},
                {"9","10","11","12"},
                {"13","14","15","16"}
        };

        System.out.println("Количество строк: "+arr.length);
        System.out.println("Количество столбцов: "+arr[0].length);
        System.out.println("Матрица:"+Arrays.deepToString(arr));

        try {
            System.out.println("Сумма эллементов матрицы:" + array_sum(arr));
        }catch (RuntimeException exc1){
            System.out.println("Ignore");
        }

    }

    static int array_sum(String[][] arr){
        int sum=0;

        if (4!=arr.length){
            throw new MyArraSizeException("Не верный размер двумерного массива");
        }
        System.out.println("Start");
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
            {
                if (4!=arr[i].length) {
                    throw new MyArraSizeException("Не верный размер двумерного массива");
                }
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException exc1) {
                        throw new MyArrayDataException("Ошибка приведения типов", i, j, arr[i][j]);
                    }
                    //sum+=Integer.valueOf(arr[i][j]);
            }
        return sum;
    }

}
