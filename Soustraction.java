public class Soustraction extends Operation {

    public Soustraction(Nombre op1, Nombre op2){
        super(op1, op2);
    }

    public int valeur(){
        return super.getOperande1().valeur() - super.getOperande2().valeur();
    }

    public String toString(){
        return "(" + super.getOperande1().valeur() + " - " + super.getOperande2().valeur() + ")";
    }
}