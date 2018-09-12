package com.hulu73.java.beans.event;

import java.util.EventListener;

/**
 * 事件监听器，对该事件的处理。
 * @Auther: liuzhg
 * @Date: 2018/9/11 0011
 * @Description:
 */
public class MyListener implements EventListener {



        public void handleEvent(MyEventObject event) {
            System.out.println("触发状态改变事件。。。");

        }


}
