package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* renamed from: fc_  reason: default package */
/* loaded from: classes.dex */
public abstract class fc_ {
    public static ParcelFileDescriptor R(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}
