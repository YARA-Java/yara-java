// Generated by jextract

package com.virustotal.yara.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$161 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$161() {}
    static final FunctionDescriptor yr_object_copy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_object_copy$MH = RuntimeHelper.downcallHandle(
        "yr_object_copy",
        constants$161.yr_object_copy$FUNC
    );
    static final FunctionDescriptor yr_object_lookup_field$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_object_lookup_field$MH = RuntimeHelper.downcallHandle(
        "yr_object_lookup_field",
        constants$161.yr_object_lookup_field$FUNC
    );
    static final FunctionDescriptor yr_object_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_object_lookup$MH = RuntimeHelper.downcallHandleVariadic(
        "yr_object_lookup",
        constants$161.yr_object_lookup$FUNC
    );
    static final FunctionDescriptor yr_object_has_undefined_value$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_object_has_undefined_value$MH = RuntimeHelper.downcallHandleVariadic(
        "yr_object_has_undefined_value",
        constants$161.yr_object_has_undefined_value$FUNC
    );
    static final FunctionDescriptor yr_object_get_float$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_object_get_float$MH = RuntimeHelper.downcallHandleVariadic(
        "yr_object_get_float",
        constants$161.yr_object_get_float$FUNC
    );
    static final FunctionDescriptor yr_object_get_integer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_object_get_integer$MH = RuntimeHelper.downcallHandleVariadic(
        "yr_object_get_integer",
        constants$161.yr_object_get_integer$FUNC
    );
}

