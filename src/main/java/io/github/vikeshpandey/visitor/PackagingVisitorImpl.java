package io.github.vikeshpandey.visitor;

import io.github.vikeshpandey.element.Cloth;
import io.github.vikeshpandey.element.Electronic;

public class PackagingVisitorImpl implements PackagingVisitor {

    @Override
    public void visit(Cloth cloth) {
        System.out.println("while packaging the cloth, make sure they are packed in water proof material");
    }

    @Override
    public void visit(Electronic electronic) {
        System.out.println("while packaging electronic, make sure they are packed in both shock-proof and water proof material");
    }
}
