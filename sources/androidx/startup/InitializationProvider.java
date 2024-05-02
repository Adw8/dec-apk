package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;

/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new j8f("Context cannot be null", 0);
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            hU c = hU.c(context);
            c.getClass();
            try {
                try {
                    Trace.beginSection("Startup");
                    c.R(c.f4274R.getPackageManager().getProviderInfo(new ComponentName(c.f4274R.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                    return true;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new j8f((Throwable) e);
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
