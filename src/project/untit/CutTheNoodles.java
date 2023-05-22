package project.untit;

//一根高筋拉面，中间切一刀，可以得到2根面条。
//
//如果先对折1次，中间切一刀，可以得到3根面条。
//
//如果连续对折2次，中间切一刀，可以得到5根面条。 那么，连续对折10次，中间切一刀，会得到多少面条呢？
public class CutTheNoodles {
    public int cutTheNoodle(int n) {
        if (n == 1) {
            return 3;
        }
        return cutTheNoodle(n - 1) + (int) Math.pow(2, n - 1);
    }
    // n = n-1 + 2^n-1

    public static void main(String[] args) {
        CutTheNoodles cutTheNoodles = new CutTheNoodles();
        int i = cutTheNoodles.cutTheNoodle(20);
        System.out.println(i);
    }
}
