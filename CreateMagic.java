import java.util.Arrays;

class CreateMagic {


    private int[][] mas;

    public CreateMagic(int[][] _mas) {

        mas = _mas;
        show_mas();
        create();
    }

    public void create() {

        for (int i = 0, j = mas.length - 1; i <= (mas.length / 2) - 1; ++i, --j) {

            int temp = mas[i][i];
            mas[i][i] = mas[j][j];
            mas[j][j] = temp;

        }

        for (int i = 0, j = mas.length - 1 - i; i <= (mas.length / 2) - 1; ++i, --j) {

            int temp = mas[i][j];
            mas[i][j] = mas[j][i];
            mas[j][i] = temp;

        }
    }

    public void show_mas() {

        for (int[] _mas : mas) {
            for (int value : _mas) {

                System.out.printf("%-3d", value);
            }
            System.out.println();
        }
        System.out.println();
    }
}

class IsMagic {

    private int f_sum;
    private int[][] mas;

    public IsMagic(int[][] mas) {

        this.mas = mas;
        f_sum = sum(Arrays.copyOf(mas[0], mas[0].length));
    }

    //метод определяющий является ли заданная матрица магическим квадратом
    public boolean magic_square() {

        if (comparing_strings())
            return false;

        if (comparison_of_columns())
            return false;

        if (diagonal_matrices())
            return false;

        return true;
    }

    //метод сравнивающий суммы элементов каждой строки матрицы
    public boolean comparing_strings() {

        for (int[] temp : mas) {

            int value = sum(temp);

            if (f_sum != value) {
                return true;
            }
        }

        return false;
    }

    //метод сравнивающий суммы элементов каждого столбца матрицы
    public boolean comparison_of_columns() {

        for (int i = 0; i < mas.length; ++i) {

            int[] temp = new int[mas[i].length];
            for (int j = 0; j < mas[i].length; ++j) {

                temp[j] = (int) mas[j][i];
            }

            int value = sum(temp);

            if (f_sum != value) {
                return true;
            }

            temp = null;
        }

        return false;
    }

    //метод сравнивающий суммы элементов главной и побочной диагоналей матрицы
    public boolean diagonal_matrices() {

        int[] temp = new int[mas.length];
        for (int i = 0; i < mas.length; ++i)
            temp[i] = (int) mas[i][i];

        int value = sum(temp);

        if (f_sum != value) {
            return true;
        }

        temp = new int[mas.length];

        for (int i = 0, j = mas.length - 1; i < mas.length; ++i, --j)
            temp[i] = (int) mas[i][j];

        value = sum(temp);

        if (f_sum != value) {
            return true;
        }

        return false;
    }

    //метод суммирования элементов переданного массива
    public int sum(int... numbers) {

        if (numbers == null) {
            return 0;
        }

        int result = 0;
        for (int number : numbers) {

            result += number;
        }

        return result;
    }
}



