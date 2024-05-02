package defpackage;

/* renamed from: m8B  reason: default package */
/* loaded from: classes.dex */
public final class m8B extends k87 {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f5949R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m8B(Object obj, msD msd, int i) {
        super(msd);
        this.R = i;
        this.f5949R = obj;
    }

    @Override // defpackage.k87
    public final String v() {
        switch (this.R) {
            case 0:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 1:
                return "DELETE FROM WorkProgress";
            default:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }
}
