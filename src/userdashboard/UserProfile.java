
package userdashboard;

import config.session;
import javax.swing.JOptionPane;

public class UserProfile extends javax.swing.JFrame {
       
    public UserProfile() {
        initComponents();
        setLocationRelativeTo(null); // Center the frame
        loadCurrentUserInfo();
    }
private void loadCurrentUserInfo() {
     if (session.username == null || session.username.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "No user session found. Please log in again.",
                "Session Error",
                JOptionPane.ERROR_MESSAGE);
        return;
    }

    Usernamehere.setText(session.username);
    
    username2.setText(session.username);
    Fullname2.setText(session.fullname != null ? session.fullname : "N/A");
    email2.setText(session.email != null ? session.email : "N/A");
    phonenumber.setText(session.phonenumber != null ? session.phonenumber : "N/A");
    id.setText(String.valueOf(session.id));
    password2.setText(session.password != null ? session.password : "******"); // optional
    }


    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        USERPROFILE1 = new javax.swing.JLabel();
        phonenumber1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        Fullname1 = new javax.swing.JLabel();
        password1 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Usernamehere = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        phonenumber = new javax.swing.JLabel();
        Fullname2 = new javax.swing.JLabel();
        username2 = new javax.swing.JLabel();
        password2 = new javax.swing.JLabel();
        email2 = new javax.swing.JLabel();
        Back1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        USERPROFILE1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        USERPROFILE1.setForeground(new java.awt.Color(255, 255, 255));
        USERPROFILE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        USERPROFILE1.setText("USER PROFILE");
        jPanel2.add(USERPROFILE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        phonenumber1.setBackground(new java.awt.Color(255, 255, 255));
        phonenumber1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        phonenumber1.setForeground(new java.awt.Color(255, 255, 255));
        phonenumber1.setText("PhoneNumber :");
        jPanel2.add(phonenumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 140, 40));

        id1.setBackground(new java.awt.Color(255, 255, 255));
        id1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setText("ID :");
        jPanel2.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 40, 40));

        username1.setBackground(new java.awt.Color(255, 255, 255));
        username1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setText("Username :");
        jPanel2.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 100, 40));

        Fullname1.setBackground(new java.awt.Color(255, 255, 255));
        Fullname1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Fullname1.setForeground(new java.awt.Color(255, 255, 255));
        Fullname1.setText("Fullname :");
        jPanel2.add(Fullname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 90, 40));

        password1.setBackground(new java.awt.Color(255, 255, 255));
        password1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        password1.setForeground(new java.awt.Color(255, 255, 255));
        password1.setText("Password :");
        jPanel2.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 100, 40));

        email1.setBackground(new java.awt.Color(255, 255, 255));
        email1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        email1.setForeground(new java.awt.Color(255, 255, 255));
        email1.setText("Email :");
        jPanel2.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 60, 40));

        jPanel4.setBackground(new java.awt.Color(153, 102, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usernamehere.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Usernamehere.setForeground(new java.awt.Color(255, 255, 255));
        Usernamehere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usernamehere.setText("User Name Here");
        jPanel4.add(Usernamehere, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 320, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 320, 330));

        id.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 170, 40));

        phonenumber.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        phonenumber.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 150, 40));

        Fullname2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Fullname2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(Fullname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 140, 40));

        username2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        username2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 150, 40));

        password2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        password2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 150, 40));

        email2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        email2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 150, 40));

        Back1.setBackground(new java.awt.Color(102, 51, 0));
        Back1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Back1.setForeground(new java.awt.Color(255, 255, 255));
        Back1.setText("BACK");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });
        jPanel2.add(Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 220, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1230, 330));

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
     userdashboard dashboard = new userdashboard();
    dashboard.setVisible(true);
    dashboard.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_Back1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JLabel Fullname1;
    private javax.swing.JLabel Fullname2;
    private javax.swing.JLabel USERPROFILE1;
    private javax.swing.JLabel Usernamehere;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel email2;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel password2;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JLabel phonenumber1;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel username2;
    // End of variables declaration//GEN-END:variables
}
