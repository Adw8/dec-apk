package defpackage;

/* renamed from: b3f  reason: default package */
/* loaded from: classes.dex */
public final class b3f extends aFk implements lR3 {
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3f(int i, aOO aoo) {
        super(3, aoo);
        this.X = i;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        switch (this.X) {
            case 0:
                jjU.o(obj);
                break;
            case 1:
                jjU.o(obj);
                break;
            case 2:
                jjU.o(obj);
                break;
            case 3:
                jjU.o(obj);
                break;
            default:
                jjU.o(obj);
                break;
        }
        return o8s.R;
    }

    public final o8s Z(aOO aoo) {
        switch (this.X) {
            case 0:
                return (o8s) new b3f(0, aoo).O(o8s.R);
            default:
                return (o8s) new b3f(2, aoo).O(o8s.R);
        }
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                jy_ jy_ = (jy_) obj;
                long j = ((aWo) obj2).f906R;
                return Z((aOO) obj3);
            case 1:
                jy_ jy_2 = (jy_) obj;
                ((Number) obj2).floatValue();
                return new b3f(1, (aOO) obj3).O(o8s.R);
            case 2:
                jy_ jy_3 = (jy_) obj;
                long j2 = ((aWo) obj2).f906R;
                return Z((aOO) obj3);
            case 3:
                jy_ jy_4 = (jy_) obj;
                long j3 = ((d_E) obj2).f2672R;
                return new b3f(3, (aOO) obj3).O(o8s.R);
            default:
                l3X l3x = (l3X) obj;
                long j4 = ((aWo) obj2).f906R;
                return new b3f(4, (aOO) obj3).O(o8s.R);
        }
    }
}
