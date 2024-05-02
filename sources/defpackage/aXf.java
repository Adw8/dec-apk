package defpackage;

import java.io.IOException;

/* renamed from: aXf  reason: default package */
/* loaded from: classes.dex */
public final class aXf extends IOException {
    public final gtp R;

    public aXf(gtp gtp) {
        super("stream was reset: " + gtp);
        this.R = gtp;
    }
}
