package io.examples.designpatterns.command.commands;

import io.examples.designpatterns.command.device.ElectronicDevice;

public class TurnTVUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }
}
