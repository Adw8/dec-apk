package defpackage;

import java.io.File;

/* renamed from: cnl  reason: default package */
/* loaded from: classes.dex */
public final class cnl extends ku2 {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fAG f2192R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2193R;

    /* renamed from: R  reason: collision with other field name */
    public File[] f2194R;
    public boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cnl(fAG fag, File file) {
        super(file);
        this.f2192R = fag;
    }

    @Override // defpackage.ciy
    public final File R() {
        int i;
        if (!this.v && this.f2194R == null) {
            this.f2192R.f3333R.getClass();
            File[] listFiles = ((ciy) this).R.listFiles();
            this.f2194R = listFiles;
            if (listFiles == null) {
                this.f2192R.f3333R.getClass();
                this.v = true;
            }
        }
        File[] fileArr = this.f2194R;
        if (fileArr != null && (i = this.R) < fileArr.length) {
            this.R = i + 1;
            return fileArr[i];
        } else if (!this.f2193R) {
            this.f2193R = true;
            return ((ciy) this).R;
        } else {
            this.f2192R.f3333R.getClass();
            return null;
        }
    }
}
