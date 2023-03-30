package java_study.concurrenthashmap;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrentHashmapTest1 {

    @Test
    void givenHashMap_whenSumParallel_thenError() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> sumList = parallelSum100(map, 100);

        assertNotEquals(1, sumList.stream().distinct().count());
        long wrongResultCount = sumList.stream().filter(num -> num != 100)
                .count();
        assertTrue(wrongResultCount > 0);
    }

    @Test
    void givenConcurrentHashMap_whenSumParallel_thenError() throws Exception {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        List<Integer> sumList = parallelSum100(map, 100);

        assertEquals(1, sumList.stream().distinct().count()); // 1

        long wrongResultCount = sumList
                .stream()
                .filter(num -> num != 100)
                .count();

        assertEquals(0, wrongResultCount);  //
    }


    private List<Integer> parallelSum100(Map<String, Integer> map, int executionTimes) throws InterruptedException {
        List<Integer> sumList = new ArrayList<>(100);
        for (int i = 0; i < executionTimes; i++) {
            map.put("test", 0);
            ExecutorService executorService = Executors.newFixedThreadPool(4);
            for (int j = 0; j < 10; j++) {
                executorService.execute(() -> {
                    for (int k = 0; k < 10; k++) {
                        map.computeIfPresent("test", (key, value) -> value + 1);
                    }
                });
            }
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
            sumList.add(map.get("test"));
        }
        return sumList;
    }

    @Test
    void givenMaps_whenGetPut500KTimes_thenConcurrentMapFaster() throws Exception {
        Map<String, Object> hashtable = new Hashtable<>();
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
        Map<String, Object> concurrentHashMap = new ConcurrentHashMap<>();

        long hashtableAvgRuntime = timeElapseForGetPut(hashtable);
        long syncHashMapAvgRuntime = timeElapseForGetPut(synchronizedMap);
        long concurrentHashMapAvgRuntime = timeElapseForGetPut(concurrentHashMap);

        assertTrue(hashtableAvgRuntime > concurrentHashMapAvgRuntime);
        assertTrue(syncHashMapAvgRuntime > concurrentHashMapAvgRuntime);

    }

    private long timeElapseForGetPut(Map<String, Object> map) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        long startTime = System.nanoTime();

        for (int i = 0; i < 4; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 500_000; j++) {
                    int value = ThreadLocalRandom.current().nextInt(10000);
                    String key = String.valueOf(value);
                    map.put(key, value);
                    map.get(key);
                }
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        return (System.nanoTime() - startTime) / 500_000;
    }

}