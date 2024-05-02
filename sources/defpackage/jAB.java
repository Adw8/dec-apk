package defpackage;

/* renamed from: jAB  reason: default package */
/* loaded from: classes.dex */
public final class jAB extends gHo {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f4850R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jAB(Object obj, msD msd, int i) {
        super(msd);
        this.R = i;
        this.f4850R = obj;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:139:0x016b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:65:0x01a3 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [jeV, mVu] */
    /* JADX WARN: Type inference failed for: r0v12, types: [long] */
    /* JADX WARN: Type inference failed for: r15v10, types: [int] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ce  */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // defpackage.gHo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.mVu r14, java.lang.Object r15) {
        /*
        // Method dump skipped, instructions count: 662
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jAB.e(mVu, java.lang.Object):void");
    }

    @Override // defpackage.k87
    public final String v() {
        switch (this.R) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
