
package userdashboard;

import config.session;
import javax.swing.JOptionPane;  
public class AddService extends javax.swing.JFrame {

    
    public AddService() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Home1 = new javax.swing.JButton();
        Pet1 = new javax.swing.JButton();
        Service1 = new javax.swing.JButton();
        Plot1 = new javax.swing.JButton();
        Settings1 = new javax.swing.JButton();
        Acoount2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        PET3 = new javax.swing.JLabel();
        ADD1 = new javax.swing.JButton();
        UPDATE2 = new javax.swing.JButton();
        DELETE1 = new javax.swing.JButton();
        SEARCHBAR1 = new javax.swing.JTextField();
        SEARCH1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        serviceid = new javax.swing.JLabel();
        petidowner3 = new javax.swing.JTextField();
        petid2 = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        dateservice = new javax.swing.JLabel();
        dateservice1 = new javax.swing.JTextField();
        Petidowner2 = new javax.swing.JLabel();
        breed1 = new javax.swing.JLabel();
        species3 = new javax.swing.JTextField();
        petid3 = new javax.swing.JLabel();
        petid4 = new javax.swing.JTextField();
        chkBurial = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        or = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small logo.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 90));

        Home1.setBackground(new java.awt.Color(102, 51, 0));
        Home1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Home1.setForeground(new java.awt.Color(255, 255, 255));
        Home1.setText("HOME");
        Home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home1ActionPerformed(evt);
            }
        });
        jPanel2.add(Home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 50));

        Pet1.setBackground(new java.awt.Color(102, 51, 0));
        Pet1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Pet1.setForeground(new java.awt.Color(255, 255, 255));
        Pet1.setText("PET");
        Pet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pet1ActionPerformed(evt);
            }
        });
        jPanel2.add(Pet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, 50));

        Service1.setBackground(new java.awt.Color(102, 51, 0));
        Service1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Service1.setForeground(new java.awt.Color(255, 255, 255));
        Service1.setText("SERVICE");
        Service1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Service1ActionPerformed(evt);
            }
        });
        jPanel2.add(Service1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 210, 50));

        Plot1.setBackground(new java.awt.Color(102, 51, 0));
        Plot1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Plot1.setForeground(new java.awt.Color(255, 255, 255));
        Plot1.setText("PLOT");
        jPanel2.add(Plot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, 50));

        Settings1.setBackground(new java.awt.Color(102, 51, 0));
        Settings1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Settings1.setForeground(new java.awt.Color(255, 255, 255));
        Settings1.setText("SETTINGS");
        Settings1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings1ActionPerformed(evt);
            }
        });
        jPanel2.add(Settings1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 210, 50));

        Acoount2.setBackground(new java.awt.Color(102, 51, 0));
        Acoount2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Acoount2.setForeground(new java.awt.Color(255, 255, 255));
        Acoount2.setText("ACCOUNT");
        Acoount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acoount2ActionPerformed(evt);
            }
        });
        jPanel2.add(Acoount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 210, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 750));

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PET3.setBackground(new java.awt.Color(102, 51, 0));
        PET3.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        PET3.setForeground(new java.awt.Color(255, 255, 255));
        PET3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PET3.setText("ADD SERVICE");
        jPanel4.add(PET3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 300, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 170));

        ADD1.setBackground(new java.awt.Color(102, 51, 0));
        ADD1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ADD1.setForeground(new java.awt.Color(255, 255, 255));
        ADD1.setText("ADD");
        ADD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD1ActionPerformed(evt);
            }
        });
        jPanel1.add(ADD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 130, 40));

        UPDATE2.setBackground(new java.awt.Color(102, 51, 0));
        UPDATE2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        UPDATE2.setForeground(new java.awt.Color(255, 255, 255));
        UPDATE2.setText("UPDATE");
        UPDATE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATE2ActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 130, 40));

        DELETE1.setBackground(new java.awt.Color(102, 51, 0));
        DELETE1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        DELETE1.setForeground(new java.awt.Color(255, 255, 255));
        DELETE1.setText("DELETE");
        DELETE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETE1ActionPerformed(evt);
            }
        });
        jPanel1.add(DELETE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 120, 40));
        jPanel1.add(SEARCHBAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 260, 40));

        SEARCH1.setBackground(new java.awt.Color(102, 51, 0));
        SEARCH1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        SEARCH1.setForeground(new java.awt.Color(255, 255, 255));
        SEARCH1.setText("SEARCH");
        SEARCH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH1ActionPerformed(evt);
            }
        });
        jPanel1.add(SEARCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 180, 150, 40));

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serviceid.setBackground(new java.awt.Color(102, 51, 0));
        serviceid.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        serviceid.setForeground(new java.awt.Color(255, 255, 255));
        serviceid.setText("Service ID :");
        jPanel3.add(serviceid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 40));

        petidowner3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petidowner3ActionPerformed(evt);
            }
        });
        jPanel3.add(petidowner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 270, 40));

        petid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petid2ActionPerformed(evt);
            }
        });
        jPanel3.add(petid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 270, 40));

        name.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Service Type:");
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 120, 40));

        dateservice.setBackground(new java.awt.Color(102, 51, 0));
        dateservice.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dateservice.setForeground(new java.awt.Color(255, 255, 255));
        dateservice.setText("Date of Service :");
        jPanel3.add(dateservice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 140, 40));

        dateservice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateservice1ActionPerformed(evt);
            }
        });
        jPanel3.add(dateservice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 270, 40));

        Petidowner2.setBackground(new java.awt.Color(102, 51, 0));
        Petidowner2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Petidowner2.setForeground(new java.awt.Color(255, 255, 255));
        Petidowner2.setText("Pet ID Owner :");
        jPanel3.add(Petidowner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 130, 40));

        breed1.setBackground(new java.awt.Color(102, 51, 0));
        breed1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        breed1.setForeground(new java.awt.Color(255, 255, 255));
        breed1.setText("Cost :");
        jPanel3.add(breed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 50, 40));

        species3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                species3ActionPerformed(evt);
            }
        });
        jPanel3.add(species3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 270, 40));

        petid3.setBackground(new java.awt.Color(102, 51, 0));
        petid3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        petid3.setForeground(new java.awt.Color(255, 255, 255));
        petid3.setText("Pet ID :");
        jPanel3.add(petid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 300, -1, 40));

        petid4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petid4ActionPerformed(evt);
            }
        });
        jPanel3.add(petid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 270, 40));

        chkBurial.setBackground(new java.awt.Color(102, 51, 0));
        chkBurial.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        chkBurial.setForeground(new java.awt.Color(255, 255, 255));
        chkBurial.setText(" BURIAL");
        chkBurial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBurialActionPerformed(evt);
            }
        });
        jPanel3.add(chkBurial, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 90, -1));

        jCheckBox1.setBackground(new java.awt.Color(102, 51, 0));
        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText(" CREMATION");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        or.setBackground(new java.awt.Color(102, 51, 0));
        or.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        or.setForeground(new java.awt.Color(255, 255, 255));
        or.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        or.setText(" or");
        jPanel3.add(or, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 136, 30, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 830, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home1ActionPerformed

    }//GEN-LAST:event_Home1ActionPerformed

    private void Pet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pet1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pet1ActionPerformed

    private void Service1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Service1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Service1ActionPerformed

    private void Settings1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Settings1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Settings1ActionPerformed

    private void Acoount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acoount2ActionPerformed
        System.out.println("Current user: " + session.username);

        if (session.username == null || session.username.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "No user session found. Please log in again.",
                "Session Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        UserProfile profile = new UserProfile();
        profile.setVisible(true);
        profile.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_Acoount2ActionPerformed

    private void ADD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADD1ActionPerformed

    private void UPDATE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDATE2ActionPerformed

    private void DELETE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETE1ActionPerformed

    private void SEARCH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SEARCH1ActionPerformed

    private void petidowner3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petidowner3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petidowner3ActionPerformed

    private void petid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petid2ActionPerformed

    private void dateservice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateservice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateservice1ActionPerformed

    private void species3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_species3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_species3ActionPerformed

    private void petid4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petid4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petid4ActionPerformed

    private void chkBurialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBurialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkBurialActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD1;
    private javax.swing.JButton Acoount2;
    private javax.swing.JButton DELETE1;
    private javax.swing.JButton Home1;
    private javax.swing.JLabel PET3;
    private javax.swing.JButton Pet1;
    private javax.swing.JLabel Petidowner2;
    private javax.swing.JButton Plot1;
    private javax.swing.JButton SEARCH1;
    private javax.swing.JTextField SEARCHBAR1;
    private javax.swing.JButton Service1;
    private javax.swing.JButton Settings1;
    private javax.swing.JButton UPDATE2;
    private javax.swing.JLabel breed1;
    private javax.swing.JCheckBox chkBurial;
    private javax.swing.JLabel dateservice;
    private javax.swing.JTextField dateservice1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel name;
    private javax.swing.JLabel or;
    private javax.swing.JTextField petid2;
    private javax.swing.JLabel petid3;
    private javax.swing.JTextField petid4;
    private javax.swing.JTextField petidowner3;
    private javax.swing.JLabel serviceid;
    private javax.swing.JTextField species3;
    // End of variables declaration//GEN-END:variables
}
