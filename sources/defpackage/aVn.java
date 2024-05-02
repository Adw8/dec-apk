package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: aVn  reason: default package */
/* loaded from: classes.dex */
public final class aVn extends SpannableStringBuilder {
    public final Class R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f901R = new ArrayList();

    public aVn(Class cls, CharSequence charSequence) {
        super(charSequence);
        if (cls != null) {
            this.R = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    public final void R() {
        for (int i = 0; i < this.f901R.size(); i++) {
            ((f1u) this.f901R.get(i)).f3280R.incrementAndGet();
        }
    }

    public final void X() {
        for (int i = 0; i < this.f901R.size(); i++) {
            ((f1u) this.f901R.get(i)).f3280R.decrementAndGet();
        }
    }

    @Override // android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final f1u c(Object obj) {
        for (int i = 0; i < this.f901R.size(); i++) {
            f1u f1u = (f1u) this.f901R.get(i);
            if (f1u.R == obj) {
                return f1u;
            }
        }
        return null;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final boolean e(Object obj) {
        if (obj != null) {
            if (this.R == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        f1u c;
        if (e(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        f1u c;
        if (e(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        f1u c;
        if (e(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (!(this.R == cls)) {
            return super.getSpans(i, i2, cls);
        }
        f1u[] f1uArr = (f1u[]) super.getSpans(i, i2, f1u.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, f1uArr.length);
        for (int i3 = 0; i3 < f1uArr.length; i3++) {
            objArr[i3] = f1uArr[i3].R;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        if ((r1.R == r4) != false) goto L_0x000b;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x000b
            java.lang.Class r0 = r1.R
            if (r0 != r4) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            java.lang.Class<f1u> r4 = defpackage.f1u.class
        L_0x000d:
            int r1 = super.nextSpanTransition(r2, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aVn.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        f1u f1u;
        if (e(obj)) {
            f1u = c(obj);
            if (f1u != null) {
                obj = f1u;
            }
        } else {
            f1u = null;
        }
        super.removeSpan(obj);
        if (f1u != null) {
            this.f901R.remove(f1u);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (e(obj)) {
            f1u f1u = new f1u(obj);
            this.f901R.add(f1u);
            obj = f1u;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new aVn(this.R, this, i, i2);
    }

    public final void v() {
        X();
        for (int i = 0; i < this.f901R.size(); i++) {
            ((f1u) this.f901R.get(i)).onTextChanged(this, 0, length(), length());
        }
    }

    @Override // android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo1append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder mo6delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder mo7insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable
    /* renamed from: append  reason: collision with other method in class */
    public final Appendable mo4append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        R();
        super.replace(i, i2, charSequence);
        X();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder mo8insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public aVn(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        if (cls != null) {
            this.R = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    @Override // android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo0append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable
    /* renamed from: append  reason: collision with other method in class */
    public final Appendable mo3append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        R();
        super.replace(i, i2, charSequence, i3, i4);
        X();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo2append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.Appendable, android.text.Editable
    /* renamed from: append  reason: collision with other method in class */
    public final Appendable mo5append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
