package com.hulu73.java.beans.event;

import java.util.EventObject;

/**
 * 事件对象
 * @Auther: liuzhg
 * @Date: 2018/9/11 0011
 * @Description:
 */
public class MyEventObject extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MyEventObject(Object source) {
        super(source);
    }
}
