package vistas;

import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import procesos.Conexion;
import procesos.GestionUsuario;
import procesos.Hash;
import procesos.Usuario;

public class InterfazPrincipal extends javax.swing.JFrame {
    
    URL iconURL =this.getClass().getResource("/img/appIcon.png");
    ImageIcon icon = new ImageIcon(iconURL);
    public Image back = new ImageIcon(getClass().getResource("/img/background.png")).getImage();
 
    public InterfazPrincipal() {
        initComponents();
        this.cargarEstilos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuFecha = new com.raven.datechooser.DateChooser();
        rbtnTipo = new javax.swing.ButtonGroup();
        bgPanelPrincipal = new assets.BGPanel();
        panelPestanas = new javax.swing.JTabbedPane();
        panelPrincipal = new javax.swing.JPanel();
        panelMensaje = new assets.RoundPanel(25,new Color(239,239,239));
        btnGoIngresar = new javax.swing.JButton();
        btnGoRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelIngreso = new javax.swing.JPanel();
        panelContenido = new assets.RoundPanel(25,new Color(239,239,239));
        iconoLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRegistrar = new javax.swing.JLabel();
        pwdContraLogin = new assets.RoundJPassField();
        txtUsuarioLogin = new assets.RoundJTextField();
        btnRegistrar = new javax.swing.JButton();
        btnRegLP = new javax.swing.JButton();
        panelRegistro = new javax.swing.JPanel();
        Registro = new assets.RoundPanel(25,new Color(239,239,239));
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuario = new assets.RoundJTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new assets.RoundJTextField();
        txtTelefono = new assets.RoundJTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCorreo = new assets.RoundJTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPasswd = new assets.RoundJPassField();
        jLabel13 = new javax.swing.JLabel();
        txtFechaNac = new assets.RoundJTextField();
        jLabel14 = new javax.swing.JLabel();
        txtConfirmar = new assets.RoundJPassFieldWC();
        rbtEstudiante = new javax.swing.JRadioButton();
        rbtDocente = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        btnRegistrarForm = new javax.swing.JButton();
        btnRegRP = new javax.swing.JButton();

        menuFecha.setForeground(new java.awt.Color(80, 203, 107));
        menuFecha.setDateFormat("yyyy-MM-dd");
        menuFecha.setTextRefernce(txtFechaNac);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        bgPanelPrincipal.setBackground(new java.awt.Color(153, 255, 204));
        bgPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPestanas.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        panelPrincipal.setOpaque(false);

        panelMensaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGoIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonIngreso-inactivo.png"))); // NOI18N
        btnGoIngresar.setBorder(null);
        btnGoIngresar.setBorderPainted(false);
        btnGoIngresar.setContentAreaFilled(false);
        btnGoIngresar.setRolloverEnabled(true);
        btnGoIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonIngreso-activo.png"))); // NOI18N
        btnGoIngresar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonIngreso-activo.png"))); // NOI18N
        btnGoIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoIngresarActionPerformed(evt);
            }
        });
        panelMensaje.add(btnGoIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 160, 40));

        btnGoRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonRegistro-inactivo.png"))); // NOI18N
        btnGoRegistrar.setBorder(null);
        btnGoRegistrar.setBorderPainted(false);
        btnGoRegistrar.setContentAreaFilled(false);
        btnGoRegistrar.setRolloverEnabled(true);
        btnGoRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonRegistro-activo.png"))); // NOI18N
        btnGoRegistrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonRegistro-activo.png"))); // NOI18N
        btnGoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoRegistrarActionPerformed(evt);
            }
        });
        panelMensaje.add(btnGoRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 160, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("SISTEMA DE GESTIÓN");
        panelMensaje.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("ESTUDIANTIL H.I.V ");
        panelMensaje.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brand.png"))); // NOI18N
        panelMensaje.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 260, 190));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(panelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(623, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPestanas.addTab("Principal", panelPrincipal);

        panelIngreso.setOpaque(false);
        panelIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContenido.setBackground(new Color(204, 204, 204));
        panelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login-icon.png"))); // NOI18N
        panelContenido.add(iconoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Usuario");
        panelContenido.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña");
        panelContenido.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("¿No tienes cuenta aún?");
        panelContenido.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        lblRegistrar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblRegistrar.setText("Registrate");
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseExited(evt);
            }
        });
        panelContenido.add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        pwdContraLogin.setEchoChar('•');
        panelContenido.add(pwdContraLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 200, 40));
        panelContenido.add(txtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 200, 40));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonIngreso-inactivo.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setRolloverEnabled(true);
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonIngreso-activo.png"))); // NOI18N
        btnRegistrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonIngreso-activo.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panelContenido.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        panelIngreso.add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 312, 480));

        btnRegLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar-inactivo.png"))); // NOI18N
        btnRegLP.setBorder(null);
        btnRegLP.setBorderPainted(false);
        btnRegLP.setContentAreaFilled(false);
        btnRegLP.setRolloverEnabled(true);
        btnRegLP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar-activo.png"))); // NOI18N
        btnRegLP.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar-inactivo.png"))); // NOI18N
        btnRegLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegLPActionPerformed(evt);
            }
        });
        panelIngreso.add(btnRegLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, -1));

        panelPestanas.addTab("Ingreso", panelIngreso);

        panelRegistro.setOpaque(false);
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registro.setBackground(new Color(204, 204, 204));
        Registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario-icon.png"))); // NOI18N
        jLabel7.setText("Usuario");
        Registro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key-icon.png"))); // NOI18N
        jLabel8.setText("Contraseña");
        Registro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        txtUsuario.setToolTipText("Elias Telleria");
        Registro.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 200, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nombre-icon.png"))); // NOI18N
        jLabel9.setText("Nombre");
        Registro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));
        Registro.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 200, 40));
        Registro.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 200, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telefono-icon.png"))); // NOI18N
        jLabel10.setText("Teléfono");
        Registro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmar-ico.png"))); // NOI18N
        jLabel11.setText("Confirma");
        Registro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));
        Registro.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 200, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mail-icon.png"))); // NOI18N
        jLabel12.setText("Email");
        Registro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));
        Registro.add(txtPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 200, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipo_usr-icon.png"))); // NOI18N
        jLabel13.setText("Tipo de Usuario");
        Registro.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));
        Registro.add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 200, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fecha_nac-icon.png"))); // NOI18N
        jLabel14.setText("Fecha de Nacimiento");
        Registro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));
        Registro.add(txtConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 200, -1));

        rbtnTipo.add(rbtEstudiante);
        rbtEstudiante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtEstudiante.setForeground(new java.awt.Color(51, 51, 51));
        rbtEstudiante.setText("Estudiante");
        rbtEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radio-unselect.png"))); // NOI18N
        rbtEstudiante.setOpaque(false);
        rbtEstudiante.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radio-select-rollover.png"))); // NOI18N
        rbtEstudiante.setRolloverEnabled(true);
        rbtEstudiante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radio-unselect-rollover.png"))); // NOI18N
        rbtEstudiante.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radio-select-rollover.png"))); // NOI18N
        rbtEstudiante.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radio-select.png"))); // NOI18N
        rbtEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtEstudianteMouseClicked(evt);
            }
        });
        Registro.add(rbtEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 100, 30));

        rbtnTipo.add(rbtDocente);
        rbtDocente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtDocente.setForeground(new java.awt.Color(51, 51, 51));
        rbtDocente.setText("Docente");
        rbtDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radio-unselect.png"))); // NOI18N
        rbtDocente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radio-select-rollover.png"))); // NOI18N
        rbtDocente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radio-unselect-rollover.png"))); // NOI18N
        rbtDocente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radio-select-rollover.png"))); // NOI18N
        rbtDocente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/radio-select.png"))); // NOI18N
        rbtDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtDocenteMouseClicked(evt);
            }
        });
        rbtDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDocenteActionPerformed(evt);
            }
        });
        Registro.add(rbtDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 90, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Registro de Usuarios");
        Registro.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        btnRegistrarForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonRegistro-inactivo.png"))); // NOI18N
        btnRegistrarForm.setBorder(null);
        btnRegistrarForm.setBorderPainted(false);
        btnRegistrarForm.setContentAreaFilled(false);
        btnRegistrarForm.setRolloverEnabled(true);
        btnRegistrarForm.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonRegistro-activo.png"))); // NOI18N
        btnRegistrarForm.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonRegistro-activo.png"))); // NOI18N
        btnRegistrarForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFormActionPerformed(evt);
            }
        });
        Registro.add(btnRegistrarForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 160, 40));

        panelRegistro.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 650, 520));

        btnRegRP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar-inactivo.png"))); // NOI18N
        btnRegRP.setBorder(null);
        btnRegRP.setBorderPainted(false);
        btnRegRP.setContentAreaFilled(false);
        btnRegRP.setRolloverEnabled(true);
        btnRegRP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar-activo.png"))); // NOI18N
        btnRegRP.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar-inactivo.png"))); // NOI18N
        btnRegRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegRPActionPerformed(evt);
            }
        });
        panelRegistro.add(btnRegRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, -1));

        panelPestanas.addTab("Registro", panelRegistro);

        bgPanelPrincipal.add(panelPestanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 1020, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoRegistrarActionPerformed
        evt.toString();
        panelPestanas.setSelectedIndex(2);
    }//GEN-LAST:event_btnGoRegistrarActionPerformed

    private void btnGoIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoIngresarActionPerformed
        evt.toString();
        panelPestanas.setSelectedIndex(1);
        
    }//GEN-LAST:event_btnGoIngresarActionPerformed

    private void lblRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseClicked
        evt.toString();
        panelPestanas.setSelectedIndex(2);
    }//GEN-LAST:event_lblRegistrarMouseClicked

    private void lblRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseEntered
        evt.toString();
        lblRegistrar.setForeground(new Color(80,203,147));
    }//GEN-LAST:event_lblRegistrarMouseEntered

    private void lblRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseExited
        evt.toString();
        lblRegistrar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblRegistrarMouseExited

    private void rbtDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDocenteActionPerformed
        evt.toString();    
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtDocenteActionPerformed

    private void btnRegistrarFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFormActionPerformed
        GestionUsuario gUsr = new GestionUsuario();
        String pwd = new String(txtPasswd.getPassword());
        String pwdCifrado = Hash.sha1(pwd);
        System.out.println(pwd);
        System.out.println(pwdCifrado);
        gUsr.comprobarUsuario(txtUsuario.getText());
        if (txtPasswd.getText().equals(txtConfirmar.getText())) {
            if (validarDatos()) {
                if (gUsr.comprobarUsuario(txtUsuario.getText()) == 0) {
                    if (gUsr.comprobarEmail(txtCorreo.getText())) {
                        Usuario usr= new Usuario(null,txtUsuario.getText(),pwdCifrado,txtNombre.getText(),txtCorreo.getText(),txtTelefono.getText(),txtFechaNac.getText(),1,1);
                        if (gUsr.registrarUsuario(usr)) {
                            JOptionPane.showMessageDialog(null, "El usuario se registro existosamente");
                            limpiar();
                            panelPestanas.setSelectedIndex(1);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: El usuario no se pudo registrar");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: El correo electronico no es valido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El usuario ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: Es necesario llenar todos los datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }
        
    }//GEN-LAST:event_btnRegistrarFormActionPerformed

    private void btnRegRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegRPActionPerformed
        panelPestanas.setSelectedIndex(0);
    }//GEN-LAST:event_btnRegRPActionPerformed

    private void btnRegLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegLPActionPerformed
        panelPestanas.setSelectedIndex(0);
    }//GEN-LAST:event_btnRegLPActionPerformed

    private void rbtEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtEstudianteMouseClicked
        System.out.println(rbtEstudiante.isSelected());
    }//GEN-LAST:event_rbtEstudianteMouseClicked

    private void rbtDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtDocenteMouseClicked
        System.out.println(rbtDocente.isSelected());
        
    }//GEN-LAST:event_rbtDocenteMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        GestionUsuario gUsr = new GestionUsuario();
        String usr = txtUsuarioLogin.getText();
        String pwd = new String(pwdContraLogin.getPassword());

        if(!usr.equals("") &&! pwd.equals("")){
            String pwdN =  Hash.sha1(pwd);
            System.out.println(pwdN);
            if((gUsr.comprobarUsuario(usr))==1 && (gUsr.comprobarContra(usr, pwdN))==1){
            //JOptionPane.showMessageDialog(null, "Acceso concedido");
                int tipo = gUsr.comprobarTipoUsr(usr);
                   
                switch(tipo) { 
                    case 1:
                        JOptionPane.showMessageDialog(null, "Estudiante");
                    break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Profesor");
                    break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Administrador");
                    break;
                    default: 
                        JOptionPane.showMessageDialog(null, "Pinche Hacker fuera de mi sistema.");
                    break;    
                }
            }else{
                       JOptionPane.showMessageDialog(null, "Contraseña y o Usuario Incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes llenar los campos para ingresar");
        }            
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro;
    private assets.BGPanel bgPanelPrincipal;
    private javax.swing.JButton btnGoIngresar;
    private javax.swing.JButton btnGoRegistrar;
    private javax.swing.JButton btnRegLP;
    private javax.swing.JButton btnRegRP;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarForm;
    private javax.swing.JLabel iconoLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblRegistrar;
    private com.raven.datechooser.DateChooser menuFecha;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelIngreso;
    private javax.swing.JPanel panelMensaje;
    private javax.swing.JTabbedPane panelPestanas;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelRegistro;
    private assets.RoundJPassField pwdContraLogin;
    private javax.swing.JRadioButton rbtDocente;
    private javax.swing.JRadioButton rbtEstudiante;
    private javax.swing.ButtonGroup rbtnTipo;
    private assets.RoundJPassFieldWC txtConfirmar;
    private assets.RoundJTextField txtCorreo;
    private assets.RoundJTextField txtFechaNac;
    private assets.RoundJTextField txtNombre;
    private assets.RoundJPassField txtPasswd;
    private assets.RoundJTextField txtTelefono;
    private assets.RoundJTextField txtUsuario;
    private assets.RoundJTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables
    
    private void cargarEstilos(){
        this.panelMensaje.setOpaque(false);
        this.panelContenido.setOpaque(false);
        this.Registro.setOpaque(false);
        this.panelPestanas.setBorder(null);
        this.panelPestanas.setEnabledAt(1, false);
        this.panelPestanas.setEnabledAt(2, false);
        this.setIconImage(icon.getImage());
        bgPanelPrincipal.setImagen(back);
        
    }
       public void limpiar() {
        txtUsuario.setText("");
        txtPasswd.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        txtConfirmar.setText("");
        txtTelefono.setText("");
    }

    
   private boolean validarDatos(){
       if (txtUsuario.getText().isEmpty()   &&
           txtTelefono.getText().isEmpty()  &&
           txtCorreo.getText().isEmpty()    && 
           txtFechaNac.getText().isEmpty() && 
           txtNombre.getText().isEmpty()    && 
           txtPasswd.getText().isEmpty()    &&
           txtConfirmar.getText().isEmpty() ) 
       {
           return false;
       }
       //System.out.println(txtFechaNac.toString());
       return true;
   }
                
}
