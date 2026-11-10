class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] taskFrequencies = new int[26];
        int maxFrequency = 0;

        for (char task : tasks) {
            int index = task - 'A';
            taskFrequencies[index]++;
            maxFrequency = Math.max(maxFrequency, taskFrequencies[index]);
        }

        int tasksWithMaxFrequency = 0;

        for (int frequency : taskFrequencies) {
            if (frequency == maxFrequency) {
                tasksWithMaxFrequency++;
            }
        }

        int slotsForMaxFreqTasks = (maxFrequency - 1) * (n + 1) + tasksWithMaxFrequency;

        return Math.max(tasks.length, slotsForMaxFreqTasks);
    }
}