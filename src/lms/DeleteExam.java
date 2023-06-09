package lms;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author A M A
 */
public class DeleteExam extends javax.swing.JFrame {

    /**
     * Creates new form DeleteExam
     */
    public DeleteExam() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        CloseButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        QID1Text = new javax.swing.JTextField();
        QID2Text = new javax.swing.JTextField();
        CNameText = new javax.swing.JTextField();
        QID3Text = new javax.swing.JTextField();
        QID4Text = new javax.swing.JTextField();
        QID5Text = new javax.swing.JTextField();
        EIDText = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 183));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Adventure", 1, 40)); // NOI18N
        jLabel2.setText("Delete Exam ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 6, -1, -1));

        CloseButton.setBackground(new java.awt.Color(255, 255, 255));
        CloseButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(255, 0, 51));
        CloseButton.setText("Close");
        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 1066, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Exam ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 112, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("Course Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setText("Question ID 1 :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 211, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("Question ID 5 :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 415, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setText("Question ID 2 :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 259, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("Question ID 3 :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 313, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setText("Question ID 4 :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 364, -1, -1));

        QID1Text.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(QID1Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 208, 700, -1));

        QID2Text.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(QID2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 259, 700, -1));

        CNameText.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(CNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 157, 700, -1));

        QID3Text.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(QID3Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 700, -1));

        QID4Text.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(QID4Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 361, 700, -1));

        QID5Text.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(QID5Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 412, 700, -1));

        EIDText.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(EIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 112, 310, -1));

        SearchButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 112, -1, -1));

        DeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 463, -1, -1));

        ClearButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 463, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        ExamManagement.open=0;
        setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        String id = EIDText.getText();
         try
        {
           Connection con = MyConnection.createConnection();
           Statement st = con.createStatement();
           ResultSet rs =st.executeQuery(" select * from quiz where id ="+id);
           if(rs.next())
           {             
             QID1Text.setText(rs.getString(2));
             QID2Text.setText(rs.getString(3));
             QID3Text.setText(rs.getString(4));
             QID4Text.setText(rs.getString(5));
             QID5Text.setText(rs.getString(6));
             CNameText.setText(rs.getString(7));        
             EIDText.setEditable(false);
           }
           else
           {
            JFrame jf = new JFrame();            
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf , "Exam ID does not exist");
           }
        }
        catch (Exception e)
        {
            JFrame jf = new JFrame();            
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf , e);
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        String id = EIDText.getText();
          try
        {
           Connection con = MyConnection.createConnection();
           PreparedStatement pa = con.prepareStatement("delete from quiz where id=? ");            
           pa.setString(1, id); 
           pa.executeUpdate();
           JFrame jf = new JFrame();
           jf.setAlwaysOnTop(true);
           JOptionPane.showMessageDialog(jf , "successfully Deleted");
           setVisible(false);
           new DeleteExam().setVisible(true);                    
        }
        catch (Exception e)
        {
            JFrame jf = new JFrame();           
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf , e);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
         EIDText.setText("");
         QID1Text.setText("");
         QID2Text.setText("");
         QID3Text.setText("");
         QID4Text.setText("");
         QID5Text.setText("");
         CNameText.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CNameText;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField EIDText;
    private javax.swing.JTextField QID1Text;
    private javax.swing.JTextField QID2Text;
    private javax.swing.JTextField QID3Text;
    private javax.swing.JTextField QID4Text;
    private javax.swing.JTextField QID5Text;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
