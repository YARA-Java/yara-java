// Generated by jextract

package com.virustotal.yara.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RE_FIBER_LIST {
 *     RE_FIBER* head;
 *     RE_FIBER* tail;
 * };
 * }
 */
public class RE_FIBER_LIST {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("head"),
        Constants$root.C_POINTER$LAYOUT.withName("tail")
    ).withName("RE_FIBER_LIST");
    public static MemoryLayout $LAYOUT() {
        return RE_FIBER_LIST.$struct$LAYOUT;
    }
    static final VarHandle head$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("head"));
    public static VarHandle head$VH() {
        return RE_FIBER_LIST.head$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RE_FIBER* head;
     * }
     */
    public static MemorySegment head$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RE_FIBER_LIST.head$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RE_FIBER* head;
     * }
     */
    public static void head$set(MemorySegment seg, MemorySegment x) {
        RE_FIBER_LIST.head$VH.set(seg, x);
    }
    public static MemorySegment head$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RE_FIBER_LIST.head$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void head$set(MemorySegment seg, long index, MemorySegment x) {
        RE_FIBER_LIST.head$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tail"));
    public static VarHandle tail$VH() {
        return RE_FIBER_LIST.tail$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RE_FIBER* tail;
     * }
     */
    public static MemorySegment tail$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RE_FIBER_LIST.tail$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RE_FIBER* tail;
     * }
     */
    public static void tail$set(MemorySegment seg, MemorySegment x) {
        RE_FIBER_LIST.tail$VH.set(seg, x);
    }
    public static MemorySegment tail$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RE_FIBER_LIST.tail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tail$set(MemorySegment seg, long index, MemorySegment x) {
        RE_FIBER_LIST.tail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

