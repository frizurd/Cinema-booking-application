package cinemaClient;

import javax.swing.JOptionPane;

public class timePanel extends javax.swing.JPanel {

    private ClientFrame parentFrame;
    
    public timePanel(String movieName, ClientFrame frame) {
        initComponents();
        
        parentFrame = frame;
        timeLabel.setText("At what time would you like to watch "+movieName+"?");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeGroup = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        timeLabel = new javax.swing.JLabel();
        twelveButton = new javax.swing.JRadioButton();
        fifteenButton = new javax.swing.JRadioButton();
        twentyButton = new javax.swing.JRadioButton();
        seatButton = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(595, 480));

        timeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        timeLabel.setText("At what time would you like to watch ____?");

        timeGroup.add(twelveButton);
        twelveButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        twelveButton.setText("12:00");
        twelveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twelveButtonActionPerformed(evt);
            }
        });

        timeGroup.add(fifteenButton);
        fifteenButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        fifteenButton.setText("15:00");
        fifteenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifteenButtonActionPerformed(evt);
            }
        });

        timeGroup.add(twentyButton);
        twentyButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        twentyButton.setText("20:00");

        seatButton.setText("Select seat");
        seatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(twelveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fifteenButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(twentyButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(seatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(timeLabel)
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(timeLabel)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twelveButton)
                    .addComponent(fifteenButton)
                    .addComponent(twentyButton))
                .addGap(18, 18, 18)
                .addComponent(seatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void twelveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twelveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twelveButtonActionPerformed

    private void fifteenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifteenButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fifteenButtonActionPerformed

    private void seatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatButtonActionPerformed
        String time = "";
        if(twelveButton.isSelected()) {
            time = "12:00";
        }
        if(fifteenButton.isSelected()) {
            time = "15:00";
        }
        if(twentyButton.isSelected()) {
            time = "20:00";
        }
        if(time == "") {
            JOptionPane.showMessageDialog (null, "Please select a time for the movie.", 
                "No time", JOptionPane.INFORMATION_MESSAGE);
        } else {
            parentFrame.changePanel("seat", time);
        }
    }//GEN-LAST:event_seatButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton fifteenButton;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton seatButton;
    private javax.swing.ButtonGroup timeGroup;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JRadioButton twelveButton;
    private javax.swing.JRadioButton twentyButton;
    // End of variables declaration//GEN-END:variables
}
