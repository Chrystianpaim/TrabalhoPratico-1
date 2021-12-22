import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Chrystian Paim
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strVal = JOptionPane.showInputDialog("Informe o valor de sua compra: ");
        Integer val = Integer.parseInt(strVal);
        String strParc = JOptionPane.showInputDialog("Deseja fazer em quantas parcelas ? ");
        Integer parc = Integer.parseInt(strParc);
        int div = 0;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Date dataso = new Date();
        Calendar c = Calendar.getInstance();
        sdf.setLenient(false);
        int [] qntp = new int[parc];
        Date [] datavenc = new Date [parc];
        int i = 0;
        
        try{
        for(i = 0 ; i < qntp.length ; i++)
        {
            div = val/parc;
            qntp[i] = div;
            
            JOptionPane.showMessageDialog(null, "Valor da parcela: " + qntp[i]);
            
           
        }
        
         for (int x = 0 ; x < datavenc.length ; x++)
            {
               datavenc[x] = dataso;
               c.setTime(dataso);
               c.add(Calendar.DAY_OF_MONTH,30);
               dataso = c.getTime();
               
               datavenc[x] = dataso;
              
             JOptionPane.showMessageDialog(null, "Data de Vencimento: " + sdf.format(datavenc[x]));
            }
        
        } catch(NumberFormatException ne){
          JOptionPane.showMessageDialog(null, "Erro de entrada inválida: " + ne.getMessage()); 
        
        } catch(NullPointerException nue){
           JOptionPane.showMessageDialog(null, " Valor Informado é nulo " + nue.getMessage());
        
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Data inválida" + e.getMessage());
        }
        
  }
}
            

        
        
    
            
        
    
    
    
    

