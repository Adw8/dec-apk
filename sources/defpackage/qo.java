package defpackage;

import android.content.Context;

/* renamed from: qo  reason: default package */
/* loaded from: classes.dex */
public final class qo extends m9V {
    public final /* synthetic */ int R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public qo(Context context, CV cv, int i) {
        super((gb) piu.g(context, cv).f7202R);
        this.R = i;
        if (i == 1) {
            super((Ww) piu.g(context, cv).f7203v);
        } else if (i == 2) {
            super((eyJ) piu.g(context, cv).c);
        } else if (i == 3) {
            super((eyJ) piu.g(context, cv).c);
        } else if (i != 4) {
        } else {
            super((aN0) piu.g(context, cv).e);
        }
    }

    public final boolean O(Boolean bool) {
        boolean booleanValue;
        switch (this.R) {
            case 0:
                booleanValue = bool.booleanValue();
                break;
            case 1:
                booleanValue = bool.booleanValue();
                break;
            default:
                booleanValue = bool.booleanValue();
                break;
        }
        return !booleanValue;
    }

    @Override // defpackage.m9V
    public final boolean R(l3L l3l) {
        switch (this.R) {
            case 0:
                return l3l.f5559R.f2442R;
            case 1:
                return l3l.f5559R.c;
            case 2:
                return l3l.f5559R.f2441R == g_9.CONNECTED;
            case 3:
                g_9 g_9 = l3l.f5559R.f2441R;
                return g_9 == g_9.UNMETERED || g_9 == g_9.TEMPORARILY_UNMETERED;
            default:
                return l3l.f5559R.e;
        }
    }

    public final boolean X(b_y b_y) {
        switch (this.R) {
            case 2:
                return !b_y.R || !b_y.v;
            default:
                return !b_y.R || b_y.c;
        }
    }

    @Override // defpackage.m9V
    public final /* bridge */ /* synthetic */ boolean v(Object obj) {
        switch (this.R) {
            case 0:
                return O((Boolean) obj);
            case 1:
                return O((Boolean) obj);
            case 2:
                return X((b_y) obj);
            case 3:
                return X((b_y) obj);
            default:
                return O((Boolean) obj);
        }
    }
}
