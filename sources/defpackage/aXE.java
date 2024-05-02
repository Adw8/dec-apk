package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executors;

/* renamed from: aXE  reason: default package */
/* loaded from: classes.dex */
public final class aXE implements coB {
    public final Object R;

    public /* synthetic */ aXE(Object obj) {
        this.R = obj;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public aXE(int i, int i2) {
        this(Executors.newSingleThreadScheduledExecutor());
        if (i != 5) {
            this.R = new ArrayList();
        }
    }

    public /* synthetic */ aXE(ppN ppn) {
        this.R = ppn;
    }
}
