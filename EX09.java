// MyMath.java
abstract class MyMath {
    public abstract int add(int a, int b);
    public abstract int sub(int a, int b);
    public abstract int mul(int a, int b);
    public abstract int div(int a, int b);
}

// Compute.java
public class EX09 extends MyMath {
    private int ans; // ans 改回 int

    public void show() {
        System.out.println("ans=" + ans);
    }

    @Override
    public int add(int a, int b) {
        ans = a + b;
        return ans;
    }

    @Override
    public int sub(int a, int b) {
        ans = a - b;
        return ans;
    }

    @Override
    public int mul(int a, int b) {
        ans = a * b;
        return ans;
    }

    @Override
    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        ans = a / b;
        return ans;
    }

    public static void main(String[] args) {
        EX09 cmp = new EX09();
        cmp.mul(3, 5); // 計算 3*5
        cmp.show();    // 此行會回應 "ans=15" 字串
    }
}
