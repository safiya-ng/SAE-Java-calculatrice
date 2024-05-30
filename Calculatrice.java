public class Calculatrice {
    
    public static void main(String[] args) throws DivisionZeroExc {
        /*
        Nombre six = new Nombre(6) ; 
        Nombre dix = new Nombre(10) ; 
        Nombre zero = new Nombre(0) ;
        Operation s = new Soustraction(dix,six) ;
        Operation t = new Addition(dix,six) ;
        Operation u = new Multiplication(dix,six) ;
        Operation v = new Division(dix,six) ;

        System.out.println(s + " = " + s.valeur()) ; // doit afficher : (10 – 6) = 4
        System.out.println(t + " = " + t.valeur()) ; // doit afficher : (10 + 6) = 16
        System.out.println(u + " = " + u.valeur()) ; // doit afficher : (10 * 6) = 60
        System.out.println(v + " = " + v.valeur()) ; // doit afficher : (10 / 6) = 1

        try {
            Operation w = new Division(dix,zero) ;
            System.out.println(w + " = " + w.valeur()) ; // doit afficher : (10 / 0) = Exception...
        }
        catch (ArithmeticException e){
            System.out.println("Exception "+e);
        }
        
        System.out.println(six.valeur());
        System.out.println(six);
        */

    Expression deux = new Nombre(2) ;
Expression trois = new Nombre(3) ;
Expression dixSept = new Nombre(17) ;
Expression s = new Soustraction(dixSept, deux) ;
Expression a = new Addition(deux, trois) ;
Expression d = new Division(s, a) ;
System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3
        
    }

}

