public String endUp(String str) {
  if (str.length() < 3) {
    return str.toUpperCase();
  } else {
  String capStr = str.substring(0, (str.length() - 3)) + str.substring(str.length() - 3, str.length()).toUpperCase();
  return capStr;
  }
}