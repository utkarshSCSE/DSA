class Solution {
      void fun(String s, int open, int close, int n, List<String> ans) {
        if (s.length() == 2*n) {
            ans.add(s);
            return;
        }
        if (open < n) {
            fun(s + "(", open + 1, close, n, ans);
        }
        if (close < open) {
            fun(s + ")", open, close + 1, n, ans);
        }
      }  
        public List<String> generateParenthesis(int n) {
         List<String> ans = new ArrayList<>();
        fun("", 0, 0, n, ans);
        return ans;
    }
        
    }
