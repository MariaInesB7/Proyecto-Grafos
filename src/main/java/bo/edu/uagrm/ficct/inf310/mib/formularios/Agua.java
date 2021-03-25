/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.uagrm.ficct.inf310.mib.formularios;


import bo.edu.uagrm.ficct.inf310sb.mib.grafos.excepciones.*;
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.excepciones.ExcepcionNroVerticesInvalido;
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.nopesados.*;
import bo.edu.uagrm.ficct.inf310sb.mib.grafos.pesado.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author HP 240 G5
 */
public class Agua extends javax.swing.JFrame {
    
    /**
     * Creates new form Agua
     */
    
    
    public Agua()throws ExcepcionNroVerticesInvalido, ExcepcionNroVerticesInvalido_1 {
        initComponents();
        
        
    }
     MetodosPracticoGrafo  metodos=new MetodosPracticoGrafo();
        Grafo grafoAgua=new Grafo(17);
        GrafoPesado grafoAPesado= new GrafoPesado(17);
       BFS  bfs;
       DFS  dfs; 
     
     public void crearGrafoAgua()throws ExcepcionNroVerticesInvalido, ExcepcionNroVerticesInvalido_1{
         
    
     grafoAgua.insertarArista(0,1 );
     grafoAgua.insertarArista(0, 6);
     grafoAgua.insertarArista(0,2 );
     grafoAgua.insertarArista(1,4 );
     grafoAgua.insertarArista(4, 6);
     grafoAgua.insertarArista(6,5 );
     grafoAgua.insertarArista(5,3 );
     grafoAgua.insertarArista(2,3 );
     
     grafoAgua.insertarArista(7,8 );
     grafoAgua.insertarArista(7,10 );
     grafoAgua.insertarArista(7 ,9);
     grafoAgua.insertarArista(7,11 );
     
     grafoAgua.insertarArista(12,13 );
     grafoAgua.insertarArista(12,14 );
      grafoAgua.insertarArista(12,15 );
     grafoAgua.insertarArista(14,16 );
      grafoAgua.insertarArista(15,16 );
     grafoAgua.insertarArista(13,16 );
     
     
        
            JOptionPane.showMessageDialog(null,"Grafo creado exitosamente");
     }
    public void crearGrafoAPesado()throws ExcepcionNroVerticesInvalido, ExcepcionNroVerticesInvalido_1, ExcepcionAristaYaExiste{
        grafoAPesado.insertarArista(0,1 ,650 );
        grafoAPesado.insertarArista(0,6,780);
        grafoAPesado.insertarArista(0,2,350 );
        grafoAPesado.insertarArista(1,4,470 );
        grafoAPesado.insertarArista(4,6,105 );
        grafoAPesado.insertarArista(6,5,170 );
        grafoAPesado.insertarArista(5,3, 80);
        grafoAPesado.insertarArista(2,3,300 );
        
        grafoAPesado.insertarArista(7,8,90 );
        grafoAPesado.insertarArista(7,9 ,120);
        grafoAPesado.insertarArista(7,10,100 );
        grafoAPesado.insertarArista(7,11,115 );
        
        grafoAPesado.insertarArista(12,13 ,470 );
        grafoAPesado.insertarArista(12,14 ,430);
        grafoAPesado.insertarArista(12,15 ,310 );
        grafoAPesado.insertarArista(14,16 ,500 );
        grafoAPesado.insertarArista(15,16 ,70);
        grafoAPesado.insertarArista(13,16 ,630 );
        
         JOptionPane.showMessageDialog(null,"Grafo pesados creado exitosamente");
    
    }
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\UniSem2-2020\\Programas ED2\\Proyecto\\Graficos\\mutunAgua2.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jMenu2.setText("No Pesado");

        jMenuItem6.setText("Iniciar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Nuevo Vertice");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Nueva Conexion");
        jMenu2.add(jMenuItem8);

        jMenuItem12.setText("Eliminar Vertice");
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("Eliminar Conexión");
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Pesado");

        jMenuItem9.setText("Iniciar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Nuevo Vertice");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Nueva Conexion");
        jMenu3.add(jMenuItem11);

        jMenuItem14.setText("Eliminar Vertice");
        jMenu3.add(jMenuItem14);

        jMenuItem15.setText("Eliminar Conexión");
        jMenu3.add(jMenuItem15);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Menu");

        jMenuItem2.setText("Conexiones separadas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Recorrido desde la fuente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Recorrido desde un punto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Verificar conexion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        String cad;
        int cant= metodos.cantDeIslas(grafoAgua);

        cad="Hay " + cant+" redes de distribución de aguas independientes" +"\n"
                + metodos.componentesDeIslasGrafo(grafoAgua);
                
        this.jTextArea1.setText(cad);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
        
        String cad= "Recorrido DFS "+ "\n"+ metodos.recorridoDFS(grafoAgua, 0)+"\n";
        cad= cad+ "Recorrido BFS "+ "\n"+ metodos.recorridoBFS(grafoAgua, 0) +"\n";
        
        this.jTextArea1.setText(cad);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            // TODO add your handling code here:

            crearGrafoAgua();
        } catch (ExcepcionNroVerticesInvalido ex) {
            Logger.getLogger(Agua.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExcepcionNroVerticesInvalido_1 ex) {
            Logger.getLogger(Agua.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       String posInicio= JOptionPane.showInputDialog("Escribe desde que posicion desea iniciar el recorrido");
       
          bfs= new BFS(grafoAgua,Integer.parseInt(posInicio));
          dfs= new DFS(grafoAgua, Integer.parseInt(posInicio));
        this.jTextArea1.setText("El recorrido BFS es: "+ bfs.elRecorrido()+ "\n"
                        + "El recorrido DFS es: "+ dfs.elRecorrido()+"\n");
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      bfs= new BFS(grafoAgua,0);
       String posInicio= JOptionPane.showInputDialog("Escriba que punto desea verificar");
        if(bfs.hayCaminoA(Integer.parseInt(posInicio) )){
        this.jTextArea1.setText("Si hay camino");
       }else{
        this.jTextArea1.setText("No hay camino");
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       
        try {
            crearGrafoAPesado();
        } catch (ExcepcionNroVerticesInvalido ex) {
            Logger.getLogger(Agua.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExcepcionNroVerticesInvalido_1 ex) {
            Logger.getLogger(Agua.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExcepcionAristaYaExiste ex) {
            Logger.getLogger(Agua.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(Agua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Agua().setVisible(true);
                } catch (ExcepcionNroVerticesInvalido ex) {
                    Logger.getLogger(Agua.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExcepcionNroVerticesInvalido_1 ex) {
                    Logger.getLogger(Agua.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
