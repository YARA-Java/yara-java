// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$35 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$35() {}
    static final FunctionDescriptor strncmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncmp$MH = RuntimeHelper.downcallHandle(
        "strncmp",
        constants$35.strncmp$FUNC
    );
    static final FunctionDescriptor strcoll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcoll$MH = RuntimeHelper.downcallHandle(
        "strcoll",
        constants$35.strcoll$FUNC
    );
    static final FunctionDescriptor strxfrm$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strxfrm$MH = RuntimeHelper.downcallHandle(
        "strxfrm",
        constants$35.strxfrm$FUNC
    );
    static final FunctionDescriptor strcoll_l$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcoll_l$MH = RuntimeHelper.downcallHandle(
        "strcoll_l",
        constants$35.strcoll_l$FUNC
    );
    static final FunctionDescriptor strxfrm_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strxfrm_l$MH = RuntimeHelper.downcallHandle(
        "strxfrm_l",
        constants$35.strxfrm_l$FUNC
    );
    static final FunctionDescriptor strdup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strdup$MH = RuntimeHelper.downcallHandle(
        "strdup",
        constants$35.strdup$FUNC
    );
}

