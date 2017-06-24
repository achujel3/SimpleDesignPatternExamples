package io.examples.designpatterns.command.commands;

import io.examples.designpatterns.command.device.ElectronicDevice;

public class TurnTVOff implements Command {

    ElectronicDevice electronicDevice;

    public TurnTVOff(ElectronicDevice newElectronicDevice) {
        electronicDevice = newElectronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }

    // Used if you want to allow for undo
    // Do the opposite of execute()

    @Override
    public void undo() {
        electronicDevice.on();
    }
}
