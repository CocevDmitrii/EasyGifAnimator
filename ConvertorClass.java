package javaapplication1;
import javax.swing.*;  


public class ConvertorClass {
    // Load dialog

    final JDialog load = new JDialog ( frame );

    JPanel panel2 = new JPanel ( new BorderLayout () );
    panel2.setBorder ( BorderFactory.createEmptyBorder ( 15, 15, 15, 15 ) );
    load.add ( panel2 );

    final JProgressBar progressBar = new JProgressBar ( 0, 100 );
    panel2.add ( progressBar );

    load.setModal ( false );
    load.pack ();
    load.setLocationRelativeTo ( frame );
}
};