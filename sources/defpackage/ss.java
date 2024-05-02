package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: ss  reason: default package */
/* loaded from: classes.dex */
public final class ss extends ML {
    public final /* synthetic */ jFe R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ UUID f7416R;

    public ss(jFe jfe, UUID uuid) {
        this.R = jfe;
        this.f7416R = uuid;
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.ML
    public final void v() {
        WorkDatabase workDatabase = this.R.f4887R;
        workDatabase.c();
        try {
            ML.R(this.R, this.f7416R.toString());
            workDatabase.Z();
            workDatabase.O();
            jFe jfe = this.R;
            hak.R(jfe.f4890R, jfe.f4887R, jfe.f4889R);
        } catch (Throwable th) {
            workDatabase.O();
            throw th;
        }
    }
}
