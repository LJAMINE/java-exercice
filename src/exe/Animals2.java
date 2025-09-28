package exe;

abstract class Animals2 {
    protected String species;
    protected double  weight;

    public Animals2(String newspecies,double newweight){
        species=newspecies;
        weight=newweight;
    }

    public String getSpecies(){
        return species;
    }

    public void setSpecies(String species){
        this.species=species;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

      abstract void makeSound();
}
