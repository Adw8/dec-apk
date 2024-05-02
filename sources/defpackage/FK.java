package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: FK  reason: default package */
/* loaded from: classes.dex */
public final class FK extends cE0 implements Map {
    public Gl R;

    public FK() {
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.R == null) {
            this.R = new Gl(0, this);
        }
        Gl gl = this.R;
        if (((ox_) ((Dd) gl).R) == null) {
            ((Dd) gl).R = new ox_(gl, 0);
        }
        return (ox_) ((Dd) gl).R;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.R == null) {
            this.R = new Gl(0, this);
        }
        Gl gl = this.R;
        if (((ox_) gl.v) == null) {
            gl.v = new ox_(gl, 1);
        }
        return (ox_) gl.v;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        v(map.size() + this.e);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.R == null) {
            this.R = new Gl(0, this);
        }
        Gl gl = this.R;
        if (((jvg) gl.c) == null) {
            gl.c = new jvg(gl);
        }
        return (jvg) gl.c;
    }

    public FK(FK fk) {
        if (fk != null) {
            int i = fk.e;
            v(this.e + i);
            if (this.e != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(fk.Z(i2), fk.x(i2));
                }
            } else if (i > 0) {
                System.arraycopy(((cE0) fk).R, 0, ((cE0) this).R, 0, i);
                System.arraycopy(((cE0) fk).f2018R, 0, ((cE0) this).f2018R, 0, i << 1);
                this.e = i;
            }
        }
    }
}
