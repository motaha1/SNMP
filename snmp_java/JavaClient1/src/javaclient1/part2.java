/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaclient1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class part2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public part2() {
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

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        system = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        con = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Tcp Group");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        system.setColumns(20);
        system.setRows(5);
        jScrollPane2.setViewportView(system);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 255));
        jButton2.setText("System Group");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("change contact :");

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("change");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("zoom");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Connection state	", " source address	", "source port", " dest. address	", "dest. port "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton6.setBackground(new java.awt.Color(255, 204, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("zoom");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //jTable1.setEnabled(false);
                                       
        // TODO add your handling code here:
                      try {                                         
            // TODO add your handling code here:
            URL url = null;
            try {
                url = new URL ("http://localhost/phphome/tcp_test.php");
            } catch (MalformedURLException ex) {
                Logger.getLogger(part2.class.getName()).log(Level.SEVERE, null, ex);
            }
            URLConnection urlc = url.openConnection();
            urlc.setAllowUserInteraction(true);
            urlc.setDoInput(true);
            urlc.setDoOutput(true);
            
            //String str = "name=88888";
            OutputStream os = null;
            try {
                os = urlc.getOutputStream();
            } catch (IOException ex) {
                Logger.getLogger(part2.class.getName()).log(Level.SEVERE, null, ex);
            }
            //byte [] data = str.getBytes();
            //os.write(data);
            
            InputStream is = urlc.getInputStream();
            String s = "";
            int ch=-1;
            while((ch = is.read()) != -1) {
                
             // System.out.print((char)ch);
          s = s+ (char)ch ;
          
          
          
          

            }
            String[] arr = s.split(";");
             String[] arr1 = s.split("1");
           // System.out.print(arr[12]);
             
            String[] dataRow = s.split(";");
            
              String[] ii = null ;

             DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                       //   List oo= new ArrayList<String>();
        // List<String> wordList = Arrays.asList(dataRow); 
              List<String> wordList = Arrays.asList(dataRow);  
                     Vector<String> v = new Vector<String>();
  Vector<String> pp = new Vector<String>();
          
         // Use the addAll method of the Collections to add
         // all array elements to the vector object
         
         
        Collections.addAll(v, dataRow);
        Collections.addAll(pp, dataRow);

       // for (Object o : v) {
   
    // model.addRow(v);
    
  
//}



          int z=0 ; 
//int i=6 ;             
             // v.removeAllElements();
              Object[] tableLines = new Object [pp.size()/6] ;
              int zz = pp.size();
         //    while (zz!=0){
                   for(int i = 0; i < pp.size();  i=i+6){
                 
                 

                //model.addRow(v);
     // v.remove(0);
     // model.addRow(v);
     v.removeAllElements();
     tableLines[z]=dataRow[i]+"/" +dataRow[i+1]+"/"+dataRow[i+2]+"/"+dataRow[i+3]+"/"+dataRow[i+4]+"/"+dataRow[i+5] ;
         /*v.add(dataRow[i]);
         v.add(dataRow[i+1]);
         v.add(dataRow[i+2]);
         v.add(dataRow[i+3]);
         v.add(dataRow[i+4]);
         v.add(dataRow[i+5]);*/
           z++ ; 
         //model.addRow(v);
       //  zz=zz-6 ; 
        // i=i+6 ; 
        
         
        
             
                        //}
          
              }
                
                          for (Object tableLine : tableLines) {
                              String line = tableLine.toString();
                              String[] dataRow1 = line.split("/");
                              model.addRow(dataRow1);
                          }
                          //  dataRow = dataRow.copyOfRange(dataRow, 1, arr.length);
                 
             


                 

            
                
            
             

            
            
        } catch (IOException ex) {
            Logger.getLogger(part2.class.getName()).log(Level.SEVERE, null, ex);}
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
              try {                                         
            // TODO add your handling code here:
            URL url = null;
            try {
                url = new URL ("http://localhost/phphome/system.php");
            } catch (MalformedURLException ex) {
                Logger.getLogger(part2.class.getName()).log(Level.SEVERE, null, ex);
            }
            URLConnection urlc = url.openConnection();
            urlc.setAllowUserInteraction(true);
            urlc.setDoInput(true);
            urlc.setDoOutput(true);
            
            String str = "contact=lolo";
            OutputStream os = null;
            try {
                os = urlc.getOutputStream();
            } catch (IOException ex) {
                Logger.getLogger(part2.class.getName()).log(Level.SEVERE, null, ex);
            }
            byte [] data = str.getBytes();
            os.write(data);
            
            InputStream is = urlc.getInputStream();
            String s = "";
            int ch=-1;
            while((ch = is.read()) != -1) {

               
                System.out.print((char)ch);
          s = s+ (char)ch ;
            system.setText(s);
            
       system.setEditable(false);
                      
   
         
            }
            
        } catch (IOException ex) {
            Logger.getLogger(part2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {                                         
            // TODO add your handling code here:
            URL url = null;
            try {
                url = new URL ("http://localhost/phphome/change.php");
            } catch (MalformedURLException ex) {
                Logger.getLogger(part2.class.getName()).log(Level.SEVERE, null, ex);
            }
            URLConnection urlc = url.openConnection();
            urlc.setAllowUserInteraction(true);
            urlc.setDoInput(true);
            urlc.setDoOutput(true);
              String z= con.getText();
            String str = "contact="+z;
          
            OutputStream os = null;
            try {
                os = urlc.getOutputStream();
            } catch (IOException ex) {
                Logger.getLogger(part2.class.getName()).log(Level.SEVERE, null, ex);
            }
            byte [] data = str.getBytes();
            os.write(data);
            
            InputStream is = urlc.getInputStream();
            String s = "";
            int ch=-1;
            while((ch = is.read()) != -1) {

               
                System.out.print((char)ch);
          s = s+ (char)ch ;
            system.setText(s);
            
                       

                      
   
         
            }
            
        } catch (IOException ex) {
            Logger.getLogger(part2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        table o = new table();
        o.show();
        o.tt.doClick();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        zoom uu = new zoom ();
        uu.tcp.setEditable(false);
        uu.tcp.setText(system.getText());
        uu.show();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(part2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new part2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField con;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextArea system;
    // End of variables declaration//GEN-END:variables
}
