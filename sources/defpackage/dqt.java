package defpackage;

import java.util.regex.Matcher;

/* renamed from: dqt  reason: default package */
/* loaded from: classes.dex */
public final class dqt {
    public final aqS R = new aqS(this);

    /* renamed from: R  reason: collision with other field name */
    public final Matcher f2900R;

    /* renamed from: R  reason: collision with other field name */
    public jkV f2901R;

    public dqt(Matcher matcher) {
        this.f2900R = matcher;
    }

    public final heu R() {
        Matcher matcher = this.f2900R;
        return caw.V(matcher.start(), matcher.end());
    }
}
