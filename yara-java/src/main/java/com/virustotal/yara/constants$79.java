// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$79 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$79() {}
    static final FunctionDescriptor pthread_rwlock_timedrdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_timedrdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_timedrdlock",
        constants$79.pthread_rwlock_timedrdlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_wrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_wrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_wrlock",
        constants$79.pthread_rwlock_wrlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_trywrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_trywrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_trywrlock",
        constants$79.pthread_rwlock_trywrlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_timedwrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_timedwrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_timedwrlock",
        constants$79.pthread_rwlock_timedwrlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_unlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_unlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_unlock",
        constants$79.pthread_rwlock_unlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlockattr_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlockattr_init$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlockattr_init",
        constants$79.pthread_rwlockattr_init$FUNC
    );
}


