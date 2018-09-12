package com.hulu73.java.beans.event;

import java.util.EventListener;
import java.util.HashSet;
import java.util.Set;

/**
 * 事件源，即触发事件的对象；
 * @Auther: liuzhg
 * @Date: 2018/9/11 0011
 * @Description:
 */
public class Source {

    Set<EventListener> listeners = new HashSet<EventListener>();

    /**
     * 注册事件监听器
     *
     * @param listener
     */
    public void addStateChangeListener(MyListener listener) {
        listeners.add(listener);
    }



    /**
     * 当事件发生时，通知注册在事件源上的所有事件做出相应的反映
     */
    public void notifyListener() {
        for (EventListener listener : listeners) {
            try {
                ((MyListener)listener).handleEvent(new MyEventObject(this));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 改变状态
     */
    public void changeFlag() {

        notifyListener();
    }


}
