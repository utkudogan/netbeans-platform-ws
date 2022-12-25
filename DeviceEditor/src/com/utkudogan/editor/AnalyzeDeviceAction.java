/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/contextAction.java to edit this template
 */
package com.utkudogan.editor;

import com.utkudogan.devicedomain.Device;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Device",
        id = "com.utkudogan.editor.AnalyzeDeviceAction"
)
@ActionRegistration(
        displayName = "#CTL_AnalyzeDeviceAction"
)
@ActionReference(path = "Menu/Device", position = 1300)
@Messages("CTL_AnalyzeDeviceAction=Analyze Device")
public final class AnalyzeDeviceAction implements ActionListener {

    private final Device context;

    public AnalyzeDeviceAction(Device context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        JOptionPane.showMessageDialog(null, context.getType());
    }
}
