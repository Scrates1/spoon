/*
 * SPDX-License-Identifier: (MIT OR CECILL-C)
 *
 * Copyright (C) 2006-2023 INRIA and contributors
 *
 * Spoon is available either under the terms of the MIT License (see LICENSE-MIT.txt) or the Cecill-C License (see LICENSE-CECILL-C.txt). You as the user are entitled to choose the terms under which to adopt Spoon.
 */
package spoon.reflect.visitor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * This annotation defines a method that contains children of an element of the
 * meta model. It is used for the automatic generation of visitors of spoon
 * metamodel elements.
 */
@Target({ ElementType.METHOD })
public @interface Child {
	/**
	 * The ordering of the child relatively to the other children of the parent
	 * node. Children will be scanned in the declared order.
	 */
	int order() default 0;
}
