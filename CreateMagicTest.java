public class CreateMagicTest {


        public static int[][] init_mas(int n) {

            int[][] mas = new int[n][n];

            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    mas[i][j] = (int) (Math.random() * 10);

            return mas;
        }

        public static void main(String[] args) {

            int[][] mas = init_mas(4);
            CreateMagic magic = new CreateMagic(mas);

            magic.show_mas();

            IsMagic isMagic = new IsMagic(mas);
            boolean flag = isMagic.magic_square();

            if (flag)
                System.out.println("Магический квадрат!");
            else
                System.out.println("Не магический квадрат!");
        }

    }
