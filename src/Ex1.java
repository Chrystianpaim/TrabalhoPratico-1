
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Chrystian Paim
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     try{
      
         
       String nome = JOptionPane.showInputDialog("Informe o seu nome");
       String strSal = JOptionPane.showInputDialog("Informe o seu salário");
       Float salb = Float.parseFloat(strSal);
       double inssval = 0;
       double inss = 0; 
       double salliq = 0;
       if(salb >= 0 && salb <= 1100.00)
       {
         inss = 7.5/100;
         inssval = salb * inss;
         salliq = salb - inssval;
         
         
         
       }
       else if(salb >= 1100.01 && salb <= 2203.48)
       {
           inss = 9.0/100;
           inssval = salb * inss;
           salliq = salb - inssval;
           
          
       }
       else if(salb >= 2203.49 && salb <= 3305.22)
       {
           inss = 0.12;
           inssval = salb * inss;
           salliq = salb - inssval;
           
          
       }
       else if(salb >= 3305.23 && salb <= 6433.57)
       {
           inss = 0.14;
           inssval = salb * inss;
           salliq = salb - inssval;
           
          
       }
       
       JOptionPane.showMessageDialog(null, "Nome: " + nome);
       JOptionPane.showMessageDialog(null, "Salário bruto: " + salb);
       JOptionPane.showMessageDialog(null, "INSS: " + inssval);
       JOptionPane.showMessageDialog(null, "Salário líquido: " + salliq);
       
       
     } catch (NumberFormatException ne){
         JOptionPane.showMessageDialog(null, "Erro de entrada inválida: " + ne.getMessage());
      
     } catch (NullPointerException nue){
         JOptionPane.showMessageDialog(null, "Erro de entrada nula: " + nue.getMessage());
     
     } catch (Exception e){  
         
       e.printStackTrace();
       JOptionPane.showMessageDialog(null, "Mensagem de erro: " + e.getMessage() + 
               "\nClasse do erro: " + e.getClass());
    }
    }
}
    
    
