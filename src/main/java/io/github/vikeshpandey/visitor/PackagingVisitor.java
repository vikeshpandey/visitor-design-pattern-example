package io.github.vikeshpandey.visitor;

import io.github.vikeshpandey.element.Cloth;
import io.github.vikeshpandey.element.Electronic;

public interface PackagingVisitor {

    void visit(Cloth clothPackagingVisitor);

    void visit(Electronic electronicPackagingVisitor);

}
