package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@mEz("activity")
/* renamed from: yL  reason: default package */
/* loaded from: classes.dex */
public class yL extends jFk {
    public final Activity R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f7488R;

    public yL(Context context) {
        Object obj;
        this.f7488R = context;
        Iterator it = a6.l(context, i5D.K).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.R = (Activity) obj;
    }

    @Override // defpackage.jFk
    public final e9E R() {
        return new wI(this);
    }

    @Override // defpackage.jFk
    public final e9E c(e9E e9e, Bundle bundle, ixU ixu) {
        Intent intent;
        int intExtra;
        wI wIVar = (wI) e9e;
        if (wIVar.R != null) {
            Intent intent2 = new Intent(wIVar.R);
            int i = 0;
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = wIVar.e;
                if (!(str == null || str.length() == 0)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            if (this.R == null) {
                intent2.addFlags(268435456);
            }
            if (ixu != null && ixu.f4778R) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.R;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", ((e9E) wIVar).e);
            Resources resources = this.f7488R.getResources();
            if (ixu != null) {
                int i2 = ixu.e;
                int i3 = ixu.X;
                if ((i2 <= 0 || !n3x.v(resources.getResourceTypeName(i2), "animator")) && (i3 <= 0 || !n3x.v(resources.getResourceTypeName(i3), "animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i2);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i3);
                } else {
                    StringBuilder U = opT.U("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                    U.append(resources.getResourceName(i2));
                    U.append(" and popExit resource ");
                    U.append(resources.getResourceName(i3));
                    U.append(" when launching ");
                    U.append(wIVar);
                    Log.w("ActivityNavigator", U.toString());
                }
            }
            this.f7488R.startActivity(intent2);
            if (ixu == null || this.R == null) {
                return null;
            }
            int i4 = ixu.v;
            int i5 = ixu.c;
            if ((i4 > 0 && n3x.v(resources.getResourceTypeName(i4), "animator")) || (i5 > 0 && n3x.v(resources.getResourceTypeName(i5), "animator"))) {
                StringBuilder U2 = opT.U("Activity destinations do not support Animator resource. Ignoring enter resource ");
                U2.append(resources.getResourceName(i4));
                U2.append(" and exit resource ");
                U2.append(resources.getResourceName(i5));
                U2.append("when launching ");
                U2.append(wIVar);
                Log.w("ActivityNavigator", U2.toString());
                return null;
            } else if (i4 < 0 && i5 < 0) {
                return null;
            } else {
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i5 >= 0) {
                    i = i5;
                }
                this.R.overridePendingTransition(i4, i);
                return null;
            }
        } else {
            throw new IllegalStateException(jQ.j(opT.U("Destination "), ((e9E) wIVar).e, " does not have an Intent set.").toString());
        }
    }

    @Override // defpackage.jFk
    public final boolean x() {
        Activity activity = this.R;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
