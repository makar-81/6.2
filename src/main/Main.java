package main;

import java.io.*;
import java.util.ArrayList;


/**
 * Created by emakarov on 28.01.2016.
 */



public class Main {
    public static void main(String[] args) {
        // put your code here
        try {
            String temp;

            FileReader fr = new FileReader("./test1.txt");
            FileWriter wr = new FileWriter("./test2.txt");

            BufferedWriter  bw = new BufferedWriter(wr);

            BufferedReader br = new BufferedReader(fr);

            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            //Map<String, Integer> store = new HashMap<String, Integer>();
            //Map<Integer,String> keys = new HashMap<Integer,String>();
            //ArrayList<String> myArrayList = new ArrayList<String>();
            //ArrayList<String> myArrayList_correlations = new ArrayList<String>();

            // Map<String, Integer> count = new HashMap<String, Integer>();
            //final String user = "user";

            try {
                while ((temp = br.readLine()) != null) {
                        while (temp.contains("\t")){
                           int pos = temp.indexOf("\t");
                           temp = temp.substring(pos + 1);
                        }
                        System.out.println(temp);
                        bw.write(temp + "\n");
                        bw.flush();
                    }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

