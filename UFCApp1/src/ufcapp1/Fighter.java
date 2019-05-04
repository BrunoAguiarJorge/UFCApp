
package ufcapp1;


public class Fighter {
    // Atrubutes 
    private String name, nacionality, category;
    private int age, wins, lost, draw;
    private float weight, height;
    //public methods
    public void introduction (){
        System.out.println("It'is time! this is " + this.getName());
        System.out.println(this.getName() + " Is from " + this.getNacionality());
        System.out.println("with " + this.getAge() + " years and " + this.getHeight() );
        System.out.println("Weightinhg " + this.getWeight() + " Kg");
        System.out.println(this.getWins() + " Wins");
        System.out.println( this.getLost()  + "losts");
        System.out.println(this.getDraw() + " draws");
        
      
    }
    public void status(){
        System.out.println(this.getName() + "is a weight " + this.getCategory());
        System.out.println("has won " + this.getWins() + " times");
        System.out.println("Has lost " + this.getLost() + " times ");
        System.out.println("Has drawn " + this.getDraw() + " Times");
    }
    public void win(){
        this.setWins(this.getWins()+ 1);
    }
    public void lost(){
        this.setLost(this.getLost() + 1);
    }
    public void draw(){
        this.setDraw(this.getDraw() + 1);
    }
    // especial methods
    //
    public Fighter(String name, String nacionality, int age, int wins, int lost, int draw, float weight, float height) {
        this.name = name;
        this.nacionality = nacionality;
        this.age = age;
        this.wins = wins;
        this.lost = lost;
        this.draw = draw;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        if (this.weight < 52.2){
            this.category = "Invalido";
        }else if (this.weight <= 7.3){
            this.category = "Leve";
        }else if (this.weight <= 83.9){
            this.category = "Pesado";
        }else if (this.weight <= 120.2){
            this.category = "Invalido";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    
}
