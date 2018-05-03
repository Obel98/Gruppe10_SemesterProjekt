/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author borga
 */
public class JournalReader {

    private Set<JournalFormat> popSet;
    private File file;
//    private String[] txt;

    public JournalReader(String fileName) {
        popSet = new TreeSet<JournalFormat>();
        file = new File(fileName);
    }

    private void readFile(File file) {

        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String[] txt = input.nextLine().split("\n");
//                System.out.println(txt[0]);
                JournalFormat jf = new JournalFormat(Integer.parseInt(txt[0]), txt[1],
                        txt[2], Integer.parseInt(txt[3]),
                        txt[4], Integer.parseInt(txt[5]),
                        Integer.parseInt(txt[6]), txt[7],
                        txt[8]);
//                System.out.println(jf.toString());
                popSet.add(jf);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Cannot find file " + ex);
        }

    }

    public static void main(String[] args) {
        JournalReader f = new JournalReader("Sag1.txt");
        f.readFile(f.file);
        System.out.println(f.popSet.isEmpty());
    }
}
