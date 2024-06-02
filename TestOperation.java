public class TestOperation {
    
    public static void main(String[] args) throws DivisionZeroExc {
        
        Expression zero = new Nombre( 0D) ;
        Expression deux = new Nombre( 2D) ;
        Expression trois = new Nombre( 3D) ;
        Expression dixSept = new Nombre(17D) ;
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;

        System.out.println(s + " = " + s.valeur()) ; // affiche (17.0 - 2.0) = 15.0
        
        try {
            Expression d = new Division(s, a) ;
            System.out.println(d + " = " + d.valeur()) ; // affiche ((17.0 - 2.0) / (2.0 + 3.0)) = 3.0
        }

        catch (DivisionZeroExc e){
            System.out.println("Expression" + e); 
        }


        try {
            Expression d = new Division(s, zero) ;
            System.out.println(d + " = " + d.valeur()) ; 
        }

        catch (DivisionZeroExc e){
            System.out.println("Expression" + e); // affiche ExpressionDivisionZeroExc: Division par 0
        }
 
    }

}

