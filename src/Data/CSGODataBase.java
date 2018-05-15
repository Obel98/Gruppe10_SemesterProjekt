/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Scanner;

/**
 *
 * @author Obel
 */
public class CSGODataBase
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner menuNavi = new Scanner(System.in);
        boolean running = true;
        while (running)
        {
            Database db = new Database("jdbc:postgresql://horton.elephantsql.com:5432/orbruzwc",
                    "orbruzwc", "jz2ddyS-O2wDkiP4bsuJ8T_vzA3tw5HQ");
            System.out.println("Choose function:\n"
                    + "Press 1, 2, 3, 4 or 5 for functions 1-5.\n"
                    + "1: List the names of the coaches and their teams.\n"
                    + "2: List of all people who have won at least one tournament.\n"
                    + "3: List team names and number of players on each team.\n"
                    + "4: Tournaments with at least your number of teams.(First solution)\n"
                    + "5: Tournaments with at least your number of teams.(Second solution)\n"
                    + "6: To quit the program.\n");
            switch (menuNavi.nextInt())
            {
                case 1:
                    db.listNames();
                    break;

                case 2:
                    db.winners();
                    break;

                case 3:
                    db.numberOfPlayers();
                    break;

                case 4:
                    db.teamsWith();
                    break;

                case 5:
                    db.teamsWith1();
                    break;

                case 6:
                    running = false;
                    break;
            }
        }
        menuNavi.close();
    }

}
