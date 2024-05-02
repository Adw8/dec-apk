package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: aFZ  reason: default package */
/* loaded from: classes.dex */
public final class aFZ extends o25 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Parcel f807R;

    /* renamed from: R  reason: collision with other field name */
    public final SparseIntArray f808R;

    /* renamed from: R  reason: collision with other field name */
    public final String f809R;
    public int X;
    public int c;
    public int e;
    public final int v;

    public aFZ(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new FK(), new FK(), new FK());
    }

    @Override // defpackage.o25
    public final aFZ R() {
        Parcel parcel = this.f807R;
        int dataPosition = parcel.dataPosition();
        int i = this.e;
        if (i == this.R) {
            i = this.v;
        }
        return new aFZ(parcel, dataPosition, i, jQ.g(new StringBuilder(), this.f809R, "  "), ((o25) this).R, super.v, super.c);
    }

    @Override // defpackage.o25
    public final boolean X(int i) {
        while (this.e < this.v) {
            int i2 = this.X;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f807R.setDataPosition(this.e);
            int readInt = this.f807R.readInt();
            this.X = this.f807R.readInt();
            this.e += readInt;
        }
        return this.X == i;
    }

    @Override // defpackage.o25
    public final void Z(int i) {
        x();
        this.c = i;
        this.f808R.put(i, this.f807R.dataPosition());
        this.f807R.writeInt(0);
        this.f807R.writeInt(i);
    }

    public final void x() {
        int i = this.c;
        if (i >= 0) {
            int i2 = this.f808R.get(i);
            int dataPosition = this.f807R.dataPosition();
            this.f807R.setDataPosition(i2);
            this.f807R.writeInt(dataPosition - i2);
            this.f807R.setDataPosition(dataPosition);
        }
    }

    public aFZ(Parcel parcel, int i, int i2, String str, FK fk, FK fk2, FK fk3) {
        super(fk, fk2, fk3);
        this.f808R = new SparseIntArray();
        this.c = -1;
        this.X = -1;
        this.f807R = parcel;
        this.R = i;
        this.v = i2;
        this.e = i;
        this.f809R = str;
    }
}
