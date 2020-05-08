class Solution {
    public String convert(String s, int numRows) {
            if (numRows == 1) {
      return s;
    }
    List<StringBuilder> list = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      list.add(new StringBuilder());
    }
    int index = 0;
    int flag = -1;
    for (int i = 0; i < s.length(); i++) {
      list.get(index).append(s.charAt(i));
      if (index % (numRows - 1) == 0) {
        flag = -flag;
      }
      index = index + flag;
    }
    StringBuilder sb = new StringBuilder();
    list.forEach(x -> sb.append(x.toString()));
    return sb.toString();
    }
}