
package quebracabeca;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Isabelle Lopes
 */
public class QuebraCabeca {

    public static void main(String[] args) {
        //Quebra-cabeça 4*4 (16 peças)
        //Cada peça da borda pode encaixar em uma única posição
        PecaBordas pBorda1 = new PecaBordas("1");
        PecaBordas pBorda2 = new PecaBordas("3");
        PecaBordas pBorda3 = new PecaBordas("5");
        PecaBordas pBorda4 = new PecaBordas("7");
        
        //Cada peça do meio pode encaixar em uma única posição
        PecaMeio pMeio1 = new PecaMeio("2");
        PecaMeio pMeio2 = new PecaMeio("4");
        PecaMeio pMeio3 = new PecaMeio("6");
        PecaMeio pMeio4 = new PecaMeio("8");
        
        //Cada peça da lateral pode encaixar em uma única posição
        PecaLateral pLateral = new PecaLateral("9");
        PecaLateral pLatera2 = new PecaLateral("10");
        PecaLateral pLatera3 = new PecaLateral("11");
        PecaLateral pLatera4 = new PecaLateral("12");
        PecaLateral pLatera5 = new PecaLateral("13");
        PecaLateral pLatera6 = new PecaLateral("14");
        PecaLateral pLatera7 = new PecaLateral("15");
        PecaLateral pLatera8 = new PecaLateral("16");
        
        
       
        System.out.println("Encaixe primeiro as pecas da borda 1 - 3 - 5 - 7");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext()) {
        sc.next();
        
        switch(pBorda1.getBorda()) {
            case "1":
                System.out.println("Peca 1 encaixada!");
                break;
            default:
                System.out.println("Nao esta na posicao correta...");
        }
        }
        switch(pBorda2.getBorda()) {
            case "3":
                System.out.println("Peca 3 encaixada!");
                break;
            default:
                System.out.println("Nao esta na posicao correta...");
        }
        
        switch(pBorda3.getBorda()) {
            case "5":
                System.out.println("Peca 5 encaixada!");
                break;
            default:
                System.out.println("Nao esta na posicao correta...");
        }
                
        switch(pBorda4.getBorda()) {
            case "7":
                System.out.println("Peca 7 encaixada!");
                break;
            default:
                System.out.println("Nao esta na posicao correta...");
        }
          
        System.out.println("Encaixe agora as pecas da lateral 9 - 10 - 11 - 12 - 13 - 14 - 15 - 16");
          
          
    }
    /*    
    switch(pMeio1.getBorda()) {
            case "2":
                if (pBorda1.getBorda().equals("1")) {
                    System.out.println("Peça Meio 2 encaixada com Peça Borda 1!");
                }
                break;
            case "4":
                if (pBorda2.getBorda().equals("3")) {
                    System.out.println("Peça Meio 4 encaixada com Peça Borda 3!");
                }
                break;
            case "6":
                if (pBorda3.getBorda().equals("5")) {
                    System.out.println("Peça Meio 6 encaixada com Peça Borda 5!");
                }
                break;
            case "8":
                if (pBorda4.getBorda().equals("7")) {
                    System.out.println("Peça Meio 8 encaixada com Peça Borda 7!");
                }
                break;
            default:
                System.out.println("Nenhuma correspondência encontrada.");
        }
    }
    */
    
}
