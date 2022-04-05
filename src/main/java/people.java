import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
public class people  {

        public static void main(String[] args) throws IOException {


            // TODO Auto-generated method stub
            //variable
            int age, height, weigt;
            String name;
            Scanner scan = new Scanner(System.in);

            System.out.print("your age=> ");

            age = scan.nextInt();

            System.out.print("your height=> ");

            height = scan.nextInt();
            System.out.print("your weight=> ");

            weigt = scan.nextInt();

            System.out.print("your name=> ");

            name = scan.next();





            System.out.println("------------------------------");

            System.out.println("name\tage\t  height  weigt");

            System.out.println("------------------------------");

            System.out.println(name+"\t\t"+age+"\t\t"+height+"\t\t"+weigt);



            String date;

            date = name+"\t\t"+ age+"\t\t"+ height+"\t\t"+weigt;

            System.out.println(date);



            try {

                OutputStream output = new FileOutputStream("c:/ipdate/Output1.txt");

                byte[] by=date.getBytes();

                output.write(by);

            } catch (Exception e) {

                e.getStackTrace();

            }


            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/ipdate/Output2.txt"))) {

                bos.write(date.getBytes());

            } catch (Exception e) {

                e.getStackTrace();

            }



            try {

                File file = new File("c:/ipdate/output1.txt");



                FileReader ji_fr = new FileReader(file);

                int cur;

                System.out.println("-----------------------------------");

                System.out.println("read to file and print out monitor");

                System.out.println("-----------------------------------");

                while((cur = ji_fr.read()) != -1) {

                    System.out.println((char)cur);

                }

                ji_fr.close();

            }	catch (FileNotFoundException e) {

                e.getStackTrace();
            }
            try {

                String filePath = "c:/ipdata/output2.txt";

                FileInputStream fileStream;

                fileStream = new FileInputStream(filePath);

                byte[ ] readBuffer = new byte[fileStream.available()];


                System.out.println(new String(readBuffer)); //prinf

                fileStream.close();   //power
            }		catch(Exception e) {
                e.getStackTrace();
            }
        }
    }