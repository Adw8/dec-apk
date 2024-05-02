package dev.kdrag0n.virt.lxc.model;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class Instance {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2730R;
    public final String c;
    public final String e;
    public final String v;

    public Instance(String str, String str2, @mr5(name = "status_code") int i, @mr5(name = "last_used_at") String str3, @mr5(name = "created_at") String str4) {
        this.f2730R = str;
        this.v = str2;
        this.R = i;
        this.c = str3;
        this.e = str4;
    }

    public final Instance copy(String str, String str2, @mr5(name = "status_code") int i, @mr5(name = "last_used_at") String str3, @mr5(name = "created_at") String str4) {
        return new Instance(str, str2, i, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instance)) {
            return false;
        }
        Instance instance = (Instance) obj;
        return n3x.v(this.f2730R, instance.f2730R) && n3x.v(this.v, instance.v) && this.R == instance.R && n3x.v(this.c, instance.c) && n3x.v(this.e, instance.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + opT.O(this.c, opT.e(this.R, opT.O(this.v, this.f2730R.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = this.f2730R;
        String str2 = this.v;
        int i = this.R;
        String str3 = this.c;
        String str4 = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append("Instance(name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(str2);
        sb.append(", statusCode=");
        sb.append(i);
        sb.append(", lastUsedAt=");
        sb.append(str3);
        sb.append(", createdAt=");
        return jQ.g(sb, str4, ")");
    }
}
