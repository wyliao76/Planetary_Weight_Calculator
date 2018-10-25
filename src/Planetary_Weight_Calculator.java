/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetary_weight_calculator;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Planetary_Weight_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int weight ;
        int gPlanet ;
        double gMoon = 1.622 ;
        double gMercury = 3.7 ;
        double gVenus = 8.87 ;
        double gJupiter = 24.79 ;
        double gEarth = 9.81 ;
        double wtPlanet ;
        
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in) ;
        
        System.out.println("Welcome to Planetary Weight Calculator");
        System.out.println("Please Enter your Weight in KG");

        weight = input.nextInt();
        
        if (weight <=0) {
            System.out.println("The weight must larger than 0");
            System.out.print("Please re-enter");
            weight = input.nextInt();
            if ( weight <= 0) {
              System.out.println("Thank for using Planetary Weight Calculator, Please press F5 to restart");
            } 
        }
        
        System.out.println("* * * Menu * * *");
        System.out.println("1-Moon");
        System.out.println("2-Mercury");
        System.out.println("3-Venus");
        System.out.println("4-Jupiter");
        System.out.println("Please choose a planet");
                
        gPlanet = input2.nextInt();
        
        if ( gPlanet == 1 ) {
        wtPlanet = weight * ( gMoon / gEarth ) ;
        System.out.println(" Your weight on Moon will be " + wtPlanet+"KG");
        }
        
        if (gPlanet == 2 ){
            wtPlanet = weight * ( gMercury / gEarth ) ;
        System.out.println(" Your weight on Mercury will be " + wtPlanet+"KG");
        }
        if (gPlanet == 3){
            wtPlanet = weight * ( gVenus / gEarth) ;
        System.out.println(" Your weight on Venus will be " + wtPlanet+"KG");
        }
        if (gPlanet == 4){
            wtPlanet = weight * ( gJupiter / gEarth) ;
        System.out.println(" Your weight on Jupitor will be " + wtPlanet + "KG");
        }
    }
}
