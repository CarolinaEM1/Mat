
package programa101;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Programa101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int matriz[][],nFilas,nCol,sumaFilas,sumaCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
        
        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite la matriz");
        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nCol;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        System.out.println("\nMatriz original: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println("");
    }
        
    // Procedemos a sumar las filas
     for (int i=0;i<nFilas;i++){
         sumaFilas = 0;
         for (int j=0;j<nCol;j++){
             sumaFilas += matriz[i][j];
         }
         System.out.print("\nLa suma de la fila ["+i+"] es: "+sumaFilas);
     }    
     System.out.println("");
     
     // Por ultimo sumamos las columnas
     
     for (int j=0;j<nCol;j++){
         sumaCol=0;
         for (int i=0;i<nFilas;i++){
             sumaCol += matriz[i][j];
         }
         System.out.print("\nLa suma de la columna ["+j+"] es: "+sumaCol);
     }
     System.out.println("");
    }
    
}
