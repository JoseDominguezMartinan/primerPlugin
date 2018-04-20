/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.exemploPlugin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.myorg.exemploPlugin.abrirNavegador"
)
@ActionRegistration(
        iconBase = "org/myorg/exemploPlugin/icono_navegador.png",
        displayName = "#CTL_abrirNavegador"
)
@ActionReference(path = "Toolbars/File",position = 0)
@Messages("CTL_abrirNavegador=navegador")
public final class abrirNavegador implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // TODO implement action body
        String url = "http://www.google.com";
        try
        {
            Runtime.getRuntime().exec("firefox " + url);
        } catch(IOException ex)
        {
            Exceptions.printStackTrace(ex);
        }
    }
}
