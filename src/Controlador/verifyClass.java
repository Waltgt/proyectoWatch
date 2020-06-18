/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Walter Caal
 */
public class verifyClass extends javax.swing.JFrame{
    
    public int cont =0;
    public ArrayList<String> lstArch = new ArrayList();
    
    public void buscarArch(File ruta){
        File arch[] = ruta.listFiles();
        
        if(arch == null){
            for(int i=0; i<arch.length;i++){
                if(arch[i].isFile()){
                    if(arch[i].getName().endsWith("xlsx")){
                        cont++;
                        lstArch.add(arch[i].getName());
                        System.out.println("llego");
                    }

                }
            }
            
        }else{
            System.out.println("no hay coincidencias");
        }
        
    }
}
