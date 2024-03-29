package io.github.vikeshpandey.element;

import io.github.vikeshpandey.visitor.Visitor;

public class Electronic implements BaseProduct {
    private int voltage;

    public Electronic(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getVoltage() {
        return voltage;
    }
}
