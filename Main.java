package Trabalho;
import java.util.Scanner;
import Helper.Help;


public class Main {
    public static void main(String[]args) {
        Scanner x=new Scanner(System.in);
        Help help=new Help();
       int Aux=0;
       int Choose;
       do {
            help.MENU();
            Choose=LEITOR(x);
            if(Choose==1){
                System.out.println("Digite o Nome do Arquivo:");
                String DocumentOne=x.nextLine();
                System.out.println("Informe o(s) nome(s) do(s) Aluno(s), por gentileza:");
                help.CreateFiles(DocumentOne,x);
                help.Reader(DocumentOne);
            }
            else if(Choose==2){
                System.out.println("Digite o Nome do Arquivo:");
                String DocumentTwo=x.nextLine();
                System.out.println("Informe o(s) nome(s) do(s) Aluno(s), por gentileza:");
                help.CreateFiles(DocumentTwo,x);
                help.Reader(DocumentTwo);
            }
            else if(Choose==3){

                System.out.println("Digite o Nome do Arquivo:");
                String DocumentThree=x.nextLine();
                System.out.println("Informe o(s) nome(s) do(s) Aluno(s), por gentileza:");
                help.CreateFiles(DocumentThree,x);
                help.Reader(DocumentThree);

                }


            else if(Choose==0){

            }else{
                System.out.println("!!!NÚMERO DIGITADO NÃO CORRESPONDE A NENHUMA OPÇÃO!!!\nPOR GENTILEZA DIGITE UM NÚMERO VALIDO!!! \n(NÚMEROS VALIDOS:0,1,2 E 3)");

            }
        }while(Aux==0);






    }
    public static int LEITOR(Scanner x){
        int aux=x.nextInt();
        x.nextLine();
        return aux;
}}



