
package quebracabeca;

import java.util.Scanner;
/**
 *
 * @author Isabelle Lopes
 */
public class QuebraCabeca {

    public static void main(String[] args) {
        //Quebra-cabeça 4*4 (16 peças)
        //Cada peça da borda pode encaixar em uma única posição
        PecaBordas pBorda1 = new PecaBordas(1);
        PecaBordas pBorda2 = new PecaBordas(3);
        PecaBordas pBorda3 = new PecaBordas(5);
        PecaBordas pBorda4 = new PecaBordas(7);
        
        //Cada peça do meio pode encaixar em uma única posição
        PecaMeio pMeio1 = new PecaMeio(2);
        PecaMeio pMeio2 = new PecaMeio(4);
        PecaMeio pMeio3 = new PecaMeio(6);
        PecaMeio pMeio4 = new PecaMeio(8);
        
        //Cada peça da lateral pode encaixar em uma única posição
        PecaLateral pLateral1 = new PecaLateral(9);
        PecaLateral pLateral2 = new PecaLateral(10);
        PecaLateral pLateral3 = new PecaLateral(11);
        PecaLateral pLateral4 = new PecaLateral(12);
        PecaLateral pLateral5 = new PecaLateral(13);
        PecaLateral pLateral6 = new PecaLateral(14);
        PecaLateral pLateral7 = new PecaLateral(15);
        PecaLateral pLateral8 = new PecaLateral(16);
             
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Encaixe primeiro as pecas da borda 1 - 3 - 5 - 7");
            int input = sc.nextInt(); 
            
            if (input == pBorda1.getBorda()) {
                System.out.println("Peca 1 encaixada!");
            } else if (input == pBorda2.getBorda()) {
                System.out.println("Peca 3 encaixada!");
            } else if (input == pBorda3.getBorda()) {
                System.out.println("Peca 5 encaixada!");
            } else if (input == pBorda4.getBorda()) {
                System.out.println("Peca 7 encaixada!");
            } else {
                System.out.println("Nao esta na posicao correta...");
            }     
            if (pBorda1.getBorda() == 1 && pBorda2.getBorda() == 3 && pBorda3.getBorda() == 5 && pBorda4.getBorda() == 7) {
                System.out.println("Todas as pecas da borda foram encaixadas corretamente!");
                break; 
            }
        }sc.close();
        
            while (true) {
            System.out.println("Encaixe agora as pecas da lateral 9 - 10 - 11 - 12 - 13 - 14 - 16");
            int input = sc.nextInt(); 
            
            if (input == pLateral1.getBorda() && pBorda1.getBorda() == 9) {
                System.out.println("Peca 9 encaixada com Peca Borda 1!");
            } else if (input == pLateral2.getBorda() && pBorda2.getBorda() == 10) {
                System.out.println("Peca 10 encaixada com Peca Borda 3!");
            } else if (input == pLateral3.getBorda() && pBorda2.getBorda() == 11) {
                System.out.println("Peca 11 encaixada com Peca Borda 3!");
            } else if (input == pLateral4.getBorda() && pBorda4.getBorda() == 12) {
                System.out.println("Peca 12 encaixada com Peca Borda 7!");
            } else if (input == pLateral5.getBorda() && pBorda4.getBorda() == 13) {
                System.out.println("Peca 13 encaixada com Peca Borda 7!");
            }else if(input == pLateral6.getBorda() && pBorda3.getBorda() == 14){
                System.out.println("Peca 14 encaixada com Peca Borda 5!");
            }else if(input == pLateral7.getBorda() && pBorda3.getBorda() == 15){
                System.out.println("Peca 15 encaixada com Peca Borda 5!");
            }else if(input == pLateral8.getBorda() && pBorda1.getBorda() == 16){
                System.out.println("Peca 16 encaixada com Peca Borda 1!");
            } else {
                System.out.println("Nao esta na posicao correta...");
            } 
            
            if (pLateral1.getBorda() == 9 && pLateral2.getBorda() == 10 && pLateral3.getBorda() == 11 && pLateral4.getBorda() == 12 &&
                    pLateral5.getBorda() == 13 && pLateral6.getBorda() == 14 && pLateral7.getBorda() == 15 && pLateral8.getBorda() == 16) {
                System.out.println("Todas as pecas da borda lateral foram encaixadas corretamente!");
                break; 
            }
        }
            
            while (true) {
            System.out.println("Encaixe agora as pecas do meio 2 - 4 - 6 - 8 com as bordas");
            int input = sc.nextInt();

            if (input == pMeio1.getBorda() && pBorda1.getBorda() == 1) {
                System.out.println("Peca Meio 2 encaixada com Peça Borda 1!");
            } else if (input == pMeio2.getBorda() && pBorda2.getBorda() == 3) {
                System.out.println("Peça Meio 4 encaixada com Peça Borda 3!");
            } else if (input == pMeio3.getBorda() && pBorda3.getBorda() == 5) {
                System.out.println("Peça Meio 6 encaixada com Peça Borda 5!");
            } else if (input == pMeio4.getBorda() && pBorda4.getBorda() == 7) {
                System.out.println("Peça Meio 8 encaixada com Peça Borda 7!");
            } else {
                System.out.println("A peça não está na posição correta...");
            }

            if (pMeio1.getBorda() == 2 && pMeio2.getBorda() == 4 && pMeio3.getBorda() == 6 && pMeio4.getBorda() == 8) {
                System.out.println("Todas as peças do meio foram encaixadas corretamente!");
                break;
            }
        }

        sc.close();
    }
/*
    // Funções auxiliares para verificar se todas as bordas ou laterais foram encaixadas
    public static boolean allBordasEncaixadas(boolean[] bordas) {
        for (boolean encaixada : bordas) {
            if (!encaixada) {
                return false;
            }
        }
        return true;
    }
       
        while (true) {
                 if () {
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
*/      

    }
    
    
          
          
    
       
      
    
    

