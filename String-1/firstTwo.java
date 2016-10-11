public String firstTwo(String str) {
  if(str.length() > 2){
    String tempStr = str.substring(0, 2);
    return tempStr;
  } else {
    return str;
  }
}
