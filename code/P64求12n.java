public class P64求12n {
    public static void main(String[] args) {

    }
    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
