package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mHr  reason: default package */
/* loaded from: classes.dex */
public final class mHr extends lLA {
    public final /* synthetic */ List R;
    public final /* synthetic */ Matrix c;

    public mHr(ArrayList arrayList, Matrix matrix) {
        this.R = arrayList;
        this.c = matrix;
    }

    @Override // defpackage.lLA
    public final void R(Matrix matrix, juL jul, int i, Canvas canvas) {
        for (lLA lla : this.R) {
            lla.R(this.c, jul, i, canvas);
        }
    }
}
