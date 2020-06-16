
package contadeluz;

import javax.swing.JOptionPane;

/**
 * @author Natalia 
 */
public class ContaDeLuz {
    private static Object dados;


    public static void main(String[] args) {
        ContaLuz leitura = new ContaLuz();
        
        JOptionPane.showMessageDialog(null,"Para a leitura da sua conta de luz, siga as intruções quando solicitadas");
        JOptionPane.showMessageDialog(null,"ATENÇÃO ÀS BANDEIRAS:\n"
                + "A cor verde: Sem cobranças adicionais. Suas condições são favoráveis de geração de energia;\n"
                + "A cor amarela: Condições menos favoráveis. Será cobrado R$1,00 por 100 kwh\n"
                + "A cor vermelha: Custo de energia mais caro. Térmicas liagadas. Dois patamares: um de R$3,00 e outro de  R$5,00 para cada 100 kwh. ");
      
        double leituraAnterior = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a leitura anterior:"));
        double leituraAtual = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira a leitura atual:"));;
      
        double total = leituraAnterior-leituraAtual;
        
        JOptionPane.showMessageDialog(null,"Total calculado para cobrança:"+total);
        
        if(total>200) {
            JOptionPane.showMessageDialog(null,"Cobrança a mais de acordo com a bandeira:"+(0.3*total));
            JOptionPane.showMessageDialog(null,"Sua bandeira é amarela");
            
        }

        if (total>300){
          JOptionPane.showMessageDialog(null,"Resultado:"+(0.29*total));
           JOptionPane.showMessageDialog(null,"Sua bandeira é vermelha");    
       }
        
     
       
      JOptionPane.showMessageDialog(null,"Leitura anterior:"+leituraAnterior
      +"\nLeitura atual:"
      +leituraAtual
      +"\nTotal sem cobrança:"
      +total);
      
       
      
    }
    
}
