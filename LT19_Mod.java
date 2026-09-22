import javax.swing.JOptionPane;
public class LT19_Mod {
    static int v1,v2, maior;
    public static void main(String[] args) {
        maiorvalor();
            JOptionPane.showMessageDialog(null, "O maior número é: "+maior);
    }
    static void maiorvalor(){
        v1= Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        v2= Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        if (v1>v2)
        {
            maior= v1;
        }
        
        else
        {
           maior= v2;
        }
    }
    
}
