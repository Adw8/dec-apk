package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: krG  reason: default package */
/* loaded from: classes.dex */
public final class krG implements aUC {

    /* renamed from: R  reason: collision with other field name */
    public dUW f5448R;

    /* renamed from: R  reason: collision with other field name */
    public final gMW f5449R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5450R;

    /* renamed from: R  reason: collision with other field name */
    public final AtomicBoolean f5451R = new AtomicBoolean();

    /* renamed from: R  reason: collision with other field name */
    public final n2N f5452R;
    public dUW v;

    /* renamed from: R  reason: collision with other field name */
    public static final zI f5447R = new zI("AssetPackServiceImpl", 0);
    public static final Intent R = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    public krG(Context context, gMW gmw, n2N n2n) {
        this.f5450R = context.getPackageName();
        this.f5449R = gmw;
        this.f5452R = n2n;
        if (meq.v(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            zI zIVar = f5447R;
            Intent intent = R;
            ppN ppn = ppN.P;
            this.f5448R = new dUW(context2, zIVar, "AssetPackService", intent, ppn);
            Context applicationContext2 = context.getApplicationContext();
            this.v = new dUW(applicationContext2 != null ? applicationContext2 : context, zIVar, "AssetPackService-keepAlive", intent, ppn);
        }
        f5447R.X("AssetPackService initiated.", new Object[0]);
    }

    public static /* bridge */ /* synthetic */ Bundle H(Map map) {
        Bundle Z = Z();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        Z.putParcelableArrayList("installed_asset_module", arrayList);
        return Z;
    }

    public static Bundle Z() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static b1t m() {
        f5447R.L("onError(%d)", -11);
        oZ oZVar = new oZ(-11, 0);
        b1t b1t = new b1t();
        b1t.Z(oZVar);
        return b1t;
    }

    @Override // defpackage.aUC
    public final void L(int i, int i2, String str, String str2) {
        if (this.f5448R != null) {
            f5447R.m("notifyChunkTransferred", new Object[0]);
            cqI cqi = new cqI();
            this.f5448R.v(new hvm(this, cqi, i, str, str2, i2, cqi, 0), cqi);
            return;
        }
        throw new bRU("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // defpackage.aUC
    public final b1t O(HashMap hashMap) {
        if (this.f5448R == null) {
            return m();
        }
        f5447R.m("syncPacks", new Object[0]);
        cqI cqi = new cqI();
        this.f5448R.v(new pd9(this, cqi, hashMap, cqi, 1), cqi);
        return cqi.R;
    }

    @Override // defpackage.aUC
    public final void R(int i, String str) {
        x(i, 10, str);
    }

    @Override // defpackage.aUC
    public final void X(int i) {
        if (this.f5448R != null) {
            f5447R.m("notifySessionFailed", new Object[0]);
            cqI cqi = new cqI();
            this.f5448R.v(new mm8(this, cqi, i, cqi), cqi);
            return;
        }
        throw new bRU("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // defpackage.aUC
    public final synchronized void c() {
        if (this.v == null) {
            f5447R.x("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        zI zIVar = f5447R;
        zIVar.m("keepAlive", new Object[0]);
        if (!this.f5451R.compareAndSet(false, true)) {
            zIVar.m("Service is already kept alive.", new Object[0]);
            return;
        }
        cqI cqi = new cqI();
        this.v.v(new cGu(this, cqi, cqi, 0), cqi);
    }

    @Override // defpackage.aUC
    public final b1t e(int i, int i2, String str, String str2) {
        if (this.f5448R == null) {
            return m();
        }
        f5447R.m("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        cqI cqi = new cqI();
        this.f5448R.v(new hvm(this, cqi, i, str, str2, i2, cqi, 1), cqi);
        return cqi.R;
    }

    @Override // defpackage.aUC
    public final void v(List list) {
        if (this.f5448R != null) {
            f5447R.m("cancelDownloads(%s)", list);
            cqI cqi = new cqI();
            this.f5448R.v(new pd9(this, cqi, list, cqi, 0), cqi);
        }
    }

    public final void x(int i, int i2, String str) {
        if (this.f5448R != null) {
            f5447R.m("notifyModuleCompleted", new Object[0]);
            cqI cqi = new cqI();
            this.f5448R.v(new onV(this, cqi, i, str, cqi, i2), cqi);
            return;
        }
        throw new bRU("The Play Store app is not installed or is an unofficial version.", i);
    }
}
