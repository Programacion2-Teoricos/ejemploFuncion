import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduzca un número");
    int valor=entrada.nextInt();
    boolean resul=esPositivo(valor);
    System.out.println(resul);
  }

  public static boolean esPositivo(int nro){
      if(nro>0)
        return true;
      else
        return false;

  }
}