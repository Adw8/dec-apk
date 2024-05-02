package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: p0F  reason: default package */
/* loaded from: classes.dex */
public abstract class p0F extends fdM implements nWA {
    public p0F() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // defpackage.fdM
    public final boolean O(int i, Parcel parcel) {
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) okB.R(parcel, Bundle.CREATOR);
                jEL jel = (jEL) this;
                jel.f4882R.f5448R.c(jel.R);
                krG.f5447R.m("onStartDownload(%d)", Integer.valueOf(readInt));
                break;
            case 3:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) okB.R(parcel, Bundle.CREATOR);
                jEL jel2 = (jEL) this;
                jel2.f4882R.f5448R.c(jel2.R);
                krG.f5447R.m("onCancelDownload(%d)", Integer.valueOf(readInt2));
                break;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) okB.R(parcel, Bundle.CREATOR);
                jEL jel3 = (jEL) this;
                jel3.f4882R.f5448R.c(jel3.R);
                krG.f5447R.m("onGetSession(%d)", Integer.valueOf(readInt3));
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                v(parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) okB.R(parcel, creator);
                Bundle bundle5 = (Bundle) okB.R(parcel, creator);
                jEL jel4 = (jEL) this;
                jel4.f4882R.f5448R.c(jel4.R);
                krG.f5447R.m("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle4.getString("module_name"), bundle4.getString("slice_id"), Integer.valueOf(bundle4.getInt("chunk_number")), Integer.valueOf(bundle4.getInt("session_id")));
                break;
            case 7:
                X((Bundle) okB.R(parcel, Bundle.CREATOR));
                break;
            case VmNativeCallback.$stable:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) okB.R(parcel, creator2);
                Bundle bundle7 = (Bundle) okB.R(parcel, creator2);
                jEL jel5 = (jEL) this;
                jel5.f4882R.f5448R.c(jel5.R);
                krG.f5447R.m("onNotifyModuleCompleted(%s, sessionId=%d)", bundle6.getString("module_name"), Integer.valueOf(bundle6.getInt("session_id")));
                break;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) okB.R(parcel, creator3);
                jEL jel6 = (jEL) this;
                jel6.f4882R.f5448R.c(jel6.R);
                krG.f5447R.m("onNotifySessionFailed(%d)", Integer.valueOf(((Bundle) okB.R(parcel, creator3)).getInt("session_id")));
                break;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                R((Bundle) okB.R(parcel, creator4), (Bundle) okB.R(parcel, creator4));
                break;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                e((Bundle) okB.R(parcel, creator5), (Bundle) okB.R(parcel, creator5));
                break;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle9 = (Bundle) okB.R(parcel, creator6);
                Bundle bundle10 = (Bundle) okB.R(parcel, creator6);
                jEL jel7 = (jEL) this;
                jel7.f4882R.f5448R.c(jel7.R);
                krG.f5447R.m("onRequestDownloadInfo()", new Object[0]);
                break;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle11 = (Bundle) okB.R(parcel, creator7);
                Bundle bundle12 = (Bundle) okB.R(parcel, creator7);
                jEL jel8 = (jEL) this;
                jel8.f4882R.f5448R.c(jel8.R);
                krG.f5447R.m("onRemoveModule()", new Object[0]);
                break;
            case 15:
                Bundle bundle13 = (Bundle) okB.R(parcel, Bundle.CREATOR);
                jEL jel9 = (jEL) this;
                jel9.f4882R.f5448R.c(jel9.R);
                krG.f5447R.m("onCancelDownloads()", new Object[0]);
                break;
        }
        return true;
    }
}
