
import Busquedas.buscaAlbumArtista;
import Busquedas.buscaAlbumGenero;
import Busquedas.buscaAlbumTitulo;
import Busquedas.buscaCancionArtista;
import Busquedas.buscaCancionGenero;
import Busquedas.buscaCancionTitulo;
import Busquedas.buscaPeliculaGenero;
import Busquedas.buscaPeliculaTitu;
import Visualizaciones.VislizaCan;
import Visualizaciones.VisualizaPeli;
import Visualizaciones.VisualizaAlbum;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author y-ose
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Fondo fondo = new Fondo();
    public Principal() {
        this.setContentPane(fondo);
        initComponents();
        JBTNAdministrador.setHorizontalAlignment(SwingConstants.LEFT);
        JBTNAdministrador.setIcon(setIcono("/Imagenes/icono.png",JBTNAdministrador));
        JBTNAdministrador.setPressedIcon(setIconoPresionar("/Imagenes/icono.png",JBTNAdministrador,40,40));
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/logo.jpg"));
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(icono);
        /*this.setLocationRelativeTo(null);
        JLabel lbImage = new JLabel();
        lbImage.setIcon(new ImageIcon(Principal.class.getResource("/Imagenes/fondo.jpg")));
        lbImage.setBounds(20, 100,100,500 );
        jPanel1.add(lbImage); */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBTNAdministrador = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        BCancion = new javax.swing.JMenu();
        BCTitulo = new javax.swing.JMenuItem();
        BCGenero = new javax.swing.JMenuItem();
        BCArtista = new javax.swing.JMenuItem();
        BAlbum = new javax.swing.JMenu();
        BATitulo = new javax.swing.JMenuItem();
        BAArtista = new javax.swing.JMenuItem();
        BAGenero = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        VCPeliculas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        VCAlbum = new javax.swing.JMenuItem();
        VCCancion = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*** Prestamo  ");

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("de");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Multimedia *** ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(225, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JBTNAdministrador.setBackground(new java.awt.Color(204, 204, 204));
        JBTNAdministrador.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JBTNAdministrador.setOpaque(false);

        jLabel4.setText("jLabel4");

        jMenu2.setText("Buscar");

        BCancion.setText("Canciones");

        BCTitulo.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        BCTitulo.setText("Titulo");
        BCTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCTituloActionPerformed(evt);
            }
        });
        BCancion.add(BCTitulo);

        BCGenero.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        BCGenero.setText("Genero");
        BCGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCGeneroActionPerformed(evt);
            }
        });
        BCancion.add(BCGenero);

        BCArtista.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        BCArtista.setText("Artista");
        BCArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCArtistaActionPerformed(evt);
            }
        });
        BCancion.add(BCArtista);

        jMenu2.add(BCancion);

        BAlbum.setText("Album");

        BATitulo.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        BATitulo.setText("Titulo");
        BATitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BATituloActionPerformed(evt);
            }
        });
        BAlbum.add(BATitulo);

        BAArtista.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        BAArtista.setText("Artista");
        BAArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAArtistaActionPerformed(evt);
            }
        });
        BAlbum.add(BAArtista);

        BAGenero.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        BAGenero.setText("Genero");
        BAGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAGeneroActionPerformed(evt);
            }
        });
        BAlbum.add(BAGenero);

        jMenu2.add(BAlbum);

        jMenu3.setText("Pelicula");

        jMenuItem2.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        jMenuItem2.setText("Titulo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        jMenuItem3.setText("Genero");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        VCPeliculas.setText("Visualizar Contenido");
        VCPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCPeliculasActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        jMenuItem1.setText("Peliculas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        VCPeliculas.add(jMenuItem1);

        VCAlbum.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        VCAlbum.setText("Albumes");
        VCAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCAlbumActionPerformed(evt);
            }
        });
        VCPeliculas.add(VCAlbum);

        VCCancion.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        VCCancion.setText("Canciones");
        VCCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCCancionActionPerformed(evt);
            }
        });
        VCPeliculas.add(VCCancion);

        jMenuBar1.add(VCPeliculas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBTNAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBTNAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VCCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCCancionActionPerformed
        // TODO add your handling code here:

      VislizaCan vC = new VislizaCan();
      vC.setVisible(true);
    
    }//GEN-LAST:event_VCCancionActionPerformed

    private void VCPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCPeliculasActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_VCPeliculasActionPerformed

    private void VCAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCAlbumActionPerformed
        // TODO add your handling code here:
        VisualizaAlbum vA = new VisualizaAlbum();
        vA.setVisible(true);
    }//GEN-LAST:event_VCAlbumActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        VisualizaPeli vP = new VisualizaPeli();
       vP.setVisible(true); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BCTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCTituloActionPerformed
        // TODO add your handling code here:
        buscaCancionTitulo bs = new buscaCancionTitulo();
        bs.setVisible(true);
    }//GEN-LAST:event_BCTituloActionPerformed

    private void BATituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BATituloActionPerformed
        // TODO add your handling code here:
        buscaAlbumTitulo ba = new buscaAlbumTitulo();
        ba.setVisible(true);
    }//GEN-LAST:event_BATituloActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        buscaPeliculaTitu bp = new buscaPeliculaTitu();
        bp.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        buscaPeliculaGenero bp = new buscaPeliculaGenero();
        bp.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void BCGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCGeneroActionPerformed
        // TODO add your handling code here:
        buscaCancionGenero bg = new buscaCancionGenero();
        bg.setVisible(true);
    }//GEN-LAST:event_BCGeneroActionPerformed

    private void BCArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCArtistaActionPerformed
        // TODO add your handling code here:
        buscaCancionArtista ba = new buscaCancionArtista();
        ba.setVisible(true);
    }//GEN-LAST:event_BCArtistaActionPerformed

    private void BAGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAGeneroActionPerformed
        // TODO add your handling code here:
        buscaAlbumGenero bag = new buscaAlbumGenero();
        bag.setVisible(true);
    }//GEN-LAST:event_BAGeneroActionPerformed

    private void BAArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAArtistaActionPerformed
        // TODO add your handling code here:
        buscaAlbumArtista baa= new buscaAlbumArtista();
        baa.setVisible(true);
    }//GEN-LAST:event_BAArtistaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho=boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }
    public Icon setIconoPresionar(String url, JButton boton, int a, int cn){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth()-a;
        int alto = boton.getHeight()-cn;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT));
        return icono;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BAArtista;
    private javax.swing.JMenuItem BAGenero;
    private javax.swing.JMenuItem BATitulo;
    private javax.swing.JMenu BAlbum;
    private javax.swing.JMenuItem BCArtista;
    private javax.swing.JMenuItem BCGenero;
    private javax.swing.JMenuItem BCTitulo;
    private javax.swing.JMenu BCancion;
    private javax.swing.JButton JBTNAdministrador;
    private javax.swing.JMenuItem VCAlbum;
    private javax.swing.JMenuItem VCCancion;
    private javax.swing.JMenu VCPeliculas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    class Fondo extends JPanel{
        private Image img;
        @Override
        public void paint(Graphics g){
            img=new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg")).getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
}
