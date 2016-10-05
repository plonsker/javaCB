public boolean lastDigit(int a, int b) {
  Integer tempA = a % 2;
  Integer tempB = b % 2;
  if (tempA == tempB) {
    return true;
  } else {
    return false;
  }
}