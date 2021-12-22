import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/*

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Chrystian Paim
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int i = 1;
    
    
     try{
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy");
         String entrada = JOptionPane.showInputDialog("Informe uma data: "); 
         
         LocalDate dataUser = LocalDate.parse(entrada, formato);
         JOptionPane.showMessageDialog(null, "Data Informada: " + formato.format(dataUser));
         while(i == 1)
         {
            i++;
          
          
            LocalDate datap =  dataUser.plusDays(7);
            LocalDate datap2 = datap.plusDays(7);
            LocalDate datap3 = datap2.plusDays(7);
            LocalDate datap4 = datap3.plusDays(7);
            LocalDate datap5 = datap4.plusDays(7);
            
            JOptionPane.showMessageDialog(null, "Data de pagamento: " + formato.format(datap));
            JOptionPane.showMessageDialog(null, "Data de pagamento: " + formato.format(datap2));
            JOptionPane.showMessageDialog(null, "Data de pagamento: " + formato.format(datap3));
            JOptionPane.showMessageDialog(null, "Data de pagamento: " + formato.format(datap4));
            JOptionPane.showMessageDialog(null, "Data de pagamento: " + formato.format(datap5));
            
         
         }
        
     
     
     } catch (Exception e) {
          
        JOptionPane.showMessageDialog(null, "Data inválida" + e.getMessage());
    }
    }
    
}
