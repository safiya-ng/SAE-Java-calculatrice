
public class Nombre extends Expression{


    private Expression valeurNombre;
    
    public Nombre(Expression value){
        this.valeurNombre = value;
    }
    
    public int valeur(){
        return this.valeurNombre;
    }
    
    public String toString(){
        return "Le nombre est " + this.valeur();
    }
}