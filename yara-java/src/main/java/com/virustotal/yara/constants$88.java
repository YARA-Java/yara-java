// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$88 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$88() {}
    static final FunctionDescriptor yr_thread_storage_create$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_thread_storage_create$MH = RuntimeHelper.downcallHandle(
        "yr_thread_storage_create",
        constants$88.yr_thread_storage_create$FUNC
    );
    static final FunctionDescriptor yr_thread_storage_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_thread_storage_destroy$MH = RuntimeHelper.downcallHandle(
        "yr_thread_storage_destroy",
        constants$88.yr_thread_storage_destroy$FUNC
    );
    static final FunctionDescriptor yr_thread_storage_set_value$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_thread_storage_set_value$MH = RuntimeHelper.downcallHandle(
        "yr_thread_storage_set_value",
        constants$88.yr_thread_storage_set_value$FUNC
    );
    static final FunctionDescriptor yr_thread_storage_get_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_thread_storage_get_value$MH = RuntimeHelper.downcallHandle(
        "yr_thread_storage_get_value",
        constants$88.yr_thread_storage_get_value$FUNC
    );
    static final FunctionDescriptor yr_notebook_create$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_notebook_create$MH = RuntimeHelper.downcallHandle(
        "yr_notebook_create",
        constants$88.yr_notebook_create$FUNC
    );
    static final FunctionDescriptor yr_notebook_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle yr_notebook_destroy$MH = RuntimeHelper.downcallHandle(
        "yr_notebook_destroy",
        constants$88.yr_notebook_destroy$FUNC
    );
}


