public class TestOperation {
    
    public static void main(String[] args) throws DivisionZeroExc {
        
        
        Expression deux = new Nombre( 2D) ;
        Expression trois = new Nombre( 3D) ;
        Expression dixSept = new Nombre(17D) ;
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;

        System.out.println(s + " = " + s.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3
        try {
            Expression d = new Division(s, a) ;
            System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3
        
        }

        catch (DivisionZeroExc e){
            System.out.println("Expression" + e);
        }
        

        

        

        
    }

}

