package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: aiw  reason: default package */
/* loaded from: classes.dex */
public final class aiw extends vm {
    public final TreeMap R = new TreeMap();

    public aiw(File file, File file2) {
        ArrayList R = eOC.R(file, file2);
        if (!R.isEmpty()) {
            Iterator it = R.iterator();
            long j = 0;
            while (it.hasNext()) {
                File file3 = (File) it.next();
                this.R.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new bRU(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }

    public final FileInputStream O(long j, Long l) {
        FileInputStream fileInputStream = new FileInputStream((File) this.R.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new bRU(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }

    @Override // defpackage.vm
    public final InputStream X(long j, long j2) {
        if (j < 0 || j2 < 0) {
            throw new bRU(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 <= c()) {
            Long l = (Long) this.R.floorKey(Long.valueOf(j));
            Long l2 = (Long) this.R.floorKey(Long.valueOf(j3));
            if (l.equals(l2)) {
                return new ldm(O(j, l), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(O(j, l));
            Collection values = this.R.subMap(l, false, l2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new n0m(Collections.enumeration(values)));
            }
            arrayList.add(new ldm(new FileInputStream((File) this.R.get(l2)), j2 - (l2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new bRU(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(c()), Long.valueOf(j3)));
    }

    @Override // defpackage.vm
    public final long c() {
        Map.Entry lastEntry = this.R.lastEntry();
        return ((File) lastEntry.getValue()).length() + ((Long) lastEntry.getKey()).longValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
