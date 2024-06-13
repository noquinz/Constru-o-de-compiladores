package codemachine;

import javax.swing.JFrame;

public class CodeMachineApp  
{
    public static void main(String[] args) 
    {
        codemachineVisualizador pv = new codemachineVisualizador();
        pv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pv.setVisible(true);
    }
}
