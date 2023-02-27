package aulaclass;
import javax.swing.JOptionPane;

public class Aulaclass {

    public static void main(String[] args) {
        Operacao operacao = new Operacao();// retorna o valor da operação
        double a,b;
        String o,temp;
        do{
          temp = JOptionPane.showInputDialog(null,"digite o primeiro numero", "numero 1",3);  
        }while(temp.matches("[a-zA-Z]+"));
        a = Double.parseDouble(temp);
        do{
          temp = JOptionPane.showInputDialog(null,"digite o segundo numero", "numero 2",3);
        }while(temp.matches("[a-zA-Z]+"));
        b = Double.parseDouble(temp);
        do{
             o = JOptionPane.showInputDialog(null,"digite a operação matematica\n\n+ - adição\n- - subtração\n* - multiplicação\n/ - divsão", "operação",3);
        }while(!((o.equals("+"))||(o.equals("-"))||(o.equals("*"))||(o.equals("/"))));
        
        switch(o){
            case "+":
                JOptionPane.showMessageDialog(null, "o resultado é "+ operacao.adicao(a, b) +"", "resultado", 1);
            break;
            case "-":
                JOptionPane.showMessageDialog(null, "o resultado é "+ operacao.subtracao(a, b) +"", "resultado", 1);
            break;
            case "/":
                JOptionPane.showMessageDialog(null, "o resultado é "+ operacao.divisao(a, b) +"", "resultado", 1);
            break;
            case "*":
                JOptionPane.showMessageDialog(null, "o resultado é "+ operacao.multiplicacao(a, b) +"", "resultado", 1);
            break;
                    
        }
    }
    
}
