/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.squirrels;

/**
 *
 * @author Will
 */
public class findGroupPage extends javax.swing.JFrame {

    /**
     * Creates new form findGroupPage
     */
    public findGroupPage() {
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

        locationButtonGroup = new javax.swing.ButtonGroup();
        sizeButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        backhomeButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        bibleBox = new javax.swing.JCheckBox();
        engBox = new javax.swing.JCheckBox();
        mathBox = new javax.swing.JCheckBox();
        torreyBox = new javax.swing.JCheckBox();
        physBox = new javax.swing.JCheckBox();
        bioBox = new javax.swing.JCheckBox();
        chemBox = new javax.swing.JCheckBox();
        otherBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        commonsRadio = new javax.swing.JRadioButton();
        fireplaceRadio = new javax.swing.JRadioButton();
        libraryRadio = new javax.swing.JRadioButton();
        fountainRadio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        onethreeRadio = new javax.swing.JRadioButton();
        foursixRadio = new javax.swing.JRadioButton();
        sevenplusRadio = new javax.swing.JRadioButton();
        findgroupButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Find Group");

        backhomeButton.setText("<- Home");
        backhomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backhomeButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Subject:");

        bibleBox.setText("Bible");

        engBox.setText("English");

        mathBox.setText("Math");

        torreyBox.setText("Torrey");

        physBox.setText("Phys");

        bioBox.setText("Bio");

        chemBox.setText("Chem");

        otherBox.setText("Other");

        jLabel3.setText("*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Location:");

        locationButtonGroup.add(commonsRadio);
        commonsRadio.setText("Commons");

        locationButtonGroup.add(fireplaceRadio);
        fireplaceRadio.setText("Fireplace");

        locationButtonGroup.add(libraryRadio);
        libraryRadio.setText("Library");

        locationButtonGroup.add(fountainRadio);
        fountainRadio.setText("Fountain");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Group Size:");

        sizeButtonGroup.add(onethreeRadio);
        onethreeRadio.setText("1-3");

        sizeButtonGroup.add(foursixRadio);
        foursixRadio.setText("4-6");

        sizeButtonGroup.add(sevenplusRadio);
        sevenplusRadio.setText("7+");

        findgroupButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        findgroupButton.setText("Find Group");
        findgroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findgroupButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backhomeButton)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bibleBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(engBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mathBox))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(physBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bioBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(chemBox)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(otherBox)
                                    .addComponent(torreyBox)))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(libraryRadio)
                                    .addComponent(commonsRadio))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fireplaceRadio)
                                    .addComponent(fountainRadio)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(onethreeRadio)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(foursixRadio)
                                        .addGap(18, 18, 18)
                                        .addComponent(sevenplusRadio))
                                    .addComponent(findgroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backhomeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bibleBox)
                    .addComponent(engBox)
                    .addComponent(mathBox)
                    .addComponent(torreyBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(physBox)
                    .addComponent(bioBox)
                    .addComponent(chemBox)
                    .addComponent(otherBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commonsRadio)
                    .addComponent(fireplaceRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(libraryRadio)
                    .addComponent(fountainRadio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onethreeRadio)
                    .addComponent(foursixRadio)
                    .addComponent(sevenplusRadio))
                .addGap(29, 29, 29)
                .addComponent(findgroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backhomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backhomeButtonActionPerformed
        new HomeScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backhomeButtonActionPerformed

    private void findgroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findgroupButtonActionPerformed
        
        
        // check the required fields
        if (bibleBox.isSelected() || engBox.isSelected() || mathBox.isSelected()
                || torreyBox.isSelected() || physBox.isSelected() 
                || bioBox.isSelected() || chemBox.isSelected() 
                || otherBox.isSelected()) {
            
            if (onethreeRadio.isSelected() || foursixRadio.isSelected()
                    || sevenplusRadio.isSelected()) {
                new resultsPage().setVisible(true);
                this.setVisible(false); 
            }       
        }
            
                       
            
    }//GEN-LAST:event_findgroupButtonActionPerformed

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
            java.util.logging.Logger.getLogger(findGroupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(findGroupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(findGroupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(findGroupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new findGroupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backhomeButton;
    private javax.swing.JCheckBox bibleBox;
    private javax.swing.JCheckBox bioBox;
    private javax.swing.JCheckBox chemBox;
    private javax.swing.JRadioButton commonsRadio;
    private javax.swing.JCheckBox engBox;
    private javax.swing.JButton findgroupButton;
    private javax.swing.JRadioButton fireplaceRadio;
    private javax.swing.JRadioButton fountainRadio;
    private javax.swing.JRadioButton foursixRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton libraryRadio;
    private javax.swing.ButtonGroup locationButtonGroup;
    private javax.swing.JCheckBox mathBox;
    private javax.swing.JRadioButton onethreeRadio;
    private javax.swing.JCheckBox otherBox;
    private javax.swing.JCheckBox physBox;
    private javax.swing.JRadioButton sevenplusRadio;
    private javax.swing.ButtonGroup sizeButtonGroup;
    private javax.swing.JCheckBox torreyBox;
    // End of variables declaration//GEN-END:variables
}
