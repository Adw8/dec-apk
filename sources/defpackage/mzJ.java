package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: mzJ  reason: default package */
/* loaded from: classes.dex */
public final class mzJ implements oaB {

    /* renamed from: R  reason: collision with other field name */
    public final fve f6259R;

    /* renamed from: R  reason: collision with other field name */
    public final i97 f6260R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedBlockingDeque f6262R;
    public final long R = TimeUnit.MILLISECONDS.toNanos(250);
    public long v = Long.MIN_VALUE;

    /* renamed from: R  reason: collision with other field name */
    public final CopyOnWriteArrayList f6261R = new CopyOnWriteArrayList();

    public mzJ(fve fve, i97 i97) {
        this.f6259R = fve;
        this.f6260R = i97;
        hgc hgc = i97.f4473R;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        hgc.getClass();
        this.f6262R = linkedBlockingDeque;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:3:0x0002, B:5:0x000c, B:9:0x0019, B:11:0x0021, B:17:0x0040, B:19:0x004b, B:22:0x0056, B:25:0x0062, B:28:0x006c, B:30:0x0071, B:35:0x007a, B:37:0x0085, B:38:0x008b, B:40:0x008f, B:45:0x0097, B:48:0x00a1, B:50:0x00a5, B:53:0x00ab, B:54:0x00af, B:55:0x00b3, B:56:0x00b4, B:58:0x00b8, B:59:0x00c1, B:60:0x00c8), top: B:64:0x0002 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:3:0x0002, B:5:0x000c, B:9:0x0019, B:11:0x0021, B:17:0x0040, B:19:0x004b, B:22:0x0056, B:25:0x0062, B:28:0x006c, B:30:0x0071, B:35:0x007a, B:37:0x0085, B:38:0x008b, B:40:0x008f, B:45:0x0097, B:48:0x00a1, B:50:0x00a5, B:53:0x00ab, B:54:0x00af, B:55:0x00b3, B:56:0x00b4, B:58:0x00b8, B:59:0x00c1, B:60:0x00c8), top: B:64:0x0002 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a5 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:3:0x0002, B:5:0x000c, B:9:0x0019, B:11:0x0021, B:17:0x0040, B:19:0x004b, B:22:0x0056, B:25:0x0062, B:28:0x006c, B:30:0x0071, B:35:0x007a, B:37:0x0085, B:38:0x008b, B:40:0x008f, B:45:0x0097, B:48:0x00a1, B:50:0x00a5, B:53:0x00ab, B:54:0x00af, B:55:0x00b3, B:56:0x00b4, B:58:0x00b8, B:59:0x00c1, B:60:0x00c8), top: B:64:0x0002 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x006c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x006c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x006b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0002 A[SYNTHETIC] */
    @Override // defpackage.oaB
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ot7 R() {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzJ.R():ot7");
    }

    public final void c() {
        Iterator it = this.f6261R.iterator();
        while (it.hasNext()) {
            oCF ocf = (oCF) it.next();
            ocf.cancel();
            oCF O = ocf.O();
            if (O != null) {
                this.f6259R.f3627R.addLast(O);
            }
        }
        this.f6261R.clear();
    }

    public final cMR e() {
        oCF ocf;
        if (this.f6259R.R(null)) {
            try {
                ocf = this.f6259R.v();
            } catch (Throwable th) {
                ocf = new kRD(th);
            }
            if (ocf.v()) {
                return new cMR(ocf, (Throwable) null, 6);
            }
            if (ocf instanceof kRD) {
                return ((kRD) ocf).R;
            }
            this.f6261R.add(ocf);
            this.f6260R.O().e(new d9D(khE.f5394R + " connect " + this.f6259R.f3625R.f3093R.L(), ocf, this), 0);
        }
        return null;
    }

    @Override // defpackage.oaB
    public final fve v() {
        return this.f6259R;
    }
}
