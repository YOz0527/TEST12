// CombinedFile.java
class MyWindow {
    private int width;
    private int height;
    private String name;

    public MyWindow(int w, int h, String s) {
        width = w;
        height = h;
        name = s;
    }

    public void show() {
        System.out.println("Name=" + name);
        System.out.println("W=" + width + ", H=" + height);
    }
}

public class EX03 {
    public static void main(String[] args) {
        MyWindow w1 = new MyWindow(3, 5, "Big windows");
        w1.show();
    }
}
