package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import java.io.File;
import java.util.WeakHashMap;

/* renamed from: Dn  reason: default package */
/* loaded from: classes.dex */
public final class Dn {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public c85 f79R;

    /* renamed from: R  reason: collision with other field name */
    public Object f80R;
    public Object c;
    public Object v;

    public /* synthetic */ Dn(ImageView imageView) {
        this.R = 0;
        this.f80R = imageView;
    }

    public static void v(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }
    }

    public final void L(PorterDuff.Mode mode) {
        if (((epC) this.v) == null) {
            this.v = new epC(0);
        }
        epC epc = (epC) this.v;
        epc.v = mode;
        epc.f3212R = true;
        R();
    }

    public final void O(ColorStateList colorStateList) {
        if (((epC) this.v) == null) {
            this.v = new epC(0);
        }
        epC epc = (epC) this.v;
        epc.R = colorStateList;
        epc.f3213v = true;
        R();
    }

    public final void R() {
        Drawable drawable = ((ImageView) this.f80R).getDrawable();
        if (drawable != null) {
            Rect rect = mTA.R;
        }
        if (drawable != null) {
            boolean z = true;
            if (((epC) this.f79R) != null) {
                if (((epC) this.c) == null) {
                    this.c = new epC(0);
                }
                epC epc = (epC) this.c;
                epc.R = null;
                epc.f3213v = false;
                epc.v = null;
                epc.f3212R = false;
                ColorStateList R = jZJ.R((ImageView) this.f80R);
                if (R != null) {
                    epc.f3213v = true;
                    epc.R = R;
                }
                PorterDuff.Mode v = jZJ.v((ImageView) this.f80R);
                if (v != null) {
                    epc.f3212R = true;
                    epc.v = v;
                }
                if (epc.f3213v || epc.f3212R) {
                    pp.e(drawable, epc, ((ImageView) this.f80R).getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            epC epc2 = (epC) this.v;
            if (epc2 != null) {
                pp.e(drawable, epc2, ((ImageView) this.f80R).getDrawableState());
                return;
            }
            epC epc3 = (epC) this.f79R;
            if (epc3 != null) {
                pp.e(drawable, epc3, ((ImageView) this.f80R).getDrawableState());
            }
        }
    }

    public final void X(int i) {
        if (i != 0) {
            Drawable p = aH9.p(((ImageView) this.f80R).getContext(), i);
            if (p != null) {
                Rect rect = mTA.R;
            }
            ((ImageView) this.f80R).setImageDrawable(p);
        } else {
            ((ImageView) this.f80R).setImageDrawable(null);
        }
        R();
    }

    public final void Z(iUj iuj) {
        iuj.X("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        iuj.X("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.v) + "')");
    }

    public final void c(AttributeSet attributeSet, int i) {
        int y;
        Context context = ((ImageView) this.f80R).getContext();
        int[] iArr = iTI.O;
        CV h = CV.h(context, attributeSet, iArr, i, 0);
        Object obj = this.f80R;
        ImageView imageView = (ImageView) obj;
        Context context2 = ((ImageView) obj).getContext();
        TypedArray typedArray = (TypedArray) h.v;
        WeakHashMap weakHashMap = of5.f6887R;
        hpL.c(imageView, context2, iArr, attributeSet, typedArray, i, 0);
        try {
            Drawable drawable = ((ImageView) this.f80R).getDrawable();
            if (!(drawable != null || (y = h.y(1, -1)) == -1 || (drawable = aH9.p(((ImageView) this.f80R).getContext(), y)) == null)) {
                ((ImageView) this.f80R).setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = mTA.R;
            }
            if (h.o(2)) {
                jZJ.c((ImageView) this.f80R, h.m(2));
            }
            if (h.o(3)) {
                jZJ.e((ImageView) this.f80R, mTA.v(h.P(3, -1), null));
            }
        } finally {
            h.z();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0198 A[ORIG_RETURN, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0079 A[EDGE_INSN: B:78:0x0079->B:34:0x0079 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.iUj r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Dn.e(iUj, int, int):void");
    }

    public Dn(aDq adq, c85 c85) {
        this.R = c85.e;
        this.f80R = adq;
        this.f79R = c85;
        this.v = "c103703e120ae8cc73c9248622f3cd1e";
        this.c = "49f946663a8deb7054212b8adda248c6";
    }
}
