import java.util.Arrays;

class SubArrays {
    public int[] subArrays(int[] a, int[] b){
        if (a.length != b.length) {
            return new int[]{0};
        }

        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }     

        SubArrays subArrays = new SubArrays(); 
        String result = Arrays.toString(subArrays.subArrays(a, b));     
        System.out.println(result);
    }
}