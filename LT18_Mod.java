import javax.swing.JOptionPane;
public class LT18_Mod{

    static int v1, v2, diferenca;
    public static void main (String[]args){
        recebervalor();
            JOptionPane.showMessageDialog(null, "A diferença é: "+diferenca);
    }
    static void recebervalor(){
        v1= Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        v2= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        diferenca= (v1-v2);
        if (diferenca<0){
            diferenca= (v2-v1);
        }

    }
}   
