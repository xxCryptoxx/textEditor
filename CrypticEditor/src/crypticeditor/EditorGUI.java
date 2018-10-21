package crypticeditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.FILES_ONLY;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Crypto
 */
public class EditorGUI extends javax.swing.JFrame {

    /**
     * Creates new form EditorGUI
     */
    public EditorGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        fileNew = new javax.swing.JMenuItem();
        fileOpen = new javax.swing.JMenuItem();
        fileSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        fileExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        textCopy = new javax.swing.JMenuItem();
        textCut = new javax.swing.JMenuItem();
        textPaste = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        programAbout = new javax.swing.JMenuItem();
        programVersion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setName(""); // NOI18N

        textArea.setBackground(new java.awt.Color(204, 204, 204));
        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setTabSize(3);
        textArea.setName(""); // NOI18N
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        fileNew.setText("New");
        fileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNewActionPerformed(evt);
            }
        });
        jMenu1.add(fileNew);

        fileOpen.setText("Open");
        fileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileOpenActionPerformed(evt);
            }
        });
        jMenu1.add(fileOpen);

        fileSave.setText("Save");
        fileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSaveActionPerformed(evt);
            }
        });
        jMenu1.add(fileSave);
        jMenu1.add(jSeparator1);

        fileExit.setText("Exit");
        fileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExitActionPerformed(evt);
            }
        });
        jMenu1.add(fileExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        textCopy.setText("Copy");
        jMenu2.add(textCopy);

        textCut.setText("Cut");
        jMenu2.add(textCut);

        textPaste.setText("Paste");
        jMenu2.add(textPaste);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");

        programAbout.setText("Program");
        programAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programAboutActionPerformed(evt);
            }
        });
        jMenu3.add(programAbout);

        programVersion.setText("Version");
        programVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programVersionActionPerformed(evt);
            }
        });
        jMenu3.add(programVersion);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void programVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programVersionActionPerformed
        //
    }//GEN-LAST:event_programVersionActionPerformed

    private void programAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programAboutActionPerformed
        //
    }//GEN-LAST:event_programAboutActionPerformed

    /**
     * File Menu Actions
     * @param evt 
     */
    private void fileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNewActionPerformed
        if(textArea.getText().isEmpty() == false) {
            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Do you want to save changes?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            switch (response) {
                case JOptionPane.NO_OPTION:
                    textArea.setText("");
                    break;
                case JOptionPane.YES_OPTION:
                    fileSaveActionPerformed(evt);
                    textArea.setText("");
                    break;
                case JOptionPane.CANCEL_OPTION:
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_fileNewActionPerformed

    private void fileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileOpenActionPerformed
        if (textArea.getText().isEmpty() == true) {
            try {
                JFileChooser choose = new JFileChooser("user");
                choose.setFileSelectionMode(FILES_ONLY);
                choose.addChoosableFileFilter(new FileNameExtensionFilter("txt", "txt"));
                choose.addChoosableFileFilter(new FileNameExtensionFilter("xyz", "xyz"));
                choose.setAcceptAllFileFilterUsed(true);

                int re = choose.showOpenDialog(this);

                if(re == JFileChooser.APPROVE_OPTION) {
                    File openFile = choose.getSelectedFile();
                    FileReader fr = new FileReader(openFile);
                    BufferedReader br = new BufferedReader(fr);

                    textArea.read(br, null);
                    String oldText = textArea.getText();
                    br.close();
                }
            } catch(IOException e){ 
                e.printStackTrace();
            }
        } else {
            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Do you want to save changes?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.NO_OPTION) {
                textArea.setText("");
                fileOpenActionPerformed(evt);
            }
            else if (response == JOptionPane.YES_OPTION) {
                fileSaveActionPerformed(evt);
                textArea.setText("");
                fileOpenActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_fileOpenActionPerformed

    private void fileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSaveActionPerformed
        JFileChooser saveFile = new JFileChooser();
        saveFile.setFileSelectionMode(FILES_ONLY);
        saveFile.addChoosableFileFilter(new FileNameExtensionFilter("txt", "txt"));
        saveFile.addChoosableFileFilter(new FileNameExtensionFilter("xyz", "xyz"));
        saveFile.setAcceptAllFileFilterUsed(true);
        
        int re = saveFile.showSaveDialog(this);
        if (re == JFileChooser.APPROVE_OPTION) {
            File outFile;
            outFile = saveFile.getSelectedFile();

            try {
                if (!outFile.exists()) {
                    outFile.createNewFile();
                }
                
                FileWriter fw = new FileWriter(outFile);
                
                fw.write(textArea.getText());
                fw.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_fileSaveActionPerformed

    private void fileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExitActionPerformed
      if(textArea.getText().isEmpty() == false) {
          JDialog.setDefaultLookAndFeelDecorated(true);
          int response = JOptionPane.showConfirmDialog(null, "Exit without saving?");
          
          if(response == JOptionPane.NO_OPTION) {
              System.exit(0);
          }
          if(response == JOptionPane.YES_OPTION) {
              fileSaveActionPerformed(evt);
          }
          else if (response == JOptionPane.YES_OPTION){
          }
      } else {
          System.exit(0);
      }
    }//GEN-LAST:event_fileExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(textArea.getText().isEmpty() == false) {
            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Do you want to save changes?", "My Notepad", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if(response == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
            else if (response == JOptionPane.YES_OPTION) {
            }
        }
        else {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem fileExit;
    private javax.swing.JMenuItem fileNew;
    private javax.swing.JMenuItem fileOpen;
    private javax.swing.JMenuItem fileSave;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem programAbout;
    private javax.swing.JMenuItem programVersion;
    public javax.swing.JTextArea textArea;
    private javax.swing.JMenuItem textCopy;
    private javax.swing.JMenuItem textCut;
    private javax.swing.JMenuItem textPaste;
    // End of variables declaration//GEN-END:variables
}
