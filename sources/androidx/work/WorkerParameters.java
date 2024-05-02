package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class WorkerParameters {
    public CV R;

    /* renamed from: R  reason: collision with other field name */
    public d3x f1447R;

    /* renamed from: R  reason: collision with other field name */
    public dSg f1448R;

    /* renamed from: R  reason: collision with other field name */
    public g2m f1449R;

    /* renamed from: R  reason: collision with other field name */
    public UUID f1450R;

    /* renamed from: R  reason: collision with other field name */
    public Executor f1451R;

    public WorkerParameters(UUID uuid, g2m g2m, List list, ExecutorService executorService, CV cv, d3x d3x, eDp edp) {
        this.f1450R = uuid;
        this.f1449R = g2m;
        new HashSet(list);
        this.f1451R = executorService;
        this.R = cv;
        this.f1447R = d3x;
        this.f1448R = edp;
    }
}
