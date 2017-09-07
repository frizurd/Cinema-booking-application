package cinemaClient;

public class moviePanel extends javax.swing.JPanel {

    private ClientFrame parentFrame;
    
    public moviePanel(String name, ClientFrame frame) {
        initComponents();
        
        parentFrame = frame;
        helloLabel.setText("Hey "+name+", which movie do you want to watch?");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movie2 = new javax.swing.JButton();
        movie1 = new javax.swing.JButton();
        helloLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        movie2.setText("Arrival");
        movie2.setToolTipText("Arrival");
        movie2.setMaximumSize(new java.awt.Dimension(200, 300));
        movie2.setPreferredSize(new java.awt.Dimension(150, 220));
        movie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie2ActionPerformed(evt);
            }
        });

        movie1.setText("Inside Men");
        movie1.setToolTipText("Inside Men");
        movie1.setIconTextGap(0);
        movie1.setMaximumSize(new java.awt.Dimension(200, 300));
        movie1.setPreferredSize(new java.awt.Dimension(150, 220));
        movie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movie1ActionPerformed(evt);
            }
        });

        helloLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        helloLabel.setText("Hey ____, which movie do you want to watch?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helloLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(movie1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(movie2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(helloLabel)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movie1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movie2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void movie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie2ActionPerformed
        parentFrame.changePanel("time", "Arrival");
    }//GEN-LAST:event_movie2ActionPerformed

    private void movie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movie1ActionPerformed
        parentFrame.changePanel("time", "Inside Men");
    }//GEN-LAST:event_movie1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel helloLabel;
    private javax.swing.JButton movie1;
    private javax.swing.JButton movie2;
    // End of variables declaration//GEN-END:variables
}
