/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crm;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Eddy
 */
public class newAdherent extends javax.swing.JDialog {
public Connection con;
    /**
     * Creates new form newAdherent
     */
    public newAdherent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Customer Relationship Management - New Adherent");
        
    }
    
        private void getConnection() {
        try {
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost:3306/adherent";
            String USERNAME = "root";
            String PASSWORD = "You@hotmail.com";
            Class.forName(JDBC_DRIVER);
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
             public void clearFields(){
            txtNewId.setText("");
            txtNewFirstName.setText("");
            txtNewLastName.setText("");

     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNewFirstName = new javax.swing.JTextField();
        txtNewLastName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNewId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        txtNewFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewFirstNameActionPerformed(evt);
            }
        });
        txtNewFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewFirstNameKeyTyped(evt);
            }
        });

        txtNewLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewLastNameKeyTyped(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnSaveKeyReleased(evt);
            }
        });

        jLabel3.setText("Individual:");

        txtNewId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewIdActionPerformed(evt);
            }
        });
        txtNewId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewIdKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNewLastName)
                                    .addComponent(txtNewId)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNewFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNewFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNewLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNewId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewFirstNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(txtNewFirstName.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fill in First Name", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if(txtNewLastName.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fill in Last Name", "Warning", JOptionPane.WARNING_MESSAGE);
        }else if(txtNewId.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fill in Individual", "Warning", JOptionPane.WARNING_MESSAGE);
            }else{
            try{
                
                String firstName = txtNewFirstName.getText();
                String lastName = txtNewLastName.getText();
                String Id = txtNewId.getText();
                
                
                getConnection();
                
                 String query = "insert into tbladherents values "
                    + "('"+Id+"','"+firstName+"','"+lastName+"')";
                
                Statement stmt = con.createStatement();
                stmt.execute(query);
                clearFields();
                this.dispose();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                
                JOptionPane.showMessageDialog(this, "Id already exists", "Warning",JOptionPane.WARNING_MESSAGE);
            
            }
        }
        
            

            
        
    }//GEN-LAST:event_btnSaveActionPerformed
        
    private void txtNewIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewIdActionPerformed

    private void btnSaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyReleased

     
    }//GEN-LAST:event_btnSaveKeyReleased

    private void txtNewFirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewFirstNameKeyTyped
if (txtNewFirstName.getText().length()>44){
            evt.consume();
        }
        char c = evt.getKeyChar();
                if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewFirstNameKeyTyped

    private void txtNewLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewLastNameKeyTyped
if (txtNewLastName.getText().length()>44){
            evt.consume();
        }
        char c = evt.getKeyChar();
                if((Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewLastNameKeyTyped

    private void txtNewIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewIdKeyTyped
if (txtNewId.getText().length()>10){
            evt.consume();
        }
        char c = evt.getKeyChar();
                if((!Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewIdKeyTyped

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
            java.util.logging.Logger.getLogger(newAdherent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newAdherent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newAdherent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newAdherent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                newAdherent dialog = new newAdherent(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNewFirstName;
    private javax.swing.JTextField txtNewId;
    private javax.swing.JTextField txtNewLastName;
    // End of variables declaration//GEN-END:variables
}
