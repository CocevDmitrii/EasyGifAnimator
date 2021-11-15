package javaapplication1;
import javax.swing.*;  

SwingUtilities.invokeLater ( new Runnable ()
        {
            public void run ()
            {
                panel.add ( button );
                button.revalidate ();
                progressBar.setValue ( finalI );
            }
};