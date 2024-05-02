package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: t3  reason: default package */
/* loaded from: classes.dex */
public final class t3 extends ML {
    public final /* synthetic */ jFe R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f7417R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f7418R = false;

    public t3(jFe jfe, String str) {
        this.R = jfe;
        this.f7417R = str;
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.ML
    public final void v() {
        WorkDatabase workDatabase = this.R.f4887R;
        workDatabase.c();
        try {
            Iterator it = workDatabase.N().Z(this.f7417R).iterator();
            while (it.hasNext()) {
                ML.R(this.R, (String) it.next());
            }
            workDatabase.Z();
            workDatabase.O();
            if (this.f7418R) {
                jFe jfe = this.R;
                hak.R(jfe.f4890R, jfe.f4887R, jfe.f4889R);
            }
        } catch (Throwable th) {
            workDatabase.O();
            throw th;
        }
    }
}
