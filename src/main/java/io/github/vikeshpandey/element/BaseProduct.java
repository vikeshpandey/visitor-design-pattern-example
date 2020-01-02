package io.github.vikeshpandey.element;

import io.github.vikeshpandey.visitor.Visitor;

public interface BaseProduct {

    void accept(Visitor visitor);
}
