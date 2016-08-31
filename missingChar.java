public String missingChar(String str, int n) {
  StringBuilder newStr = new StringBuilder(str);
    newStr.deleteCharAt(n);
    return newStr.toString();
  }