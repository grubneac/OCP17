/*
 * create method allowRequest(String userId) that return false for each userId
 * if call it more than 5 times during last 10 second
 * */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PayforgeQuestion {

    private static final int MAX_LIMIT_COUNTER = 5;
    public static final int TIME_LIMIT = 10;

    private final Map<String, Deque<Long>> userRateLimiter = new ConcurrentHashMap<>();

    public boolean allowRequest(String userId) {
        Long currentSeconds = System.currentTimeMillis() / 1000;

        Deque<Long> longDeque = userRateLimiter.computeIfAbsent(userId, k -> new LinkedList<>());

        // Block to other threads
        synchronized (longDeque) {
            cleanDeque(longDeque, currentSeconds);

            // Return false if already 5 requests in last TIME_LIMIT seconds
            if (longDeque.size() >= MAX_LIMIT_COUNTER) {
                return false;
            }

            longDeque.addFirst(currentSeconds);
            return true;
        }
    }

    private void cleanDeque(Deque<Long> longDeque, Long currentSeconds) {
        while (!longDeque.isEmpty()) {
            Long peekLastSeconds = longDeque.peekLast();
            if (peekLastSeconds < currentSeconds - TIME_LIMIT) {
                longDeque.pollLast();
            } else {
                break;
            }
        }
    }
}
