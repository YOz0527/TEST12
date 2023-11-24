// Average.java
class Average {
    private int sum = 0;
    private int end;
    private double avg;

    public Average(int e) {
        end = e;
    }

    public double averg() {
        for (int i = 1; i <= end; i++) {
            sum += i;
        }
        avg = (double) sum / end;
        return avg;
    }
}

// Main.java
public class EX07 {
    public static void main(String[] args) {
        Average a1 = new Average(10);
        System.out.println("avg=" + a1.averg());
    }
}
