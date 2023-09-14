import singleton.Constante;
import singleton.Constante;

public class App {
    public static void main(String[] args) throws Exception {
       Constante constante = Constante.getinstante();
       System.out.println(constante);
       constante.setDatos("iva", 0.16);
       System.out.println(constante);
       Constante constante2 = Constante.getinstante();
       System.out.println(constante2);
       constante.setDatos("iva", 0.18);
       System.out.println(constante);
    }
}
