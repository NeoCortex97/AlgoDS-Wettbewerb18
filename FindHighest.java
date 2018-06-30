private customPair test(int preI, int i, int postI){
  long tmp = ((preI * 10) + i) * 10 + postI;
  PrimeNum p = new PrimeNum();
  int number = p.start();
  long maxBorder = tmp / 2;
  int gain = 0;

  // Find higest prime divisor start
  while (number >= maxBorder) {
    if (tmp % number == 0 && number > gain) {
      gain = number
    }else{
      number = p.next();
    }
  }
  // Find higest prime divisor end

  return customPair(gain, i);
}private customPair test(int preI, int i, int postI){
  long tmp = ((preI * 10) + i) * 10 + postI;
  PrimeNum p = new PrimeNum();
  int number = p.start();
  long maxBorder = tmp / 2;
  int gain = 0;

  // Find higest prime divisor start
  while (number >= maxBorder) {
    if (tmp % number == 0 && number > gain) {
      gain = number
    }else{
      number = p.next();
    }
  }
  // Find higest prime divisor end

  return customPair(gain, i);
}
