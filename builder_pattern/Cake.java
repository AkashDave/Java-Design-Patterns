package builder_pattern;

/**
 *
 * @author Akash
 */
class Cake {
    private final double sugar;
    private final double butter;
    private final double milk;
    private final int cherry;
    
    public static class CakeBuilder{
        private double sugar;
        private double butter;
        private double milk;
        private int cherry;
        
        //builders methods for setting properties
        public CakeBuilder sugar(double sugar){
            this.sugar=sugar; return this;
        }
        public CakeBuilder butter(double butter){
            this.butter=butter; return this;
        }
        public CakeBuilder milk(double milk){
            this.milk=milk; return this;
        }
        public CakeBuilder cherry(int cherry){
            this.cherry=cherry; return this;
        }
        Cake build(){
            return new Cake(this);
        }
    }
    //private constructor to generate wanted object of Cake
    private Cake(CakeBuilder obj){
            this.sugar=obj.sugar;
            this.butter=obj.butter;
            this.milk=obj.milk;
            this.cherry=obj.cherry;
        }
    @Override
    public String toString() {
        return "Cake{" + "sugar=" + sugar + ", butter=" + butter + ", milk=" + milk + ", cherry=" + cherry + '}';
    }
    
                
}

