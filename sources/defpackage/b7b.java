package defpackage;

import java.io.IOException;

/* renamed from: b7b  reason: default package */
/* loaded from: classes.dex */
public class b7b extends IOException {
    public static final /* synthetic */ int e = 0;

    public b7b(String str) {
        super(str);
    }

    public static b7b O() {
        return new b7b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static b7b R() {
        return new b7b("Protocol message had invalid UTF-8.");
    }

    public static b7b X() {
        return new b7b("Failed to parse the message.");
    }

    public static b7b c() {
        return new b7b("CodedInputStream encountered a malformed varint.");
    }

    public static b7b e() {
        return new b7b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static p3X v() {
        return new p3X();
    }

    public b7b(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }
}
