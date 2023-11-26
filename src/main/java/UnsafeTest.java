import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class UnsafeTest {
    static long _10G = 1024 * 1024 * 1024 * 10L;

    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {
        Unsafe unsafe = getUnsafe();
        long l = unsafe.allocateMemory(_10G);
        unsafe.setMemory(l, _10G, (byte) 0);
        System.in.read();
        unsafe.putLong(l, 1024);
        System.out.println(unsafe.getLong(l));
        System.in.read();
        unsafe.freeMemory(l);
    }

    public static Unsafe getUnsafe() throws NoSuchFieldException, IllegalAccessException {
        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        return (Unsafe) theUnsafe.get(null);
    }
}
