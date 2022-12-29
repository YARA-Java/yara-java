// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*YR_EXT_LOAD_FUNC)(struct YR_SCAN_CONTEXT* context,struct YR_OBJECT* module_object,void* module_data,unsigned long module_data_size);
 * }
 */
public interface YR_EXT_LOAD_FUNC {

    int apply(java.lang.foreign.MemorySegment context, java.lang.foreign.MemorySegment module_object, java.lang.foreign.MemorySegment module_data, long module_data_size);
    static MemorySegment allocate(YR_EXT_LOAD_FUNC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(YR_EXT_LOAD_FUNC.class, fi, constants$165.YR_EXT_LOAD_FUNC$FUNC, scope);
    }
    static YR_EXT_LOAD_FUNC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _context, java.lang.foreign.MemorySegment _module_object, java.lang.foreign.MemorySegment _module_data, long _module_data_size) -> {
            try {
                return (int)constants$165.YR_EXT_LOAD_FUNC$MH.invokeExact(symbol, _context, _module_object, _module_data, _module_data_size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


