package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import java.io.File;
import java.util.TimeZone;

/* renamed from: lW7  reason: default package */
/* loaded from: classes.dex */
public final class lW7 extends aFk implements iv7 {
    public final /* synthetic */ oo3 R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lW7(oo3 oo3, aOO aoo) {
        super(2, aoo);
        this.R = oo3;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((lW7) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        oo3 oo3 = this.R;
        RP rp = oo3.R;
        String str = (String) oo3.f6954R.f5923v.getValue();
        rp.getClass();
        long j = (long) 1024;
        long min = Math.min((new StatFs(rp.R.getFilesDir().getAbsolutePath()).getTotalBytes() / j) / j, 523264L);
        ParcelFileDescriptor open = ParcelFileDescriptor.open(new File(rp.R.getFilesDir(), gvP.V(-3881552352743253907L)), 1006632960);
        try {
            fhb fhb = new fhb();
            fhb.R = ParcelFileDescriptor.open(new File(rp.R.getFilesDir(), gvP.V(-3881552404282861459L)), 268435456);
            j2f.R.getClass();
            String str2 = fjr.f3539R;
            String id = TimeZone.getDefault().getID();
            fhb.f3504R = "root=/dev/vda rootfstype=erofs ro init=/opt/vc/preinit console=hvc0 rcu_nocbs=0-7 workqueue.power_efficient=1 cgroup.memory=nokmem,nosocket vc.data_size=" + min + " vc.vcontrol_token=" + str2 + " vc.timezone=" + id;
            fKE fke = new fKE();
            fke.R = ParcelFileDescriptor.open(new File(rp.R.getFilesDir(), gvP.V(-3881552434347632531L)), 268435456);
            fke.f3380R = false;
            fke.f3381R = new kzi[0];
            fKE fke2 = new fKE();
            fke2.R = ParcelFileDescriptor.open(new File(rp.R.getFilesDir(), gvP.V(-3881552481592272787L)), 805306368);
            fke2.f3380R = true;
            fke2.f3381R = new kzi[0];
            fKE fke3 = new fKE();
            fke3.R = ParcelFileDescriptor.open(new File(rp.R.getFilesDir(), gvP.V(-3881552528836913043L)), 805306368);
            fke3.f3380R = true;
            fke3.f3381R = new kzi[0];
            fhb.f3506R = new fKE[]{fke, fke2, fke3};
            fhb.f3505R = false;
            doT dot = rp.f480R;
            fhb.e = ((Number) dot.c.v(dot, doT.v[1])).intValue();
            fhb.X = 8;
            fhb.f3509v = gvP.V(-3881552576081553299L);
            fhb.f3508c = gvP.V(-3881552593261422483L);
            fhb.f3507R = new String[]{gvP.V(-3881552614736258963L), gvP.V(-3881552679160768403L)};
            l08 l08 = new l08(fhb);
            pby[] pbyArr = kxm.R;
            HI hi = new HI(((bDs) ((js8) rp.f479R.getValue())).O(l08, open, open));
            th = null;
            return hi;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new lW7(this.R, aoo);
    }
}
