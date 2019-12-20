package io.github.vikeshpandey.element;

import io.github.vikeshpandey.visitor.PackagingVisitor;

public class Electronic implements BaseProduct {
    private int voltage;

    public Electronic(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public void performPackaging(PackagingVisitor packagingVisitor) {
        packagingVisitor.visit(this);
    }

    public int getVoltage() {
        return voltage;
    }
}
