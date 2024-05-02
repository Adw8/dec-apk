package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: iOa  reason: default package */
/* loaded from: classes.dex */
public final class iOa extends ContextWrapper {
    public static Configuration v;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Configuration f4554R;

    /* renamed from: R  reason: collision with other field name */
    public Resources.Theme f4555R;

    /* renamed from: R  reason: collision with other field name */
    public Resources f4556R;

    /* renamed from: R  reason: collision with other field name */
    public LayoutInflater f4557R;

    public iOa(Context context, int i) {
        super(context);
        this.R = i;
    }

    public final void R(Configuration configuration) {
        if (this.f4556R != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f4554R == null) {
            this.f4554R = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f4556R == null) {
            Configuration configuration = this.f4554R;
            if (configuration != null) {
                if (v == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    v = configuration2;
                }
                if (!configuration.equals(v)) {
                    this.f4556R = nrd.R(this, this.f4554R).getResources();
                }
            }
            this.f4556R = super.getResources();
        }
        return this.f4556R;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4557R == null) {
            this.f4557R = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4557R;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f4555R;
        if (theme != null) {
            return theme;
        }
        if (this.R == 0) {
            this.R = 2132017704;
        }
        v();
        return this.f4555R;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.R != i) {
            this.R = i;
            v();
        }
    }

    public final void v() {
        if (this.f4555R == null) {
            this.f4555R = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4555R.setTo(theme);
            }
        }
        this.f4555R.applyStyle(this.R, true);
    }
}
