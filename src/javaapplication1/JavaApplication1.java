
      
package javaapplication1;
import java.io.*;
import java.util.*;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class JavaApplication1 {

    
    public static void main(String[] args) {
         try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
      
      SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new NewJFrame().setVisible(true);
			}
		});
      
    }
    
}
