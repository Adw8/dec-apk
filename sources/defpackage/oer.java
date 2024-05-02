package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.d;
import androidx.compose.ui.platform.ComposeView;
import dev.kdrag0n.virtcontainer.R;
import java.util.Arrays;

/* renamed from: oer  reason: default package */
/* loaded from: classes.dex */
public abstract class oer {
    public static final ack R = new ack(Arrays.asList(gQc.c(R.font.inter_regular, null, 14), gQc.c(R.font.inter_medium, lIe.X, 12)));

    /* renamed from: R  reason: collision with other field name */
    public static final c_P f6870R = new c_P(e(aHM.e, false), e(aHM.X, false), e(aHM.O, false), e(aHM.L, false), e(aHM.Z, true), e(aHM.m, false), e(aHM.C, true), e(kMk.R(aHM.N, 0, gQc.S(18), null, 262141), false), e(aHM.P, false), e(aHM.R, false), e(aHM.v, false), e(aHM.c, false), e(aHM.x, false), e(aHM.H, false), e(aHM.U, false));

    public static final void R(iv7 iv7, m88 m88, int i) {
        int i2;
        E2 e2;
        jr_ jr_ = (jr_) m88;
        jr_.q(830896840);
        if ((i & 14) == 0) {
            i2 = (jr_.O(iv7) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !jr_.J()) {
            if (n1P.y(jr_)) {
                jr_.w(48333621);
                aoA U = n1P.U((Context) jr_.x(ur.f7428R));
                long j = U.C;
                long j2 = U.j;
                long j3 = U.P;
                long j4 = U.U;
                long j5 = U.N;
                long j6 = U.i;
                long j7 = U.K;
                long j8 = U.o;
                long j9 = U.t;
                long j10 = U.I;
                long j11 = U.n;
                long j12 = U.z;
                long j13 = U.h;
                long j14 = U.X;
                long j15 = U.c;
                long j16 = U.x;
                long j17 = U.L;
                long j18 = U.e;
                long j19 = U.Z;
                owM owm = _1.R;
                e2 = new E2(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, j17, j, j15, j18, x1.R, x1.c, x1.v, x1.e, j19, x1.X, x1.O);
                jr_.g(false);
            } else {
                jr_.w(48333695);
                aoA U2 = n1P.U((Context) jr_.x(ur.f7428R));
                long j20 = U2.N;
                long j21 = U2.H;
                long j22 = U2.U;
                long j23 = U2.g;
                long j24 = U2.C;
                long j25 = U2.V;
                long j26 = U2.y;
                long j27 = U2.t;
                long j28 = U2.J;
                long j29 = U2.u;
                long j30 = U2.Y;
                long j31 = U2.h;
                long j32 = U2.Q;
                long j33 = U2.R;
                long j34 = U2.X;
                e2 = _1.c(j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j33, j34, U2.O, U2.x, U2.e, U2.v, U2.m, 466092032);
                jr_.g(false);
            }
            o02.c(e2, null, f6870R, aH9.I(jr_, -1097333900, new he(iv7, i2, 6)), jr_, 3456, 2);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new he(iv7, i, 7);
        }
    }

    public static void c(d dVar, dNH dnh) {
        dNH u = aH9.u(new o4g(1, dnh), true, 908242668);
        ViewGroup.LayoutParams layoutParams = puq.R;
        View childAt = ((ViewGroup) dVar.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(u);
            return;
        }
        ComposeView composeView2 = new ComposeView(dVar, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(u);
        View decorView = dVar.getWindow().getDecorView();
        if (aH9.s(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, dVar);
        }
        if (iTI.H(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, dVar);
        }
        if (aH9.T(decorView) == null) {
            aH9.cr(decorView, dVar);
        }
        dVar.setContentView(composeView2, puq.R);
    }

    public static final kMk e(kMk kmk, boolean z) {
        return kmk.c(new kMk(0, 0, z ? lIe.X : null, null, R, gQc.r((((float) Math.exp((double) (eT9.c(kmk.f5283R.R) * -0.1745f))) * 0.185f) - 201.3184f, 8589934592L), null, null, 0, 261979));
    }

    public static final void v(ComposeView composeView, dNH dnh) {
        composeView.setViewCompositionStrategy(hw1.N);
        composeView.setContent(aH9.u(new o4g(0, dnh), true, 1707426411));
    }
}
