package io.examples.designpatterns.command;

import io.examples.designpatterns.command.device.ElectronicDevice;
import io.examples.designpatterns.command.device.Television;

public class TVRemote {

    public static ElectronicDevice getDevice() {
        return new Television();
    }

}
