public String makeOutWord(String out, String word) {
  String tempOut1 = out.substring(0, (out.length()/2));
  String tempOut2 = out.substring((out.length()/2), out.length());
  
  return tempOut1 + word + tempOut2;
}
