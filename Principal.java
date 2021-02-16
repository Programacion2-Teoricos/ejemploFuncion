import java.util.Scanner;

class Principal {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    //Pide datos al usuario
    System.out.println("Introduzca un número");
    float num1=teclado.nextFloat();
    System.out.println("Introduzca otro número");
    float num2=teclado.nextFloat();
    
    //Llama a la funcion multi
    float resultado=multi(num1, num2);
    System.out.println("El resultado del producto es: "+resultado);

    //Uso de la función triple
    System.out.println("Introduzca un número");
    int nro3=teclado.nextInt();
    int resul=triple(nro3);
    System.out.println("El triple del nro ingresado es: "+resul);
  }

  public static float multi(float nro1, float nro2){

    float result=nro1*nro2;
    return result;
  }

  public static int triple(int nro1){

    int result=nro1*3;
    return result;
  }



}