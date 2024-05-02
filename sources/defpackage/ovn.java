package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: ovn  reason: default package */
/* loaded from: classes.dex */
public final class ovn {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public cod f7025R;

    /* renamed from: R  reason: collision with other field name */
    public WeakReference f7026R;

    /* renamed from: R  reason: collision with other field name */
    public final TextPaint f7024R = new TextPaint(1);

    /* renamed from: R  reason: collision with other field name */
    public final zt f7027R = new zt(1, this);

    /* renamed from: R  reason: collision with other field name */
    public boolean f7028R = true;

    public ovn(joe joe) {
        this.f7026R = new WeakReference(null);
        this.f7026R = new WeakReference(joe);
    }

    public final float R(String str) {
        if (!this.f7028R) {
            return this.R;
        }
        float measureText = str == null ? 0.0f : this.f7024R.measureText((CharSequence) str, 0, str.length());
        this.R = measureText;
        this.f7028R = false;
        return measureText;
    }

    public final void v(cod cod, Context context) {
        if (this.f7025R != cod) {
            this.f7025R = cod;
            if (cod != null) {
                cod.O(context, this.f7024R, this.f7027R);
                joe joe = (joe) this.f7026R.get();
                if (joe != null) {
                    this.f7024R.drawableState = joe.getState();
                }
                cod.X(context, this.f7024R, this.f7027R);
                this.f7028R = true;
            }
            joe joe2 = (joe) this.f7026R.get();
            if (joe2 != null) {
                joe2.R();
                joe2.onStateChange(joe2.getState());
            }
        }
    }
}
