// Generated by jextract

package com.virustotal.yara.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$105 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$105() {}
    static final FunctionDescriptor yr_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_free$MH = RuntimeHelper.downcallHandle(
        "yr_free",
        constants$105.yr_free$FUNC
    );
    static final FunctionDescriptor yr_heap_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle yr_heap_alloc$MH = RuntimeHelper.downcallHandle(
        "yr_heap_alloc",
        constants$105.yr_heap_alloc$FUNC
    );
    static final FunctionDescriptor yr_heap_free$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle yr_heap_free$MH = RuntimeHelper.downcallHandle(
        "yr_heap_free",
        constants$105.yr_heap_free$FUNC
    );
    static final FunctionDescriptor __fpclassify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle __fpclassify$MH = RuntimeHelper.downcallHandle(
        "__fpclassify",
        constants$105.__fpclassify$FUNC
    );
    static final FunctionDescriptor __signbit$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle __signbit$MH = RuntimeHelper.downcallHandle(
        "__signbit",
        constants$105.__signbit$FUNC
    );
    static final FunctionDescriptor __isinf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle __isinf$MH = RuntimeHelper.downcallHandle(
        "__isinf",
        constants$105.__isinf$FUNC
    );
}

