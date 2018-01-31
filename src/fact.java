public class fact {

    public static int z = 1;

    public static int fc(int n){

        if(n!=0){
            z = z * n;
            n--;
            fc(n);
        }

        return z;
    }

    public static void main(String[] args) {
        int n = 5;
        n = fc(n);
        System.out.print(n);
    }
}
