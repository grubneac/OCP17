package ranking_system;

import java.util.Arrays;

public class User {
    private final int[] RANKS = {-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8};
    public int indexRank;
    public int rank;
    public int progress;


    public void incProgress(int taskRank) {
        if (taskRank < -8 || taskRank > 8 || taskRank == 0) {
            throw new IllegalArgumentException();
        }
        int indexTaskRank = Arrays.binarySearch(RANKS, taskRank);
        int taskProgress = 0;
        if (indexTaskRank > indexRank) {
            taskProgress = 10 * (indexTaskRank - indexRank) * (indexTaskRank - indexRank);
        } else if (indexTaskRank == indexRank) {
            taskProgress = 3;
        } else if (indexTaskRank + 1 == indexRank) {
            taskProgress = 1;
        } else {
            taskProgress = 0;
        }
        taskProgress += progress;
        while (taskProgress >= 100) {
            taskProgress -= 100;
            if (indexRank < RANKS.length - 1) {
                indexRank++;
            }
        }
        progress = taskProgress;
        rank = RANKS[indexRank];
        if (rank == 8) {
            progress = 0;
        }
    }
}

