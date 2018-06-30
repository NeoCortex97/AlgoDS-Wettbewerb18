class PrimeNum{
  private static ArrayList<Integer> primes;
  int pos;

  public PrimeNum(){
    this.primes = new ArrayList<Integer>();
    this.primes.add(2);
    this.primes.add(3);
    this.pos = 0;
  }

  public int start(){
    // last element primes.get(primes.size() - 1);
    this.pos = 1;
    return primes.get(0);
  }

  public int next(){
    ++this.pos;
    if (this.pos < primes.size()) {
      return primes.get(pos - 1);
    }else{
      generateOne();
      return primes.get(primes.size() - 1);
    }
  }

  private void generateOne(){
    int offset = 2;
    boolean found = false;
    while(found){
      found = true;
      int candidate = primes.get(primes.size() - 1) + offset;
      int upperBorder = candidate / 2;
      if(upperBorder <= candidate - 2){
        for (int i = 1; i < primes.size() - 1; ++i) {
          if(candidate % primes.get(i) == 0){
            found = false;
            break;
          }
        }
      }else{
        for (int i = 1; i < primes.size() - 1; ++i) {
          if(candidate % primes.get(i) == 0){
            found = false;
            break;
          }
        }
        for(int j = primes.get(primes.size() - 1) + 2; j <= upperBorder; j += 2){
          if(candidate % j == 0){
            found = false;
            break;
          }
        }
      }
      if (found){
        primes.add(candidate);
      }
    }
  }

}
