// Generated by jextract

package com.virustotal.yara.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$7 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$7() {}
    static final FunctionDescriptor vscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vscanf$MH = RuntimeHelper.downcallHandle(
        "vscanf",
        constants$7.vscanf$FUNC
    );
    static final FunctionDescriptor vsscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vsscanf$MH = RuntimeHelper.downcallHandle(
        "vsscanf",
        constants$7.vsscanf$FUNC
    );
    static final FunctionDescriptor fgetc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fgetc$MH = RuntimeHelper.downcallHandle(
        "fgetc",
        constants$7.fgetc$FUNC
    );
    static final FunctionDescriptor getc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getc$MH = RuntimeHelper.downcallHandle(
        "getc",
        constants$7.getc$FUNC
    );
    static final FunctionDescriptor getchar$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getchar$MH = RuntimeHelper.downcallHandle(
        "getchar",
        constants$7.getchar$FUNC
    );
    static final FunctionDescriptor getc_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getc_unlocked$MH = RuntimeHelper.downcallHandle(
        "getc_unlocked",
        constants$7.getc_unlocked$FUNC
    );
}

