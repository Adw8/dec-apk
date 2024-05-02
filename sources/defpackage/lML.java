package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.termux.view.TerminalView;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.util.List;

/* renamed from: lML  reason: default package */
/* loaded from: classes.dex */
public final class lML extends k8G implements kg9 {
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ Object f5665X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lML(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(1);
        this.X = i;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f5665X = obj5;
        this.O = obj6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e7, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(long r21) {
        /*
        // Method dump skipped, instructions count: 582
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lML.R(long):void");
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        float f;
        Path path;
        switch (this.X) {
            case 0:
                R(((Number) obj).longValue());
                break;
            case 1:
                ((h0T) this.v).R(Boolean.valueOf(((mgi) ((okg) obj)).v()));
                if (mGH.e((h0T) this.v)) {
                    l6.z((jy_) this.R, null, 4, new mNo((ze) this.c, (h0T) this.e, null), 1);
                    l6.z((jy_) this.R, null, 0, new c_k((p2E) this.O, (h0T) this.f5665X, null), 3);
                } else {
                    l6.z((jy_) this.R, null, 0, new ahO((p2E) this.O, (h0T) this.f5665X, null), 3);
                }
                return o8s.R;
            case 2:
                h57 h57 = (h57) obj;
                l0f[] l0fArr = (l0f[]) this.R;
                List list = (List) this.v;
                mZf mzf = (mZf) this.c;
                blo blo = (blo) this.e;
                blo blo2 = (blo) this.f5665X;
                mz mzVar = (mz) this.O;
                int i = 0;
                for (l0f l0f : l0fArr) {
                    i++;
                    PO.v(h57, l0f, (pc0) list.get(i), mzf.getLayoutDirection(), blo.e, blo2.e, mzVar);
                }
                return o8s.R;
            case 3:
                fiv fiv = (fiv) obj;
                float floor = (float) Math.floor((double) fiv.mZ(l1.c));
                long j = ((n3) ((dH9) this.R).getValue()).f6279R;
                long j2 = ((n3) ((dH9) this.v).getValue()).f6279R;
                float mZ = fiv.mZ(l1.e);
                float f2 = floor / 2.0f;
                gug gug = new gug(floor, 0.0f, 0, 0, 30);
                float e = nqW.e(fiv.c());
                if (n3.c(j, j2)) {
                    f = 0.0f;
                    fiv.s(fiv, j, 0, n1P.e(e, e), g4x.R(mZ, mZ), faV.R, 226);
                } else {
                    f = 0.0f;
                    long N = aH9.N(floor, floor);
                    float f3 = e - (((float) 2) * floor);
                    long e2 = n1P.e(f3, f3);
                    float max = Math.max(0.0f, mZ - floor);
                    fiv.s(fiv, j, N, e2, g4x.R(max, max), faV.R, 224);
                    long N2 = aH9.N(f2, f2);
                    float f4 = e - floor;
                    float f5 = mZ - f2;
                    fiv.s(fiv, j2, N2, n1P.e(f4, f4), g4x.R(f5, f5), gug, 224);
                }
                long j3 = ((n3) ((dH9) this.c).getValue()).f6279R;
                float floatValue = ((Number) ((dH9) this.e).getValue()).floatValue();
                float floatValue2 = ((Number) ((dH9) this.f5665X).getValue()).floatValue();
                TB tb = (TB) this.O;
                gug gug2 = new gug(floor, 0.0f, 2, 0, 26);
                float e3 = nqW.e(fiv.c());
                float z = hDC.z(0.4f, 0.5f, floatValue2);
                float z2 = hDC.z(0.7f, 0.5f, floatValue2);
                float z3 = hDC.z(0.5f, 0.5f, floatValue2);
                float z4 = hDC.z(0.3f, 0.5f, floatValue2);
                ((dm) tb.R).e();
                ((dm) tb.R).f2856R.moveTo(0.2f * e3, z3 * e3);
                ((dm) tb.R).f2856R.lineTo(z * e3, z2 * e3);
                ((dm) tb.R).f2856R.lineTo(0.8f * e3, e3 * z4);
                zX zXVar = tb.f527R;
                cnO cno = tb.R;
                PathMeasure pathMeasure = zXVar.R;
                if (cno == null) {
                    path = null;
                } else if (cno instanceof dm) {
                    path = ((dm) cno).f2856R;
                } else {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                pathMeasure.setPath(path, false);
                ((dm) tb.v).e();
                zX zXVar2 = tb.f527R;
                zXVar2.R(f, zXVar2.R.getLength() * floatValue, tb.v);
                fiv.K(fiv, tb.v, j3, gug2);
                break;
            case 4:
                R(((Number) obj).longValue());
                break;
            default:
                TerminalView terminalView = (TerminalView) LayoutInflater.from((Context) obj).inflate(R.layout.content_terminal, (ViewGroup) null);
                float f6 = iqx.R;
                ((h0T) this.R).R(terminalView);
                InputMethodManager inputMethodManager = (InputMethodManager) this.c;
                h0T h0t = (h0T) this.O;
                terminalView.setOnFocusChangeListener(new View.OnFocusChangeListener(inputMethodManager, terminalView) { // from class: erk
                    public final /* synthetic */ InputMethodManager R;

                    /* renamed from: R  reason: collision with other field name */
                    public final /* synthetic */ TerminalView f3220R;

                    {
                        this.R = r2;
                        this.f3220R = r3;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z5) {
                        dH9 dh9 = dH9.this;
                        InputMethodManager inputMethodManager2 = this.R;
                        TerminalView terminalView2 = this.f3220R;
                        if (((Boolean) dh9.getValue()).booleanValue() && z5) {
                            inputMethodManager2.showSoftInput(terminalView2, 0);
                        }
                    }
                });
                terminalView.setTerminalViewClient(new lV4((TerminalViewModel) this.e, terminalView, inputMethodManager, (h0T) this.f5665X, h0t));
                return terminalView;
        }
        return o8s.R;
    }
}
