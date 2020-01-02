package io.github.vikeshpandey.element;

import io.github.vikeshpandey.visitor.Visitor;

public class Cloth implements BaseProduct {
    private String size;

    public Cloth(String size) {
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSize() {
        return size;
    }
}
