// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$154 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$154() {}
    static final FunctionDescriptor yr_scanner_set_callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_scanner_set_callback$MH = RuntimeHelper.downcallHandle(
        "yr_scanner_set_callback",
        constants$154.yr_scanner_set_callback$FUNC
    );
    static final FunctionDescriptor yr_scanner_set_timeout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle yr_scanner_set_timeout$MH = RuntimeHelper.downcallHandle(
        "yr_scanner_set_timeout",
        constants$154.yr_scanner_set_timeout$FUNC
    );
    static final FunctionDescriptor yr_scanner_set_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle yr_scanner_set_flags$MH = RuntimeHelper.downcallHandle(
        "yr_scanner_set_flags",
        constants$154.yr_scanner_set_flags$FUNC
    );
    static final FunctionDescriptor yr_scanner_define_integer_variable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle yr_scanner_define_integer_variable$MH = RuntimeHelper.downcallHandle(
        "yr_scanner_define_integer_variable",
        constants$154.yr_scanner_define_integer_variable$FUNC
    );
    static final FunctionDescriptor yr_scanner_define_boolean_variable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle yr_scanner_define_boolean_variable$MH = RuntimeHelper.downcallHandle(
        "yr_scanner_define_boolean_variable",
        constants$154.yr_scanner_define_boolean_variable$FUNC
    );
    static final FunctionDescriptor yr_scanner_define_float_variable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle yr_scanner_define_float_variable$MH = RuntimeHelper.downcallHandle(
        "yr_scanner_define_float_variable",
        constants$154.yr_scanner_define_float_variable$FUNC
    );
}


