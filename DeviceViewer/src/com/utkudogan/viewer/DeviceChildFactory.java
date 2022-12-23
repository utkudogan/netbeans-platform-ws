/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utkudogan.viewer;

import com.utkudogan.devicedomain.Device;
import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author utku.dogan
 */
public class DeviceChildFactory extends ChildFactory<Device> {

    @Override
    protected boolean createKeys(List<Device> list) {
        list.add(new Device("blue", 123));
        list.add(new Device("red", 124));

        return true;
    }

    @Override
    protected Node createNodeForKey(Device key) {
        DeviceNode node = null;
        try {
            node = new DeviceNode(key);
        } catch (IntrospectionException e) {
            Exceptions.printStackTrace(e);
        }
        return node;
    }

}
