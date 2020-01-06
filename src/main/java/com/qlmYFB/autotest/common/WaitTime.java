package com.qlmYFB.autotest.common;
public class WaitTime {
    static public void waitTime(int time) {
               try {
                         Thread.sleep(time);
                   } catch (InterruptedException e) {
                      // TODO Auto-generated catch block
                       e.printStackTrace();
                    }
          }
}
