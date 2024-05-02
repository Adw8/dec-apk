package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.d;

/* renamed from: p5g  reason: default package */
/* loaded from: classes.dex */
public final class p5g implements LayoutInflater.Factory2 {
    public final hAW R;

    public p5g(hAW haw) {
        this.R = haw;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        d dVar;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.R);
        }
        pm2 pm2 = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1P.f6270R);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z = pm2.class.isAssignableFrom(aLv.v(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    pm2 = this.R.z(resourceId);
                }
                if (pm2 == null && string != null) {
                    pm2 = this.R.n(string);
                }
                if (pm2 == null && id != -1) {
                    pm2 = this.R.z(id);
                }
                if (pm2 == null) {
                    aLv A = this.R.A();
                    context.getClassLoader();
                    pm2 = A.R(attributeValue);
                    pm2.f7251e = true;
                    pm2.L = resourceId != 0 ? resourceId : id;
                    pm2.Z = id;
                    pm2.f7248c = string;
                    pm2.f7246X = true;
                    hAW haw = this.R;
                    pm2.f7234R = haw;
                    eAj eaj = haw.f4113R;
                    pm2.f7232R = eaj;
                    pm2.z(eaj.f3004R, attributeSet, pm2.f7226R);
                    dVar = this.R.R(pm2);
                    if (hAW.W(2)) {
                        Log.v("FragmentManager", "Fragment " + pm2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!pm2.f7246X) {
                    pm2.f7246X = true;
                    hAW haw2 = this.R;
                    pm2.f7234R = haw2;
                    eAj eaj2 = haw2.f4113R;
                    pm2.f7232R = eaj2;
                    pm2.z(eaj2.f3004R, attributeSet, pm2.f7226R);
                    dVar = this.R.O(pm2);
                    if (hAW.W(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + pm2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                kSM ksm = gju.R;
                gju.v(new khS(pm2, viewGroup, 0));
                gju.R(pm2).getClass();
                ovv ovv = ovv.DETECT_FRAGMENT_TAG_USAGE;
                if (ovv instanceof Void) {
                    Void r13 = (Void) ovv;
                }
                pm2.f7229R = viewGroup;
                dVar.H();
                dVar.x();
                View view2 = pm2.f7228R;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (pm2.f7228R.getTag() == null) {
                        pm2.f7228R.setTag(string);
                    }
                    pm2.f7228R.addOnAttachStateChangeListener(new czV(this, dVar));
                    return pm2.f7228R;
                }
                throw new IllegalStateException(jQ.C("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
