package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: ewo  reason: default package */
/* loaded from: classes.dex */
public final class ewo implements R4 {
    public final /* synthetic */ String R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ List f3249R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ CountDownLatch f3250R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jcw f3251R;
    public final /* synthetic */ List v;

    public ewo(ArrayList arrayList, CountDownLatch countDownLatch, jcw jcw, String str, ArrayList arrayList2) {
        this.f3249R = arrayList;
        this.f3250R = countDownLatch;
        this.f3251R = jcw;
        this.R = str;
        this.v = arrayList2;
    }

    @Override // defpackage.R4
    public final void R(dEt det) {
        jcw jcw = this.f3251R;
        String str = this.R;
        List list = this.v;
        List list2 = this.f3249R;
        jcw.getClass();
        try {
            ArrayList v = jcw.v(str, det);
            synchronized (list) {
                list.addAll(v);
            }
        } catch (Exception e) {
            synchronized (list2) {
                list2.add(e);
            }
        }
        this.f3250R.countDown();
    }

    @Override // defpackage.R4
    public final void v(IOException iOException) {
        List list = this.f3249R;
        synchronized (list) {
            list.add(iOException);
        }
        this.f3250R.countDown();
    }
}
