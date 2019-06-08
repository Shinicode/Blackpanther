public class BlackPanther {
    // hlikia, perivalon, varos, fullo, anaparaxthike

    private int age;
    private String env;
    private float weight;
    private bool sex;
    private bool reproduced;

    // Getters - Setters 

    private int getAge(){
        return this.age;
    }

    private void setAge(int ilikia){
        this.age = ilikia;
    }

    //---------------------

    private String getEnv(){
        return this.env;
    }

    private String setEnv(String environment){
        this.env = environment;
    }

    //---------------------

    private float getWeight(){
        return this.weight;
    }

    private float setWeight(int kila){
        this.weight = kila;
    }

    //---------------------

    private boolean getSex(){
        return this.sex;
    }

    private boolean setSex(boolean fullo){
        this.sex = fullo;
    }

    //---------------------

    private boolean getReproduced(){
        return this.reproduced;
    }

    private boolean setReproduced(boolean prod){
        this.reproduced = prod;
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
        public void eatAnimal(int varos){
            
        }


}