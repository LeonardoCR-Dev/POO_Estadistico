//Francisco Javier Portillo Pineda
package Controlador;

import Principal.Principal;
import Vista.CorrelacionLineal;
import Vista.Covarianza;
import Vista.MenuPrincipal;
import Vista.RegresionMuestral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class controladorMenu implements ActionListener {
    
    private MenuPrincipal vistaMenu;
    
    public controladorMenu(MenuPrincipal vistaMenu) {
        this.vistaMenu = vistaMenu;
        this.vistaMenu.jButton4.addActionListener(this);
        this.vistaMenu.jButton_Correlacion.addActionListener(this);
        this.vistaMenu.jButton_Covarianza.addActionListener(this);
        this.vistaMenu.jButton_Regresion.addActionListener(this);
        this.vistaMenu.jMenuItem_Correlacion.addActionListener(this);
        this.vistaMenu.jMenuItem_Covarianza.addActionListener(this);
        this.vistaMenu.jMenuItem_Regresion.addActionListener(this);
        this.vistaMenu.jMenuItem_Salir.addActionListener(this);
        this.vistaMenu.jMenuItem_acerca.addActionListener(this);
    }
    
    public void iniciar() {
        vistaMenu.setIconImage(new ImageIcon(getClass().getResource("/Recursos/calculadora.png")).getImage());
        vistaMenu.setLocationRelativeTo(null);
        vistaMenu.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaMenu.jButton4) {
            System.exit(0);
        }
        if (e.getSource() == vistaMenu.jButton_Correlacion) {
            CorrelacionLineal vistaCorrelacion = new CorrelacionLineal();
            controladorCorrelacion controladorCorre = new controladorCorrelacion(vistaCorrelacion);
            controladorCorre.iniciar();
            vistaMenu.dispose();
            vistaCorrelacion.setVisible(true);
        }
        if (e.getSource() == vistaMenu.jButton_Covarianza) {
            Covarianza vistaCovarianza = new Covarianza();
            controladorCovarianza controladorCovarianza = new controladorCovarianza(vistaCovarianza);
            controladorCovarianza.iniciar();
            vistaMenu.dispose();
            vistaCovarianza.setVisible(true);
        }
        if (e.getSource() == vistaMenu.jButton_Regresion) {
            RegresionMuestral vistaregrecion = new RegresionMuestral();
            controladorRegrecion controladorRe = new controladorRegrecion(vistaregrecion);
            controladorRe.iniciar();
            vistaMenu.dispose();
            vistaregrecion.setVisible(true);
        }
        if (e.getSource() == vistaMenu.jMenuItem_Salir) {
            vistaMenu.jButton4.doClick();
        }
        if (e.getSource() == vistaMenu.jMenuItem_Correlacion) {
            vistaMenu.jButton_Correlacion.doClick();
        }
        if (e.getSource() == vistaMenu.jMenuItem_Covarianza) {
            vistaMenu.jButton_Covarianza.doClick();
        }
        if (e.getSource() == vistaMenu.jMenuItem_Regresion) {
            vistaMenu.jButton_Regresion.doClick();
        }
        if (e.getSource() == vistaMenu.jMenuItem_acerca) {
            Principal.acerca.setLocationRelativeTo(null);
            Principal.acerca.setVisible(true);            
        }
    }
    
}
