package defpackage;

/* renamed from: gHo  reason: default package */
/* loaded from: classes.dex */
public abstract class gHo extends k87 {
    public gHo(msD msd) {
        super(msd);
    }

    public final void X(Object obj) {
        mVu R = R();
        try {
            e(R, obj);
            R.R.executeInsert();
        } finally {
            c(R);
        }
    }

    public abstract void e(mVu mvu, Object obj);
}
