public String extraEnd(String str) {
  String tempStr = str.substring((str.length()-2), (str.length()));
  return tempStr + tempStr + tempStr;
}