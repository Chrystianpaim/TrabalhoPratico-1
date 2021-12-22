import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Chrystian Paim
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
       
       String entrada1 = JOptionPane.showInputDialog("Informe uma data para locação: ");
       String entrada2 = JOptionPane.showInputDialog("Informe uma data para devolução: ");
       
       sdf.setLenient(false);
       Calendar dataLoc = Calendar.getInstance();
       Calendar dataDev = Calendar.getInstance();
        
        
        
        String strDiaria = JOptionPane.showInputDialog("Informe o valor da diário");
       
        
        long valtot = 0;
        Integer diaria = Integer.parseInt(strDiaria);
        
        try{
         
         
         dataLoc.setTime(sdf.parse(entrada1));
         JOptionPane.showMessageDialog(null, "Data de locação: " + sdf.format(dataLoc.getTime()));
          
        
          
         dataDev.setTime(sdf.parse(entrada2));
         JOptionPane.showMessageDialog(null, "Data de locação: " + sdf.format(dataDev.getTime()));
          
         //Cálculo para diferença de dias
          
          long miliSec = 24 * 60 * 60 * 1000;
          long diff = dataDev.getTimeInMillis() - dataLoc.getTimeInMillis();
          long diasdif = diff/miliSec;
          
         JOptionPane.showMessageDialog(null, "Dias de locação: " + diasdif);
         
         //Valor total da locação 
         
         valtot = diasdif * diaria;
          
          JOptionPane.showMessageDialog(null, "Valor total da locação: " + valtot);
       
       } catch (NumberFormatException ne){
         JOptionPane.showMessageDialog(null, "Erro de entrada inválida: " + ne.getMessage()); 
          
        } catch(NullPointerException nue){
          JOptionPane.showMessageDialog(null, " Valor Informado é nulo " + nue.getMessage());
        
        }  catch (Exception e) {
          
        JOptionPane.showMessageDialog(null, "Data inválida" + e.getMessage());
    
}
    
    }
    
}

   
    
    

