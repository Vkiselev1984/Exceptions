import java.util.Arrays;

public class DivArrays {
    public int[] divArrays(int[] a, int[] b){
        if (a.length != b.length) {
            return new int[]{0};
        }

        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                throw new RuntimeException("Деление на ноль");
            }
            c[i] = a[i] / b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 4};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }     

        DivArrays ans = new DivArrays(); 
        String itresume_res = Arrays.toString(ans.divArrays(a, b));     
        System.out.println(itresume_res);
    }
}