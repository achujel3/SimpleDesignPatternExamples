package io.examples.designpatterns.command.commands;

import io.examples.designpatterns.command.device.ElectronicDevice;

import java.util.List;

public class TurnItAllOff implements Command {

    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }

    @Override
    public void execute() {
        theDevices.stream().forEach(device -> device.off());
    }

    @Override
    public void undo() {
        theDevices.stream().forEach(device -> device.on());
    }
}
