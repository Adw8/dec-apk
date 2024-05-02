package defpackage;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: aSX  reason: default package */
/* loaded from: classes.dex */
public final class aSX {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ StaggeredGridLayoutManager f887R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f888R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f889R;
    public boolean c;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f890v;

    public aSX(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f887R = staggeredGridLayoutManager;
        R();
    }

    public final void R() {
        this.R = -1;
        this.v = Integer.MIN_VALUE;
        this.f888R = false;
        this.f890v = false;
        this.c = false;
        int[] iArr = this.f889R;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
