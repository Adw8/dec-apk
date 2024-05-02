package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: huQ  reason: default package */
/* loaded from: classes.dex */
public final class huQ implements SharedPreferences.Editor {
    public final SharedPreferences.Editor R;

    /* renamed from: R  reason: collision with other field name */
    public final nTM f4413R;

    /* renamed from: R  reason: collision with other field name */
    public AtomicBoolean f4412R = new AtomicBoolean(false);

    /* renamed from: R  reason: collision with other field name */
    public final CopyOnWriteArrayList f4411R = new CopyOnWriteArrayList();

    public huQ(nTM ntm, SharedPreferences.Editor editor) {
        this.f4413R = ntm;
        this.R = editor;
    }

    public final void R() {
        if (this.f4412R.getAndSet(false)) {
            for (String str : ((HashMap) this.f4413R.getAll()).keySet()) {
                if (!this.f4411R.contains(str)) {
                    this.f4413R.getClass();
                    if (!nTM.c(str)) {
                        this.R.remove(this.f4413R.R(str));
                    }
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        R();
        this.R.apply();
        v();
        this.f4411R.clear();
    }

    public final void c(String str, byte[] bArr) {
        this.f4413R.getClass();
        if (!nTM.c(str)) {
            this.f4411R.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                nTM ntm = this.f4413R;
                String R = ntm.R(str);
                try {
                    Pair pair = new Pair(R, new String(_8.v(ntm.f6394R.R(bArr, R.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                    this.R.putString((String) pair.first, (String) pair.second);
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            } catch (GeneralSecurityException e2) {
                StringBuilder U = opT.U("Could not encrypt data: ");
                U.append(e2.getMessage());
                throw new SecurityException(U.toString(), e2);
            }
        } else {
            throw new SecurityException(opT.H(str, " is a reserved key for the encryption keyset."));
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f4412R.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        R();
        try {
            return this.R.commit();
        } finally {
            v();
            this.f4411R.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(5);
        allocate.put(z ? (byte) 1 : 0);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(4);
        allocate.putFloat(f);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(2);
        allocate.putInt(i);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(3);
        allocate.putLong(j);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(0);
        allocate.putInt(length);
        allocate.put(bytes);
        c(str, allocate.array());
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:0:?, code lost:
        r6 = r6;
     */
    @Override // android.content.SharedPreferences.Editor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.SharedPreferences.Editor putStringSet(java.lang.String r5, java.util.Set r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x000c
            L5 r6 = new L5
            r6.<init>()
            java.lang.String r0 = "__NULL__"
            r6.add(r0)
        L_0x000c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            int r1 = r6.size()
            int r1 = r1 * 4
            java.util.Iterator r6 = r6.iterator()
        L_0x001f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r3)
            r0.add(r2)
            int r2 = r2.length
            int r1 = r1 + r2
            goto L_0x001f
        L_0x0037:
            int r1 = r1 + 4
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
            r1 = 1
            r6.putInt(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            int r2 = r1.length
            r6.putInt(r2)
            r6.put(r1)
            goto L_0x0045
        L_0x0059:
            byte[] r6 = r6.array()
            r4.c(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huQ.putStringSet(java.lang.String, java.util.Set):android.content.SharedPreferences$Editor");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f4413R.getClass();
        if (!nTM.c(str)) {
            this.R.remove(this.f4413R.R(str));
            this.f4411R.remove(str);
            return this;
        }
        throw new SecurityException(opT.H(str, " is a reserved key for the encryption keyset."));
    }

    public final void v() {
        Iterator it = this.f4413R.f6392R.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.f4411R.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f4413R, (String) it2.next());
            }
        }
    }
}
