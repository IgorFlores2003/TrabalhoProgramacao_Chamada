package Trabalho;
import Helper.*;
import java.util.Scanner;


public class Main {

    public static void main(String[]args) {
        Scanner x = new Scanner(System.in);
        Help_2 help = new Help_2();
        TEST test=new TEST();
       String read= TEST.CSV_FILE;
        int Aux=0;
        int Choose;
        do {
            test.Reader(read);
            Choose=LEITOR(x);
            if(Choose==1){

                 System.out.println("Digite o Nome do Arquivo:");
                 String DocumentOne = x.nextLine();
                 help.CreateFiles(DocumentOne, x);

            }
            else if(Choose==2){

                System.out.println("Digite o Nome do Arquivo:");
                String DocumentTwo = x.nextLine();
                help.CreateFiles(DocumentTwo, x);
            }
            else if(Choose==3){

                System.out.println("Digite o Nome do Arquivo:");
                String DocumentThree = x.nextLine();
                help.CreateFiles(DocumentThree, x);
            }

            else if(Choose==0){
Aux++;
            }else{
                System.out.println("!!!NÚMERO DIGITADO NÃO CORRESPONDE A NENHUMA OPÇÃO!!!\nPOR GENTILEZA DIGITE UM NÚMERO VALIDO!!! \n(NÚMEROS VALIDOS:0,1,2 E 3)");

            }
        }while(Aux==0);

    }
    public static int LEITOR(Scanner x){
        int aux = x.nextInt();
        x.nextLine();
        return aux;
    }}




