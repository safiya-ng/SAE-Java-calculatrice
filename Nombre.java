
public class Nombre extends Expression{


    private Double valeurNombre;
    
    public Nombre(Double value){
        this.valeurNombre = value;
    }
    
    public Double valeur(){
        return this.valeurNombre;
    }
    
    public String toString(){
        return "Le nombre est " + this.valeur();
    }
}