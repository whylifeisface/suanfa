package project.untit;

public class s {
        public static void sIn(int n){
            if (n >= 0){
                sIn(n-1);
                System.out.println(n-1);
                System.out.println("A");
            }

        }
    public static void main(String[] args) {
        sIn(2);

    }
}
