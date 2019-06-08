public class BlackPanther {
    // hlikia, perivalon, varos, fullo, anaparaxthike

    private int age;
    private String env;
    private float weight;
    private boolean sex;
    private boolean reproduced;

    // Getters - Setters 

    private int getAge(){
        return this.age;
    }

    private void setAge(int ilikia){
        this.age = ilikia;
    }

    //---------------------

    String getEnv(){
        return this.env;
    }

    private String setEnv(String environment){
       return  this.env = environment;
    }

    //---------------------

    private float getWeight(){
        return this.weight;
    }

    private float setWeight(int kila){
       return  this.weight = kila;
    }

    //---------------------

    private boolean getSex(){
        return this.sex;
    }

    private boolean setSex(boolean fullo){
      return  this.sex = fullo;
    }

    //---------------------

    private boolean getReproduced(){
        return this.reproduced;
    }

    private boolean setReproduced(boolean prod){
       return this.reproduced = prod;
    }

        //*----- CONTRUCTOR -----

        //*   age | reproduced | env | weight | sex 

    public  BlackPanther(){ } 

    public  BlackPanther(int hlikia,String environment,float kila){
        this.age = hlikia;
        this.env = environment;
        this.weight = kila;
     } 
    public  BlackPanther(String environment, boolean fullo, boolean prod){
        this.env = environment;
        this.sex = fullo;
        this.reproduced = prod;
     } 
    
        //*  Fae thirama() || + 1/100 
        public void eatAnimal(int x){
            this.weight =+ 0.01;
        }

        //* psakse fagito() || hlikia + 1 

        public void searchFood() {
            this.age =+ 1;
        }

        //* anaparagwgh(string , bool) || returns strings 

        public void breed(BlackPanther x){
            if((this.env == x.env)&&(this.sex != x.sex)){
                 System.out.println("H anaparagwgh pragmatopioithike");
            } else {
                 System.out.println("Adunath h anaparagwgh");
            }
        }
}