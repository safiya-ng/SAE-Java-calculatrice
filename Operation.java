import java.beans.Expression;

public abstract class Operation extends Expression{

    private Expression operande1;
    private Expression operande2;

    public Operation(Nombre op1, Nombre op2){
        this.operande1 = op1;
        this.operande2 = op2;
    }

    public abstract int valeur(); // Oblige les class fille à implemeter cette méthode

    public Nombre getOperande1() {
        return this.operande1;
    }

    public Nombre getOperande2() {
        return this.operande2;
    }


}