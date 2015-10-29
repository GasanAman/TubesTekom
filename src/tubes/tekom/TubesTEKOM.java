/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.tekom;

import java.util.Scanner;

/**
 *
 * @author Ghassan
 */
public class TubesTEKOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Input : ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Lexic L = new Lexic(input);
    }
    
}
