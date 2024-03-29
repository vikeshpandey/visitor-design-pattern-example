package io.github.vikeshpandey;

import io.github.vikeshpandey.element.BaseProduct;
import io.github.vikeshpandey.element.Cloth;
import io.github.vikeshpandey.element.Electronic;
import io.github.vikeshpandey.visitor.Visitor;
import io.github.vikeshpandey.visitor.PackagingVisitor;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] arg) {
        Set<BaseProduct> products = new HashSet<>();
        products.add(new Cloth("M"));
        products.add(new Electronic(220));

        packageProductsForShipping(products);
    }

    private static void packageProductsForShipping(Set<BaseProduct> products) {
        Visitor visitor = new PackagingVisitor();
        products.forEach(baseProduct -> baseProduct.accept(visitor));
    }

}
