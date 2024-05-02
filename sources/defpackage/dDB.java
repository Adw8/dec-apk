package defpackage;

import java.io.File;

/* renamed from: dDB  reason: default package */
/* loaded from: classes.dex */
public final class dDB extends ku2 {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fAG f2530R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2531R;

    /* renamed from: R  reason: collision with other field name */
    public File[] f2532R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dDB(fAG fag, File file) {
        super(file);
        this.f2530R = fag;
    }

    @Override // defpackage.ciy
    public final File R() {
        if (!this.f2531R) {
            this.f2530R.f3333R.getClass();
            this.f2531R = true;
            return ((ciy) this).R;
        }
        File[] fileArr = this.f2532R;
        if (fileArr == null || this.R < fileArr.length) {
            if (fileArr == null) {
                File[] listFiles = ((ciy) this).R.listFiles();
                this.f2532R = listFiles;
                if (listFiles == null) {
                    this.f2530R.f3333R.getClass();
                }
                File[] fileArr2 = this.f2532R;
                if (fileArr2 == null || fileArr2.length == 0) {
                    this.f2530R.f3333R.getClass();
                    return null;
                }
            }
            File[] fileArr3 = this.f2532R;
            int i = this.R;
            this.R = i + 1;
            return fileArr3[i];
        }
        this.f2530R.f3333R.getClass();
        return null;
    }
}
