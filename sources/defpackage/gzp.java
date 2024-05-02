package defpackage;

import android.widget.ListView;

/* renamed from: gzp  reason: default package */
/* loaded from: classes.dex */
public abstract class gzp {
    public static boolean R(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    public static void v(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
