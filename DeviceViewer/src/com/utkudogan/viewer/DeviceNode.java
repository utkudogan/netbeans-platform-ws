/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utkudogan.viewer;

import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;
import com.utkudogan.devicedomain.Device;
import org.openide.nodes.Children;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author utku.dogan
 */
public class DeviceNode extends BeanNode<Device>{

    public DeviceNode(Device bean) throws IntrospectionException {
        super(bean, Children.LEAF, Lookups.singleton(bean));
        setDisplayName(bean.getType());


    }
    
}
