import java.util.Scanner;
public class Factorial{
  public static void main(String args[]){
  Scanner valor=new Scanner(System.in);
  int a=valor.nextInt();
    int fact=1;
    for (int i=a; i>=1; i--){
      if (i==1) {break;}
      else {
      fact=fact*i;
    }
  System.out.println("El factorial es: " + fact);
  }
}
}
public factorial(){
  System.out.println("Hey");
}
//Haciendo pruebas para trabajar en equipo
