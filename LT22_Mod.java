import javax.swing.JOptionPane;
public class LT22_Mod {
    static int n1, n2;
    public static void main (String[]args){
        Maior();
    }
    static void Maior(){
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor: "));
        if (n1>n2){
            JOptionPane.showMessageDialog(null, "A ordem é "+n1 +" e "+n2);
        }
        else{
            JOptionPane.showMessageDialog(null, "A ordem é "+n2 +" e "+n1);
        }
    }
}  
