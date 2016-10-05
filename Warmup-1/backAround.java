public String backAround(String str) {
  String tempStr;

  if (str.length() <= 1){
    tempStr = str;
  }
  return tempStr = str.charAt(str.length()-1) + str + str.charAt(str.length()-1);

}

// or

public String backAround(String str) {
  // Get the last char
  String last = str.substring(str.length() - 1);
  return last + str + last;
}