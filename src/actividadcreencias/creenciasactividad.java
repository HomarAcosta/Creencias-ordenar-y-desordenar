package actividadcreencias;
import javax.swing.DefaultListModel;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author Homar
 */
public class creenciasactividad extends javax.swing.JFrame {

    /**
     * Creates new form creenciasactividad
     */
    public creenciasactividad() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("Las 28 creencias fundamentales de la iglesia adventista del septimo dia");

        jButton1.setText("Ordenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Desordenar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
cargarordenar();  
     
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      DefaultListModel listModel = new DefaultListModel();
      String cree[] = new String[28];
      cree[0]= "1.Las Sagradas Escrituras";
      cree[1]= "2.La Deidad o trinidad";
      cree[2]="3.Dios Padre";
      cree[3]="4. Dios Hijo";
      cree[4]="5.Dios Espirtu Santo";
      cree[5]="6.Dios es el Creador";
      cree[6]="7.La naturaleza del hombre";
      cree[7]="8.El gran conflicto";
      cree[8]="9.Vida, muerte y resureccion de Cristo";
      cree[9]="10.La experiencia de la salvacion";
      cree[10]="11.El crecimiento en Cristo";
      cree[11]="12.La iglesia";
      cree[12]="13.El remanente y su mision";
      cree[13]="14.La unidad en el cuerpo de Cristo";
      cree[14]="15.El bautismo";
      cree[15]="16.La cena del Señor";
      cree[16]="17.Dones y ministerios espirituales";
      cree[17]="18.El don de la profecia";
      cree[18]="19.La ley de Dios";
      cree[19]="20.El sabado";
      cree[20]="21.La mayordomia";
      cree[21]="22.La conducta cristiana";
      cree[22]="23.Matrimonio y familia";
      cree[23]="24.El ministerio de cristo en el santuario celestial";
      cree[24]="25.La segunda venida de Cristo";
      cree[25]="26.Muerte y resureccion";
      cree[26]="27.El milenio y el fin del pecado";
      cree[27]="28.La nueva tierra";
    for(int i=0; i<cree.length; i++) {
   listModel.addElement(cree[i]);
}
 jList1.setModel(listModel);
    }//GEN-LAST:event_formWindowOpened

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cargarDesordenar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void cargarDesordenar(){
      String cree[] = new String[28];
      cree[0]= "1.Las Sagradas Escrituras";
      cree[1]= "2.La Deidad o trinidad";
      cree[2]="3.Dios Padre";
      cree[3]="4. Dios Hijo";
      cree[4]="5.Dios Espirtu Santo";
      cree[5]="6.Dios es el Creador";
      cree[6]="7.La naturaleza del hombre";
      cree[7]="8.El gran conflicto";
      cree[8]="9.Vida, muerte y resureccion de Cristo";
      cree[9]="10.La experiencia de la salvacion";
      cree[10]="11.El crecimiento en Cristo";
      cree[11]="12.La iglesia";
      cree[12]="13.El remanente y su mision";
      cree[13]="14.La unidad en el cuerpo de Cristo";
      cree[14]="15.El bautismo";
      cree[15]="16.La cena del Señor";
      cree[16]="17.Dones y ministerios espirituales";
      cree[17]="18.El don de la profecia";
      cree[18]="19.La ley de Dios";
      cree[19]="20.El sabado";
      cree[20]="21.La mayordomia";
      cree[21]="22.La conducta cristiana";
      cree[22]="23.Matrimonio y familia";
      cree[23]="24.El ministerio de cristo en el santuario celestial";
      cree[24]="25.La segunda venida de Cristo";
      cree[25]="26.Muerte y resureccion";
      cree[26]="27.El milenio y el fin del pecado";
      cree[27]="28.La nueva tierra";
      modelList = new DefaultListModel();
           jList1.setModel(modelList);
        ArrayList<Integer> valores = generarValoresAleatorios();
    for (Integer valor : valores) {
            modelList.addElement(cree [valor]);
        }
    }

public ArrayList<Integer> generarValoresAleatorios() {
       ArrayList<Integer> valores = new ArrayList<Integer>();
        int valor = 0;
    for (int i = 0; i < 28; i++) {
        valor = (int) ((Math.random()*28 -1));
        valores.add(valor);
        }
        return valores;
 }
public void cargarordenar(){
    DefaultListModel listModel = new DefaultListModel();
      String cree[] = new String[28];
      cree[0]= "1.Las Sagradas Escrituras";
      cree[1]= "2.La Deidad o trinidad";
      cree[2]="3.Dios Padre";
      cree[3]="4. Dios Hijo";
      cree[4]="5.Dios Espirtu Santo";
      cree[5]="6.Dios es el Creador";
      cree[6]="7.La naturaleza del hombre";
      cree[7]="8.El gran conflicto";
      cree[8]="9.Vida, muerte y resureccion de Cristo";
      cree[9]="10.La experiencia de la salvacion";
      cree[10]="11.El crecimiento en Cristo";
      cree[11]="12.La iglesia";
      cree[12]="13.El remanente y su mision";
      cree[13]="14.La unidad en el cuerpo de Cristo";
      cree[14]="15.El bautismo";
      cree[15]="16.La cena del Señor";
      cree[16]="17.Dones y ministerios espirituales";
      cree[17]="18.El don de la profecia";
      cree[18]="19.La ley de Dios";
      cree[19]="20.El sabado";
      cree[20]="21.La mayordomia";
      cree[21]="22.La conducta cristiana";
      cree[22]="23.Matrimonio y familia";
      cree[23]="24.El ministerio de cristo en el santuario celestial";
      cree[24]="25.La segunda venida de Cristo";
      cree[25]="26.Muerte y resureccion";
      cree[26]="27.El milenio y el fin del pecado";
      cree[27]="28.La nueva tierra";
      for(int i=0; i<cree.length; i++) {
   listModel.addElement(cree[i]);
}
 jList1.setModel(listModel);
}      
  
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
            java.util.logging.Logger.getLogger(creenciasactividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(creenciasactividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(creenciasactividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(creenciasactividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new creenciasactividad().setVisible(true);
            }
        });
    }
private DefaultListModel modelList; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
