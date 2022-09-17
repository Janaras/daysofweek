package daysofweek;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("text.txt");
        fileWriter.write("Aa \n");
        fileWriter.write("Bb \n");
        fileWriter.write("Cc \n");
        fileWriter.write("Dd \n");
        fileWriter.write("Ee \n");
        fileWriter.write("Ff \n");
        fileWriter.write("Gg \n");
        fileWriter.write("Hh \n");
        fileWriter.write("Ii \n");
        fileWriter.write("Jj \n");
        fileWriter.write("Kk \n");
        fileWriter.write("Ll \n");
        fileWriter.write("Mm \n");
        fileWriter.write("Nn \n");
        fileWriter.write("Oo \n");
        fileWriter.write("Pp \n");
        fileWriter.write("Qq \n");
        fileWriter.write("Rr \n");
        fileWriter.write("Ss \n");
        fileWriter.write("Tt \n");
        fileWriter.write("Uu \n");
        fileWriter.write("Vv \n");
        fileWriter.write("Ww \n");
        fileWriter.write("Xx \n");
        fileWriter.write("Yy \n");
        fileWriter.write("Zz \n");
        fileWriter.write("0  \n");
        fileWriter.write("1  \n");
        fileWriter.write("2 \n");
        fileWriter.write("3 \n");
        fileWriter.write("4 \n");
        fileWriter.write("5 \n");
        fileWriter.write("6 \n");
        fileWriter.write("7 \n");
        fileWriter.write("8 \n");
        fileWriter.write("9 \n");
        fileWriter.close();
        FileReader fileReader = new FileReader("text.txt");
        Scanner scanner = new Scanner(fileReader);
        int couter = 1;
        while (scanner.hasNextLine()) {
            System.out.println(couter + "->" + scanner.nextLine());
            couter++;
        }
        fileReader.close();


//        System.out.println(":");
//        String s = sc.nextLine();
//    try (FileWriter fileWriter = new FileWriter("text.txt")) {
//            fileWriter.write("Hello,Good morning " + s + "!");
//        }
//        try (FileReader fileReader = new FileReader("text.txt")) {
//            Scanner sc1 = new Scanner(fileReader);
//            while (sc1.hasNextLine())
//                System.out.println(sc1.nextLine());
    }
}



//

//
//hj
//
//        Random random = new Random();
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        int sum = 0;
//        for (int i = 0; i < 50; i++) {
//            treeSet.add(random.nextInt(0,1000));
//            sum+=i;
//        }
//        System.out.println(sum);
//        System.out.println(treeSet);








































//        Random r = new Random();
//        int []arr = new int[11]


