import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/31
 */
public class TestOne {

    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();

        /**
         * 1. 故障出现
         *      java.util.ConcurrentModificationException
         *
         * 2. 导致原因
         *      并发争抢修改导致
         *
         * 3. 解决方案：
         *      List<String> list = new Vector<>();
         *      List<String> list = Collections.synchronizedList(new ArrayList<>());
         *      List<String> list = new CopyOnWriteArrayList<>();
         */
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }).start();
        }
    }

}
