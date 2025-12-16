/*
* create method allowRequest(String userId) that return false for each userId
* if call it more than 5 times during 10 second
* */
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class PayforgeQuestion {

    private static final int MAX_LIMIT_COUNTER = 5;
    public static final int TIME_LIMIT = 10;
    private final Map<String, LimitSruct> userRateLimiter = new HashMap<>();

    public boolean allowRequest(String userId) {
        Instant currentInstant = Instant.now();

        if(!userRateLimiter.containsKey(userId)) { // not found
            userRateLimiter.put(userId, new LimitSruct(0,currentInstant));
            return true;
        } else { // already exist
            LimitSruct limitSruct = userRateLimiter.get(userId);
            Instant theLastTime = limitSruct.getTheLastTime();

            if (theLastTime.isAfter(currentInstant.minusSeconds(TIME_LIMIT))) {
                if (limitSruct.getCurrentLimit() >= MAX_LIMIT_COUNTER) {
                    return false;
                } else { //increment counter
                    limitSruct.setCurrentLimit(limitSruct.getCurrentLimit() + 1);
                    return true;
                }
            }else { // reset counter
                userRateLimiter.put(userId, new LimitSruct(0,currentInstant));
                return true;
            }
        }
    }

    class LimitSruct {
        private int currentLimit;
        private Instant theLastTime;

        public LimitSruct(int currentLimit, Instant theLastTime) {
            this.currentLimit = currentLimit;
            this.theLastTime = theLastTime;
        }

        public int getCurrentLimit() {
            return currentLimit;
        }

        public Instant getTheLastTime() {
            return theLastTime;
        }

        public void setCurrentLimit(int currentLimit) {
            this.currentLimit = currentLimit;
        }
    }
}
