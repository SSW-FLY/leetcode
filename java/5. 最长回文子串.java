class Solution {
    public String longestPalindrome(String s) {
            if (s == null) {
      return s;
    }
    if (s.length() <= 1) {
      return s;
    }
    int end = 0;
    int begin = 0;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        if (end - begin < 1) {
          end = i;
          begin = i - 1;
        }
        int a = i - 2;
        int b = i + 1;
        while (a >= 0 && b < s.length()) {
          if (s.charAt(a) == s.charAt(b)) {
            if (b - a > end - begin) {
              end = b;
              begin = a;
            }
            a--;
            b++;
          } else {
            break;
          }
        }
      }
      int a = i - 1;
      int b = i + 1;
      while (a >= 0 && b < s.length()) {
        if (s.charAt(a) == s.charAt(b)) {
          if (b - a > end - begin) {
            end = b;
            begin = a;
          }
          a--;
          b++;
        } else {
         break;
        }
      }
    }

    return s.substring(begin, end + 1);
    }
}