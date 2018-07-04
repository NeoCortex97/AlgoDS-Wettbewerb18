class BrurteForce{

  public String run(int[] data){
    int start = 0;
    int commonGain = 0;
    int[] gains = new int[];
    int[] positions = new int[];
    while(start < data.length - 1){
     for(int i = start; i < data.length(); ++i){
       gains[i] = test();
     }
      ++start;
    }
  }
}
