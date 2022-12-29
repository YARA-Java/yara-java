// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct YR_ARENA {
 *     uint32_t xrefs;
 *     uint32_t num_buffers;
 *     YR_ARENA_BUFFER buffers[16];
 *     size_t initial_buffer_size;
 *     YR_RELOC* reloc_list_head;
 *     YR_RELOC* reloc_list_tail;
 * };
 * }
 */
public class YR_ARENA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("xrefs"),
        Constants$root.C_INT$LAYOUT.withName("num_buffers"),
        MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("size"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("used")
        ).withName("YR_ARENA_BUFFER")).withName("buffers"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("initial_buffer_size"),
        Constants$root.C_POINTER$LAYOUT.withName("reloc_list_head"),
        Constants$root.C_POINTER$LAYOUT.withName("reloc_list_tail")
    ).withName("YR_ARENA");
    public static MemoryLayout $LAYOUT() {
        return YR_ARENA.$struct$LAYOUT;
    }
    static final VarHandle xrefs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xrefs"));
    public static VarHandle xrefs$VH() {
        return YR_ARENA.xrefs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t xrefs;
     * }
     */
    public static int xrefs$get(MemorySegment seg) {
        return (int)YR_ARENA.xrefs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t xrefs;
     * }
     */
    public static void xrefs$set(MemorySegment seg, int x) {
        YR_ARENA.xrefs$VH.set(seg, x);
    }
    public static int xrefs$get(MemorySegment seg, long index) {
        return (int)YR_ARENA.xrefs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xrefs$set(MemorySegment seg, long index, int x) {
        YR_ARENA.xrefs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle num_buffers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_buffers"));
    public static VarHandle num_buffers$VH() {
        return YR_ARENA.num_buffers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t num_buffers;
     * }
     */
    public static int num_buffers$get(MemorySegment seg) {
        return (int)YR_ARENA.num_buffers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t num_buffers;
     * }
     */
    public static void num_buffers$set(MemorySegment seg, int x) {
        YR_ARENA.num_buffers$VH.set(seg, x);
    }
    public static int num_buffers$get(MemorySegment seg, long index) {
        return (int)YR_ARENA.num_buffers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_buffers$set(MemorySegment seg, long index, int x) {
        YR_ARENA.num_buffers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment buffers$slice(MemorySegment seg) {
        return seg.asSlice(8, 384);
    }
    static final VarHandle initial_buffer_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("initial_buffer_size"));
    public static VarHandle initial_buffer_size$VH() {
        return YR_ARENA.initial_buffer_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * size_t initial_buffer_size;
     * }
     */
    public static long initial_buffer_size$get(MemorySegment seg) {
        return (long)YR_ARENA.initial_buffer_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * size_t initial_buffer_size;
     * }
     */
    public static void initial_buffer_size$set(MemorySegment seg, long x) {
        YR_ARENA.initial_buffer_size$VH.set(seg, x);
    }
    public static long initial_buffer_size$get(MemorySegment seg, long index) {
        return (long)YR_ARENA.initial_buffer_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void initial_buffer_size$set(MemorySegment seg, long index, long x) {
        YR_ARENA.initial_buffer_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reloc_list_head$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reloc_list_head"));
    public static VarHandle reloc_list_head$VH() {
        return YR_ARENA.reloc_list_head$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_RELOC* reloc_list_head;
     * }
     */
    public static MemorySegment reloc_list_head$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_ARENA.reloc_list_head$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_RELOC* reloc_list_head;
     * }
     */
    public static void reloc_list_head$set(MemorySegment seg, MemorySegment x) {
        YR_ARENA.reloc_list_head$VH.set(seg, x);
    }
    public static MemorySegment reloc_list_head$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_ARENA.reloc_list_head$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reloc_list_head$set(MemorySegment seg, long index, MemorySegment x) {
        YR_ARENA.reloc_list_head$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reloc_list_tail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reloc_list_tail"));
    public static VarHandle reloc_list_tail$VH() {
        return YR_ARENA.reloc_list_tail$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_RELOC* reloc_list_tail;
     * }
     */
    public static MemorySegment reloc_list_tail$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_ARENA.reloc_list_tail$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_RELOC* reloc_list_tail;
     * }
     */
    public static void reloc_list_tail$set(MemorySegment seg, MemorySegment x) {
        YR_ARENA.reloc_list_tail$VH.set(seg, x);
    }
    public static MemorySegment reloc_list_tail$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_ARENA.reloc_list_tail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reloc_list_tail$set(MemorySegment seg, long index, MemorySegment x) {
        YR_ARENA.reloc_list_tail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

