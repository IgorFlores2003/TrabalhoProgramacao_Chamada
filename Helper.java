package Helper;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Help_2 {
    public void CreateFiles(String Tex, Scanner x) {
        File dir = new File(TEST.New_Information(TEST.CSV_FILE));
        File arq = new File(dir, Tex +".txt");
        int choose;
        int aux=0;
        String read= TEST.CSV_FILE;

        try {
            FileWriter File = new FileWriter(TEST.New_Information(TEST.CSV_FILE) + Tex + ".txt");
            PrintWriter Print = new PrintWriter(arq);

            do {
                System.out.println("Informe o(s) nome(s) do(s) Aluno(s), por gentileza:");
                String Edi = x.nextLine();
                Print.print(Edi);
                System.out.println("Deseja cadastrar mais alunos a chamada?\n1-Sim\n2-Não");
                choose = x.nextInt();
                if (choose == 1) {
                     Edi = x.nextLine();
                    Print.println(Edi);
                } else if (choose == 2) {
                    aux++;

                }
            } while (aux == 0) ;

                File.close();
                Print.close();
            }catch(IOException e){

                e.printStackTrace();
            }
        Reader(read);
        }

    public void Reader (String arqui){
        File dir = new File(TEST.CSV_FILE);
        File arq = new File(dir, arqui);
        System.out.println("Informações Salvas!!!");
        System.out.println("Nome do arquivo:" + arq);
        System.out.println("Informações Salvas no Arquivo:" + arqui + "\n");

        try {

            FileReader Reader = new FileReader(arqui);

            BufferedReader bufferedReader = new BufferedReader(Reader);

            String linha = "";

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);

            }
            Reader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }}


