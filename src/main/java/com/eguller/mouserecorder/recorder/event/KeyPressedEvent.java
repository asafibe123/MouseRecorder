package com.eguller.mouserecorder.recorder.event;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: eguller
 * Date: 12/4/13
 * Time: 5:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeyPressedEvent extends KeyEvent{
    public KeyPressedEvent(int key) {
        super(key);
    }

    @Override
    public void execute(Robot robot) {
        robot.keyPress(key);
    }
}
