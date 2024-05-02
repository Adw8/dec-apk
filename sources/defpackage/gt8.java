package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import java.util.ArrayList;

/* renamed from: gt8  reason: default package */
/* loaded from: classes.dex */
public abstract class gt8 {
    public static String R(CharSequence charSequence) {
        return Html.escapeHtml(charSequence);
    }

    public static void c(Intent intent) {
        intent.setClipData(null);
        intent.setFlags(intent.getFlags() & -2);
    }

    public static void v(Intent intent, ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
