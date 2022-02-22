/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABCOM
 */
public class Yamaha extends Motor {
    private String jenis;
    private String bahan;
    public Yamaha (String jenis, String bahan){
        this.jenis = jenis;
        this.bahan = bahan;
    }
    public void Atribut (){
        System.out.println("Bahan Bakar :  "+bahan);
        System.out.println("Jenis Bahan Bakar :  "+jenis);
    }
}





