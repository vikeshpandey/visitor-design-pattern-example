package io.github.vikeshpandey.element;

import io.github.vikeshpandey.visitor.PackagingVisitor;

public interface BaseProduct {

    void performPackaging(PackagingVisitor packagingVisitor);
}
