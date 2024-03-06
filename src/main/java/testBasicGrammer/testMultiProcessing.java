package testBasicGrammer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class testMultiProcessing {

    public static void main(String[] args) {

            ExecutorService executorService = Executors.newFixedThreadPool(3); // 创建大小为5的线程池
            AtomicInteger value = new AtomicInteger();

            for (int i = 0; i < 9; i++) { // 执行100次任务
                int finalI1 = i;
                executorService.execute(() -> { // 使用execute方法提交任务
//                System.out.println(String.valueOf(finalI) + " hello world"); // 打印hello world

                        if (finalI1 == 2) {
                            return;
                        }
                        System.out.println("start sleep: " + finalI1);
                        value.addAndGet(1);
                        System.out.println("end sleep: " + finalI1);


                });
            }
            executorService.shutdownNow();
            System.out.println("out of for loop");
//        System.out.println("out of for loop");
//        while(!executorService.isTerminated()){} // 等待所有任务执行完毕
//        System.out.println("value的值为：" + value); // 打印i的值

        System.out.println("hahah");
    }
    }

