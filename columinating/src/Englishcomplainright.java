/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amabd7808
 */
public class Englishcomplainright extends javax.swing.JFrame {

    /**
     * Creates new form Englishcomplainright
     */
    public Englishcomplainright() {
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
        jPanel2 = new javax.swing.JPanel();
        lbltitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadiscription = new javax.swing.JTextArea();
        lblpic = new javax.swing.JLabel();
        lbltypeanswer = new javax.swing.JLabel();
        txtfanswer = new javax.swing.JTextField();
        btngiveitback = new javax.swing.JButton();
        btnsteal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitle1.setFont(new java.awt.Font("Ti92Pluspc", 1, 24)); // NOI18N
        lbltitle1.setText("Make your own adventure stage 5");

        txtadiscription.setColumns(20);
        txtadiscription.setRows(5);
        txtadiscription.setText("The principal saw everything in the \ncamera and took your complain, the \nprincipal suspended Hizashi for a week \nand you were very happy you didn’t \npunch him in the face. On your way \nhome you saw luffy’s hat was falling \non the floor,You went and picked up \nthe hat and you were wondering should \nyou take the hat and give it back to \nluffy or steal it and run. The \ndistance between you and luffy was \n18meters should you steal the hat or \ngive it back to him. If you ran to luffy \nit will take you 13 seconds to give him \nthe hat. Calculate the speed in m/s. \ngive your answer in 2 significant digits");
        txtadiscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtadiscriptionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtadiscription);

        lblpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/straw hat1.png"))); // NOI18N
        lblpic.setText("jLabel1");

        lbltypeanswer.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        lbltypeanswer.setText("Type your answer here ---->");

        btngiveitback.setText("give it back");
        btngiveitback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiveitbackActionPerformed(evt);
            }
        });

        btnsteal.setText("steal it ");
        btnsteal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstealActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lbltitle1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btngiveitback)
                    .addComponent(lbltypeanswer, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfanswer, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addGap(351, 351, 351))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnsteal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltypeanswer, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(txtfanswer))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngiveitback)
                    .addComponent(btnsteal))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void txtadiscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtadiscriptionMouseClicked
    txtadiscription.setEditable(false);
    }//GEN-LAST:event_txtadiscriptionMouseClicked

    private void btngiveitbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiveitbackActionPerformed
    double answer;
 answer = Double.parseDouble(txtfanswer.getText());
 //IF HE GOT THE RIGHT ANSWER HE WILL KEEP GOING TILL HE WINS 
 if (answer == 1.3){
     this.setVisible(false);
     new youwon().setVisible(true);
 }
 //IF HE GOT THE WRONG ANSWER HE WILL GO TO THE FIRST STEP OF THE USER LOSING
 else {
     this.setVisible(false);
     new gearsecond().setVisible(true);
 }
    }//GEN-LAST:event_btngiveitbackActionPerformed

    private void btnstealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstealActionPerformed
      double answer;
 answer = Double.parseDouble(txtfanswer.getText());
 if (answer == 1.3){
     this.setVisible(false);
     new stealright().setVisible(true);
 }
 else {
     this.setVisible(false);
     new stealwrong().setVisible(true);
 }
    }//GEN-LAST:event_btnstealActionPerformed

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
            java.util.logging.Logger.getLogger(Englishcomplainright.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Englishcomplainright.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Englishcomplainright.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Englishcomplainright.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Englishcomplainright().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngiveitback;
    private javax.swing.JButton btnsteal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblpic;
    private javax.swing.JLabel lbltitle1;
    private javax.swing.JLabel lbltypeanswer;
    private javax.swing.JTextArea txtadiscription;
    private javax.swing.JTextField txtfanswer;
    // End of variables declaration//GEN-END:variables
}