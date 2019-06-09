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

    private void setEnv(String environment){
         this.env = environment;
    }

    //---------------------

    private float getWeight(){
        return this.weight;
    }

    private void setWeight(int kila){
         this.weight = kila;
    }

    //---------------------

    private boolean getSex(){
        return this.sex;
    }

    private void setSex(boolean fullo){
        this.sex = fullo;
    }

    //---------------------

    private boolean getReproduced(){
        return this.reproduced;
    }

    private void setReproduced(boolean prod){
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
        public void eatAnimal(double x){
              this.weight += (x/100);
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

        //* ---- Ektuposh ----  age || env || weight || sex || reproduced.
        public void printAll(){
            System.out.println("Age: " + this.age);
            System.out.println("Environment: " + this.env);
            System.out.println("Weight: " + this.weight);
            System.out.println("Sex: " + this.sex);
            System.out.println("Produce: " + this.reproduced);
        }

		
}