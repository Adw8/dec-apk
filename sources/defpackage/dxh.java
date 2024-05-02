package defpackage;

import android.view.View;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: dxh  reason: default package */
/* loaded from: classes.dex */
public abstract class dxh implements cHc {
    public static nUO R;

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f2926R = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};

    public static String H(int i) {
        boolean z = false;
        if (i == 1) {
            return "Text";
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return "Number";
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return "Email";
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return "NumberPassword";
        }
        if (i == 9) {
            z = true;
        }
        return z ? "Decimal" : "Invalid";
    }

    public static final nUO c() {
        nUO nuo = R;
        if (nuo != null) {
            return nuo;
        }
        f0G f0g = new f0G("Outlined.Delete");
        int i = jnb.R;
        oSW osw = new oSW(n3.v);
        jGl jgl = new jGl();
        jgl.Z(16.0f, 9.0f);
        jgl.H(10.0f);
        jgl.e(8.0f);
        jgl.x(9.0f);
        jgl.X(8.0f);
        jgl.R.add(new bn8(-1.5f, -6.0f));
        jgl.X(-5.0f);
        jgl.L(-1.0f, 1.0f);
        jgl.e(5.0f);
        jgl.H(2.0f);
        jgl.X(14.0f);
        jgl.x(4.0f);
        jgl.X(-3.5f);
        jgl.L(-1.0f, -1.0f);
        jgl.R();
        jgl.Z(18.0f, 7.0f);
        jgl.e(6.0f);
        jgl.H(12.0f);
        jgl.c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        jgl.X(8.0f);
        jgl.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        jgl.x(7.0f);
        jgl.R();
        f0G.c(f0g, jgl.R, osw);
        nUO e = f0g.e();
        R = e;
        return e;
    }

    public void L(View view, int i) {
    }

    public abstract void O(oRG org, boolean z);

    public abstract int R(View view, int i);

    public abstract boolean U(View view, int i);

    public int X() {
        return 0;
    }

    public abstract void Z(int i);

    public int e(View view) {
        return 0;
    }

    public abstract void m(View view, int i, int i2);

    public abstract int v(View view, int i);

    public abstract void x(View view, float f, float f2);
}
