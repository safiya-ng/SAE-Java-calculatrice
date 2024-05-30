public class Addition extends Operation {

    public Addition(Expression op1, Expression op2){
        super(op1, op2);
    }

    public Double valeur(){
        return super.getOperande1().valeur() + super.getOperande2().valeur();
    }

    public String toString(){
        return "(" + super.getOperande1() + " + " + super.getOperande2() + ")";
    }
}
