package defpackage;

/* renamed from: mit  reason: default package */
/* loaded from: classes.dex */
public final class mit extends k87 {
    public final /* synthetic */ int R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mit(msD msd, int i) {
        super(msd);
        this.R = i;
    }

    @Override // defpackage.k87
    public final String v() {
        switch (this.R) {
            case 0:
                return "DELETE FROM workspec WHERE id=?";
            case 1:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 2:
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            case 3:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case 4:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 6:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            default:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }
}
