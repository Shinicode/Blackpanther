public class Main {
 
    public static void main(String[] args) {
        
        
        // ? BlackPanther(String environment, boolean fullo, boolean prod) 

        BlackPanther panther1 = new BlackPanther("South Africa",true ,true);

        BlackPanther panther2 = new BlackPanther("South Africa",false,true);

        BlackPanther panther3 = new BlackPanther( 10 ,"false",120);
        panther3.eatAnimal(10);

        panther1.breed(panther2);
        panther3.printAll();

        //! ---- COUNTER CLASS ---- 
        // Counter c1 = new Counter();
        // Counter c2 = new Counter(5);

        // c2.increment();
        // c2.incrementBy(10);
        

        // System.out.println(c2.getValue());
        // System.out.println(c1.getValue());

        // c1.incrementBy(12);
        // c2.reset();
        // System.out.println(c2.getValue());
        // System.out.println(c1.getValue());
    }
    
}