package defpackage;

import dev.kdrag0n.virtcontainer.ui.create.CreateViewModel;

/* renamed from: jnE  reason: default package */
/* loaded from: classes.dex */
public final class jnE extends aFk implements iv7 {
    public final /* synthetic */ dM_ R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ CreateViewModel f5014R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5015R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jnE(CreateViewModel createViewModel, dM_ dm_, aOO aoo) {
        super(2, aoo);
        this.f5014R = createViewModel;
        this.R = dm_;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jnE) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x000a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x001b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r0v10, types: [jy_] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc A[RETURN] */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r10) {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnE.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        jnE jne = new jnE(this.f5014R, this.R, aoo);
        jne.f5015R = obj;
        return jne;
    }
}
