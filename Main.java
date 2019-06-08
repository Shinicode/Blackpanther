public class Main {
 
    public static void main(String[] args) {
        
        System.out.println("hello world");
        // ? BlackPanther(String environment, boolean fullo, boolean prod) 

        BlackPanther panther1 = new BlackPanther("South Africa",true ,true);

        BlackPanther panther2 = new BlackPanther("South Africa",false,true);

        panther1.breed(panther2);

        Counter c1 = new Counter();
        Counter c2 = new Counter(5);

        System.out.println(c2.num);
    }
    
}