package defpackage;

import android.view.View;

/* renamed from: i1U  reason: default package */
/* loaded from: classes.dex */
public final class i1U extends aFk implements lR3 {
    public int O;
    public /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1U(aAC aac, aOO aoo, int i) {
        super(3, aoo);
        this.X = i;
        this.c = aac;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        h2V h2v;
        h2V h2v2;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        switch (this.X) {
            case 0:
                int i = this.O;
                if (i == 0) {
                    jjU.o(obj);
                    ((View) this.v).performHapticFeedback(3);
                    float f = iqx.R;
                    ((h0T) this.c).R(Boolean.TRUE);
                    this.O = 1;
                    if (((l3X) this.R).v(this) == bgr) {
                        return bgr;
                    }
                } else if (i == 1) {
                    jjU.o(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f2 = iqx.R;
                ((h0T) this.c).R(Boolean.FALSE);
                return o8s.R;
            case 1:
                int i2 = this.O;
                if (i2 == 0) {
                    jjU.o(obj);
                    h2v2 = (h2V) this.R;
                    Object obj2 = this.v;
                    this.R = h2v2;
                    this.O = 1;
                    obj = ((iv7) this.c).J(obj2, this);
                    if (obj == bgr) {
                        return bgr;
                    }
                } else if (i2 == 1) {
                    h2v2 = (h2V) this.R;
                    jjU.o(obj);
                } else if (i2 == 2) {
                    jjU.o(obj);
                    return o8s.R;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.R = null;
                this.O = 2;
                if (h2v2.R(obj, this) == bgr) {
                    return bgr;
                }
                return o8s.R;
            default:
                int i3 = this.O;
                if (i3 == 0) {
                    jjU.o(obj);
                    h2v = (h2V) this.R;
                    Object[] objArr = (Object[]) this.v;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.R = h2v;
                    this.O = 1;
                    obj = ((lR3) this.c).y(obj3, obj4, this);
                    if (obj == bgr) {
                        return bgr;
                    }
                } else if (i3 == 1) {
                    h2v = (h2V) this.R;
                    jjU.o(obj);
                } else if (i3 == 2) {
                    jjU.o(obj);
                    return o8s.R;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.R = null;
                this.O = 2;
                if (h2v.R(obj, this) == bgr) {
                    return bgr;
                }
                return o8s.R;
        }
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                long j = ((aWo) obj2).f906R;
                i1U i1u = new i1U((View) this.v, (h0T) this.c, (aOO) obj3);
                i1u.R = (l3X) obj;
                return i1u.O(o8s.R);
            case 1:
                i1U i1u2 = new i1U((iv7) this.c, (aOO) obj3, 1);
                i1u2.R = (h2V) obj;
                i1u2.v = obj2;
                return i1u2.O(o8s.R);
            default:
                i1U i1u3 = new i1U((lR3) this.c, (aOO) obj3, 2);
                i1u3.R = (h2V) obj;
                i1u3.v = (Object[]) obj2;
                return i1u3.O(o8s.R);
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public i1U(View view, h0T h0t, aOO aoo) {
        super(3, aoo);
        this.X = 0;
        this.v = view;
        this.c = h0t;
    }
}
