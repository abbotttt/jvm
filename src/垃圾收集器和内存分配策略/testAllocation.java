package 垃圾收集器和内存分配策略;

/**
 * Created by Administrator on 2018/3/24.
 */
public class testAllocation {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] alloction1, alloction2, alloction3, alloction4;
        alloction1 = new byte[2 * _1MB];
        alloction2 = new byte[2 * _1MB];
        alloction3 = new byte[2 * _1MB];
        alloction4 = new byte[4 * _1MB];
    }
}
