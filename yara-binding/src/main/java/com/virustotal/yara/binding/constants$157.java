// Generated by jextract

package com.virustotal.yara.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$157 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$157() {}
    static final FunctionDescriptor yr_rules_scan_mem$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle yr_rules_scan_mem$MH = RuntimeHelper.downcallHandle(
        "yr_rules_scan_mem",
        constants$157.yr_rules_scan_mem$FUNC
    );
    static final FunctionDescriptor yr_rules_scan_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle yr_rules_scan_file$MH = RuntimeHelper.downcallHandle(
        "yr_rules_scan_file",
        constants$157.yr_rules_scan_file$FUNC
    );
    static final FunctionDescriptor yr_rules_scan_fd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle yr_rules_scan_fd$MH = RuntimeHelper.downcallHandle(
        "yr_rules_scan_fd",
        constants$157.yr_rules_scan_fd$FUNC
    );
    static final FunctionDescriptor yr_rules_scan_proc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle yr_rules_scan_proc$MH = RuntimeHelper.downcallHandle(
        "yr_rules_scan_proc",
        constants$157.yr_rules_scan_proc$FUNC
    );
    static final FunctionDescriptor yr_rules_save$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_rules_save$MH = RuntimeHelper.downcallHandle(
        "yr_rules_save",
        constants$157.yr_rules_save$FUNC
    );
    static final FunctionDescriptor yr_rules_save_stream$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_rules_save_stream$MH = RuntimeHelper.downcallHandle(
        "yr_rules_save_stream",
        constants$157.yr_rules_save_stream$FUNC
    );
}

