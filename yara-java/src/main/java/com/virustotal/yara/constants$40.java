// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$40 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$40() {}
    static final FunctionDescriptor strncasecmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncasecmp$MH = RuntimeHelper.downcallHandle(
        "strncasecmp",
        constants$40.strncasecmp$FUNC
    );
    static final FunctionDescriptor strcasecmp_l$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcasecmp_l$MH = RuntimeHelper.downcallHandle(
        "strcasecmp_l",
        constants$40.strcasecmp_l$FUNC
    );
    static final FunctionDescriptor strncasecmp_l$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strncasecmp_l$MH = RuntimeHelper.downcallHandle(
        "strncasecmp_l",
        constants$40.strncasecmp_l$FUNC
    );
    static final FunctionDescriptor explicit_bzero$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle explicit_bzero$MH = RuntimeHelper.downcallHandle(
        "explicit_bzero",
        constants$40.explicit_bzero$FUNC
    );
    static final FunctionDescriptor strsep$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strsep$MH = RuntimeHelper.downcallHandle(
        "strsep",
        constants$40.strsep$FUNC
    );
    static final FunctionDescriptor strsignal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strsignal$MH = RuntimeHelper.downcallHandle(
        "strsignal",
        constants$40.strsignal$FUNC
    );
}


