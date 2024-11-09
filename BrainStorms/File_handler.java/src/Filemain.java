/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Filemain {
    File file;
 
     public Filemain(String filename){
        file=new File(filename);  
     }
     public void renamefile(File file2){
      
         if(file.renameTo(file2)){
             System.out.println("Rename sucessfull");
         }else{
             System.out.println("Rename not sucessfull");
         }
     }
     public void deleteFile(){
           file.delete();
     }
     public String getName(){
         return file.getName();
     }
    public static void main(String...args){
        Filemain ob=new Filemain("Tharane.txt");
         File file3=new File("d:\\javap\\Tharane2.txt");
        ob.renamefile(file3);
    }
}
}
