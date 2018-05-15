/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aquaintance.ICase;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author borga
 */
public class CaseReader {

    private File file;
    private ICase cf;

    public CaseReader(String fileName) {
        //Obel
        //file = new File("C:" + "/" + "Users" + "/" + "Mads Obel Jensen" + "/" + "Documents" + "/" + "NetBeansProjects" + "/" + "Gruppe10_SemesterProjekt" + "/" + fileName);
        file = new File("/Users/Obel/NetBeansProjects/Gruppe10_SemesterProjekt" + "/" + fileName);

        //Rasmus
        //file = new File("C:\\Users\\rasmu\\Documents\\Gruppe10_SemesterProjekt" + "/" + fileName);
<<<<<<< HEAD
        //file = new File("C:\\Users\\rasmu\\Desktop\\Code\\Semester 2\\Gruppe10_SemesterProjekt" + "/" + fileName);
=======
//        file = new File("C:\\Users\\rasmu\\Desktop\\Code\\Semester 2\\Gruppe10_SemesterProjekt" + "/" + fileName);
>>>>>>> master

        //Borgar
        file = new File("C:\\Users\\borga\\Documents\\NetBeansProjects\\SemesterProjekt\\Gruppe10_SemesterProjekt" + "/" + fileName);
        
        //thorey
        //file = new File("C:\\Users\\Bruger\\Documents\\NetBeansProjects\\Gruppe10_SemesterProjekt" + "/" + fileName);
        
        readFile(file);
    }

    private void readFile(File file) {

        try (Scanner input = new Scanner(file)) {
            String[] temp = new String[10];
            int i = 0;
            while (input.hasNextLine()) {
                temp[i] = input.nextLine();
                i++;
            }
            cf = new CaseFormat(Integer.parseInt(temp[1]), temp[2],
                    temp[3], Integer.parseInt(temp[4]),
                    temp[5], Integer.parseInt(temp[6]),
                    Integer.parseInt(temp[7]), temp[8],
                    temp[9]);
            System.out.println(cf.toString());

        } catch (FileNotFoundException ex) {
            System.out.println("Cannot find file " + ex);
        }

    }

    public ICase getCf() {
        return cf;
    }

//    public static void main(String[] args)
//    {
//        CaseReader test = new CaseReader("Sag1.txt");
//        System.out.println(test.getCf().getEmail());
//    }
}
