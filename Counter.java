public class Counter{
    public int num;

    // *  ---- Functions ----
    public  Counter(){
       this.num = 0;
   }

    public  Counter(int x){
       this.num = x;
   }
    public int getValue(){
        return this.num;
    }

    public void increment(){
        this.num += 1;
    }

    public void incrementBy(int x){
        this.num += x;
    }

    public void reset(){
        this.num = 0;
    }

}