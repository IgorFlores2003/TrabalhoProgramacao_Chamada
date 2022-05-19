package Helper;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.text.Normalizer;



public class Help {

    public static String CSV_FILE=System.getenv("CSV_FILE");

    public void CreateFiles(String Tex, Scanner x) {
        File dir = new File(CSV_FILE);
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

        public void Reader (String arqui){
            File dir = new File(CSV_FILE);
            File arq = new File(dir, arqui);

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

        }

public static String New_Information(String New_Information ){
        int information= New_Information.lastIndexOf("\\");
        return New_Information.substring(0, information+1);
}}


