class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder stack = new StringBuilder();

        for (char currentDigit : num.toCharArray()) {
            while (k > 0 && stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > currentDigit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(currentDigit);
        }

        while (k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        int leadingZeroIndex = 0;
        while (leadingZeroIndex < stack.length() &&
               stack.charAt(leadingZeroIndex) == '0') {
            leadingZeroIndex++;
        }

        String result = stack.substring(leadingZeroIndex);

        return result.isEmpty() ? "0" : result;
    }
}