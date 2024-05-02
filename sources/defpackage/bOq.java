package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: bOq  reason: default package */
/* loaded from: classes.dex */
public final class bOq {

    /* renamed from: R  reason: collision with other field name */
    public final long f1621R;

    /* renamed from: R  reason: collision with other field name */
    public final String f1622R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1623R;

    /* renamed from: c  reason: collision with other field name */
    public final String f1624c;

    /* renamed from: c  reason: collision with other field name */
    public final boolean f1625c;

    /* renamed from: e  reason: collision with other field name */
    public final String f1626e;

    /* renamed from: e  reason: collision with other field name */
    public final boolean f1627e;

    /* renamed from: v  reason: collision with other field name */
    public final String f1628v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f1629v;
    public static final Pattern R = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern v = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern e = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public bOq(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f1622R = str;
        this.f1628v = str2;
        this.f1621R = j;
        this.f1624c = str3;
        this.f1626e = str4;
        this.f1623R = z;
        this.f1629v = z2;
        this.f1625c = z3;
        this.f1627e = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bOq) {
            bOq boq = (bOq) obj;
            if (n3x.v(boq.f1622R, this.f1622R) && n3x.v(boq.f1628v, this.f1628v) && boq.f1621R == this.f1621R && n3x.v(boq.f1624c, this.f1624c) && n3x.v(boq.f1626e, this.f1626e) && boq.f1623R == this.f1623R && boq.f1629v == this.f1629v && boq.f1625c == this.f1625c && boq.f1627e == this.f1627e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int O = opT.O(this.f1626e, opT.O(this.f1624c, opT.X(this.f1621R, opT.O(this.f1628v, opT.O(this.f1622R, 527, 31), 31), 31), 31), 31);
        int hashCode = Boolean.hashCode(this.f1629v);
        int hashCode2 = Boolean.hashCode(this.f1625c);
        return Boolean.hashCode(this.f1627e) + ((hashCode2 + ((hashCode + ((Boolean.hashCode(this.f1623R) + O) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1622R);
        sb.append('=');
        sb.append(this.f1628v);
        if (this.f1625c) {
            if (this.f1621R == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) jr7.R.get()).format(new Date(this.f1621R)));
            }
        }
        if (!this.f1627e) {
            sb.append("; domain=");
            sb.append(this.f1624c);
        }
        sb.append("; path=");
        sb.append(this.f1626e);
        if (this.f1623R) {
            sb.append("; secure");
        }
        if (this.f1629v) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
