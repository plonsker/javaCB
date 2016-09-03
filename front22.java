public String front22(String str) {
  
  if (str.length() <= 2){
    return str + str + str;
  }
  String front = str.substring(0, 2);
  return front + str + front;
}

// site solution

public String front22(String str) {
  // First figure the number of chars to take
  int take = 2;
  if (take > str.length()) {
    take = str.length();
  }
  
  String front = str.substring(0, take);
  return front + str + front;
}