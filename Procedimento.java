/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 31312020
 */
public class Procedimento {
    Ambulatorial ambulatorial;
    Cirurgico cirurgico;
    private List<ItemDeProcedimentos> lista = new ArrayList();
    Scanner lerInt = new Scanner(System.in);
    
    public Procedimento(){
        ambulatorial = new Ambulatorial();
        cirurgico = new Cirurgico();
    }
    
    public void tipoProcedimento(){
        System.out.print("\nEscolha o Procedimento desejado:\n(1)Ambularorial\n(2)Cirurgico\nOpção: ");
        int tipo = lerInt.nextInt();
        
        if (tipo==1){
            ambulatorial.tipoAmbulatorial();
        }
        if (tipo==2){
            cirurgico.tipoCirurgico();
        }
         
        System.out.print("\nDeseja adicionar outro procedimento?\n(1)Sim\n(2)Não\nOpção: ");
        int opc = lerInt.nextInt();
        
        if (opc==1){
            tipoProcedimento();
        }
        opc = 0;
    }
}
