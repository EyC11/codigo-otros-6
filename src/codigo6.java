import java.util.Scanner;//Importando el scaner 

public class codigo6 {
	public static void main(String[] args) {  
	Scanner s= new Scanner(System.in);// Creamos un scanner para ingresar la opcion 1 o 2 de los múltiplos
		
    int[] n = new int[20];// creando objeto new

    for (int i = 0; i < 20; i++) {//Se agrego + a i++ para completar el incremento
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " ");//faltaba .out en System.out.print
    }
    
    System.out.println("\n¿Qué números quiere resaltar? ");//Agrega l al println
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    
    int opcion = s.nextInt(); //n.parseInt(System.console().readLine());corrigiendo error de sintaxis de )

    int multiplo = (opcion == 1) ? 5 : 7; // cambiando condicion ternaria

for (int e : n) { //cambio de char a int y el foreach a for 
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      } else {
        System.out.print(e + " ");// corrigiendo in a out
      }
    }
    s.close();
    }//fin main
}//fin clase codigo6