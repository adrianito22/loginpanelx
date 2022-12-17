import Views.LoginPanel;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FlatLightLaf.setup();
        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }



        // FrameGet frame=  new FrameGet();
        // frame.setVisible(true);
        // frame.removeAll();

        JFrame frame= new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);


        LoginPanel mipanel= new LoginPanel();
              mipanel.setVisible(true);
        mipanel.setSize(500,500);
        frame.setContentPane(mipanel);


    }
}