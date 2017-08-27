public class Ejecutar 

{
  public static void main(String[] args) {
    Reloj reloj1 = new Reloj();
        reloj1.setHora(5);
        reloj1.setMinutos(59);
        reloj1.setSegundos(59);
        reloj1.addSegundos();
        System.out.println(reloj1.toString());

        Reloj reloj2 = new Reloj();
        reloj2.setHora(12);
        reloj2.setMinutos(0);
        reloj2.setSegundos(0);
        reloj2.subtractSegundos();
        System.out.println(reloj2.toString());  
    }
}

