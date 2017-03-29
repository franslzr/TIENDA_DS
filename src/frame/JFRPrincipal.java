package frame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import javax.swing.table.JTableHeader;
import connections.conection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Lopez Garcia
 */
public final class JFRPrincipal extends javax.swing.JFrame {

    boolean ventas, compras, productos, proveedores;
    boolean apagado, principal;
    int x, y;
    JTableHeader tHeadVentas, tHeadCompras, tHeadProductos, tHeadCompra, tHeadProveedores, tHeadDetalleCompra;

    public JFRPrincipal() {
        initComponents();
        conection cn = new conection();
        try {
            cn.CrearConexion();
        } catch (Exception ex) {
//            Logger.getLogger(JFRPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Try again...");
        }
        tHeadVentas = tblProductosVender.getTableHeader();
        tHeadCompras = tblCompras.getTableHeader();
        tHeadProductos = jtblProductos.getTableHeader();
        tHeadCompra = tblCompra.getTableHeader();
        tHeadProveedores = tblProveedores.getTableHeader();
        tHeadDetalleCompra = tblDetalleCompra.getTableHeader();

        cabezera();
        ventas = compras = productos = proveedores = apagado = false;
        btnVentas.setBorder(null);
        btnCompras.setBorder(null);
        btnProductos.setBorder(null);
        btnProveedores.setBorder(null);
        apagado2();
        Principal(true);
        Compras(false);
        Ventas(false);
        Productos(false);
        Proveedores(false);
    }

    /*  ---- Color a las cabeceras de las tablas ----  */
    public void cabezera() {
        Font fuente = new Font("Tahoma", Font.BOLD, 12);
        tHeadVentas.setBackground(jpnBarraMenu.getBackground());
        tHeadVentas.setForeground(Color.WHITE);
        tHeadVentas.setFont(fuente);

        tHeadCompras.setBackground(jpnBarraMenu.getBackground());
        tHeadCompras.setForeground(Color.WHITE);
        tHeadCompras.setFont(fuente);

        tHeadProductos.setBackground(jpnBarraMenu.getBackground());
        tHeadProductos.setForeground(Color.WHITE);
        tHeadProductos.setFont(fuente);

        tHeadCompra.setBackground(jpnBarraMenu.getBackground());
        tHeadCompra.setForeground(Color.WHITE);
        tHeadCompra.setFont(fuente);

        tHeadProveedores.setBackground(jpnBarraMenu.getBackground());
        tHeadProveedores.setForeground(Color.WHITE);
        tHeadProveedores.setFont(fuente);

        tHeadDetalleCompra.setBackground(jpnBarraMenu.getBackground());
        tHeadDetalleCompra.setForeground(Color.WHITE);
        tHeadDetalleCompra.setFont(fuente);

    }

    /*  ---- Visualización de imágenes en Menú ----  */
    public void Principal(boolean estado) {
        if (!jpnProveedores.isVisible()) {
            jpnPrimero.setVisible(estado);
        } else {
        }
    }

    public void Compras(boolean estado) {
        if (!jpnProveedores.isVisible()) {
            jpnSegundo.setVisible(estado);
        } else {
        }
    }

    public void Ventas(boolean estado) {
        if (!jpnProveedores.isVisible()) {
            jpnTercero.setVisible(estado);
        } else {
        }
    }

    public void Productos(boolean estado) {
        if (!jpnProveedores.isVisible()) {
            jpnCuarto.setVisible(estado);
        } else {
        }
    }

    public void Proveedores(boolean estado) {
        if (!jpnProveedores.isVisible()) {
            jpnQuinto.setVisible(estado);
        } else {
        }
    }

    public void apagado() {
        apagado = true;
        jpnPrincipal.setVisible(false);
    }

