package Helper;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;



public class Help {
    public void CreateFiles(String Tex, Scanner x) {
        File dir = new File("C:\\TrabalhoProgramacao");
        File arq = new File(dir, Tex);

        try {

            arq.createNewFile();

            FileWriter File = new FileWriter(Tex, false);

            PrintWriter Print = new PrintWriter(arq);
            String Edi = x.nextLine();

                Print.println(Edi);
                Print.flush();
                Print.close();


        } catch (IOException e) {

                e.printStackTrace();
            }
        }

        public void MENU () {

            System.out.println("<<<<<<EXEMPLO DE COMO DEVE SER CADASTRADA A CHAMADA>>>>>>\n [matematica_3_14_05_2022]");
            System.out.println("-----------CHAMADA-----------");
            System.out.println("1-Matemática");
            System.out.println("2-Educação Física");
            System.out.println("3-Português");
            System.out.println("0-Sair");
            System.out.println("-----------------------------");
        }
        public void Reader (String arqui){
            File dir = new File("C:\\TrabalhoProgramacao");
            File arq = new File(dir, arqui);
            System.out.println("Informações Salvas!!!");
            System.out.println("Nome do arquivo:" + arq);
            System.out.println("Informações Salvas no Arquivo:" + arqui + "\n");

            try {

                FileReader Reader = new FileReader(arq);

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


