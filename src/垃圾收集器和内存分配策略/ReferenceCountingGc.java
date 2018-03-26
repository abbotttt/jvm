package 垃圾收集器和内存分配策略;

/**
 * testCG() 方法执行后，objA和objB会不会被CG
 */
public class ReferenceCountingGc {
    public Object instance = null;
    private static final int _1MB =1024*1024;
    private byte[] bigSize =new byte[2*_1MB];

    public static void testGc(){
        ReferenceCountingGc objA = new ReferenceCountingGc();
        ReferenceCountingGc objB = new ReferenceCountingGc();
        objA.instance=objB;
        objB.instance=objA;
        objA = null;
        objB = null;
        System.gc();
    }

    public static void main(String[] args) {
        testGc();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
