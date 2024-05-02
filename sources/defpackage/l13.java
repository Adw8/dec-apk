package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: l13  reason: default package */
/* loaded from: classes.dex */
public final class l13 implements h2V {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ List f5540R;
    public final /* synthetic */ int e;

    public /* synthetic */ l13(ArrayList arrayList, h0T h0t, int i) {
        this.e = i;
        this.f5540R = arrayList;
        this.R = h0t;
    }

    @Override // defpackage.h2V
    public final /* bridge */ /* synthetic */ Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                return v((nto) obj);
            case 1:
                return v((nto) obj);
            default:
                return v((nto) obj);
        }
    }

    public final o8s v(nto nto) {
        switch (this.e) {
            case 0:
                if (nto instanceof k4G) {
                    this.f5540R.add(nto);
                } else if (nto instanceof ktE) {
                    this.f5540R.remove(((ktE) nto).R);
                }
                this.R.R(Boolean.valueOf(!this.f5540R.isEmpty()));
                break;
            case 1:
                if (nto instanceof a07) {
                    this.f5540R.add(nto);
                } else if (nto instanceof bNQ) {
                    this.f5540R.remove(((bNQ) nto).R);
                }
                this.R.R(Boolean.valueOf(!this.f5540R.isEmpty()));
                break;
            default:
                if (nto instanceof oDO) {
                    this.f5540R.add(nto);
                } else if (nto instanceof oSH) {
                    this.f5540R.remove(((oSH) nto).R);
                } else if (nto instanceof hPn) {
                    this.f5540R.remove(((hPn) nto).R);
                }
                this.R.R(Boolean.valueOf(!this.f5540R.isEmpty()));
                break;
        }
        return o8s.R;
    }
}
