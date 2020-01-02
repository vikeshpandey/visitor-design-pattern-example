package io.github.vikeshpandey.visitor;

import io.github.vikeshpandey.element.Cloth;
import io.github.vikeshpandey.element.Electronic;

public interface Visitor {

    void visit(Cloth cloth);

    void visit(Electronic electronic);

}
