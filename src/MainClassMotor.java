/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABCOM
 */
public class MainClassMotor {
     public void cekMotor (Motor Motor){
        Motor.Atribut();
        Motor.AccHonda();
    }
     public void cekMotor2 (Motor Motor){
        Motor.Atribut();
        Motor.AccYamaha();
    }
    
    public static void main(String[] args) {
        
        MainClassMotor Motor = new MainClassMotor();        
        System.out.println("HONDA");
        Motor.cekMotor(new Honda("Bensin","Premium"));       
        
        System.out.println("-----------------------------------------");
        System.out.println("YAMAHA");
        Motor.cekMotor2(new Yamaha ("Bensin","Premium"));
        
        
    }
}










