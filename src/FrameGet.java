import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameGet extends JFrame {


    private JPanel jpanel;
    private JButton clickmeTestButton;
    private JButton button1;
    private JButton ssss;
    private JCheckBox checkBox1ff;
    private JRadioButton radioButton1;
    private JTextField hjjjTextField;
    private JTextPane textPane1;
    private JTextField gfhfghfjgTextField;
    private JCheckBox checkBox1;
    private JTextField asdfTextField;
    private JTextArea fdggdfTextArea;

    public FrameGet() {
        createUIComponents();

    setContentPane(jpanel);

    setSize(500,500);
    clickmeTestButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("siempre ss");

        }
    });
}

    private void createUIComponents() {
        hjjjTextField= new JTextField();
        hjjjTextField.setText("SE INTRODUJO TEXTO AQUI ");
        // TODO: place custom component creation code here
    }
}
