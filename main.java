package aulaclass;
import javax.swing.JOptionPane;

public class Aulaclass {

    public static void main(String[] args) {
        Operacao operacao = new Operacao(); //faz as operações e informa ao usuario
        double a,b;
        String o;
        a = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o primeiro numero", "numero 1",3));
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o segundo numero", "numero 2",3));
        do{
             o = JOptionPane.showInputDialog(null,"digite a operação matematica\n\n+ - adição\n- - subtração\n* - multiplicação\n/ - divsão", "operação",3);
        }while(!((o.equals("+"))||(o.equals("-"))||(o.equals("*"))||(o.equals("/"))));
        
        switch(o){
            case "+":
                operacao.adicao(a, b);
            break;
            case "-":
                operacao.subtracao(a, b);
            break;
            case "/":
                operacao.divisao(a, b);
            break;
            case "*":
                operacao.multiplicacao(a, b);
            break;
                    
        }
    }
    
}
