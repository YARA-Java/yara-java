// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$78 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$78() {}
    static final FunctionDescriptor pthread_mutexattr_getrobust$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_getrobust$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_getrobust",
        constants$78.pthread_mutexattr_getrobust$FUNC
    );
    static final FunctionDescriptor pthread_mutexattr_setrobust$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_setrobust$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_setrobust",
        constants$78.pthread_mutexattr_setrobust$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_init$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_init",
        constants$78.pthread_rwlock_init$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_destroy",
        constants$78.pthread_rwlock_destroy$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_rdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_rdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_rdlock",
        constants$78.pthread_rwlock_rdlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_tryrdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_tryrdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_tryrdlock",
        constants$78.pthread_rwlock_tryrdlock$FUNC
    );
}


