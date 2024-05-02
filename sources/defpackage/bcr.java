package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: bcr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bcr implements FilenameFilter {
    public static final /* synthetic */ bcr R = new bcr();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return eOC.R.matcher(str).matches();
    }
}
