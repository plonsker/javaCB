public boolean or35(int n) {
  if(n % 3 == 0){
    return true;
  }
  if(n % 5 == 0){
    return true;
  }
  return false;
}

// or

public boolean or35(int n) {
  return (n % 3 == 0) || (n % 5 == 0);
}