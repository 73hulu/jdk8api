package com.hulu73.java.beans.beancontext.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/11 0011
 * @Description:
 */
public class MyPropertyChangeListener implements PropertyChangeListener {
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("propertyChange....."+evt.getPropertyName() + "----------" + evt.getNewValue());

    }
}
