package datastructure;

/**
 * 手写递归实现5的阶乘
 * author:https://github.com/honglei92
 * time:2018/7/13
 */
public class DiguiTest {
    public static void main(String[] args) {
        int result = digui(5);
        System.out.println(result);
    }

    private static int digui(int i) {
        if (i > 1) {
            return i * digui(i - 1);
        } else {
            return 1;
        }
    }
}
