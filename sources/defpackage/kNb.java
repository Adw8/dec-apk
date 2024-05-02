package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import dev.kdrag0n.virtcontainer.R;
import java.util.LinkedHashMap;

/* renamed from: kNb  reason: default package */
/* loaded from: classes.dex */
public abstract class kNb {
    public static final LinkedHashMap R = new LinkedHashMap();

    public static final hUt R(Context context) {
        hUt hut;
        LinkedHashMap linkedHashMap = R;
        synchronized (linkedHashMap) {
            Object obj = linkedHashMap.get(context);
            if (obj == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                nJ R2 = jjU.R(-1, null, 6);
                i31 i31 = new i31(new arh(contentResolver, uriFor, new fJ4(R2, Handler.createAsync(Looper.getMainLooper()), 0), R2, context, null));
                pyX pyx = new pyX(null);
                h8R h8r = iFn.R;
                obj = l6.M(i31, new m3D(jjU.t(pyx, hJr.R)), new ern(0, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                linkedHashMap.put(context, obj);
            }
            hut = (hUt) obj;
        }
        return hut;
    }

    public static final hYA v(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof hYA) {
            return (hYA) tag;
        }
        return null;
    }
}
