package view; /**
 * Descripci?n de la clase GuiSieteYMedia
 *
 * @author
 * @version
 */

import controller.Juego;
import model.Carta;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
    private JPanel panelCentro;
    private JLabel lblCarta;
    private JPanel panelSur;
    private JButton btnSacarCarta;
    private JButton btnPlantarse;
    private JButton btnNuevoJuego;
    private JButton btnMostrarBaraja;
    private JTextField txtEstadoJuego;

    private Juego juego; //el modelo

    /**
     * Constructor de objetos de la clase view.Gui7YMedia
     */
    public Gui() {
        juego = new Juego(); //crear el modelo

        panelCentro = crearPanelCentro();
        this.getContentPane().add(panelCentro, BorderLayout.CENTER);

        panelSur = crearPanelSur();
        add(panelSur, BorderLayout.SOUTH);

        setVisible(true);
        setSize(400, 600);
        setLocationRelativeTo(null);  //centrar la ventana
        setTitle("Juego de las 7 y media");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    /**
     * crear el panel sur que contiene
     * los botones y la etiqueta en la que se mostrara el
     * estado del juego
     */
    public JPanel crearPanelSur() {

        JPanel panelSur = new JPanel();
        panelSur.setLayout(new GridLayout(5, 1));
        txtEstadoJuego = new JTextField(60);
        txtEstadoJuego.setText(" Para jugar pulsa Nuevo Juego");
        txtEstadoJuego.setFont(new Font("Verdana", Font.BOLD, 14));
        txtEstadoJuego.setEditable(true);
        txtEstadoJuego.setBackground(Color.white);
        txtEstadoJuego.setForeground(Color.blue);
        txtEstadoJuego.setHorizontalAlignment(JLabel.CENTER);
        panelSur.add(txtEstadoJuego);
        btnNuevoJuego = new JButton("Nuevo juego");
        btnNuevoJuego.addActionListener(this);  // el oyente de eventos sera la ventna JFrame

        panelSur.add(btnNuevoJuego);
        btnSacarCarta = new JButton("Sacar carta");
        btnSacarCarta.addActionListener(this);
        btnSacarCarta.setEnabled(false);
        panelSur.add(btnSacarCarta);

        btnPlantarse = new JButton("Plantarse");
        btnPlantarse.addActionListener(this);
        btnPlantarse.setEnabled(false);
        panelSur.add(btnPlantarse);

        btnMostrarBaraja = new JButton("Mostrar Baraja");
        btnMostrarBaraja.addActionListener(this);
        btnMostrarBaraja.setEnabled(true);
        panelSur.add(btnMostrarBaraja);
        return panelSur;

    }

    /**
     * crear el panel norte que mostrara la carta
     * sacada (su imagen grafica)
     */
    public JPanel crearPanelCentro() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(new TitledBorder("Carta sacada"));
        lblCarta = new JLabel();
        lblCarta.setOpaque(true);
        lblCarta.setBackground(Color.gray);
        lblCarta.setHorizontalAlignment(JLabel.CENTER);
        panel.add(lblCarta, BorderLayout.CENTER);

        return panel;

    }

    /**
     * Analizar la fuente del evento producido
     * es decir, que boton se ha pulsado
     */
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnNuevoJuego)
            nuevoJuego();
        else if (evt.getSource() == btnSacarCarta)
            sacarCarta();
        else if (evt.getSource() == btnPlantarse)
            plantarse();
        else
            mostrarBaraja();

    }

    /**
     * Tratamiento para empezar a jugar.
     * Se habilitan los botones SacarCarta y Plantarse
     * se resetea el juego mostrando la situacion inicial
     */
    private void nuevoJuego() {
        juego.reset();
        lblCarta.setIcon(null);
        habilitarBotones(false, true, true);

        txtEstadoJuego.setText(" Puntuacion:  " + juego.getPuntosAcumulados() + " puntos");

    }

    /**
     * El juego devuelve la carta sacada que se muestra
     * en la ventana grafica indicando los puntos acumulados
     * que se llevan en el juego. Si se llega a las siete y media o
     * se pasa, se muestra el resultado y se prepara todo para volver a jugar.
     * Si la carta sacada es nul es que ya o quedaban cartas en la
     * baraja, tambien se prepara todo para volver a jugar
     */
    private void sacarCarta() {
        Carta c = juego.sacarCarta();
        if (c != null) {
            lblCarta.setIcon(c.getImagen());
            txtEstadoJuego.setText("Puntos acumulados  " + juego.getPuntosAcumulados());
            if (juego.seHaPasado()) {
                String txt = txtEstadoJuego.getText();
                txtEstadoJuego.setText(txt + " - Te has pasado de " + Juego.SIETE_Y_MEDIO);
                habilitarBotones(true, false, false);

            } else if (juego.esSieteYMedia()) {
                String txt = txtEstadoJuego.getText();
                txtEstadoJuego.setText(txt + "  -  Has ganado");
                habilitarBotones(true, false, false);
            }

        } else {
            txtEstadoJuego.setText("Ya no quedan cartas en la baraja");
            habilitarBotones(true, false, false);
        }
    }

    /**
     * Habilitar/deshabilitar los botones de NuevoJuego, SacarCarta, Plantarse
     */
    private void habilitarBotones(boolean n, boolean s, boolean p) {
        btnNuevoJuego.setEnabled(n);
        btnSacarCarta.setEnabled(s);
        btnPlantarse.setEnabled(p);
    }

    /**
     * El jugador se planta
     * Se muestra un mensaje de final con el total de puntos
     * acumulados y se prepara todo para un nuevo jeugo
     */
    private void plantarse() {

        txtEstadoJuego.setText(" Te has plantado con un total de " + juego.getPuntosAcumulados() + " puntos");

        habilitarBotones(true, false, false);

    }

    /**
     * Mostrar la baraja (las cartas que quedan)
     */
    private void mostrarBaraja() {
        JOptionPane.showMessageDialog(this, juego.mostrarBaraja());

    }
}
