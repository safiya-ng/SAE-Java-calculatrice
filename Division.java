import java.beans.Expression;

public class Division extends Operation {
    
    public Division(Expression op1, Expression op2) throws DivisionZeroExc{
        super(op1, op2);
        if (op2.valeur()==0){
            throw new DivisionZeroExc();
        }
       
    }

    public int valeur(){
        return super.getOperande1().valeur() / super.getOperande2().valeur();
    }

    public String toString(){
        return "(" + super.getOperande1().valeur() + " / " + super.getOperande2().valeur() + ")";
    }
}