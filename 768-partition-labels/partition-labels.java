class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastOccurrence = new int[26];
        int stringLength = s.length();

        for (int i = 0; i < stringLength; i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        List<Integer> partitionSizes = new ArrayList<>();

        int maxReachInPartition = 0;
        int partitionStart = 0;

        for (int currentIndex = 0; currentIndex < stringLength; currentIndex++) {
            maxReachInPartition = Math.max(maxReachInPartition,
                    lastOccurrence[s.charAt(currentIndex) - 'a']);

            if (maxReachInPartition == currentIndex) {
                partitionSizes.add(currentIndex - partitionStart + 1);
                partitionStart = currentIndex + 1;
            }
        }

        return partitionSizes;
    }
}