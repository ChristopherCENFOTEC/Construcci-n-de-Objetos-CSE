import java.io.BufferedReader;
import java.io.InputStreamReader;

public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

public static void main(String[] args){
  Cliente uno = new Cliente("Ryan", "Blackwood", "123", "Masculino", "San Pedro");
  Cliente dos = new Cliente("Thorfinn", "Ragnarson", "12345", "Dinamarca");
  Cliente tres = new Cliente();

  suscripcion basica = new suscripcion("Básica", 7, "1 mes");
  suscripcion premium = new suscripcion("Premium", 10, "1 mes");
  suscripcion ultra = new suscripcion("Ultra", 15, "3 meses");

  uno.suscribirse(new suscripcion("Full Ultra Deluxe", 50, "2 Meses"));
  dos.suscribirse(new suscripcion("May The 4th Be With You", 70, "4 Meses"));
  tres.suscribirse(new suscripcion("Reach", 100, "6 Meses"));
  uno.suscribirse(basica);
  dos.suscribirse(premium);
  tres.suscribirse(ultra);

  System.out.println(uno.equals(dos));
  System.out.println(uno);
  System.out.println(dos);
  System.out.println(tres);
}