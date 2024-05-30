public class Calculatrice {
    
    public static void main(String[] args) throws DivisionZeroExc {
        
        
        Expression deux = new Nombre( 2D) ;
        Expression trois = new Nombre( 3D) ;
        Expression dixSept = new Nombre(17D) ;
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        Expression d = new Division(s, a) ;

        System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3

        
    }

}

