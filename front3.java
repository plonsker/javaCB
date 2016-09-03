public String front3(String str) {
  if (str.length() <= 2) return str + str + str;
  String tripStr = str.substring(0, 3);
  return tripStr + tripStr + tripStr;
}

// solutiojn 2

public String front3(String str) {
  String front;
  
  if (str.length() >= 3) {
    front = str.substring(0, 3);
  }
  else {
    front = str;
  }

  return front + front + front;
}