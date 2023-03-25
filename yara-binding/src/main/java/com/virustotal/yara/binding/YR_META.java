// Generated by jextract

package com.virustotal.yara.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct YR_META {
 *     union {
 *         char* identifier;
 *         YR_ARENA_REF identifier_;
 *     };
 *     union {
 *         char* string;
 *         YR_ARENA_REF string_;
 *     };
 *     int64_t integer;
 *     int32_t type;
 *     int32_t flags;
 * };
 * }
 */
public class YR_META {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("identifier"),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("buffer_id"),
                Constants$root.C_INT$LAYOUT.withName("offset")
            ).withName("identifier_")
        ).withName("$anon$0"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("string"),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("buffer_id"),
                Constants$root.C_INT$LAYOUT.withName("offset")
            ).withName("string_")
        ).withName("$anon$1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("integer"),
        Constants$root.C_INT$LAYOUT.withName("type"),
        Constants$root.C_INT$LAYOUT.withName("flags")
    ).withName("YR_META");
    public static MemoryLayout $LAYOUT() {
        return YR_META.$struct$LAYOUT;
    }
    static final VarHandle identifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("identifier"));
    public static VarHandle identifier$VH() {
        return YR_META.identifier$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* identifier;
     * }
     */
    public static MemorySegment identifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_META.identifier$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* identifier;
     * }
     */
    public static void identifier$set(MemorySegment seg, MemorySegment x) {
        YR_META.identifier$VH.set(seg, x);
    }
    public static MemorySegment identifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_META.identifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void identifier$set(MemorySegment seg, long index, MemorySegment x) {
        YR_META.identifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment identifier_$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle string$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("string"));
    public static VarHandle string$VH() {
        return YR_META.string$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* string;
     * }
     */
    public static MemorySegment string$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_META.string$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* string;
     * }
     */
    public static void string$set(MemorySegment seg, MemorySegment x) {
        YR_META.string$VH.set(seg, x);
    }
    public static MemorySegment string$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_META.string$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void string$set(MemorySegment seg, long index, MemorySegment x) {
        YR_META.string$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment string_$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle integer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("integer"));
    public static VarHandle integer$VH() {
        return YR_META.integer$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t integer;
     * }
     */
    public static long integer$get(MemorySegment seg) {
        return (long)YR_META.integer$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t integer;
     * }
     */
    public static void integer$set(MemorySegment seg, long x) {
        YR_META.integer$VH.set(seg, x);
    }
    public static long integer$get(MemorySegment seg, long index) {
        return (long)YR_META.integer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void integer$set(MemorySegment seg, long index, long x) {
        YR_META.integer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return YR_META.type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)YR_META.type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        YR_META.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)YR_META.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        YR_META.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return YR_META.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int32_t flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)YR_META.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int32_t flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        YR_META.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)YR_META.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        YR_META.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

