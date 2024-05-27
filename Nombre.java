
public class Nombre extends Expression{


    private int valeurNombre;
    
    public Nombre(int value){
        this.valeurNombre = value;
    }
    
    public int valeur(){
        return this.valeurNombre;
    }
    
    public String toString(){
        return "Le nombre est " + this.valeur();
    }
}