package defpackage;

/* renamed from: mQq  reason: default package */
/* loaded from: classes.dex */
public final class mQq extends k49 {
    public final /* synthetic */ String R = "    ";

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ k49 f6043R;

    public mQq(k49 k49) {
        this.f6043R = k49;
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        String str = mot.R;
        if (str == null) {
            str = "";
        }
        mot.j(this.R);
        try {
            this.f6043R.O(mot, obj);
        } finally {
            mot.j(str);
        }
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        return this.f6043R.R(csz);
    }

    @Override // defpackage.k49
    public final boolean c() {
        return this.f6043R.c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6043R);
        sb.append(".indent(\"");
        return jQ.g(sb, this.R, "\")");
    }
}
