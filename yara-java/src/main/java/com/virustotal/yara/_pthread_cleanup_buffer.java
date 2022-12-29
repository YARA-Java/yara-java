// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _pthread_cleanup_buffer {
 *     void (*__routine)(void*);
 *     void* __arg;
 *     int __canceltype;
 *     struct _pthread_cleanup_buffer* __prev;
 * };
 * }
 */
public class _pthread_cleanup_buffer {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("__routine"),
        Constants$root.C_POINTER$LAYOUT.withName("__arg"),
        Constants$root.C_INT$LAYOUT.withName("__canceltype"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("__prev")
    ).withName("_pthread_cleanup_buffer");
    public static MemoryLayout $LAYOUT() {
        return _pthread_cleanup_buffer.$struct$LAYOUT;
    }
    static final FunctionDescriptor __routine$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __routine$MH = RuntimeHelper.downcallHandle(
        _pthread_cleanup_buffer.__routine$FUNC
    );
    /**
     * {@snippet :
 * void (*__routine)(void*);
     * }
     */
    public interface __routine {

        void apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(__routine fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(__routine.class, fi, _pthread_cleanup_buffer.__routine$FUNC, scope);
        }
        static __routine ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    _pthread_cleanup_buffer.__routine$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle __routine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__routine"));
    public static VarHandle __routine$VH() {
        return _pthread_cleanup_buffer.__routine$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*__routine)(void*);
     * }
     */
    public static MemorySegment __routine$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_pthread_cleanup_buffer.__routine$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*__routine)(void*);
     * }
     */
    public static void __routine$set(MemorySegment seg, MemorySegment x) {
        _pthread_cleanup_buffer.__routine$VH.set(seg, x);
    }
    public static MemorySegment __routine$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_pthread_cleanup_buffer.__routine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __routine$set(MemorySegment seg, long index, MemorySegment x) {
        _pthread_cleanup_buffer.__routine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static __routine __routine(MemorySegment segment, SegmentScope scope) {
        return __routine.ofAddress(__routine$get(segment), scope);
    }
    static final VarHandle __arg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__arg"));
    public static VarHandle __arg$VH() {
        return _pthread_cleanup_buffer.__arg$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* __arg;
     * }
     */
    public static MemorySegment __arg$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_pthread_cleanup_buffer.__arg$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* __arg;
     * }
     */
    public static void __arg$set(MemorySegment seg, MemorySegment x) {
        _pthread_cleanup_buffer.__arg$VH.set(seg, x);
    }
    public static MemorySegment __arg$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_pthread_cleanup_buffer.__arg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __arg$set(MemorySegment seg, long index, MemorySegment x) {
        _pthread_cleanup_buffer.__arg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __canceltype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__canceltype"));
    public static VarHandle __canceltype$VH() {
        return _pthread_cleanup_buffer.__canceltype$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __canceltype;
     * }
     */
    public static int __canceltype$get(MemorySegment seg) {
        return (int)_pthread_cleanup_buffer.__canceltype$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __canceltype;
     * }
     */
    public static void __canceltype$set(MemorySegment seg, int x) {
        _pthread_cleanup_buffer.__canceltype$VH.set(seg, x);
    }
    public static int __canceltype$get(MemorySegment seg, long index) {
        return (int)_pthread_cleanup_buffer.__canceltype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __canceltype$set(MemorySegment seg, long index, int x) {
        _pthread_cleanup_buffer.__canceltype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __prev$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__prev"));
    public static VarHandle __prev$VH() {
        return _pthread_cleanup_buffer.__prev$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _pthread_cleanup_buffer* __prev;
     * }
     */
    public static MemorySegment __prev$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_pthread_cleanup_buffer.__prev$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _pthread_cleanup_buffer* __prev;
     * }
     */
    public static void __prev$set(MemorySegment seg, MemorySegment x) {
        _pthread_cleanup_buffer.__prev$VH.set(seg, x);
    }
    public static MemorySegment __prev$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_pthread_cleanup_buffer.__prev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __prev$set(MemorySegment seg, long index, MemorySegment x) {
        _pthread_cleanup_buffer.__prev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


