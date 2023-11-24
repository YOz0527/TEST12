// Ex12_12.java
class Factor {
    public int fac(int n) {
        if (n >= 1)
            return n * fac(n - 1);
        else
            return 1;
    }
}

class Sum {
    private int sum = 0;

    public int add(int n) {
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
}

public class EX12 {
    public static void main(String[] args) {
        Factor f = new Factor();
        System.out.println("factor(5)=" + f.fac(5));

        Sum s = new Sum();
        System.out.println("Sum(10)=" + s.add(10));
    }
}
