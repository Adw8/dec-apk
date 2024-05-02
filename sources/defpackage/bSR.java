package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* renamed from: bSR  reason: default package */
/* loaded from: classes.dex */
public final class bSR {
    public final Context R;

    /* renamed from: R  reason: collision with other field name */
    public cof f1663R;

    /* renamed from: R  reason: collision with other field name */
    public final String f1666R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f1667R;

    /* renamed from: R  reason: collision with other field name */
    public HashSet f1668R;

    /* renamed from: R  reason: collision with other field name */
    public Executor f1669R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1670R;
    public boolean c;
    public Executor v;

    /* renamed from: R  reason: collision with other field name */
    public final Class f1665R = WorkDatabase.class;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1671v = true;

    /* renamed from: R  reason: collision with other field name */
    public final gL6 f1664R = new gL6(17);

    public bSR(Context context, String str) {
        this.R = context;
        this.f1666R = str;
    }

    public final void R(hZE... hzeArr) {
        if (this.f1668R == null) {
            this.f1668R = new HashSet();
        }
        for (hZE hze : hzeArr) {
            this.f1668R.add(Integer.valueOf(hze.R));
            this.f1668R.add(Integer.valueOf(hze.v));
        }
        gL6 gl6 = this.f1664R;
        gl6.getClass();
        for (hZE hze2 : hzeArr) {
            int i = hze2.R;
            int i2 = hze2.v;
            TreeMap treeMap = (TreeMap) ((HashMap) gl6.R).get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                ((HashMap) gl6.R).put(Integer.valueOf(i), treeMap);
            }
            hZE hze3 = (hZE) treeMap.get(Integer.valueOf(i2));
            if (hze3 != null) {
                Log.w("ROOM", "Overriding migration " + hze3 + " with " + hze2);
            }
            treeMap.put(Integer.valueOf(i2), hze2);
        }
    }
}
