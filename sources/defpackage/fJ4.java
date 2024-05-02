package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

/* renamed from: fJ4  reason: default package */
/* loaded from: classes.dex */
public final class fJ4 extends ContentObserver {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3378R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fJ4(nJ nJVar, Handler handler, int i) {
        super(handler);
        this.R = i;
        this.f3378R = nJVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.R) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        switch (this.R) {
            case 0:
                ((gn) this.f3378R).e(o8s.R);
                return;
            case 1:
            default:
                super.onChange(z, uri);
                return;
            case 2:
                ((mB1) this.f3378R).c();
                return;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fJ4(eQg eqg) {
        super(new Handler());
        this.R = 1;
        this.f3378R = eqg;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        switch (this.R) {
            case 1:
                eQg eqg = (eQg) this.f3378R;
                if (eqg.v && (cursor = eqg.R) != null && !cursor.isClosed()) {
                    eqg.f3084R = eqg.R.requery();
                    return;
                }
                return;
            default:
                super.onChange(z);
                return;
        }
    }
}
