package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: MN  reason: default package */
/* loaded from: classes.dex */
public final class MN {
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(MN.class, "notCompletedCount");

    /* renamed from: R  reason: collision with other field name */
    public final htf[] f291R;
    public volatile /* synthetic */ int notCompletedCount;

    public MN(htf[] htfArr) {
        this.f291R = htfArr;
        this.notCompletedCount = htfArr.length;
    }
}
