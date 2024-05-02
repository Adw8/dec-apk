package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: TV  reason: default package */
/* loaded from: classes.dex */
public final class TV extends dtx {
    public final U9 R;

    /* renamed from: R  reason: collision with other field name */
    public final Integer f534R;

    public TV(U9 u9, Integer num) {
        this.R = u9;
        this.f534R = num;
    }

    public static TV I(U9 u9, gL6 gl6, Integer num) {
        if (((nE) gl6.R).R.length == 32) {
            o7 o7Var = u9.f550R;
            o7 o7Var2 = o7.e;
            boolean z = true;
            if (!(o7Var != o7Var2) || num != null) {
                if (o7Var == o7Var2) {
                    z = false;
                }
                if (z || num == null) {
                    return new TV(u9, num);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        }
        throw new GeneralSecurityException("Invalid key size");
    }

    @Override // defpackage.dtx
    public final o02 C() {
        return this.R;
    }

    public final nE u() {
        o7 o7Var = this.R.f550R;
        if (o7Var == o7.e) {
            return nE.R(new byte[0]);
        }
        if (o7Var == o7.c || o7Var == o7.v) {
            return nE.R(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f534R.intValue()).array());
        }
        if (o7Var == o7.R) {
            return nE.R(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f534R.intValue()).array());
        }
        StringBuilder U = opT.U("Unknown AesCmacParameters.Variant: ");
        U.append(this.R.f550R);
        throw new IllegalStateException(U.toString());
    }
}
