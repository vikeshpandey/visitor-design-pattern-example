package io.github.vikeshpandey.element;

import io.github.vikeshpandey.visitor.PackagingVisitor;

public class Cloth implements BaseProduct {
    private String size;

    public Cloth(String size) {
        this.size = size;
    }

    @Override
    public void performPackaging(PackagingVisitor packagingVisitor) {
        packagingVisitor.visit(this);
    }

    public String getSize() {
        return size;
    }
}
