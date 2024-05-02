package defpackage;

/* renamed from: bEz  reason: default package */
/* loaded from: classes.dex */
public abstract class bEz {
    public static final mou R;

    static {
        String str;
        mou mou;
        int i = mrV.R;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (!(str != null ? Boolean.parseBoolean(str) : false)) {
            mou = ohJ.R;
        } else {
            h8R h8r = iFn.R;
            fhC fhc = hJr.R;
            hBL hbl = ((hBL) fhc).f4160R;
            mou = !(fhc instanceof mou) ? ohJ.R : (mou) fhc;
        }
        R = mou;
    }
}
