package cinemaClient;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.*;

public class ClientFrame extends javax.swing.JFrame {

    private JPanel currentPanel;
    private clientThread thread;
    private String panelName;

    Socket socket;
    DataInputStream inputStream;
    DataOutputStream outputStream;

    public ClientFrame() {
        initComponents();

        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        currentPanel = new namePanel(this);
        add(currentPanel, BorderLayout.CENTER);

        int portNumber = 12001;
        String serverAddress = "localhost";

        try {
            socket = new Socket("localhost", portNumber);
            outputStream = new DataOutputStream(socket.getOutputStream());

            thread = new clientThread(socket, this);
            thread.start();

        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + serverAddress);
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Couldn't get I/O for the connection to " + serverAddress);
            System.exit(1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(491, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ClientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientFrame().setVisible(true);
            }
        });
    }

    public void changePanel(String panelName, String name) {
        getContentPane().removeAll();

        if (null != panelName) switch (panelName) {
            case "name":
                this.panelName = name;
                currentPanel = new namePanel(this);
                break;
            case "movie":
                this.panelName = name;
                currentPanel = new moviePanel(name, this);
                sendMsg(name);
                break;
            case "time":
                this.panelName = name;
                currentPanel = new timePanel(name, this);
                sendMsg(name);
                break;
            case "seat":
                if(thread.isDone()) {
                    currentPanel = new seatPanel(name, this, thread);
                } else {
                    this.panelName = name;
                    sendMsg(name);
                }
                break;
            default:
                break;
        }
        add(currentPanel, BorderLayout.CENTER);

        invalidate();
        validate();
        repaint();
    }

    public void sendMsg(String msg) {
        if (!msg.isEmpty()) {
            try {
                outputStream.writeUTF(msg);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public String getPanelName() {
        return panelName;
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