    public void apagado2() {
        jpnProveedores.setVisible(false);
        jpnAgregarProv.setVisible(false);
        jpnModificarProveedor.setVisible(false);
        jpnVentas.setVisible(false);
        jpnProductos.setVisible(false);
        jpnNuevoProducto.setVisible(false);
        jpnRegistroCompra.setVisible(false);
        jpnCompras.setVisible(false);
        jpnDetalleCompra.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngFiltroProductos = new javax.swing.ButtonGroup();
        jpnBarraSuperior = new javax.swing.JPanel();
        lblBotonCerrar = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jpnBarraMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        jpnSubMenu = new javax.swing.JPanel();
        btnCompras = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnHome = new javax.swing.JLabel();
        jpnPrincipal = new javax.swing.JPanel();
        jpnPrimero = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lblMitad = new javax.swing.JLabel();
        jpnSegundo = new javax.swing.JPanel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lblMitad2 = new javax.swing.JLabel();
        jpnTercero = new javax.swing.JPanel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lblMitad3 = new javax.swing.JLabel();
        jpnCuarto = new javax.swing.JPanel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();
        lbl34 = new javax.swing.JLabel();
        lbl35 = new javax.swing.JLabel();
        lblMitad4 = new javax.swing.JLabel();
        jpnQuinto = new javax.swing.JPanel();
        lbl41 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        lbl45 = new javax.swing.JLabel();
        lblMitad5 = new javax.swing.JLabel();
        jpnProveedores = new javax.swing.JPanel();
        btnEliminarProveedor = new javax.swing.JButton();
        btnAgregarProveedor = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        jPanel42 = new javax.swing.JPanel();
        jSeparator20 = new javax.swing.JSeparator();
        lblProveedores6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        txtProductosBuscar1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator38 = new javax.swing.JSeparator();
        jpnAgregarProv = new javax.swing.JPanel();
        btnGuardarProveedor = new javax.swing.JButton();
        btnAtrasProveedores = new javax.swing.JButton();
        txtDireccionProveedor = new javax.swing.JTextField();
        txtNIT = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        jPanel45 = new javax.swing.JPanel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIDProveedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jpnModificarProveedor = new javax.swing.JPanel();
        btnGuardarModificarProveedor = new javax.swing.JButton();
        btnAtrasModificarProveedor = new javax.swing.JButton();
        txtNuevoDireccionProveedor = new javax.swing.JTextField();
        txtNuevoNIT = new javax.swing.JTextField();
        txtNuevoNombreProveedor = new javax.swing.JTextField();
        txtNuevoTelefonoProveedor = new javax.swing.JTextField();
        jPanel48 = new javax.swing.JPanel();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtIDProveedor1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator41 = new javax.swing.JSeparator();
        jSeparator42 = new javax.swing.JSeparator();
        jSeparator43 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtNitActualProveedor = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtNombreActualProveedor1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtTelefonoActualProveedor = new javax.swing.JLabel();
        txtDireccionActualProveedor = new javax.swing.JLabel();
        jpnVentas = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductosVender = new javax.swing.JTable();
        btnVender = new javax.swing.JButton();
        btnEliminarProductoVenta = new javax.swing.JButton();
        btnBuscarProductoVenta = new javax.swing.JButton();
        txtTotalventa = new javax.swing.JTextField();
        txtNombreProductoVender = new javax.swing.JTextField();
        txtCantidadVender = new javax.swing.JTextField();
        btnAgregarProductoVenta = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jSeparator15 = new javax.swing.JSeparator();
        lblProveedores5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtClienteVenta = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtIdVenta = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtCodigoBarraVender = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jpnCompras = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        btnAgregarCompra = new javax.swing.JButton();
        btnVerDetalle = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jSeparator27 = new javax.swing.JSeparator();
        lblProveedores3 = new javax.swing.JLabel();
        lblListadoCompras = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        jpnRegistroCompra = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtIdCompra = new javax.swing.JTextField();
        cmbProveedor = new javax.swing.JComboBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        lblIdCompra = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblProveedor = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lblTotal = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        lblCodBarraProd = new javax.swing.JLabel();
        txtCodBarraProd = new javax.swing.JTextField();
        lblNomProd = new javax.swing.JLabel();
        txtNomProd = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        lblCostoProd = new javax.swing.JLabel();
        txtCostoProd = new javax.swing.JTextField();
        jpnProductos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblProductos = new javax.swing.JTable();
        btnNuevoProducto = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jSeparator14 = new javax.swing.JSeparator();
        lblProveedores4 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txtProductosBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        jpnNuevoProducto = new javax.swing.JPanel();
        btnAgregarNuevoProducto = new javax.swing.JButton();
        btnSalirProductos = new javax.swing.JButton();
        txtCodBarraProductos = new javax.swing.JTextField();
        txtNombreProductos = new javax.swing.JTextField();
        txtPrecioProductos = new javax.swing.JTextField();
        jPanel46 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtProductoInventario = new javax.swing.JTextField();
        jSeparator39 = new javax.swing.JSeparator();
        jpnDetalleCompra = new javax.swing.JPanel();
        txtCodBarraProductos1 = new javax.swing.JTextField();
        txtNombreProductos1 = new javax.swing.JTextField();
        jPanel47 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblDetalleCompra = new javax.swing.JTable();
        jSeparator32 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        jSeparator33 = new javax.swing.JSeparator();
        txtPrecioProductos2 = new javax.swing.JTextField();
        txtTotal2 = new javax.swing.JTextField();
        btnAtrasDetalleCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/iconos/lanzador.png")).getImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnBarraSuperior.setBackground(new java.awt.Color(0, 0, 0));
        jpnBarraSuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jpnBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpnBarraSuperiorMouseDragged(evt);
            }
        });
        jpnBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnBarraSuperiorMousePressed(evt);
            }
        });
        jpnBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBotonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/exit32.png"))); // NOI18N
        lblBotonCerrar.setToolTipText("Salir");
        lblBotonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonCerrarMouseClicked(evt);
            }
        });
        jpnBarraSuperior.add(lblBotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 50));

        lblLogo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lanzador.png"))); // NOI18N
        lblLogo.setText("iShop");
        lblLogo.setToolTipText("");
        jpnBarraSuperior.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 50));

        getContentPane().add(jpnBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 55));

        jpnBarraMenu.setBackground(new java.awt.Color(102, 0, 0));
        jpnBarraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenu.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mas32.png"))); // NOI18N
        lblMenu.setText("Menu");
        jpnBarraMenu.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 15, 90, 50));

        jpnSubMenu.setBackground(new java.awt.Color(102, 0, 0));
        jpnSubMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnSubMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/compras.png"))); // NOI18N
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprasMouseExited(evt);
            }
        });
        jpnSubMenu.add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(-126, 20, 180, 40));

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/productos.png"))); // NOI18N
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });
        jpnSubMenu.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-126, 120, 180, 40));

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ventas.png"))); // NOI18N
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        jpnSubMenu.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-126, 70, 180, 40));

        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedores.png"))); // NOI18N
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseExited(evt);
            }
        });
        jpnSubMenu.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(-126, 170, 180, 40));

        jpnBarraMenu.add(jpnSubMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 190, 230));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Home48.png"))); // NOI18N
        btnHome.setToolTipText("Inicio");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        jpnBarraMenu.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        getContentPane().add(jpnBarraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 600));

        jpnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jpnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnPrimero.setBackground(new java.awt.Color(0, 0, 0));
        jpnPrimero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Entypo_e776(0)_64.png"))); // NOI18N
        jpnPrimero.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 70, 60));

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("iShop");
        jpnPrimero.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 50, -1));

        lbl7.setBackground(new java.awt.Color(153, 153, 153));
        lbl7.setForeground(new java.awt.Color(102, 102, 102));
        lbl7.setText("Versión 1.0");
        jpnPrimero.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 70, -1));

        lbl5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(102, 102, 102));
        lbl5.setText("Te damos la bienvenida a tu");
        jpnPrimero.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        lbl6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl6.setForeground(new java.awt.Color(102, 102, 102));
        lbl6.setText("nuevo sistema de Tienda.");
        jpnPrimero.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, 20));

        lblMitad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mitad.jpg"))); // NOI18N
        jpnPrimero.add(lblMitad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 600));

        jpnPrincipal.add(jpnPrimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 730, 600));

        jpnSegundo.setBackground(new java.awt.Color(0, 0, 0));
        jpnSegundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl11.setForeground(new java.awt.Color(255, 255, 255));
        lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Entypo_e73d(0)_32.png"))); // NOI18N
        lbl11.setText("Compras");
        jpnSegundo.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, -1));

        lbl12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl12.setForeground(new java.awt.Color(102, 102, 102));
        lbl12.setText("Podrás realizar compras y ");
        jpnSegundo.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        lbl13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl13.setForeground(new java.awt.Color(102, 102, 102));
        lbl13.setText("abastecer tu Tienda.");
        jpnSegundo.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, 30));

        lbl14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl14.setForeground(new java.awt.Color(102, 102, 102));
        lbl14.setText("Usa esta opción para manejar");
        jpnSegundo.add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 190, -1));

        lbl15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl15.setForeground(new java.awt.Color(102, 102, 102));
        lbl15.setText("el sistema de Compras.");
        jpnSegundo.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, 30));

        lblMitad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mitad2.jpg"))); // NOI18N
        jpnSegundo.add(lblMitad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 370, 600));

        jpnPrincipal.add(jpnSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 730, 600));

        jpnTercero.setBackground(new java.awt.Color(0, 0, 0));
        jpnTercero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl21.setForeground(new java.awt.Color(255, 255, 255));
        lbl21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Entypo_e789(2)_32.png"))); // NOI18N
        lbl21.setText("Ventas");
        jpnTercero.add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 120, -1));

        lbl22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl22.setForeground(new java.awt.Color(102, 102, 102));
        lbl22.setText("Podrás manejar los ingresos");
        jpnTercero.add(lbl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        lbl23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl23.setForeground(new java.awt.Color(102, 102, 102));
        lbl23.setText("que obtiene tu tienda.");
        jpnTercero.add(lbl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 30));

        lbl24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl24.setForeground(new java.awt.Color(102, 102, 102));
        lbl24.setText("Usa esta opción y maneja");
        jpnTercero.add(lbl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 160, -1));

        lbl25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl25.setForeground(new java.awt.Color(102, 102, 102));
        lbl25.setText("el sistema de Ventas.");
        jpnTercero.add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, 30));

        lblMitad3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mitad3.jpg"))); // NOI18N
        lblMitad3.setText("jLabel2");
        jpnTercero.add(lblMitad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 600));

        jpnPrincipal.add(jpnTercero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 730, 600));

        jpnCuarto.setBackground(new java.awt.Color(0, 0, 0));
        jpnCuarto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl31.setForeground(new java.awt.Color(255, 255, 255));
        lbl31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Entypo_e738(1)_32.png"))); // NOI18N
        lbl31.setText("Productos");
        jpnCuarto.add(lbl31, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 130, -1));

        lbl32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl32.setForeground(new java.awt.Color(102, 102, 102));
        lbl32.setText("Podrás manejar los productos");
        jpnCuarto.add(lbl32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 190, -1));

        lbl33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl33.setForeground(new java.awt.Color(102, 102, 102));
        lbl33.setText("de tu sistema de Tienda.");
        jpnCuarto.add(lbl33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, 30));

        lbl34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl34.setForeground(new java.awt.Color(102, 102, 102));
        lbl34.setText("Usa esta opción para modificar,");
        jpnCuarto.add(lbl34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 200, -1));

        lbl35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl35.setForeground(new java.awt.Color(102, 102, 102));
        lbl35.setText("agregar o eliminar Productos.");
        jpnCuarto.add(lbl35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 190, 30));

        lblMitad4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mitad4.jpg"))); // NOI18N
        jpnCuarto.add(lblMitad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 360, 600));

        jpnPrincipal.add(jpnCuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 730, 600));

        jpnQuinto.setBackground(new java.awt.Color(0, 0, 0));
        jpnQuinto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl41.setForeground(new java.awt.Color(255, 255, 255));
        lbl41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Entypo_e78e(0)_32.png"))); // NOI18N
        lbl41.setText("Proveedores");
        jpnQuinto.add(lbl41, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 160, -1));

        lbl42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl42.setForeground(new java.awt.Color(102, 102, 102));
        lbl42.setText("¿Deseas nuevas alianzas?");
        jpnQuinto.add(lbl42, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        lbl43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl43.setForeground(new java.awt.Color(102, 102, 102));
        lbl43.setText("¡Estamos para eso!");
        jpnQuinto.add(lbl43, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, 30));

        lbl44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl44.setForeground(new java.awt.Color(102, 102, 102));
        lbl44.setText("Usa esta opción y agrega");
        jpnQuinto.add(lbl44, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 160, -1));

        lbl45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl45.setForeground(new java.awt.Color(102, 102, 102));
        lbl45.setText("a tus nuevos proveedores.");
        jpnQuinto.add(lbl45, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, 30));

        lblMitad5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mitad5.jpg"))); // NOI18N
        jpnQuinto.add(lblMitad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 600));

        jpnPrincipal.add(jpnQuinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 730, 600));

        getContentPane().add(jpnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 55, 750, 595));

        jpnProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarProveedorMouseExited(evt);
            }
        });
        jpnProveedores.add(btnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 110, 30));

        btnAgregarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregarprov.png"))); // NOI18N
        btnAgregarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProveedor.setFocusCycleRoot(true);
        btnAgregarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarProveedorMouseExited(evt);
            }
        });
        jpnProveedores.add(btnAgregarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 110, 30));

        btnModificarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btnModificarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarProveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarProveedorMouseExited(evt);
            }
        });
        jpnProveedores.add(btnModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 110, 30));

        tblProveedores =new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idProveedor", "Nombre", "Teléfono", "Dirección", "NIT"
            }
        ));
        tblProveedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProveedores);

        jpnProveedores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 670, 260));

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel42.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 50));

        lblProveedores6.setBackground(new java.awt.Color(255, 255, 255));
        lblProveedores6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProveedores6.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores6.setText("Proveedores");
        jPanel42.add(lblProveedores6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 30));

        jpnProveedores.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Listado de los Proveedores actuales:");
        jpnProveedores.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 175, -1, -1));
        jpnProveedores.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, -1));
        jpnProveedores.add(txtProductosBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 670, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Proveedor a buscar:");
        jpnProveedores.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, -1, -1));
        jpnProveedores.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 20));

        getContentPane().add(jpnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 730, 600));

        jpnAgregarProv.setPreferredSize(new java.awt.Dimension(95, 95));
        jpnAgregarProv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardarprov.png"))); // NOI18N
        btnGuardarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarProveedorMouseExited(evt);
            }
        });
        jpnAgregarProv.add(btnGuardarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 110, 30));

        btnAtrasProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras.png"))); // NOI18N
        btnAtrasProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtrasProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtrasProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtrasProveedoresMouseExited(evt);
            }
        });
        jpnAgregarProv.add(btnAtrasProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 110, 30));
        jpnAgregarProv.add(txtDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 410, 30));
        jpnAgregarProv.add(txtNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 230, 30));

        txtNombreProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpnAgregarProv.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 410, 30));
        jpnAgregarProv.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 230, 30));

        jPanel45.setBackground(new java.awt.Color(0, 0, 0));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel45.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 20, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Agrega un nuevo proveedor:");
        jPanel45.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");
        jPanel45.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 30));

        txtIDProveedor.setEditable(false);
        jPanel45.add(txtIDProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 90, 30));

        jpnAgregarProv.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nombre:");
        jpnAgregarProv.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Teléfono:");
        jpnAgregarProv.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Dirección:");
        jpnAgregarProv.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("NIT:");
        jpnAgregarProv.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, 20));
        jpnAgregarProv.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 30, 10));
        jpnAgregarProv.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 50, 10));
        jpnAgregarProv.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 60, 10));
        jpnAgregarProv.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 60, 10));

        getContentPane().add(jpnAgregarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 730, 600));

        jpnModificarProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarModificarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardarprov.png"))); // NOI18N
        btnGuardarModificarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarModificarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarModificarProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarModificarProveedorMouseExited(evt);
            }
        });
        jpnModificarProveedor.add(btnGuardarModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 110, 30));

        btnAtrasModificarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras.png"))); // NOI18N
        btnAtrasModificarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtrasModificarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasModificarProveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtrasModificarProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtrasModificarProveedorMouseExited(evt);
            }
        });
        jpnModificarProveedor.add(btnAtrasModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 110, 30));
        jpnModificarProveedor.add(txtNuevoDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 410, 30));
        jpnModificarProveedor.add(txtNuevoNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 230, 30));

        txtNuevoNombreProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpnModificarProveedor.add(txtNuevoNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 410, 30));
        jpnModificarProveedor.add(txtNuevoTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 230, 30));

        jPanel48.setBackground(new java.awt.Color(0, 0, 0));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator40.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel48.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 20, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Modifica un proveedor:");
        jPanel48.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 170, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID:");
        jPanel48.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 30));

        txtIDProveedor1.setEditable(false);
        jPanel48.add(txtIDProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 90, 30));

        jpnModificarProveedor.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Nombre:");
        jpnModificarProveedor.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Teléfono:");
        jpnModificarProveedor.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Dirección:");
        jpnModificarProveedor.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("NIT:");
        jpnModificarProveedor.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, 20));
        jpnModificarProveedor.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 30, 10));
        jpnModificarProveedor.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 50, 10));
        jpnModificarProveedor.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 60, 10));
        jpnModificarProveedor.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 60, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Actual:");
        jpnModificarProveedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        txtNitActualProveedor.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtNitActualProveedor.setForeground(new java.awt.Color(102, 0, 0));
        txtNitActualProveedor.setText("0210-300496-102-2");
        jpnModificarProveedor.add(txtNitActualProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 437, 370, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setText("Actual:");
        jpnModificarProveedor.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        txtNombreActualProveedor1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtNombreActualProveedor1.setForeground(new java.awt.Color(102, 0, 0));
        txtNombreActualProveedor1.setText("Juanito Martinez");
        jpnModificarProveedor.add(txtNombreActualProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 167, 370, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 0, 0));
        jLabel38.setText("Actual:");
        jpnModificarProveedor.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 0, 0));
        jLabel39.setText("Actual:");
        jpnModificarProveedor.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        txtTelefonoActualProveedor.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtTelefonoActualProveedor.setForeground(new java.awt.Color(102, 0, 0));
        txtTelefonoActualProveedor.setText("755555555");
        jpnModificarProveedor.add(txtTelefonoActualProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 257, 370, 20));

        txtDireccionActualProveedor.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtDireccionActualProveedor.setForeground(new java.awt.Color(102, 0, 0));
        txtDireccionActualProveedor.setText("Urb. Altos del Palmar Block D. Pasaje 8, Casa 17");
        jpnModificarProveedor.add(txtDireccionActualProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 347, 370, 20));

        getContentPane().add(jpnModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 730, 600));

        jpnVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jpnVentas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 750, 10));

        tblProductosVender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod Barra", "Producto", "Cantidad", "Precio Unitario", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductosVender.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblProductosVender);

        jpnVentas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 710, 190));

        btnVender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/vender.png"))); // NOI18N
        btnVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVenderMouseExited(evt);
            }
        });
        jpnVentas.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 110, 30));

        btnEliminarProductoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminarProductoVenta.setToolTipText("Eliminar Productos Seleccionados");
        btnEliminarProductoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProductoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarProductoVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarProductoVentaMouseExited(evt);
            }
        });
        jpnVentas.add(btnEliminarProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 110, 30));

        btnBuscarProductoVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarProductoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnBuscarProductoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProductoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarProductoVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarProductoVentaMouseExited(evt);
            }
        });
        jpnVentas.add(btnBuscarProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 110, 30));

        txtTotalventa.setEditable(false);
        txtTotalventa.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalventa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnVentas.add(txtTotalventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 120, 40));

        txtNombreProductoVender.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnVentas.add(txtNombreProductoVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 350, 40));

        txtCantidadVender.setText("  1");
        txtCantidadVender.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnVentas.add(txtCantidadVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 80, 40));

        btnAgregarProductoVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregarProductoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar2.png"))); // NOI18N
        btnAgregarProductoVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProductoVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarProductoVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarProductoVentaMouseExited(evt);
            }
        });
        jpnVentas.add(btnAgregarProductoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 175, 110, 30));

        jPanel44.setBackground(new java.awt.Color(0, 0, 0));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel44.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 20, 70));

        lblProveedores5.setBackground(new java.awt.Color(255, 255, 255));
        lblProveedores5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProveedores5.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores5.setText("Ventas");
        jPanel44.add(lblProveedores5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 50));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ID Venta");
        jPanel44.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 70, -1));

        txtClienteVenta.setEditable(false);
        txtClienteVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtClienteVenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel44.add(txtClienteVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 280, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cliente");
        jPanel44.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 70, -1));

        txtIdVenta.setEditable(false);
        txtIdVenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIdVenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel44.add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 140, 30));

        jpnVentas.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 70));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Producto");
        jpnVentas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Cantidad");
        jpnVentas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));
        jpnVentas.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 115, 60, -1));
        jpnVentas.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 115, 60, 10));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Total");
        jpnVentas.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, -1));
        jpnVentas.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 465, 40, 20));

        txtCodigoBarraVender.setEditable(false);
        jpnVentas.add(txtCodigoBarraVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 140, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Código de Barra");
        jpnVentas.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        jpnVentas.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 115, 100, 10));

        getContentPane().add(jpnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 730, 600));

        jpnCompras.setName("jpnCompras"); // NOI18N
        jpnCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCompras =new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblCompras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Compra 1", "Pollo Indio", "12/Febrero/17", "$23.00"},
                {"Compra 2", null, null, null},
                {"Compra 3", null, null, null},
                {"Compra 4", null, null, null}
            },
            new String [] {
                "Id Compra", "Proveedor", "Fecha", "Total"
            }
        ));
        tblCompras.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tblCompras);

        jpnCompras.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 660, 310));

        btnAgregarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        btnAgregarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarCompraMouseExited(evt);
            }
        });
        btnAgregarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCompraActionPerformed(evt);
            }
        });
        jpnCompras.add(btnAgregarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 110, 30));

        btnVerDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/detalles2.png"))); // NOI18N
        btnVerDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerDetalleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerDetalleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerDetalleMouseExited(evt);
            }
        });
        jpnCompras.add(btnVerDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 110, 30));

        jPanel37.setBackground(new java.awt.Color(0, 0, 0));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator27.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel37.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 50));

        lblProveedores3.setBackground(new java.awt.Color(255, 255, 255));
        lblProveedores3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProveedores3.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores3.setText("Compras");
        jPanel37.add(lblProveedores3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        jpnCompras.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        lblListadoCompras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblListadoCompras.setText("Listado de Compras Realizadas:");
        jpnCompras.add(lblListadoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, -1));
        jpnCompras.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 117, 200, 10));

        getContentPane().add(jpnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 730, 600));

        jpnRegistroCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardarprov.png"))); // NOI18N
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        jpnRegistroCompra.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 110, 30));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras.png"))); // NOI18N
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        jpnRegistroCompra.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 110, 30));

        txtIdCompra.setText("001");
        jpnRegistroCompra.add(txtIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 60, 30));

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pollo Indio", "SONY", "Niña Mirna" }));
        jpnRegistroCompra.add(cmbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 180, 30));

        tblCompra =new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id producto", "Producto", "Cantidad", "Costo", "SubTotal"
            }
        ));
        tblCompra.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tblCompra);

        jpnRegistroCompra.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 660, 210));

        txtTotal.setText("$");
        jpnRegistroCompra.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 100, 40));
        jpnRegistroCompra.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, 30));

        jPanel39.setBackground(new java.awt.Color(0, 0, 0));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(240, 240, 240));
        jLabel33.setText("Agregar una Compra:");
        jPanel39.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 30));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel39.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 20, 50));

        jpnRegistroCompra.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFecha.setText("Fecha:");
        jpnRegistroCompra.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 60, 30));

        lblIdCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIdCompra.setText("Id Compra:");
        jpnRegistroCompra.add(lblIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 80, 30));
        jpnRegistroCompra.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 95, 70, 30));
        jpnRegistroCompra.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 145, 40, 20));

        lblProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProveedor.setText("Proveedor:");
        jpnRegistroCompra.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 90, 30));
        jpnRegistroCompra.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 95, 70, 20));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotal.setText("TOTAL:");
        jpnRegistroCompra.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 50, 40));
        jpnRegistroCompra.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 529, 40, 40));

        lblCodBarraProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodBarraProd.setText("Cod Barra:");
        jpnRegistroCompra.add(lblCodBarraProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 30));
        jpnRegistroCompra.add(txtCodBarraProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 120, 30));

        lblNomProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNomProd.setText("Producto:");
        jpnRegistroCompra.add(lblNomProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 70, 30));
        jpnRegistroCompra.add(txtNomProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 140, 30));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidad.setText("Cantidad:");
        jpnRegistroCompra.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 70, 30));

        txtCantidad.setText("  1");
        jpnRegistroCompra.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 40, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpnRegistroCompra.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 750, 10));

        jSeparator36.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator36.setForeground(new java.awt.Color(0, 0, 0));
        jpnRegistroCompra.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 750, 10));

        lblCostoProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCostoProd.setText("Costo:");
        jpnRegistroCompra.add(lblCostoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 194, 40, 20));
        jpnRegistroCompra.add(txtCostoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 80, 30));

        getContentPane().add(jpnRegistroCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 730, 600));

        jpnProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblProductos =new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jtblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código de Barra", "Nombre", "Costo", "Inventario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtblProductos);

        jpnProductos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 650, 260));

        btnNuevoProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo3.png"))); // NOI18N
        btnNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoProductoMouseExited(evt);
            }
        });
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        jpnProductos.add(btnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 110, 30));

        btnBuscarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnBuscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarProductoMouseExited(evt);
            }
        });
        jpnProductos.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 110, 30));

        btnModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btnModificarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarProductoMouseExited(evt);
            }
        });
        jpnProductos.add(btnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 110, 30));

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarProductoMouseExited(evt);
            }
        });
        jpnProductos.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 110, 30));

        jPanel43.setBackground(new java.awt.Color(0, 0, 0));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel43.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 20, 50));

        lblProveedores4.setBackground(new java.awt.Color(255, 255, 255));
        lblProveedores4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProveedores4.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedores4.setText("Productos");
        jPanel43.add(lblProveedores4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        jpnProductos.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 50));
        jpnProductos.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 186, 160, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Listado de los Productos:");
        jpnProductos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        jpnProductos.add(txtProductosBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 430, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Producto a buscar:");
        jpnProductos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        jpnProductos.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 96, 120, 20));

        getContentPane().add(jpnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 730, 600));

        jpnNuevoProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar2.png"))); // NOI18N
        btnAgregarNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarNuevoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarNuevoProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarNuevoProductoMouseExited(evt);
            }
        });
        jpnNuevoProducto.add(btnAgregarNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 110, 30));

        btnSalirProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras.png"))); // NOI18N
        btnSalirProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirProductosMouseExited(evt);
            }
        });
        btnSalirProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProductosActionPerformed(evt);
            }
        });
        jpnNuevoProducto.add(btnSalirProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 110, 30));

        txtCodBarraProductos.setEditable(false);
        jpnNuevoProducto.add(txtCodBarraProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 220, 30));
        jpnNuevoProducto.add(txtNombreProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 270, 30));
        jpnNuevoProducto.add(txtPrecioProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 80, 30));

        jPanel46.setBackground(new java.awt.Color(0, 0, 0));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(240, 240, 240));
        jLabel34.setText("Agregar un nuevo producto:");
        jPanel46.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 30));

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel46.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 20, 50));

        jpnNuevoProducto.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Código de barra:");
        jpnNuevoProducto.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 20));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Nombre:");
        jpnNuevoProducto.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 20));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Costo:");
        jpnNuevoProducto.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 60, 40));
        jpnNuevoProducto.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 100, 10));
        jpnNuevoProducto.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 315, 70, 20));
        jpnNuevoProducto.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 40, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Inventario:");
        jpnNuevoProducto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 10));
        jpnNuevoProducto.add(txtProductoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 60, 30));
        jpnNuevoProducto.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 20));

        getContentPane().add(jpnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 730, 600));

        jpnDetalleCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpnDetalleCompra.add(txtCodBarraProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 130, 30));
        jpnDetalleCompra.add(txtNombreProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 390, 30));

        jPanel47.setBackground(new java.awt.Color(0, 0, 0));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(240, 240, 240));
        jLabel36.setText("Detalle de la Compra:");
        jPanel47.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 30));

        jSeparator28.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel47.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 20, 50));

        jpnDetalleCompra.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("ID Compra:");
        jpnDetalleCompra.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 20));

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Proveedor:");
        jpnDetalleCompra.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 30));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Costo:");
        jpnDetalleCompra.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 60, 20));
        jpnDetalleCompra.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 40, 10));
        jpnDetalleCompra.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 70, 10));
        jpnDetalleCompra.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 185, 70, 10));

        tblDetalleCompra =new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblDetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Producto", "Cantidad", "Costo", "SubTotal"
            }
        ));
        tblDetalleCompra.setEnabled(false);
        tblDetalleCompra.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tblDetalleCompra);

        jpnDetalleCompra.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 670, 230));

        jSeparator32.setForeground(new java.awt.Color(0, 0, 0));
        jpnDetalleCompra.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 232, 750, 10));

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Total:");
        jpnDetalleCompra.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, -1, -1));
        jpnDetalleCompra.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 556, 40, -1));
        jpnDetalleCompra.add(txtPrecioProductos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 70, 30));

        txtTotal2.setText("$");
        jpnDetalleCompra.add(txtTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 100, 40));

        btnAtrasDetalleCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/atras.png"))); // NOI18N
        btnAtrasDetalleCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtrasDetalleCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasDetalleCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtrasDetalleCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtrasDetalleCompraMouseExited(evt);
            }
        });
        jpnDetalleCompra.add(btnAtrasDetalleCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 535, 110, 30));

        getContentPane().add(jpnDetalleCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 730, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblBotonCerrarMouseClicked

    /*  ---- Animaciones de los botones del menú ----  */
    private void btnComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseEntered
        /*  ---- Animación compras, mover ----  */
        if (!compras) {
            Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnCompras);
        }
        Principal(false);
        Compras(true);
    }//GEN-LAST:event_btnComprasMouseEntered

    private void btnComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseExited
        /*  ---- Animación compras, volver posición anterior ----  */
        if (!compras) {
            Animacion.Animacion.mover_izquierda(0, -126, 1, 2, btnCompras);
        }
        Principal(true);
        Compras(false);
    }//GEN-LAST:event_btnComprasMouseExited

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        if (!ventas) {
            Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnVentas);
        }
        Principal(false);
        Ventas(true);
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        if (!ventas) {
            Animacion.Animacion.mover_izquierda(0, -126, 1, 2, btnVentas);
        }
        Principal(true);
        Ventas(false);
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        if (!productos) {
            Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnProductos);
        }
        Principal(false);
        Productos(true);
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        if (!productos) {
            Animacion.Animacion.mover_izquierda(0, -126, 1, 2, btnProductos);
        }
        Principal(true);
        Productos(false);
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseEntered
        if (!proveedores) {
            Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnProveedores);
        }
        Principal(false);
        Proveedores(true);
    }//GEN-LAST:event_btnProveedoresMouseEntered

    private void btnProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseExited
        if (!proveedores) {
            Animacion.Animacion.mover_izquierda(0, -126, 1, 2, btnProveedores);
        }
        Principal(true);
        Proveedores(false);
    }//GEN-LAST:event_btnProveedoresMouseExited

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked
        apagado();
        Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnProveedores);
        apagado2();
        jpnProveedores.setVisible(true);
    }//GEN-LAST:event_btnProveedoresMouseClicked

    /*  ---- Acción de botones, cambiar de pantallas (Paneles) ----  */
    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        apagado2();
        apagado = false;
        jpnPrincipal.setVisible(true);
        Principal(true);
        Compras(false);
        Ventas(false);
        Productos(false);
        Proveedores(false);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnAgregarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProveedorMouseClicked
        jpnProveedores.setVisible(false);
        jpnAgregarProv.setVisible(true);
    }//GEN-LAST:event_btnAgregarProveedorMouseClicked

    private void btnAtrasProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasProveedoresMouseClicked
        jpnAgregarProv.setVisible(false);
        jpnProveedores.setVisible(true);
    }//GEN-LAST:event_btnAtrasProveedoresMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        apagado();
        apagado2();
        jpnVentas.setVisible(true);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        jpnProductos.setVisible(false);
        jpnNuevoProducto.setVisible(true);
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnSalirProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProductosActionPerformed
        jpnNuevoProducto.setVisible(false);
        jpnProductos.setVisible(true);
    }//GEN-LAST:event_btnSalirProductosActionPerformed

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        apagado();
        Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnProductos);
        apagado2();
        jpnProductos.setVisible(true);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnAgregarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCompraActionPerformed
        jpnRegistroCompra.setVisible(true);
        jpnCompras.setVisible(false);
    }//GEN-LAST:event_btnAgregarCompraActionPerformed

    private void btnVerDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDetalleMouseClicked
        jpnDetalleCompra.setVisible(true);
        jpnCompras.setVisible(false);
    }//GEN-LAST:event_btnVerDetalleMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        jpnCompras.setVisible(true);
        jpnRegistroCompra.setVisible(false);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
        apagado();
        Animacion.Animacion.mover_derecha(-126, 0, 1, 2, btnCompras);
        apagado2();
        jpnCompras.setVisible(true);
    }//GEN-LAST:event_btnComprasMouseClicked

    /*  ---- Mover barra ----  */
    private void jpnBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnBarraSuperiorMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jpnBarraSuperiorMousePressed

    private void jpnBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnBarraSuperiorMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jpnBarraSuperiorMouseDragged

    private void btnAtrasDetalleCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasDetalleCompraMouseClicked
        jpnDetalleCompra.setVisible(false);
        jpnCompras.setVisible(true);
    }//GEN-LAST:event_btnAtrasDetalleCompraMouseClicked

    /*  ---- Cambio de color a los botones ----  */
    private void btnAgregarProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProveedorMouseEntered
        // Cambio del botón Agregar Proveedor a negro:
        btnAgregarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/agregarprovB.png")));
    }//GEN-LAST:event_btnAgregarProveedorMouseEntered

    private void btnAgregarProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProveedorMouseExited
        // Cambio del botón Agregar Proveedor a blanco:
        btnAgregarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/agregarprov.png")));
    }//GEN-LAST:event_btnAgregarProveedorMouseExited

    private void btnModificarProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProveedorMouseEntered
        // Cambio del botón Modificar Proveedor a negro:
        btnModificarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/modificarB.png")));
    }//GEN-LAST:event_btnModificarProveedorMouseEntered

    private void btnModificarProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProveedorMouseExited
        // Cambio del botón Modificar Proveedor a blanco:
        btnModificarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/modificar.png")));
    }//GEN-LAST:event_btnModificarProveedorMouseExited

    private void btnEliminarProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProveedorMouseEntered
        btnEliminarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/eliminarB.png")));
    }//GEN-LAST:event_btnEliminarProveedorMouseEntered

    private void btnEliminarProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProveedorMouseExited
        btnEliminarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/eliminar.png")));
    }//GEN-LAST:event_btnEliminarProveedorMouseExited

    private void btnAtrasProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasProveedoresMouseEntered
        btnAtrasProveedores.setIcon(new ImageIcon(getClass().getResource("/iconos/atrasB.png")));
    }//GEN-LAST:event_btnAtrasProveedoresMouseEntered

    private void btnAtrasProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasProveedoresMouseExited
        btnAtrasProveedores.setIcon(new ImageIcon(getClass().getResource("/iconos/atras.png")));
    }//GEN-LAST:event_btnAtrasProveedoresMouseExited

    private void btnGuardarProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarProveedorMouseEntered
        btnGuardarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/guardarprovB.png")));
    }//GEN-LAST:event_btnGuardarProveedorMouseEntered

    private void btnGuardarProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarProveedorMouseExited
        btnGuardarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/guardarprov.png")));
    }//GEN-LAST:event_btnGuardarProveedorMouseExited

    private void btnAgregarProductoVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoVentaMouseEntered
        btnAgregarProductoVenta.setIcon(new ImageIcon(getClass().getResource("/iconos/agregar2B.png")));
    }//GEN-LAST:event_btnAgregarProductoVentaMouseEntered

    private void btnAgregarProductoVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoVentaMouseExited
        btnAgregarProductoVenta.setIcon(new ImageIcon(getClass().getResource("/iconos/agregar2.png")));
    }//GEN-LAST:event_btnAgregarProductoVentaMouseExited

    private void btnEliminarProductoVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoVentaMouseEntered
        btnEliminarProductoVenta.setIcon(new ImageIcon(getClass().getResource("/iconos/eliminarB.png")));
    }//GEN-LAST:event_btnEliminarProductoVentaMouseEntered

    private void btnEliminarProductoVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoVentaMouseExited
        btnEliminarProductoVenta.setIcon(new ImageIcon(getClass().getResource("/iconos/eliminar.png")));
    }//GEN-LAST:event_btnEliminarProductoVentaMouseExited

    private void btnBuscarProductoVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductoVentaMouseEntered
        btnBuscarProductoVenta.setIcon(new ImageIcon(getClass().getResource("/iconos/buscarB.png")));
    }//GEN-LAST:event_btnBuscarProductoVentaMouseEntered

    private void btnBuscarProductoVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductoVentaMouseExited
        btnBuscarProductoVenta.setIcon(new ImageIcon(getClass().getResource("/iconos/buscar.png")));
    }//GEN-LAST:event_btnBuscarProductoVentaMouseExited

    private void btnVenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseEntered
        btnVender.setIcon(new ImageIcon(getClass().getResource("/iconos/venderB.png")));
    }//GEN-LAST:event_btnVenderMouseEntered

    private void btnVenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenderMouseExited
        btnVender.setIcon(new ImageIcon(getClass().getResource("/iconos/vender.png")));
    }//GEN-LAST:event_btnVenderMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setIcon(new ImageIcon(getClass().getResource("/iconos/atrasB.png")));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setIcon(new ImageIcon(getClass().getResource("/iconos/atras.png")));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setIcon(new ImageIcon(getClass().getResource("/iconos/guardarprovB.png")));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setIcon(new ImageIcon(getClass().getResource("/iconos/guardarprov.png")));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnNuevoProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProductoMouseEntered
        btnNuevoProducto.setIcon(new ImageIcon(getClass().getResource("/iconos/nuevo3B.png")));
    }//GEN-LAST:event_btnNuevoProductoMouseEntered

    private void btnNuevoProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProductoMouseExited
        btnNuevoProducto.setIcon(new ImageIcon(getClass().getResource("/iconos/nuevo3.png")));
    }//GEN-LAST:event_btnNuevoProductoMouseExited

    private void btnBuscarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductoMouseEntered
        btnBuscarProducto.setIcon(new ImageIcon(getClass().getResource("/iconos/buscarB.png")));
    }//GEN-LAST:event_btnBuscarProductoMouseEntered

    private void btnBuscarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductoMouseExited
        btnBuscarProducto.setIcon(new ImageIcon(getClass().getResource("/iconos/buscar.png")));
    }//GEN-LAST:event_btnBuscarProductoMouseExited

    private void btnModificarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProductoMouseEntered
        btnModificarProducto.setIcon(new ImageIcon(getClass().getResource("/iconos/modificarB.png")));
    }//GEN-LAST:event_btnModificarProductoMouseEntered

    private void btnModificarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProductoMouseExited
        btnModificarProducto.setIcon(new ImageIcon(getClass().getResource("/iconos/modificar.png")));
    }//GEN-LAST:event_btnModificarProductoMouseExited

    private void btnEliminarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoMouseEntered
        btnEliminarProducto.setIcon(new ImageIcon(getClass().getResource("/iconos/eliminarB.png")));
    }//GEN-LAST:event_btnEliminarProductoMouseEntered

    private void btnEliminarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoMouseExited
        btnEliminarProducto.setIcon(new ImageIcon(getClass().getResource("/iconos/eliminar.png")));
    }//GEN-LAST:event_btnEliminarProductoMouseExited

    private void btnSalirProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirProductosMouseEntered
        btnSalirProductos.setIcon(new ImageIcon(getClass().getResource("/iconos/atrasB.png")));
    }//GEN-LAST:event_btnSalirProductosMouseEntered

    private void btnSalirProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirProductosMouseExited
        btnSalirProductos.setIcon(new ImageIcon(getClass().getResource("/iconos/atras.png")));
    }//GEN-LAST:event_btnSalirProductosMouseExited

    private void btnAgregarNuevoProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarNuevoProductoMouseEntered
        btnAgregarNuevoProducto.setIcon(new ImageIcon(getClass().getResource("/iconos/agregarB.png")));
    }//GEN-LAST:event_btnAgregarNuevoProductoMouseEntered

    private void btnAgregarNuevoProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarNuevoProductoMouseExited
        btnAgregarNuevoProducto.setIcon(new ImageIcon(getClass().getResource("/iconos/agregar.png")));
    }//GEN-LAST:event_btnAgregarNuevoProductoMouseExited

    private void btnAgregarCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCompraMouseEntered
        btnAgregarCompra.setIcon(new ImageIcon(getClass().getResource("/iconos/agregar2B.png")));
    }//GEN-LAST:event_btnAgregarCompraMouseEntered

    private void btnAgregarCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCompraMouseExited
        btnAgregarCompra.setIcon(new ImageIcon(getClass().getResource("/iconos/agregar2.png")));
    }//GEN-LAST:event_btnAgregarCompraMouseExited

    private void btnVerDetalleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDetalleMouseEntered
        btnVerDetalle.setIcon(new ImageIcon(getClass().getResource("/iconos/detalles2B.png")));
    }//GEN-LAST:event_btnVerDetalleMouseEntered

    private void btnVerDetalleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerDetalleMouseExited
        btnVerDetalle.setIcon(new ImageIcon(getClass().getResource("/iconos/detalles2.png")));
    }//GEN-LAST:event_btnVerDetalleMouseExited

    private void btnAtrasDetalleCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasDetalleCompraMouseEntered
        btnAtrasDetalleCompra.setIcon(new ImageIcon(getClass().getResource("/iconos/atrasB.png")));
    }//GEN-LAST:event_btnAtrasDetalleCompraMouseEntered

    private void btnAtrasDetalleCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasDetalleCompraMouseExited
        btnAtrasDetalleCompra.setIcon(new ImageIcon(getClass().getResource("/iconos/atras.png")));
    }//GEN-LAST:event_btnAtrasDetalleCompraMouseExited

    private void btnGuardarModificarProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarModificarProveedorMouseEntered
        btnGuardarModificarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/guardarprovB.png")));
    }//GEN-LAST:event_btnGuardarModificarProveedorMouseEntered

    private void btnGuardarModificarProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarModificarProveedorMouseExited
        btnGuardarModificarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/guardarprov.png")));
    }//GEN-LAST:event_btnGuardarModificarProveedorMouseExited

    private void btnAtrasModificarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasModificarProveedorMouseClicked
        jpnModificarProveedor.setVisible(false);
        jpnProveedores.setVisible(true);
    }//GEN-LAST:event_btnAtrasModificarProveedorMouseClicked

    private void btnAtrasModificarProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasModificarProveedorMouseEntered
        btnAtrasModificarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/atrasB.png")));
    }//GEN-LAST:event_btnAtrasModificarProveedorMouseEntered

    private void btnAtrasModificarProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasModificarProveedorMouseExited
        btnAtrasModificarProveedor.setIcon(new ImageIcon(getClass().getResource("/iconos/atras.png")));
    }//GEN-LAST:event_btnAtrasModificarProveedorMouseExited

    private void btnModificarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProveedorMouseClicked
        jpnProveedores.setVisible(false);
        jpnModificarProveedor.setVisible(true);
    }//GEN-LAST:event_btnModificarProveedorMouseClicked

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFRPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCompra;
    private javax.swing.JButton btnAgregarNuevoProducto;
    private javax.swing.JButton btnAgregarProductoVenta;
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnAtrasDetalleCompra;
    private javax.swing.JButton btnAtrasModificarProveedor;
    private javax.swing.JButton btnAtrasProveedores;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnBuscarProductoVenta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarProductoVenta;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarModificarProveedor;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JLabel btnHome;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnModificarProveedor;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalirProductos;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnVerDetalle;
    private javax.swing.ButtonGroup btngFiltroProductos;
    private javax.swing.JComboBox cmbProveedor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel jpnAgregarProv;
    private javax.swing.JPanel jpnBarraMenu;
    private javax.swing.JPanel jpnBarraSuperior;
    private javax.swing.JPanel jpnCompras;
    private javax.swing.JPanel jpnCuarto;
    private javax.swing.JPanel jpnDetalleCompra;
    private javax.swing.JPanel jpnModificarProveedor;
    private javax.swing.JPanel jpnNuevoProducto;
    private javax.swing.JPanel jpnPrimero;
    private javax.swing.JPanel jpnPrincipal;
    private javax.swing.JPanel jpnProductos;
    private javax.swing.JPanel jpnProveedores;
    private javax.swing.JPanel jpnQuinto;
    private javax.swing.JPanel jpnRegistroCompra;
    private javax.swing.JPanel jpnSegundo;
    private javax.swing.JPanel jpnSubMenu;
    private javax.swing.JPanel jpnTercero;
    private javax.swing.JPanel jpnVentas;
    private javax.swing.JTable jtblProductos;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl35;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl45;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lblBotonCerrar;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodBarraProd;
    private javax.swing.JLabel lblCostoProd;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIdCompra;
    private javax.swing.JLabel lblListadoCompras;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMitad;
    private javax.swing.JLabel lblMitad2;
    private javax.swing.JLabel lblMitad3;
    private javax.swing.JLabel lblMitad4;
    private javax.swing.JLabel lblMitad5;
    private javax.swing.JLabel lblNomProd;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblProveedores3;
    private javax.swing.JLabel lblProveedores4;
    private javax.swing.JLabel lblProveedores5;
    private javax.swing.JLabel lblProveedores6;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCompra;
    private javax.swing.JTable tblCompras;
    private javax.swing.JTable tblDetalleCompra;
    private javax.swing.JTable tblProductosVender;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadVender;
    private javax.swing.JTextField txtClienteVenta;
    private javax.swing.JTextField txtCodBarraProd;
    private javax.swing.JTextField txtCodBarraProductos;
    private javax.swing.JTextField txtCodBarraProductos1;
    private javax.swing.JTextField txtCodigoBarraVender;
    private javax.swing.JTextField txtCostoProd;
    private javax.swing.JLabel txtDireccionActualProveedor;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDProveedor;
    private javax.swing.JTextField txtIDProveedor1;
    private javax.swing.JTextField txtIdCompra;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JLabel txtNitActualProveedor;
    private javax.swing.JTextField txtNomProd;
    private javax.swing.JLabel txtNombreActualProveedor1;
    private javax.swing.JTextField txtNombreProductoVender;
    private javax.swing.JTextField txtNombreProductos;
    private javax.swing.JTextField txtNombreProductos1;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtNuevoDireccionProveedor;
    private javax.swing.JTextField txtNuevoNIT;
    private javax.swing.JTextField txtNuevoNombreProveedor;
    private javax.swing.JTextField txtNuevoTelefonoProveedor;
    private javax.swing.JTextField txtPrecioProductos;
    private javax.swing.JTextField txtPrecioProductos2;
    private javax.swing.JTextField txtProductoInventario;
    private javax.swing.JTextField txtProductosBuscar;
    private javax.swing.JTextField txtProductosBuscar1;
    private javax.swing.JLabel txtTelefonoActualProveedor;
    private javax.swing.JTextField txtTelefonoProveedor;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotal2;
    private javax.swing.JTextField txtTotalventa;
    // End of variables declaration//GEN-END:variables

    private void setVisible(JPopupMenu MenuEmergente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
