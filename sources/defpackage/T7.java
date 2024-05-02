package defpackage;

import java.io.IOException;

/* renamed from: T7  reason: default package */
/* loaded from: classes.dex */
public final class T7 extends IOException {
    public T7(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super(opT.H("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
    }

    public T7(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
